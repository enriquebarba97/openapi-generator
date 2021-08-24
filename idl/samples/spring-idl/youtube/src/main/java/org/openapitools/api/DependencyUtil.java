package org.openapitools.api;

public class DependencyUtil {

  public static boolean doNotSatisfyOrDependency(boolean... assertions){
    boolean result = false;
    for (int i=0;i<assertions.length;i++){
      result = result || assertions[i];

      if (result)
        return false;
    }
    return true;
  }

  public static boolean doNotSatisfyZeroOrOneDependency(boolean... assertions){
    boolean result = true;
    for (int i=0;i<assertions.length;i++){
      result = result && ZeroOrOneAllOrNoneElement(i,assertions,false,true);
      if (!result)
        break;
    }
    return !result;
  }

  public static boolean doNotSatisfyOnlyOneDependency(boolean... assertions){
    boolean result = true;
    for (int i=0;i<assertions.length;i++){
      result = result && ZeroOrOneAllOrNoneElement(i,assertions,false,true);
      if (!result)
        return true;
    }

    result = result && !doNotSatisfyOrDependency(assertions);
    return !result;
  }

  public static boolean doNotSatisfyAllOrNoneDependency(boolean... assertions){
    boolean result = true;
    for (int i=0;i<assertions.length;i++){
      result = result && ZeroOrOneAllOrNoneElement(i,assertions,false,false)
        && ZeroOrOneAllOrNoneElement(i,assertions,true,true);

      if (!result)
        return true;
    }

    return false;
  }

  private static boolean ZeroOrOneAllOrNoneElement(int i,boolean[] allElements, boolean negateElement, boolean negateRemainingElements){
    boolean element = negateElement ? allElements[i]:!allElements[i];
    if (element)
      return true;

    boolean result = true;
    for (int j=0;j<allElements.length;j++){
      if (i!=j){
        boolean otherElement = negateRemainingElements ? !allElements[j]:allElements[j];
      result = result && otherElement;
      if (!result)
        return false;
      }
    }
    return true;
  }

}