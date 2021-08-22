def do_not_satisfy_or_dependency(*assertions):
    result = False
    for assertion in assertions:
        result = result or assertion
        if result:
          return False

    return True

def do_not_satisfy_zero_or_one_dependency(*assertions):
    result = True
    for i in range(len(assertions)):
        result = result and zero_or_one_all_or_none_element(i,assertions,False,True)
        if not result:
            break

    return not result

def do_not_satisfy_only_one_dependency(*assertions):
    result = True
    for i in range(len(assertions)):
        result = result and zero_or_one_all_or_none_element(i,assertions,False,True)
        if not result:
            return True

    result = result and not do_not_satisfy_or_dependency(*assertions)
    return not result

def do_not_satisfy_all_or_none_dependency(*assertions):
    result = True
    for i in range(len(assertions)):
        result = result and zero_or_one_all_or_none_element(i,assertions,False,False) and zero_or_one_all_or_none_element(i,assertions,True,True)

        if not result:
            return True

    return False


def zero_or_one_all_or_none_element(i,allElements,negateElement,negateRemainingElements):
    element = allElements[i] if negateElement else not allElements[i]
    if element:
        return True

    result = True
    for j in range(len(allElements)):
        if i!=j:
            otherElement = not allElements[j] if negateRemainingElements else allElements[j]
            result = result and otherElement
            if not result:
                return False

    return True