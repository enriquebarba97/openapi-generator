package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Ratings schemes. The country-specific ratings are mostly for movies and shows. LINT.IfChange
 */
@ApiModel(description = "Ratings schemes. The country-specific ratings are mostly for movies and shows. LINT.IfChange")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ContentRating   {
  /**
   * The video's Australian Classification Board (ACB) or Australian Communications and Media Authority (ACMA) rating. ACMA ratings are used to classify children's television programming.
   */
  public enum AcbRatingEnum {
    ACBUNSPECIFIED("acbUnspecified"),
    
    ACBE("acbE"),
    
    ACBP("acbP"),
    
    ACBC("acbC"),
    
    ACBG("acbG"),
    
    ACBPG("acbPg"),
    
    ACBM("acbM"),
    
    ACBMA15PLUS("acbMa15plus"),
    
    ACBR18PLUS("acbR18plus"),
    
    ACBUNRATED("acbUnrated");

    private String value;

    AcbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AcbRatingEnum fromValue(String text) {
      for (AcbRatingEnum b : AcbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("acbRating")
  private AcbRatingEnum acbRating;

  /**
   * The video's rating from Italy's Autorità per le Garanzie nelle Comunicazioni (AGCOM).
   */
  public enum AgcomRatingEnum {
    AGCOMUNSPECIFIED("agcomUnspecified"),
    
    AGCOMT("agcomT"),
    
    AGCOMVM14("agcomVm14"),
    
    AGCOMVM18("agcomVm18"),
    
    AGCOMUNRATED("agcomUnrated");

    private String value;

    AgcomRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AgcomRatingEnum fromValue(String text) {
      for (AgcomRatingEnum b : AgcomRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("agcomRating")
  private AgcomRatingEnum agcomRating;

  /**
   * The video's Anatel (Asociación Nacional de Televisión) rating for Chilean television.
   */
  public enum AnatelRatingEnum {
    ANATELUNSPECIFIED("anatelUnspecified"),
    
    ANATELF("anatelF"),
    
    ANATELI("anatelI"),
    
    ANATELI7("anatelI7"),
    
    ANATELI10("anatelI10"),
    
    ANATELI12("anatelI12"),
    
    ANATELR("anatelR"),
    
    ANATELA("anatelA"),
    
    ANATELUNRATED("anatelUnrated");

    private String value;

    AnatelRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnatelRatingEnum fromValue(String text) {
      for (AnatelRatingEnum b : AnatelRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("anatelRating")
  private AnatelRatingEnum anatelRating;

  /**
   * The video's British Board of Film Classification (BBFC) rating.
   */
  public enum BbfcRatingEnum {
    BBFCUNSPECIFIED("bbfcUnspecified"),
    
    BBFCU("bbfcU"),
    
    BBFCPG("bbfcPg"),
    
    BBFC12A("bbfc12a"),
    
    BBFC12("bbfc12"),
    
    BBFC15("bbfc15"),
    
    BBFC18("bbfc18"),
    
    BBFCR18("bbfcR18"),
    
    BBFCUNRATED("bbfcUnrated");

    private String value;

    BbfcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BbfcRatingEnum fromValue(String text) {
      for (BbfcRatingEnum b : BbfcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("bbfcRating")
  private BbfcRatingEnum bbfcRating;

  /**
   * The video's rating from Thailand's Board of Film and Video Censors.
   */
  public enum BfvcRatingEnum {
    BFVCUNSPECIFIED("bfvcUnspecified"),
    
    BFVCG("bfvcG"),
    
    BFVCE("bfvcE"),
    
    BFVC13("bfvc13"),
    
    BFVC15("bfvc15"),
    
    BFVC18("bfvc18"),
    
    BFVC20("bfvc20"),
    
    BFVCB("bfvcB"),
    
    BFVCUNRATED("bfvcUnrated");

    private String value;

    BfvcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BfvcRatingEnum fromValue(String text) {
      for (BfvcRatingEnum b : BfvcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("bfvcRating")
  private BfvcRatingEnum bfvcRating;

  /**
   * The video's rating from the Austrian Board of Media Classification (Bundesministerium für Unterricht, Kunst und Kultur).
   */
  public enum BmukkRatingEnum {
    BMUKKUNSPECIFIED("bmukkUnspecified"),
    
    BMUKKAA("bmukkAa"),
    
    BMUKK6("bmukk6"),
    
    BMUKK8("bmukk8"),
    
    BMUKK10("bmukk10"),
    
    BMUKK12("bmukk12"),
    
    BMUKK14("bmukk14"),
    
    BMUKK16("bmukk16"),
    
    BMUKKUNRATED("bmukkUnrated");

    private String value;

    BmukkRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BmukkRatingEnum fromValue(String text) {
      for (BmukkRatingEnum b : BmukkRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("bmukkRating")
  private BmukkRatingEnum bmukkRating;

  /**
   * Rating system for Canadian TV - Canadian TV Classification System The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian English-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.
   */
  public enum CatvRatingEnum {
    CATVUNSPECIFIED("catvUnspecified"),
    
    CATVC("catvC"),
    
    CATVC8("catvC8"),
    
    CATVG("catvG"),
    
    CATVPG("catvPg"),
    
    CATV14PLUS("catv14plus"),
    
    CATV18PLUS("catv18plus"),
    
    CATVUNRATED("catvUnrated"),
    
    CATVE("catvE");

    private String value;

    CatvRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatvRatingEnum fromValue(String text) {
      for (CatvRatingEnum b : CatvRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catvRating")
  private CatvRatingEnum catvRating;

  /**
   * The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian French-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.
   */
  public enum CatvfrRatingEnum {
    CATVFRUNSPECIFIED("catvfrUnspecified"),
    
    CATVFRG("catvfrG"),
    
    CATVFR8PLUS("catvfr8plus"),
    
    CATVFR13PLUS("catvfr13plus"),
    
    CATVFR16PLUS("catvfr16plus"),
    
    CATVFR18PLUS("catvfr18plus"),
    
    CATVFRUNRATED("catvfrUnrated"),
    
    CATVFRE("catvfrE");

    private String value;

    CatvfrRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatvfrRatingEnum fromValue(String text) {
      for (CatvfrRatingEnum b : CatvfrRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catvfrRating")
  private CatvfrRatingEnum catvfrRating;

  /**
   * The video's Central Board of Film Certification (CBFC - India) rating.
   */
  public enum CbfcRatingEnum {
    CBFCUNSPECIFIED("cbfcUnspecified"),
    
    CBFCU("cbfcU"),
    
    CBFCUA("cbfcUA"),
    
    CBFCA("cbfcA"),
    
    CBFCS("cbfcS"),
    
    CBFCUNRATED("cbfcUnrated");

    private String value;

    CbfcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CbfcRatingEnum fromValue(String text) {
      for (CbfcRatingEnum b : CbfcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cbfcRating")
  private CbfcRatingEnum cbfcRating;

  /**
   * The video's Consejo de Calificación Cinematográfica (Chile) rating.
   */
  public enum CccRatingEnum {
    CCCUNSPECIFIED("cccUnspecified"),
    
    CCCTE("cccTe"),
    
    CCC6("ccc6"),
    
    CCC14("ccc14"),
    
    CCC18("ccc18"),
    
    CCC18V("ccc18v"),
    
    CCC18S("ccc18s"),
    
    CCCUNRATED("cccUnrated");

    private String value;

    CccRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CccRatingEnum fromValue(String text) {
      for (CccRatingEnum b : CccRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cccRating")
  private CccRatingEnum cccRating;

  /**
   * The video's rating from Portugal's Comissão de Classificação de Espect´culos.
   */
  public enum CceRatingEnum {
    CCEUNSPECIFIED("cceUnspecified"),
    
    CCEM4("cceM4"),
    
    CCEM6("cceM6"),
    
    CCEM12("cceM12"),
    
    CCEM16("cceM16"),
    
    CCEM18("cceM18"),
    
    CCEUNRATED("cceUnrated"),
    
    CCEM14("cceM14");

    private String value;

    CceRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CceRatingEnum fromValue(String text) {
      for (CceRatingEnum b : CceRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cceRating")
  private CceRatingEnum cceRating;

  /**
   * The video's rating in Switzerland.
   */
  public enum ChfilmRatingEnum {
    CHFILMUNSPECIFIED("chfilmUnspecified"),
    
    CHFILM0("chfilm0"),
    
    CHFILM6("chfilm6"),
    
    CHFILM12("chfilm12"),
    
    CHFILM16("chfilm16"),
    
    CHFILM18("chfilm18"),
    
    CHFILMUNRATED("chfilmUnrated");

    private String value;

    ChfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChfilmRatingEnum fromValue(String text) {
      for (ChfilmRatingEnum b : ChfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("chfilmRating")
  private ChfilmRatingEnum chfilmRating;

  /**
   * The video's Canadian Home Video Rating System (CHVRS) rating.
   */
  public enum ChvrsRatingEnum {
    CHVRSUNSPECIFIED("chvrsUnspecified"),
    
    CHVRSG("chvrsG"),
    
    CHVRSPG("chvrsPg"),
    
    CHVRS14A("chvrs14a"),
    
    CHVRS18A("chvrs18a"),
    
    CHVRSR("chvrsR"),
    
    CHVRSE("chvrsE"),
    
    CHVRSUNRATED("chvrsUnrated");

    private String value;

    ChvrsRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChvrsRatingEnum fromValue(String text) {
      for (ChvrsRatingEnum b : ChvrsRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("chvrsRating")
  private ChvrsRatingEnum chvrsRating;

  /**
   * The video's rating from the Commission de Contrôle des Films (Belgium).
   */
  public enum CicfRatingEnum {
    CICFUNSPECIFIED("cicfUnspecified"),
    
    CICFE("cicfE"),
    
    CICFKTEA("cicfKtEa"),
    
    CICFKNTENA("cicfKntEna"),
    
    CICFUNRATED("cicfUnrated");

    private String value;

    CicfRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CicfRatingEnum fromValue(String text) {
      for (CicfRatingEnum b : CicfRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cicfRating")
  private CicfRatingEnum cicfRating;

  /**
   * The video's rating from Romania's CONSILIUL NATIONAL AL AUDIOVIZUALULUI (CNA).
   */
  public enum CnaRatingEnum {
    CNAUNSPECIFIED("cnaUnspecified"),
    
    CNAAP("cnaAp"),
    
    CNA12("cna12"),
    
    CNA15("cna15"),
    
    CNA18("cna18"),
    
    CNA18PLUS("cna18plus"),
    
    CNAUNRATED("cnaUnrated");

    private String value;

    CnaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CnaRatingEnum fromValue(String text) {
      for (CnaRatingEnum b : CnaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cnaRating")
  private CnaRatingEnum cnaRating;

  /**
   * Rating system in France - Commission de classification cinematographique
   */
  public enum CncRatingEnum {
    CNCUNSPECIFIED("cncUnspecified"),
    
    CNCT("cncT"),
    
    CNC10("cnc10"),
    
    CNC12("cnc12"),
    
    CNC16("cnc16"),
    
    CNC18("cnc18"),
    
    CNCE("cncE"),
    
    CNCINTERDICTION("cncInterdiction"),
    
    CNCUNRATED("cncUnrated");

    private String value;

    CncRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CncRatingEnum fromValue(String text) {
      for (CncRatingEnum b : CncRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cncRating")
  private CncRatingEnum cncRating;

  /**
   * The video's rating from France's Conseil supérieur de l’audiovisuel, which rates broadcast content.
   */
  public enum CsaRatingEnum {
    CSAUNSPECIFIED("csaUnspecified"),
    
    CSAT("csaT"),
    
    CSA10("csa10"),
    
    CSA12("csa12"),
    
    CSA16("csa16"),
    
    CSA18("csa18"),
    
    CSAINTERDICTION("csaInterdiction"),
    
    CSAUNRATED("csaUnrated");

    private String value;

    CsaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CsaRatingEnum fromValue(String text) {
      for (CsaRatingEnum b : CsaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("csaRating")
  private CsaRatingEnum csaRating;

  /**
   * The video's rating from Luxembourg's Commission de surveillance de la classification des films (CSCF).
   */
  public enum CscfRatingEnum {
    CSCFUNSPECIFIED("cscfUnspecified"),
    
    CSCFAL("cscfAl"),
    
    CSCFA("cscfA"),
    
    CSCF6("cscf6"),
    
    CSCF9("cscf9"),
    
    CSCF12("cscf12"),
    
    CSCF16("cscf16"),
    
    CSCF18("cscf18"),
    
    CSCFUNRATED("cscfUnrated");

    private String value;

    CscfRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CscfRatingEnum fromValue(String text) {
      for (CscfRatingEnum b : CscfRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cscfRating")
  private CscfRatingEnum cscfRating;

  /**
   * The video's rating in the Czech Republic.
   */
  public enum CzfilmRatingEnum {
    CZFILMUNSPECIFIED("czfilmUnspecified"),
    
    CZFILMU("czfilmU"),
    
    CZFILM12("czfilm12"),
    
    CZFILM14("czfilm14"),
    
    CZFILM18("czfilm18"),
    
    CZFILMUNRATED("czfilmUnrated");

    private String value;

    CzfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CzfilmRatingEnum fromValue(String text) {
      for (CzfilmRatingEnum b : CzfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("czfilmRating")
  private CzfilmRatingEnum czfilmRating;

  /**
   * The video's Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.
   */
  public enum DjctqRatingEnum {
    DJCTQUNSPECIFIED("djctqUnspecified"),
    
    DJCTQL("djctqL"),
    
    DJCTQ10("djctq10"),
    
    DJCTQ12("djctq12"),
    
    DJCTQ14("djctq14"),
    
    DJCTQ16("djctq16"),
    
    DJCTQ18("djctq18"),
    
    DJCTQER("djctqEr"),
    
    DJCTQL10("djctqL10"),
    
    DJCTQL12("djctqL12"),
    
    DJCTQL14("djctqL14"),
    
    DJCTQL16("djctqL16"),
    
    DJCTQL18("djctqL18"),
    
    DJCTQ1012("djctq1012"),
    
    DJCTQ1014("djctq1014"),
    
    DJCTQ1016("djctq1016"),
    
    DJCTQ1018("djctq1018"),
    
    DJCTQ1214("djctq1214"),
    
    DJCTQ1216("djctq1216"),
    
    DJCTQ1218("djctq1218"),
    
    DJCTQ1416("djctq1416"),
    
    DJCTQ1418("djctq1418"),
    
    DJCTQ1618("djctq1618"),
    
    DJCTQUNRATED("djctqUnrated");

    private String value;

    DjctqRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DjctqRatingEnum fromValue(String text) {
      for (DjctqRatingEnum b : DjctqRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("djctqRating")
  private DjctqRatingEnum djctqRating;

  /**
   * Gets or Sets djctqRatingReasons
   */
  public enum DjctqRatingReasonsEnum {
    DJCTQRATINGREASONUNSPECIFIED("djctqRatingReasonUnspecified"),
    
    DJCTQVIOLENCE("djctqViolence"),
    
    DJCTQEXTREMEVIOLENCE("djctqExtremeViolence"),
    
    DJCTQSEXUALCONTENT("djctqSexualContent"),
    
    DJCTQNUDITY("djctqNudity"),
    
    DJCTQSEX("djctqSex"),
    
    DJCTQEXPLICITSEX("djctqExplicitSex"),
    
    DJCTQDRUGS("djctqDrugs"),
    
    DJCTQLEGALDRUGS("djctqLegalDrugs"),
    
    DJCTQILLEGALDRUGS("djctqIllegalDrugs"),
    
    DJCTQINAPPROPRIATELANGUAGE("djctqInappropriateLanguage"),
    
    DJCTQCRIMINALACTS("djctqCriminalActs"),
    
    DJCTQIMPACTINGCONTENT("djctqImpactingContent");

    private String value;

    DjctqRatingReasonsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DjctqRatingReasonsEnum fromValue(String text) {
      for (DjctqRatingReasonsEnum b : DjctqRatingReasonsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("djctqRatingReasons")
  private List<DjctqRatingReasonsEnum> djctqRatingReasons = null;

  /**
   * Rating system in Turkey - Evaluation and Classification Board of the Ministry of Culture and Tourism
   */
  public enum EcbmctRatingEnum {
    ECBMCTUNSPECIFIED("ecbmctUnspecified"),
    
    ECBMCTG("ecbmctG"),
    
    ECBMCT7A("ecbmct7a"),
    
    ECBMCT7PLUS("ecbmct7plus"),
    
    ECBMCT13A("ecbmct13a"),
    
    ECBMCT13PLUS("ecbmct13plus"),
    
    ECBMCT15A("ecbmct15a"),
    
    ECBMCT15PLUS("ecbmct15plus"),
    
    ECBMCT18PLUS("ecbmct18plus"),
    
    ECBMCTUNRATED("ecbmctUnrated");

    private String value;

    EcbmctRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EcbmctRatingEnum fromValue(String text) {
      for (EcbmctRatingEnum b : EcbmctRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ecbmctRating")
  private EcbmctRatingEnum ecbmctRating;

  /**
   * The video's rating in Estonia.
   */
  public enum EefilmRatingEnum {
    EEFILMUNSPECIFIED("eefilmUnspecified"),
    
    EEFILMPERE("eefilmPere"),
    
    EEFILML("eefilmL"),
    
    EEFILMMS6("eefilmMs6"),
    
    EEFILMK6("eefilmK6"),
    
    EEFILMMS12("eefilmMs12"),
    
    EEFILMK12("eefilmK12"),
    
    EEFILMK14("eefilmK14"),
    
    EEFILMK16("eefilmK16"),
    
    EEFILMUNRATED("eefilmUnrated");

    private String value;

    EefilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EefilmRatingEnum fromValue(String text) {
      for (EefilmRatingEnum b : EefilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eefilmRating")
  private EefilmRatingEnum eefilmRating;

  /**
   * The video's rating in Egypt.
   */
  public enum EgfilmRatingEnum {
    EGFILMUNSPECIFIED("egfilmUnspecified"),
    
    EGFILMGN("egfilmGn"),
    
    EGFILM18("egfilm18"),
    
    EGFILMBN("egfilmBn"),
    
    EGFILMUNRATED("egfilmUnrated");

    private String value;

    EgfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EgfilmRatingEnum fromValue(String text) {
      for (EgfilmRatingEnum b : EgfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("egfilmRating")
  private EgfilmRatingEnum egfilmRating;

  /**
   * The video's Eirin (映倫) rating. Eirin is the Japanese rating system.
   */
  public enum EirinRatingEnum {
    EIRINUNSPECIFIED("eirinUnspecified"),
    
    EIRING("eirinG"),
    
    EIRINPG12("eirinPg12"),
    
    EIRINR15PLUS("eirinR15plus"),
    
    EIRINR18PLUS("eirinR18plus"),
    
    EIRINUNRATED("eirinUnrated");

    private String value;

    EirinRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EirinRatingEnum fromValue(String text) {
      for (EirinRatingEnum b : EirinRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eirinRating")
  private EirinRatingEnum eirinRating;

  /**
   * The video's rating from Malaysia's Film Censorship Board.
   */
  public enum FcbmRatingEnum {
    FCBMUNSPECIFIED("fcbmUnspecified"),
    
    FCBMU("fcbmU"),
    
    FCBMPG13("fcbmPg13"),
    
    FCBMP13("fcbmP13"),
    
    FCBM18("fcbm18"),
    
    FCBM18SX("fcbm18sx"),
    
    FCBM18PA("fcbm18pa"),
    
    FCBM18SG("fcbm18sg"),
    
    FCBM18PL("fcbm18pl"),
    
    FCBMUNRATED("fcbmUnrated");

    private String value;

    FcbmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FcbmRatingEnum fromValue(String text) {
      for (FcbmRatingEnum b : FcbmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fcbmRating")
  private FcbmRatingEnum fcbmRating;

  /**
   * The video's rating from Hong Kong's Office for Film, Newspaper and Article Administration.
   */
  public enum FcoRatingEnum {
    FCOUNSPECIFIED("fcoUnspecified"),
    
    FCOI("fcoI"),
    
    FCOIIA("fcoIia"),
    
    FCOIIB("fcoIib"),
    
    FCOII("fcoIi"),
    
    FCOIII("fcoIii"),
    
    FCOUNRATED("fcoUnrated");

    private String value;

    FcoRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FcoRatingEnum fromValue(String text) {
      for (FcoRatingEnum b : FcoRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fcoRating")
  private FcoRatingEnum fcoRating;

  /**
   * This property has been deprecated. Use the contentDetails.contentRating.cncRating instead.
   */
  public enum FmocRatingEnum {
    FMOCUNSPECIFIED("fmocUnspecified"),
    
    FMOCU("fmocU"),
    
    FMOC10("fmoc10"),
    
    FMOC12("fmoc12"),
    
    FMOC16("fmoc16"),
    
    FMOC18("fmoc18"),
    
    FMOCE("fmocE"),
    
    FMOCUNRATED("fmocUnrated");

    private String value;

    FmocRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FmocRatingEnum fromValue(String text) {
      for (FmocRatingEnum b : FmocRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fmocRating")
  private FmocRatingEnum fmocRating;

  /**
   * The video's rating from South Africa's Film and Publication Board.
   */
  public enum FpbRatingEnum {
    FPBUNSPECIFIED("fpbUnspecified"),
    
    FPBA("fpbA"),
    
    FPBPG("fpbPg"),
    
    FPB79PG("fpb79Pg"),
    
    FPB1012PG("fpb1012Pg"),
    
    FPB13("fpb13"),
    
    FPB16("fpb16"),
    
    FPB18("fpb18"),
    
    FPBX18("fpbX18"),
    
    FPBXX("fpbXx"),
    
    FPBUNRATED("fpbUnrated"),
    
    FPB10("fpb10");

    private String value;

    FpbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FpbRatingEnum fromValue(String text) {
      for (FpbRatingEnum b : FpbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fpbRating")
  private FpbRatingEnum fpbRating;

  /**
   * Gets or Sets fpbRatingReasons
   */
  public enum FpbRatingReasonsEnum {
    FPBRATINGREASONUNSPECIFIED("fpbRatingReasonUnspecified"),
    
    FPBBLASPHEMY("fpbBlasphemy"),
    
    FPBLANGUAGE("fpbLanguage"),
    
    FPBNUDITY("fpbNudity"),
    
    FPBPREJUDICE("fpbPrejudice"),
    
    FPBSEX("fpbSex"),
    
    FPBVIOLENCE("fpbViolence"),
    
    FPBDRUGS("fpbDrugs"),
    
    FPBSEXUALVIOLENCE("fpbSexualViolence"),
    
    FPBHORROR("fpbHorror"),
    
    FPBCRIMINALTECHNIQUES("fpbCriminalTechniques"),
    
    FPBIMITATIVEACTSTECHNIQUES("fpbImitativeActsTechniques");

    private String value;

    FpbRatingReasonsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FpbRatingReasonsEnum fromValue(String text) {
      for (FpbRatingReasonsEnum b : FpbRatingReasonsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("fpbRatingReasons")
  private List<FpbRatingReasonsEnum> fpbRatingReasons = null;

  /**
   * The video's Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.
   */
  public enum FskRatingEnum {
    FSKUNSPECIFIED("fskUnspecified"),
    
    FSK0("fsk0"),
    
    FSK6("fsk6"),
    
    FSK12("fsk12"),
    
    FSK16("fsk16"),
    
    FSK18("fsk18"),
    
    FSKUNRATED("fskUnrated");

    private String value;

    FskRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FskRatingEnum fromValue(String text) {
      for (FskRatingEnum b : FskRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("fskRating")
  private FskRatingEnum fskRating;

  /**
   * The video's rating in Greece.
   */
  public enum GrfilmRatingEnum {
    GRFILMUNSPECIFIED("grfilmUnspecified"),
    
    GRFILMK("grfilmK"),
    
    GRFILME("grfilmE"),
    
    GRFILMK12("grfilmK12"),
    
    GRFILMK13("grfilmK13"),
    
    GRFILMK15("grfilmK15"),
    
    GRFILMK17("grfilmK17"),
    
    GRFILMK18("grfilmK18"),
    
    GRFILMUNRATED("grfilmUnrated");

    private String value;

    GrfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrfilmRatingEnum fromValue(String text) {
      for (GrfilmRatingEnum b : GrfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("grfilmRating")
  private GrfilmRatingEnum grfilmRating;

  /**
   * The video's Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.
   */
  public enum IcaaRatingEnum {
    ICAAUNSPECIFIED("icaaUnspecified"),
    
    ICAAAPTA("icaaApta"),
    
    ICAA7("icaa7"),
    
    ICAA12("icaa12"),
    
    ICAA13("icaa13"),
    
    ICAA16("icaa16"),
    
    ICAA18("icaa18"),
    
    ICAAX("icaaX"),
    
    ICAAUNRATED("icaaUnrated");

    private String value;

    IcaaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IcaaRatingEnum fromValue(String text) {
      for (IcaaRatingEnum b : IcaaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("icaaRating")
  private IcaaRatingEnum icaaRating;

  /**
   * The video's Irish Film Classification Office (IFCO - Ireland) rating. See the IFCO website for more information.
   */
  public enum IfcoRatingEnum {
    IFCOUNSPECIFIED("ifcoUnspecified"),
    
    IFCOG("ifcoG"),
    
    IFCOPG("ifcoPg"),
    
    IFCO12("ifco12"),
    
    IFCO12A("ifco12a"),
    
    IFCO15("ifco15"),
    
    IFCO15A("ifco15a"),
    
    IFCO16("ifco16"),
    
    IFCO18("ifco18"),
    
    IFCOUNRATED("ifcoUnrated");

    private String value;

    IfcoRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IfcoRatingEnum fromValue(String text) {
      for (IfcoRatingEnum b : IfcoRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ifcoRating")
  private IfcoRatingEnum ifcoRating;

  /**
   * The video's rating in Israel.
   */
  public enum IlfilmRatingEnum {
    ILFILMUNSPECIFIED("ilfilmUnspecified"),
    
    ILFILMAA("ilfilmAa"),
    
    ILFILM12("ilfilm12"),
    
    ILFILM14("ilfilm14"),
    
    ILFILM16("ilfilm16"),
    
    ILFILM18("ilfilm18"),
    
    ILFILMUNRATED("ilfilmUnrated");

    private String value;

    IlfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IlfilmRatingEnum fromValue(String text) {
      for (IlfilmRatingEnum b : IlfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ilfilmRating")
  private IlfilmRatingEnum ilfilmRating;

  /**
   * The video's INCAA (Instituto Nacional de Cine y Artes Audiovisuales - Argentina) rating.
   */
  public enum IncaaRatingEnum {
    INCAAUNSPECIFIED("incaaUnspecified"),
    
    INCAAATP("incaaAtp"),
    
    INCAASAM13("incaaSam13"),
    
    INCAASAM16("incaaSam16"),
    
    INCAASAM18("incaaSam18"),
    
    INCAAC("incaaC"),
    
    INCAAUNRATED("incaaUnrated");

    private String value;

    IncaaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IncaaRatingEnum fromValue(String text) {
      for (IncaaRatingEnum b : IncaaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("incaaRating")
  private IncaaRatingEnum incaaRating;

  /**
   * The video's rating from the Kenya Film Classification Board.
   */
  public enum KfcbRatingEnum {
    KFCBUNSPECIFIED("kfcbUnspecified"),
    
    KFCBG("kfcbG"),
    
    KFCBPG("kfcbPg"),
    
    KFCB16PLUS("kfcb16plus"),
    
    KFCBR("kfcbR"),
    
    KFCBUNRATED("kfcbUnrated");

    private String value;

    KfcbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KfcbRatingEnum fromValue(String text) {
      for (KfcbRatingEnum b : KfcbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("kfcbRating")
  private KfcbRatingEnum kfcbRating;

  /**
   * The video's NICAM/Kijkwijzer rating from the Nederlands Instituut voor de Classificatie van Audiovisuele Media (Netherlands).
   */
  public enum KijkwijzerRatingEnum {
    KIJKWIJZERUNSPECIFIED("kijkwijzerUnspecified"),
    
    KIJKWIJZERAL("kijkwijzerAl"),
    
    KIJKWIJZER6("kijkwijzer6"),
    
    KIJKWIJZER9("kijkwijzer9"),
    
    KIJKWIJZER12("kijkwijzer12"),
    
    KIJKWIJZER16("kijkwijzer16"),
    
    KIJKWIJZER18("kijkwijzer18"),
    
    KIJKWIJZERUNRATED("kijkwijzerUnrated");

    private String value;

    KijkwijzerRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KijkwijzerRatingEnum fromValue(String text) {
      for (KijkwijzerRatingEnum b : KijkwijzerRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("kijkwijzerRating")
  private KijkwijzerRatingEnum kijkwijzerRating;

  /**
   * The video's Korea Media Rating Board (영상물등급위원회) rating. The KMRB rates videos in South Korea.
   */
  public enum KmrbRatingEnum {
    KMRBUNSPECIFIED("kmrbUnspecified"),
    
    KMRBALL("kmrbAll"),
    
    KMRB12PLUS("kmrb12plus"),
    
    KMRB15PLUS("kmrb15plus"),
    
    KMRBTEENR("kmrbTeenr"),
    
    KMRBR("kmrbR"),
    
    KMRBUNRATED("kmrbUnrated");

    private String value;

    KmrbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KmrbRatingEnum fromValue(String text) {
      for (KmrbRatingEnum b : KmrbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("kmrbRating")
  private KmrbRatingEnum kmrbRating;

  /**
   * The video's rating from Indonesia's Lembaga Sensor Film.
   */
  public enum LsfRatingEnum {
    LSFUNSPECIFIED("lsfUnspecified"),
    
    LSFSU("lsfSu"),
    
    LSFA("lsfA"),
    
    LSFBO("lsfBo"),
    
    LSF13("lsf13"),
    
    LSFR("lsfR"),
    
    LSF17("lsf17"),
    
    LSFD("lsfD"),
    
    LSF21("lsf21"),
    
    LSFUNRATED("lsfUnrated");

    private String value;

    LsfRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LsfRatingEnum fromValue(String text) {
      for (LsfRatingEnum b : LsfRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("lsfRating")
  private LsfRatingEnum lsfRating;

  /**
   * The video's rating from Malta's Film Age-Classification Board.
   */
  public enum MccaaRatingEnum {
    MCCAAUNSPECIFIED("mccaaUnspecified"),
    
    MCCAAU("mccaaU"),
    
    MCCAAPG("mccaaPg"),
    
    MCCAA12A("mccaa12a"),
    
    MCCAA12("mccaa12"),
    
    MCCAA14("mccaa14"),
    
    MCCAA15("mccaa15"),
    
    MCCAA16("mccaa16"),
    
    MCCAA18("mccaa18"),
    
    MCCAAUNRATED("mccaaUnrated");

    private String value;

    MccaaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MccaaRatingEnum fromValue(String text) {
      for (MccaaRatingEnum b : MccaaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mccaaRating")
  private MccaaRatingEnum mccaaRating;

  /**
   * The video's rating from the Danish Film Institute's (Det Danske Filminstitut) Media Council for Children and Young People.
   */
  public enum MccypRatingEnum {
    MCCYPUNSPECIFIED("mccypUnspecified"),
    
    MCCYPA("mccypA"),
    
    MCCYP7("mccyp7"),
    
    MCCYP11("mccyp11"),
    
    MCCYP15("mccyp15"),
    
    MCCYPUNRATED("mccypUnrated");

    private String value;

    MccypRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MccypRatingEnum fromValue(String text) {
      for (MccypRatingEnum b : MccypRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mccypRating")
  private MccypRatingEnum mccypRating;

  /**
   * The video's rating system for Vietnam - MCST
   */
  public enum McstRatingEnum {
    MCSTUNSPECIFIED("mcstUnspecified"),
    
    MCSTP("mcstP"),
    
    MCST0("mcst0"),
    
    MCSTC13("mcstC13"),
    
    MCSTC16("mcstC16"),
    
    MCST16PLUS("mcst16plus"),
    
    MCSTC18("mcstC18"),
    
    MCSTGPG("mcstGPg"),
    
    MCSTUNRATED("mcstUnrated");

    private String value;

    McstRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static McstRatingEnum fromValue(String text) {
      for (McstRatingEnum b : McstRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mcstRating")
  private McstRatingEnum mcstRating;

  /**
   * The video's rating from Singapore's Media Development Authority (MDA) and, specifically, it's Board of Film Censors (BFC).
   */
  public enum MdaRatingEnum {
    MDAUNSPECIFIED("mdaUnspecified"),
    
    MDAG("mdaG"),
    
    MDAPG("mdaPg"),
    
    MDAPG13("mdaPg13"),
    
    MDANC16("mdaNc16"),
    
    MDAM18("mdaM18"),
    
    MDAR21("mdaR21"),
    
    MDAUNRATED("mdaUnrated");

    private String value;

    MdaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MdaRatingEnum fromValue(String text) {
      for (MdaRatingEnum b : MdaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mdaRating")
  private MdaRatingEnum mdaRating;

  /**
   * The video's rating from Medietilsynet, the Norwegian Media Authority.
   */
  public enum MedietilsynetRatingEnum {
    MEDIETILSYNETUNSPECIFIED("medietilsynetUnspecified"),
    
    MEDIETILSYNETA("medietilsynetA"),
    
    MEDIETILSYNET6("medietilsynet6"),
    
    MEDIETILSYNET7("medietilsynet7"),
    
    MEDIETILSYNET9("medietilsynet9"),
    
    MEDIETILSYNET11("medietilsynet11"),
    
    MEDIETILSYNET12("medietilsynet12"),
    
    MEDIETILSYNET15("medietilsynet15"),
    
    MEDIETILSYNET18("medietilsynet18"),
    
    MEDIETILSYNETUNRATED("medietilsynetUnrated");

    private String value;

    MedietilsynetRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MedietilsynetRatingEnum fromValue(String text) {
      for (MedietilsynetRatingEnum b : MedietilsynetRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("medietilsynetRating")
  private MedietilsynetRatingEnum medietilsynetRating;

  /**
   * The video's rating from Finland's Kansallinen Audiovisuaalinen Instituutti (National Audiovisual Institute).
   */
  public enum MekuRatingEnum {
    MEKUUNSPECIFIED("mekuUnspecified"),
    
    MEKUS("mekuS"),
    
    MEKU7("meku7"),
    
    MEKU12("meku12"),
    
    MEKU16("meku16"),
    
    MEKU18("meku18"),
    
    MEKUUNRATED("mekuUnrated");

    private String value;

    MekuRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MekuRatingEnum fromValue(String text) {
      for (MekuRatingEnum b : MekuRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mekuRating")
  private MekuRatingEnum mekuRating;

  /**
   * The rating system for MENA countries, a clone of MPAA. It is needed to prevent titles go live w/o additional QC check, since some of them can be inappropriate for the countries at all. See b/33408548 for more details.
   */
  public enum MenaMpaaRatingEnum {
    MENAMPAAUNSPECIFIED("menaMpaaUnspecified"),
    
    MENAMPAAG("menaMpaaG"),
    
    MENAMPAAPG("menaMpaaPg"),
    
    MENAMPAAPG13("menaMpaaPg13"),
    
    MENAMPAAR("menaMpaaR"),
    
    MENAMPAAUNRATED("menaMpaaUnrated");

    private String value;

    MenaMpaaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MenaMpaaRatingEnum fromValue(String text) {
      for (MenaMpaaRatingEnum b : MenaMpaaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("menaMpaaRating")
  private MenaMpaaRatingEnum menaMpaaRating;

  /**
   * The video's rating from the Ministero dei Beni e delle Attività Culturali e del Turismo (Italy).
   */
  public enum MibacRatingEnum {
    MIBACUNSPECIFIED("mibacUnspecified"),
    
    MIBACT("mibacT"),
    
    MIBACVAP("mibacVap"),
    
    MIBACVM12("mibacVm12"),
    
    MIBACVM14("mibacVm14"),
    
    MIBACVM18("mibacVm18"),
    
    MIBACUNRATED("mibacUnrated");

    private String value;

    MibacRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MibacRatingEnum fromValue(String text) {
      for (MibacRatingEnum b : MibacRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mibacRating")
  private MibacRatingEnum mibacRating;

  /**
   * The video's Ministerio de Cultura (Colombia) rating.
   */
  public enum MocRatingEnum {
    MOCUNSPECIFIED("mocUnspecified"),
    
    MOCE("mocE"),
    
    MOCT("mocT"),
    
    MOC7("moc7"),
    
    MOC12("moc12"),
    
    MOC15("moc15"),
    
    MOC18("moc18"),
    
    MOCX("mocX"),
    
    MOCBANNED("mocBanned"),
    
    MOCUNRATED("mocUnrated");

    private String value;

    MocRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MocRatingEnum fromValue(String text) {
      for (MocRatingEnum b : MocRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mocRating")
  private MocRatingEnum mocRating;

  /**
   * The video's rating from Taiwan's Ministry of Culture (文化部).
   */
  public enum MoctwRatingEnum {
    MOCTWUNSPECIFIED("moctwUnspecified"),
    
    MOCTWG("moctwG"),
    
    MOCTWP("moctwP"),
    
    MOCTWPG("moctwPg"),
    
    MOCTWR("moctwR"),
    
    MOCTWUNRATED("moctwUnrated"),
    
    MOCTWR12("moctwR12"),
    
    MOCTWR15("moctwR15");

    private String value;

    MoctwRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MoctwRatingEnum fromValue(String text) {
      for (MoctwRatingEnum b : MoctwRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("moctwRating")
  private MoctwRatingEnum moctwRating;

  /**
   * The video's Motion Picture Association of America (MPAA) rating.
   */
  public enum MpaaRatingEnum {
    MPAAUNSPECIFIED("mpaaUnspecified"),
    
    MPAAG("mpaaG"),
    
    MPAAPG("mpaaPg"),
    
    MPAAPG13("mpaaPg13"),
    
    MPAAR("mpaaR"),
    
    MPAANC17("mpaaNc17"),
    
    MPAAX("mpaaX"),
    
    MPAAUNRATED("mpaaUnrated");

    private String value;

    MpaaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MpaaRatingEnum fromValue(String text) {
      for (MpaaRatingEnum b : MpaaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mpaaRating")
  private MpaaRatingEnum mpaaRating;

  /**
   * The rating system for trailer, DVD, and Ad in the US. See http://movielabs.com/md/ratings/v2.3/html/US_MPAAT_Ratings.html.
   */
  public enum MpaatRatingEnum {
    MPAATUNSPECIFIED("mpaatUnspecified"),
    
    MPAATGB("mpaatGb"),
    
    MPAATRB("mpaatRb");

    private String value;

    MpaatRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MpaatRatingEnum fromValue(String text) {
      for (MpaatRatingEnum b : MpaatRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mpaatRating")
  private MpaatRatingEnum mpaatRating;

  /**
   * The video's rating from the Movie and Television Review and Classification Board (Philippines).
   */
  public enum MtrcbRatingEnum {
    MTRCBUNSPECIFIED("mtrcbUnspecified"),
    
    MTRCBG("mtrcbG"),
    
    MTRCBPG("mtrcbPg"),
    
    MTRCBR13("mtrcbR13"),
    
    MTRCBR16("mtrcbR16"),
    
    MTRCBR18("mtrcbR18"),
    
    MTRCBX("mtrcbX"),
    
    MTRCBUNRATED("mtrcbUnrated");

    private String value;

    MtrcbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MtrcbRatingEnum fromValue(String text) {
      for (MtrcbRatingEnum b : MtrcbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mtrcbRating")
  private MtrcbRatingEnum mtrcbRating;

  /**
   * The video's rating from the Maldives National Bureau of Classification.
   */
  public enum NbcRatingEnum {
    NBCUNSPECIFIED("nbcUnspecified"),
    
    NBCG("nbcG"),
    
    NBCPG("nbcPg"),
    
    NBC12PLUS("nbc12plus"),
    
    NBC15PLUS("nbc15plus"),
    
    NBC18PLUS("nbc18plus"),
    
    NBC18PLUSR("nbc18plusr"),
    
    NBCPU("nbcPu"),
    
    NBCUNRATED("nbcUnrated");

    private String value;

    NbcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NbcRatingEnum fromValue(String text) {
      for (NbcRatingEnum b : NbcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nbcRating")
  private NbcRatingEnum nbcRating;

  /**
   * The video's rating in Poland.
   */
  public enum NbcplRatingEnum {
    NBCPLUNSPECIFIED("nbcplUnspecified"),
    
    NBCPLI("nbcplI"),
    
    NBCPLII("nbcplIi"),
    
    NBCPLIII("nbcplIii"),
    
    NBCPLIV("nbcplIv"),
    
    NBCPL18PLUS("nbcpl18plus"),
    
    NBCPLUNRATED("nbcplUnrated");

    private String value;

    NbcplRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NbcplRatingEnum fromValue(String text) {
      for (NbcplRatingEnum b : NbcplRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nbcplRating")
  private NbcplRatingEnum nbcplRating;

  /**
   * The video's rating from the Bulgarian National Film Center.
   */
  public enum NfrcRatingEnum {
    NFRCUNSPECIFIED("nfrcUnspecified"),
    
    NFRCA("nfrcA"),
    
    NFRCB("nfrcB"),
    
    NFRCC("nfrcC"),
    
    NFRCD("nfrcD"),
    
    NFRCX("nfrcX"),
    
    NFRCUNRATED("nfrcUnrated");

    private String value;

    NfrcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NfrcRatingEnum fromValue(String text) {
      for (NfrcRatingEnum b : NfrcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nfrcRating")
  private NfrcRatingEnum nfrcRating;

  /**
   * The video's rating from Nigeria's National Film and Video Censors Board.
   */
  public enum NfvcbRatingEnum {
    NFVCBUNSPECIFIED("nfvcbUnspecified"),
    
    NFVCBG("nfvcbG"),
    
    NFVCBPG("nfvcbPg"),
    
    NFVCB12("nfvcb12"),
    
    NFVCB12A("nfvcb12a"),
    
    NFVCB15("nfvcb15"),
    
    NFVCB18("nfvcb18"),
    
    NFVCBRE("nfvcbRe"),
    
    NFVCBUNRATED("nfvcbUnrated");

    private String value;

    NfvcbRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NfvcbRatingEnum fromValue(String text) {
      for (NfvcbRatingEnum b : NfvcbRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nfvcbRating")
  private NfvcbRatingEnum nfvcbRating;

  /**
   * The video's rating from the Nacionãlais Kino centrs (National Film Centre of Latvia).
   */
  public enum NkclvRatingEnum {
    NKCLVUNSPECIFIED("nkclvUnspecified"),
    
    NKCLVU("nkclvU"),
    
    NKCLV7PLUS("nkclv7plus"),
    
    NKCLV12PLUS("nkclv12plus"),
    
    NKCLV16PLUS("nkclv16plus"),
    
    NKCLV18PLUS("nkclv18plus"),
    
    NKCLVUNRATED("nkclvUnrated");

    private String value;

    NkclvRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NkclvRatingEnum fromValue(String text) {
      for (NkclvRatingEnum b : NkclvRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nkclvRating")
  private NkclvRatingEnum nkclvRating;

  /**
   * The National Media Council ratings system for United Arab Emirates.
   */
  public enum NmcRatingEnum {
    NMCUNSPECIFIED("nmcUnspecified"),
    
    NMCG("nmcG"),
    
    NMCPG("nmcPg"),
    
    NMCPG13("nmcPg13"),
    
    NMCPG15("nmcPg15"),
    
    NMC15PLUS("nmc15plus"),
    
    NMC18PLUS("nmc18plus"),
    
    NMC18TC("nmc18tc"),
    
    NMCUNRATED("nmcUnrated");

    private String value;

    NmcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NmcRatingEnum fromValue(String text) {
      for (NmcRatingEnum b : NmcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("nmcRating")
  private NmcRatingEnum nmcRating;

  /**
   * The video's Office of Film and Literature Classification (OFLC - New Zealand) rating.
   */
  public enum OflcRatingEnum {
    OFLCUNSPECIFIED("oflcUnspecified"),
    
    OFLCG("oflcG"),
    
    OFLCPG("oflcPg"),
    
    OFLCM("oflcM"),
    
    OFLCR13("oflcR13"),
    
    OFLCR15("oflcR15"),
    
    OFLCR16("oflcR16"),
    
    OFLCR18("oflcR18"),
    
    OFLCUNRATED("oflcUnrated"),
    
    OFLCRP13("oflcRp13"),
    
    OFLCRP16("oflcRp16"),
    
    OFLCRP18("oflcRp18");

    private String value;

    OflcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OflcRatingEnum fromValue(String text) {
      for (OflcRatingEnum b : OflcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("oflcRating")
  private OflcRatingEnum oflcRating;

  /**
   * The video's rating in Peru.
   */
  public enum PefilmRatingEnum {
    PEFILMUNSPECIFIED("pefilmUnspecified"),
    
    PEFILMPT("pefilmPt"),
    
    PEFILMPG("pefilmPg"),
    
    PEFILM14("pefilm14"),
    
    PEFILM18("pefilm18"),
    
    PEFILMUNRATED("pefilmUnrated");

    private String value;

    PefilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PefilmRatingEnum fromValue(String text) {
      for (PefilmRatingEnum b : PefilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("pefilmRating")
  private PefilmRatingEnum pefilmRating;

  /**
   * The video's rating from the Hungarian Nemzeti Filmiroda, the Rating Committee of the National Office of Film.
   */
  public enum RcnofRatingEnum {
    RCNOFUNSPECIFIED("rcnofUnspecified"),
    
    RCNOFI("rcnofI"),
    
    RCNOFII("rcnofIi"),
    
    RCNOFIII("rcnofIii"),
    
    RCNOFIV("rcnofIv"),
    
    RCNOFV("rcnofV"),
    
    RCNOFVI("rcnofVi"),
    
    RCNOFUNRATED("rcnofUnrated");

    private String value;

    RcnofRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RcnofRatingEnum fromValue(String text) {
      for (RcnofRatingEnum b : RcnofRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("rcnofRating")
  private RcnofRatingEnum rcnofRating;

  /**
   * The video's rating in Venezuela.
   */
  public enum ResorteviolenciaRatingEnum {
    RESORTEVIOLENCIAUNSPECIFIED("resorteviolenciaUnspecified"),
    
    RESORTEVIOLENCIAA("resorteviolenciaA"),
    
    RESORTEVIOLENCIAB("resorteviolenciaB"),
    
    RESORTEVIOLENCIAC("resorteviolenciaC"),
    
    RESORTEVIOLENCIAD("resorteviolenciaD"),
    
    RESORTEVIOLENCIAE("resorteviolenciaE"),
    
    RESORTEVIOLENCIAUNRATED("resorteviolenciaUnrated");

    private String value;

    ResorteviolenciaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResorteviolenciaRatingEnum fromValue(String text) {
      for (ResorteviolenciaRatingEnum b : ResorteviolenciaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("resorteviolenciaRating")
  private ResorteviolenciaRatingEnum resorteviolenciaRating;

  /**
   * The video's General Directorate of Radio, Television and Cinematography (Mexico) rating.
   */
  public enum RtcRatingEnum {
    RTCUNSPECIFIED("rtcUnspecified"),
    
    RTCAA("rtcAa"),
    
    RTCA("rtcA"),
    
    RTCB("rtcB"),
    
    RTCB15("rtcB15"),
    
    RTCC("rtcC"),
    
    RTCD("rtcD"),
    
    RTCUNRATED("rtcUnrated");

    private String value;

    RtcRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RtcRatingEnum fromValue(String text) {
      for (RtcRatingEnum b : RtcRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("rtcRating")
  private RtcRatingEnum rtcRating;

  /**
   * The video's rating from Ireland's Raidió Teilifís Éireann.
   */
  public enum RteRatingEnum {
    RTEUNSPECIFIED("rteUnspecified"),
    
    RTEGA("rteGa"),
    
    RTECH("rteCh"),
    
    RTEPS("rtePs"),
    
    RTEMA("rteMa"),
    
    RTEUNRATED("rteUnrated");

    private String value;

    RteRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RteRatingEnum fromValue(String text) {
      for (RteRatingEnum b : RteRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("rteRating")
  private RteRatingEnum rteRating;

  /**
   * The video's National Film Registry of the Russian Federation (MKRF - Russia) rating.
   */
  public enum RussiaRatingEnum {
    RUSSIAUNSPECIFIED("russiaUnspecified"),
    
    RUSSIA0("russia0"),
    
    RUSSIA6("russia6"),
    
    RUSSIA12("russia12"),
    
    RUSSIA16("russia16"),
    
    RUSSIA18("russia18"),
    
    RUSSIAUNRATED("russiaUnrated");

    private String value;

    RussiaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RussiaRatingEnum fromValue(String text) {
      for (RussiaRatingEnum b : RussiaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("russiaRating")
  private RussiaRatingEnum russiaRating;

  /**
   * The video's rating in Slovakia.
   */
  public enum SkfilmRatingEnum {
    SKFILMUNSPECIFIED("skfilmUnspecified"),
    
    SKFILMG("skfilmG"),
    
    SKFILMP2("skfilmP2"),
    
    SKFILMP5("skfilmP5"),
    
    SKFILMP8("skfilmP8"),
    
    SKFILMUNRATED("skfilmUnrated");

    private String value;

    SkfilmRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SkfilmRatingEnum fromValue(String text) {
      for (SkfilmRatingEnum b : SkfilmRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("skfilmRating")
  private SkfilmRatingEnum skfilmRating;

  /**
   * The video's rating in Iceland.
   */
  public enum SmaisRatingEnum {
    SMAISUNSPECIFIED("smaisUnspecified"),
    
    SMAISL("smaisL"),
    
    SMAIS7("smais7"),
    
    SMAIS12("smais12"),
    
    SMAIS14("smais14"),
    
    SMAIS16("smais16"),
    
    SMAIS18("smais18"),
    
    SMAISUNRATED("smaisUnrated");

    private String value;

    SmaisRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SmaisRatingEnum fromValue(String text) {
      for (SmaisRatingEnum b : SmaisRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("smaisRating")
  private SmaisRatingEnum smaisRating;

  /**
   * The video's rating from Statens medieråd (Sweden's National Media Council).
   */
  public enum SmsaRatingEnum {
    SMSAUNSPECIFIED("smsaUnspecified"),
    
    SMSAA("smsaA"),
    
    SMSA7("smsa7"),
    
    SMSA11("smsa11"),
    
    SMSA15("smsa15"),
    
    SMSAUNRATED("smsaUnrated");

    private String value;

    SmsaRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SmsaRatingEnum fromValue(String text) {
      for (SmsaRatingEnum b : SmsaRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("smsaRating")
  private SmsaRatingEnum smsaRating;

  /**
   * The video's TV Parental Guidelines (TVPG) rating.
   */
  public enum TvpgRatingEnum {
    TVPGUNSPECIFIED("tvpgUnspecified"),
    
    TVPGY("tvpgY"),
    
    TVPGY7("tvpgY7"),
    
    TVPGY7FV("tvpgY7Fv"),
    
    TVPGG("tvpgG"),
    
    TVPGPG("tvpgPg"),
    
    PG14("pg14"),
    
    TVPGMA("tvpgMa"),
    
    TVPGUNRATED("tvpgUnrated");

    private String value;

    TvpgRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TvpgRatingEnum fromValue(String text) {
      for (TvpgRatingEnum b : TvpgRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("tvpgRating")
  private TvpgRatingEnum tvpgRating;

  /**
   * A rating that YouTube uses to identify age-restricted content.
   */
  public enum YtRatingEnum {
    YTUNSPECIFIED("ytUnspecified"),
    
    YTAGERESTRICTED("ytAgeRestricted");

    private String value;

    YtRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static YtRatingEnum fromValue(String text) {
      for (YtRatingEnum b : YtRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ytRating")
  private YtRatingEnum ytRating;

  public ContentRating acbRating(AcbRatingEnum acbRating) {
    this.acbRating = acbRating;
    return this;
  }

   /**
   * The video's Australian Classification Board (ACB) or Australian Communications and Media Authority (ACMA) rating. ACMA ratings are used to classify children's television programming.
   * @return acbRating
  **/
  @ApiModelProperty(value = "The video's Australian Classification Board (ACB) or Australian Communications and Media Authority (ACMA) rating. ACMA ratings are used to classify children's television programming.")
  public AcbRatingEnum getAcbRating() {
    return acbRating;
  }

  public void setAcbRating(AcbRatingEnum acbRating) {
    this.acbRating = acbRating;
  }

  public ContentRating agcomRating(AgcomRatingEnum agcomRating) {
    this.agcomRating = agcomRating;
    return this;
  }

   /**
   * The video's rating from Italy's Autorità per le Garanzie nelle Comunicazioni (AGCOM).
   * @return agcomRating
  **/
  @ApiModelProperty(value = "The video's rating from Italy's Autorità per le Garanzie nelle Comunicazioni (AGCOM).")
  public AgcomRatingEnum getAgcomRating() {
    return agcomRating;
  }

  public void setAgcomRating(AgcomRatingEnum agcomRating) {
    this.agcomRating = agcomRating;
  }

  public ContentRating anatelRating(AnatelRatingEnum anatelRating) {
    this.anatelRating = anatelRating;
    return this;
  }

   /**
   * The video's Anatel (Asociación Nacional de Televisión) rating for Chilean television.
   * @return anatelRating
  **/
  @ApiModelProperty(value = "The video's Anatel (Asociación Nacional de Televisión) rating for Chilean television.")
  public AnatelRatingEnum getAnatelRating() {
    return anatelRating;
  }

  public void setAnatelRating(AnatelRatingEnum anatelRating) {
    this.anatelRating = anatelRating;
  }

  public ContentRating bbfcRating(BbfcRatingEnum bbfcRating) {
    this.bbfcRating = bbfcRating;
    return this;
  }

   /**
   * The video's British Board of Film Classification (BBFC) rating.
   * @return bbfcRating
  **/
  @ApiModelProperty(value = "The video's British Board of Film Classification (BBFC) rating.")
  public BbfcRatingEnum getBbfcRating() {
    return bbfcRating;
  }

  public void setBbfcRating(BbfcRatingEnum bbfcRating) {
    this.bbfcRating = bbfcRating;
  }

  public ContentRating bfvcRating(BfvcRatingEnum bfvcRating) {
    this.bfvcRating = bfvcRating;
    return this;
  }

   /**
   * The video's rating from Thailand's Board of Film and Video Censors.
   * @return bfvcRating
  **/
  @ApiModelProperty(value = "The video's rating from Thailand's Board of Film and Video Censors.")
  public BfvcRatingEnum getBfvcRating() {
    return bfvcRating;
  }

  public void setBfvcRating(BfvcRatingEnum bfvcRating) {
    this.bfvcRating = bfvcRating;
  }

  public ContentRating bmukkRating(BmukkRatingEnum bmukkRating) {
    this.bmukkRating = bmukkRating;
    return this;
  }

   /**
   * The video's rating from the Austrian Board of Media Classification (Bundesministerium für Unterricht, Kunst und Kultur).
   * @return bmukkRating
  **/
  @ApiModelProperty(value = "The video's rating from the Austrian Board of Media Classification (Bundesministerium für Unterricht, Kunst und Kultur).")
  public BmukkRatingEnum getBmukkRating() {
    return bmukkRating;
  }

  public void setBmukkRating(BmukkRatingEnum bmukkRating) {
    this.bmukkRating = bmukkRating;
  }

  public ContentRating catvRating(CatvRatingEnum catvRating) {
    this.catvRating = catvRating;
    return this;
  }

   /**
   * Rating system for Canadian TV - Canadian TV Classification System The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian English-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.
   * @return catvRating
  **/
  @ApiModelProperty(value = "Rating system for Canadian TV - Canadian TV Classification System The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian English-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.")
  public CatvRatingEnum getCatvRating() {
    return catvRating;
  }

  public void setCatvRating(CatvRatingEnum catvRating) {
    this.catvRating = catvRating;
  }

  public ContentRating catvfrRating(CatvfrRatingEnum catvfrRating) {
    this.catvfrRating = catvfrRating;
    return this;
  }

   /**
   * The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian French-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.
   * @return catvfrRating
  **/
  @ApiModelProperty(value = "The video's rating from the Canadian Radio-Television and Telecommunications Commission (CRTC) for Canadian French-language broadcasts. For more information, see the Canadian Broadcast Standards Council website.")
  public CatvfrRatingEnum getCatvfrRating() {
    return catvfrRating;
  }

  public void setCatvfrRating(CatvfrRatingEnum catvfrRating) {
    this.catvfrRating = catvfrRating;
  }

  public ContentRating cbfcRating(CbfcRatingEnum cbfcRating) {
    this.cbfcRating = cbfcRating;
    return this;
  }

   /**
   * The video's Central Board of Film Certification (CBFC - India) rating.
   * @return cbfcRating
  **/
  @ApiModelProperty(value = "The video's Central Board of Film Certification (CBFC - India) rating.")
  public CbfcRatingEnum getCbfcRating() {
    return cbfcRating;
  }

  public void setCbfcRating(CbfcRatingEnum cbfcRating) {
    this.cbfcRating = cbfcRating;
  }

  public ContentRating cccRating(CccRatingEnum cccRating) {
    this.cccRating = cccRating;
    return this;
  }

   /**
   * The video's Consejo de Calificación Cinematográfica (Chile) rating.
   * @return cccRating
  **/
  @ApiModelProperty(value = "The video's Consejo de Calificación Cinematográfica (Chile) rating.")
  public CccRatingEnum getCccRating() {
    return cccRating;
  }

  public void setCccRating(CccRatingEnum cccRating) {
    this.cccRating = cccRating;
  }

  public ContentRating cceRating(CceRatingEnum cceRating) {
    this.cceRating = cceRating;
    return this;
  }

   /**
   * The video's rating from Portugal's Comissão de Classificação de Espect´culos.
   * @return cceRating
  **/
  @ApiModelProperty(value = "The video's rating from Portugal's Comissão de Classificação de Espect´culos.")
  public CceRatingEnum getCceRating() {
    return cceRating;
  }

  public void setCceRating(CceRatingEnum cceRating) {
    this.cceRating = cceRating;
  }

  public ContentRating chfilmRating(ChfilmRatingEnum chfilmRating) {
    this.chfilmRating = chfilmRating;
    return this;
  }

   /**
   * The video's rating in Switzerland.
   * @return chfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Switzerland.")
  public ChfilmRatingEnum getChfilmRating() {
    return chfilmRating;
  }

  public void setChfilmRating(ChfilmRatingEnum chfilmRating) {
    this.chfilmRating = chfilmRating;
  }

  public ContentRating chvrsRating(ChvrsRatingEnum chvrsRating) {
    this.chvrsRating = chvrsRating;
    return this;
  }

   /**
   * The video's Canadian Home Video Rating System (CHVRS) rating.
   * @return chvrsRating
  **/
  @ApiModelProperty(value = "The video's Canadian Home Video Rating System (CHVRS) rating.")
  public ChvrsRatingEnum getChvrsRating() {
    return chvrsRating;
  }

  public void setChvrsRating(ChvrsRatingEnum chvrsRating) {
    this.chvrsRating = chvrsRating;
  }

  public ContentRating cicfRating(CicfRatingEnum cicfRating) {
    this.cicfRating = cicfRating;
    return this;
  }

   /**
   * The video's rating from the Commission de Contrôle des Films (Belgium).
   * @return cicfRating
  **/
  @ApiModelProperty(value = "The video's rating from the Commission de Contrôle des Films (Belgium).")
  public CicfRatingEnum getCicfRating() {
    return cicfRating;
  }

  public void setCicfRating(CicfRatingEnum cicfRating) {
    this.cicfRating = cicfRating;
  }

  public ContentRating cnaRating(CnaRatingEnum cnaRating) {
    this.cnaRating = cnaRating;
    return this;
  }

   /**
   * The video's rating from Romania's CONSILIUL NATIONAL AL AUDIOVIZUALULUI (CNA).
   * @return cnaRating
  **/
  @ApiModelProperty(value = "The video's rating from Romania's CONSILIUL NATIONAL AL AUDIOVIZUALULUI (CNA).")
  public CnaRatingEnum getCnaRating() {
    return cnaRating;
  }

  public void setCnaRating(CnaRatingEnum cnaRating) {
    this.cnaRating = cnaRating;
  }

  public ContentRating cncRating(CncRatingEnum cncRating) {
    this.cncRating = cncRating;
    return this;
  }

   /**
   * Rating system in France - Commission de classification cinematographique
   * @return cncRating
  **/
  @ApiModelProperty(value = "Rating system in France - Commission de classification cinematographique")
  public CncRatingEnum getCncRating() {
    return cncRating;
  }

  public void setCncRating(CncRatingEnum cncRating) {
    this.cncRating = cncRating;
  }

  public ContentRating csaRating(CsaRatingEnum csaRating) {
    this.csaRating = csaRating;
    return this;
  }

   /**
   * The video's rating from France's Conseil supérieur de l’audiovisuel, which rates broadcast content.
   * @return csaRating
  **/
  @ApiModelProperty(value = "The video's rating from France's Conseil supérieur de l’audiovisuel, which rates broadcast content.")
  public CsaRatingEnum getCsaRating() {
    return csaRating;
  }

  public void setCsaRating(CsaRatingEnum csaRating) {
    this.csaRating = csaRating;
  }

  public ContentRating cscfRating(CscfRatingEnum cscfRating) {
    this.cscfRating = cscfRating;
    return this;
  }

   /**
   * The video's rating from Luxembourg's Commission de surveillance de la classification des films (CSCF).
   * @return cscfRating
  **/
  @ApiModelProperty(value = "The video's rating from Luxembourg's Commission de surveillance de la classification des films (CSCF).")
  public CscfRatingEnum getCscfRating() {
    return cscfRating;
  }

  public void setCscfRating(CscfRatingEnum cscfRating) {
    this.cscfRating = cscfRating;
  }

  public ContentRating czfilmRating(CzfilmRatingEnum czfilmRating) {
    this.czfilmRating = czfilmRating;
    return this;
  }

   /**
   * The video's rating in the Czech Republic.
   * @return czfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in the Czech Republic.")
  public CzfilmRatingEnum getCzfilmRating() {
    return czfilmRating;
  }

  public void setCzfilmRating(CzfilmRatingEnum czfilmRating) {
    this.czfilmRating = czfilmRating;
  }

  public ContentRating djctqRating(DjctqRatingEnum djctqRating) {
    this.djctqRating = djctqRating;
    return this;
  }

   /**
   * The video's Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.
   * @return djctqRating
  **/
  @ApiModelProperty(value = "The video's Departamento de Justiça, Classificação, Qualificação e Títulos (DJCQT - Brazil) rating.")
  public DjctqRatingEnum getDjctqRating() {
    return djctqRating;
  }

  public void setDjctqRating(DjctqRatingEnum djctqRating) {
    this.djctqRating = djctqRating;
  }

  public ContentRating djctqRatingReasons(List<DjctqRatingReasonsEnum> djctqRatingReasons) {
    this.djctqRatingReasons = djctqRatingReasons;
    return this;
  }

  public ContentRating addDjctqRatingReasonsItem(DjctqRatingReasonsEnum djctqRatingReasonsItem) {
    if (this.djctqRatingReasons == null) {
      this.djctqRatingReasons = new ArrayList<DjctqRatingReasonsEnum>();
    }
    this.djctqRatingReasons.add(djctqRatingReasonsItem);
    return this;
  }

   /**
   * Reasons that explain why the video received its DJCQT (Brazil) rating.
   * @return djctqRatingReasons
  **/
  @ApiModelProperty(value = "Reasons that explain why the video received its DJCQT (Brazil) rating.")
  public List<DjctqRatingReasonsEnum> getDjctqRatingReasons() {
    return djctqRatingReasons;
  }

  public void setDjctqRatingReasons(List<DjctqRatingReasonsEnum> djctqRatingReasons) {
    this.djctqRatingReasons = djctqRatingReasons;
  }

  public ContentRating ecbmctRating(EcbmctRatingEnum ecbmctRating) {
    this.ecbmctRating = ecbmctRating;
    return this;
  }

   /**
   * Rating system in Turkey - Evaluation and Classification Board of the Ministry of Culture and Tourism
   * @return ecbmctRating
  **/
  @ApiModelProperty(value = "Rating system in Turkey - Evaluation and Classification Board of the Ministry of Culture and Tourism")
  public EcbmctRatingEnum getEcbmctRating() {
    return ecbmctRating;
  }

  public void setEcbmctRating(EcbmctRatingEnum ecbmctRating) {
    this.ecbmctRating = ecbmctRating;
  }

  public ContentRating eefilmRating(EefilmRatingEnum eefilmRating) {
    this.eefilmRating = eefilmRating;
    return this;
  }

   /**
   * The video's rating in Estonia.
   * @return eefilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Estonia.")
  public EefilmRatingEnum getEefilmRating() {
    return eefilmRating;
  }

  public void setEefilmRating(EefilmRatingEnum eefilmRating) {
    this.eefilmRating = eefilmRating;
  }

  public ContentRating egfilmRating(EgfilmRatingEnum egfilmRating) {
    this.egfilmRating = egfilmRating;
    return this;
  }

   /**
   * The video's rating in Egypt.
   * @return egfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Egypt.")
  public EgfilmRatingEnum getEgfilmRating() {
    return egfilmRating;
  }

  public void setEgfilmRating(EgfilmRatingEnum egfilmRating) {
    this.egfilmRating = egfilmRating;
  }

  public ContentRating eirinRating(EirinRatingEnum eirinRating) {
    this.eirinRating = eirinRating;
    return this;
  }

   /**
   * The video's Eirin (映倫) rating. Eirin is the Japanese rating system.
   * @return eirinRating
  **/
  @ApiModelProperty(value = "The video's Eirin (映倫) rating. Eirin is the Japanese rating system.")
  public EirinRatingEnum getEirinRating() {
    return eirinRating;
  }

  public void setEirinRating(EirinRatingEnum eirinRating) {
    this.eirinRating = eirinRating;
  }

  public ContentRating fcbmRating(FcbmRatingEnum fcbmRating) {
    this.fcbmRating = fcbmRating;
    return this;
  }

   /**
   * The video's rating from Malaysia's Film Censorship Board.
   * @return fcbmRating
  **/
  @ApiModelProperty(value = "The video's rating from Malaysia's Film Censorship Board.")
  public FcbmRatingEnum getFcbmRating() {
    return fcbmRating;
  }

  public void setFcbmRating(FcbmRatingEnum fcbmRating) {
    this.fcbmRating = fcbmRating;
  }

  public ContentRating fcoRating(FcoRatingEnum fcoRating) {
    this.fcoRating = fcoRating;
    return this;
  }

   /**
   * The video's rating from Hong Kong's Office for Film, Newspaper and Article Administration.
   * @return fcoRating
  **/
  @ApiModelProperty(value = "The video's rating from Hong Kong's Office for Film, Newspaper and Article Administration.")
  public FcoRatingEnum getFcoRating() {
    return fcoRating;
  }

  public void setFcoRating(FcoRatingEnum fcoRating) {
    this.fcoRating = fcoRating;
  }

  public ContentRating fmocRating(FmocRatingEnum fmocRating) {
    this.fmocRating = fmocRating;
    return this;
  }

   /**
   * This property has been deprecated. Use the contentDetails.contentRating.cncRating instead.
   * @return fmocRating
  **/
  @ApiModelProperty(value = "This property has been deprecated. Use the contentDetails.contentRating.cncRating instead.")
  public FmocRatingEnum getFmocRating() {
    return fmocRating;
  }

  public void setFmocRating(FmocRatingEnum fmocRating) {
    this.fmocRating = fmocRating;
  }

  public ContentRating fpbRating(FpbRatingEnum fpbRating) {
    this.fpbRating = fpbRating;
    return this;
  }

   /**
   * The video's rating from South Africa's Film and Publication Board.
   * @return fpbRating
  **/
  @ApiModelProperty(value = "The video's rating from South Africa's Film and Publication Board.")
  public FpbRatingEnum getFpbRating() {
    return fpbRating;
  }

  public void setFpbRating(FpbRatingEnum fpbRating) {
    this.fpbRating = fpbRating;
  }

  public ContentRating fpbRatingReasons(List<FpbRatingReasonsEnum> fpbRatingReasons) {
    this.fpbRatingReasons = fpbRatingReasons;
    return this;
  }

  public ContentRating addFpbRatingReasonsItem(FpbRatingReasonsEnum fpbRatingReasonsItem) {
    if (this.fpbRatingReasons == null) {
      this.fpbRatingReasons = new ArrayList<FpbRatingReasonsEnum>();
    }
    this.fpbRatingReasons.add(fpbRatingReasonsItem);
    return this;
  }

   /**
   * Reasons that explain why the video received its FPB (South Africa) rating.
   * @return fpbRatingReasons
  **/
  @ApiModelProperty(value = "Reasons that explain why the video received its FPB (South Africa) rating.")
  public List<FpbRatingReasonsEnum> getFpbRatingReasons() {
    return fpbRatingReasons;
  }

  public void setFpbRatingReasons(List<FpbRatingReasonsEnum> fpbRatingReasons) {
    this.fpbRatingReasons = fpbRatingReasons;
  }

  public ContentRating fskRating(FskRatingEnum fskRating) {
    this.fskRating = fskRating;
    return this;
  }

   /**
   * The video's Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.
   * @return fskRating
  **/
  @ApiModelProperty(value = "The video's Freiwillige Selbstkontrolle der Filmwirtschaft (FSK - Germany) rating.")
  public FskRatingEnum getFskRating() {
    return fskRating;
  }

  public void setFskRating(FskRatingEnum fskRating) {
    this.fskRating = fskRating;
  }

  public ContentRating grfilmRating(GrfilmRatingEnum grfilmRating) {
    this.grfilmRating = grfilmRating;
    return this;
  }

   /**
   * The video's rating in Greece.
   * @return grfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Greece.")
  public GrfilmRatingEnum getGrfilmRating() {
    return grfilmRating;
  }

  public void setGrfilmRating(GrfilmRatingEnum grfilmRating) {
    this.grfilmRating = grfilmRating;
  }

  public ContentRating icaaRating(IcaaRatingEnum icaaRating) {
    this.icaaRating = icaaRating;
    return this;
  }

   /**
   * The video's Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.
   * @return icaaRating
  **/
  @ApiModelProperty(value = "The video's Instituto de la Cinematografía y de las Artes Audiovisuales (ICAA - Spain) rating.")
  public IcaaRatingEnum getIcaaRating() {
    return icaaRating;
  }

  public void setIcaaRating(IcaaRatingEnum icaaRating) {
    this.icaaRating = icaaRating;
  }

  public ContentRating ifcoRating(IfcoRatingEnum ifcoRating) {
    this.ifcoRating = ifcoRating;
    return this;
  }

   /**
   * The video's Irish Film Classification Office (IFCO - Ireland) rating. See the IFCO website for more information.
   * @return ifcoRating
  **/
  @ApiModelProperty(value = "The video's Irish Film Classification Office (IFCO - Ireland) rating. See the IFCO website for more information.")
  public IfcoRatingEnum getIfcoRating() {
    return ifcoRating;
  }

  public void setIfcoRating(IfcoRatingEnum ifcoRating) {
    this.ifcoRating = ifcoRating;
  }

  public ContentRating ilfilmRating(IlfilmRatingEnum ilfilmRating) {
    this.ilfilmRating = ilfilmRating;
    return this;
  }

   /**
   * The video's rating in Israel.
   * @return ilfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Israel.")
  public IlfilmRatingEnum getIlfilmRating() {
    return ilfilmRating;
  }

  public void setIlfilmRating(IlfilmRatingEnum ilfilmRating) {
    this.ilfilmRating = ilfilmRating;
  }

  public ContentRating incaaRating(IncaaRatingEnum incaaRating) {
    this.incaaRating = incaaRating;
    return this;
  }

   /**
   * The video's INCAA (Instituto Nacional de Cine y Artes Audiovisuales - Argentina) rating.
   * @return incaaRating
  **/
  @ApiModelProperty(value = "The video's INCAA (Instituto Nacional de Cine y Artes Audiovisuales - Argentina) rating.")
  public IncaaRatingEnum getIncaaRating() {
    return incaaRating;
  }

  public void setIncaaRating(IncaaRatingEnum incaaRating) {
    this.incaaRating = incaaRating;
  }

  public ContentRating kfcbRating(KfcbRatingEnum kfcbRating) {
    this.kfcbRating = kfcbRating;
    return this;
  }

   /**
   * The video's rating from the Kenya Film Classification Board.
   * @return kfcbRating
  **/
  @ApiModelProperty(value = "The video's rating from the Kenya Film Classification Board.")
  public KfcbRatingEnum getKfcbRating() {
    return kfcbRating;
  }

  public void setKfcbRating(KfcbRatingEnum kfcbRating) {
    this.kfcbRating = kfcbRating;
  }

  public ContentRating kijkwijzerRating(KijkwijzerRatingEnum kijkwijzerRating) {
    this.kijkwijzerRating = kijkwijzerRating;
    return this;
  }

   /**
   * The video's NICAM/Kijkwijzer rating from the Nederlands Instituut voor de Classificatie van Audiovisuele Media (Netherlands).
   * @return kijkwijzerRating
  **/
  @ApiModelProperty(value = "The video's NICAM/Kijkwijzer rating from the Nederlands Instituut voor de Classificatie van Audiovisuele Media (Netherlands).")
  public KijkwijzerRatingEnum getKijkwijzerRating() {
    return kijkwijzerRating;
  }

  public void setKijkwijzerRating(KijkwijzerRatingEnum kijkwijzerRating) {
    this.kijkwijzerRating = kijkwijzerRating;
  }

  public ContentRating kmrbRating(KmrbRatingEnum kmrbRating) {
    this.kmrbRating = kmrbRating;
    return this;
  }

   /**
   * The video's Korea Media Rating Board (영상물등급위원회) rating. The KMRB rates videos in South Korea.
   * @return kmrbRating
  **/
  @ApiModelProperty(value = "The video's Korea Media Rating Board (영상물등급위원회) rating. The KMRB rates videos in South Korea.")
  public KmrbRatingEnum getKmrbRating() {
    return kmrbRating;
  }

  public void setKmrbRating(KmrbRatingEnum kmrbRating) {
    this.kmrbRating = kmrbRating;
  }

  public ContentRating lsfRating(LsfRatingEnum lsfRating) {
    this.lsfRating = lsfRating;
    return this;
  }

   /**
   * The video's rating from Indonesia's Lembaga Sensor Film.
   * @return lsfRating
  **/
  @ApiModelProperty(value = "The video's rating from Indonesia's Lembaga Sensor Film.")
  public LsfRatingEnum getLsfRating() {
    return lsfRating;
  }

  public void setLsfRating(LsfRatingEnum lsfRating) {
    this.lsfRating = lsfRating;
  }

  public ContentRating mccaaRating(MccaaRatingEnum mccaaRating) {
    this.mccaaRating = mccaaRating;
    return this;
  }

   /**
   * The video's rating from Malta's Film Age-Classification Board.
   * @return mccaaRating
  **/
  @ApiModelProperty(value = "The video's rating from Malta's Film Age-Classification Board.")
  public MccaaRatingEnum getMccaaRating() {
    return mccaaRating;
  }

  public void setMccaaRating(MccaaRatingEnum mccaaRating) {
    this.mccaaRating = mccaaRating;
  }

  public ContentRating mccypRating(MccypRatingEnum mccypRating) {
    this.mccypRating = mccypRating;
    return this;
  }

   /**
   * The video's rating from the Danish Film Institute's (Det Danske Filminstitut) Media Council for Children and Young People.
   * @return mccypRating
  **/
  @ApiModelProperty(value = "The video's rating from the Danish Film Institute's (Det Danske Filminstitut) Media Council for Children and Young People.")
  public MccypRatingEnum getMccypRating() {
    return mccypRating;
  }

  public void setMccypRating(MccypRatingEnum mccypRating) {
    this.mccypRating = mccypRating;
  }

  public ContentRating mcstRating(McstRatingEnum mcstRating) {
    this.mcstRating = mcstRating;
    return this;
  }

   /**
   * The video's rating system for Vietnam - MCST
   * @return mcstRating
  **/
  @ApiModelProperty(value = "The video's rating system for Vietnam - MCST")
  public McstRatingEnum getMcstRating() {
    return mcstRating;
  }

  public void setMcstRating(McstRatingEnum mcstRating) {
    this.mcstRating = mcstRating;
  }

  public ContentRating mdaRating(MdaRatingEnum mdaRating) {
    this.mdaRating = mdaRating;
    return this;
  }

   /**
   * The video's rating from Singapore's Media Development Authority (MDA) and, specifically, it's Board of Film Censors (BFC).
   * @return mdaRating
  **/
  @ApiModelProperty(value = "The video's rating from Singapore's Media Development Authority (MDA) and, specifically, it's Board of Film Censors (BFC).")
  public MdaRatingEnum getMdaRating() {
    return mdaRating;
  }

  public void setMdaRating(MdaRatingEnum mdaRating) {
    this.mdaRating = mdaRating;
  }

  public ContentRating medietilsynetRating(MedietilsynetRatingEnum medietilsynetRating) {
    this.medietilsynetRating = medietilsynetRating;
    return this;
  }

   /**
   * The video's rating from Medietilsynet, the Norwegian Media Authority.
   * @return medietilsynetRating
  **/
  @ApiModelProperty(value = "The video's rating from Medietilsynet, the Norwegian Media Authority.")
  public MedietilsynetRatingEnum getMedietilsynetRating() {
    return medietilsynetRating;
  }

  public void setMedietilsynetRating(MedietilsynetRatingEnum medietilsynetRating) {
    this.medietilsynetRating = medietilsynetRating;
  }

  public ContentRating mekuRating(MekuRatingEnum mekuRating) {
    this.mekuRating = mekuRating;
    return this;
  }

   /**
   * The video's rating from Finland's Kansallinen Audiovisuaalinen Instituutti (National Audiovisual Institute).
   * @return mekuRating
  **/
  @ApiModelProperty(value = "The video's rating from Finland's Kansallinen Audiovisuaalinen Instituutti (National Audiovisual Institute).")
  public MekuRatingEnum getMekuRating() {
    return mekuRating;
  }

  public void setMekuRating(MekuRatingEnum mekuRating) {
    this.mekuRating = mekuRating;
  }

  public ContentRating menaMpaaRating(MenaMpaaRatingEnum menaMpaaRating) {
    this.menaMpaaRating = menaMpaaRating;
    return this;
  }

   /**
   * The rating system for MENA countries, a clone of MPAA. It is needed to prevent titles go live w/o additional QC check, since some of them can be inappropriate for the countries at all. See b/33408548 for more details.
   * @return menaMpaaRating
  **/
  @ApiModelProperty(value = "The rating system for MENA countries, a clone of MPAA. It is needed to prevent titles go live w/o additional QC check, since some of them can be inappropriate for the countries at all. See b/33408548 for more details.")
  public MenaMpaaRatingEnum getMenaMpaaRating() {
    return menaMpaaRating;
  }

  public void setMenaMpaaRating(MenaMpaaRatingEnum menaMpaaRating) {
    this.menaMpaaRating = menaMpaaRating;
  }

  public ContentRating mibacRating(MibacRatingEnum mibacRating) {
    this.mibacRating = mibacRating;
    return this;
  }

   /**
   * The video's rating from the Ministero dei Beni e delle Attività Culturali e del Turismo (Italy).
   * @return mibacRating
  **/
  @ApiModelProperty(value = "The video's rating from the Ministero dei Beni e delle Attività Culturali e del Turismo (Italy).")
  public MibacRatingEnum getMibacRating() {
    return mibacRating;
  }

  public void setMibacRating(MibacRatingEnum mibacRating) {
    this.mibacRating = mibacRating;
  }

  public ContentRating mocRating(MocRatingEnum mocRating) {
    this.mocRating = mocRating;
    return this;
  }

   /**
   * The video's Ministerio de Cultura (Colombia) rating.
   * @return mocRating
  **/
  @ApiModelProperty(value = "The video's Ministerio de Cultura (Colombia) rating.")
  public MocRatingEnum getMocRating() {
    return mocRating;
  }

  public void setMocRating(MocRatingEnum mocRating) {
    this.mocRating = mocRating;
  }

  public ContentRating moctwRating(MoctwRatingEnum moctwRating) {
    this.moctwRating = moctwRating;
    return this;
  }

   /**
   * The video's rating from Taiwan's Ministry of Culture (文化部).
   * @return moctwRating
  **/
  @ApiModelProperty(value = "The video's rating from Taiwan's Ministry of Culture (文化部).")
  public MoctwRatingEnum getMoctwRating() {
    return moctwRating;
  }

  public void setMoctwRating(MoctwRatingEnum moctwRating) {
    this.moctwRating = moctwRating;
  }

  public ContentRating mpaaRating(MpaaRatingEnum mpaaRating) {
    this.mpaaRating = mpaaRating;
    return this;
  }

   /**
   * The video's Motion Picture Association of America (MPAA) rating.
   * @return mpaaRating
  **/
  @ApiModelProperty(value = "The video's Motion Picture Association of America (MPAA) rating.")
  public MpaaRatingEnum getMpaaRating() {
    return mpaaRating;
  }

  public void setMpaaRating(MpaaRatingEnum mpaaRating) {
    this.mpaaRating = mpaaRating;
  }

  public ContentRating mpaatRating(MpaatRatingEnum mpaatRating) {
    this.mpaatRating = mpaatRating;
    return this;
  }

   /**
   * The rating system for trailer, DVD, and Ad in the US. See http://movielabs.com/md/ratings/v2.3/html/US_MPAAT_Ratings.html.
   * @return mpaatRating
  **/
  @ApiModelProperty(value = "The rating system for trailer, DVD, and Ad in the US. See http://movielabs.com/md/ratings/v2.3/html/US_MPAAT_Ratings.html.")
  public MpaatRatingEnum getMpaatRating() {
    return mpaatRating;
  }

  public void setMpaatRating(MpaatRatingEnum mpaatRating) {
    this.mpaatRating = mpaatRating;
  }

  public ContentRating mtrcbRating(MtrcbRatingEnum mtrcbRating) {
    this.mtrcbRating = mtrcbRating;
    return this;
  }

   /**
   * The video's rating from the Movie and Television Review and Classification Board (Philippines).
   * @return mtrcbRating
  **/
  @ApiModelProperty(value = "The video's rating from the Movie and Television Review and Classification Board (Philippines).")
  public MtrcbRatingEnum getMtrcbRating() {
    return mtrcbRating;
  }

  public void setMtrcbRating(MtrcbRatingEnum mtrcbRating) {
    this.mtrcbRating = mtrcbRating;
  }

  public ContentRating nbcRating(NbcRatingEnum nbcRating) {
    this.nbcRating = nbcRating;
    return this;
  }

   /**
   * The video's rating from the Maldives National Bureau of Classification.
   * @return nbcRating
  **/
  @ApiModelProperty(value = "The video's rating from the Maldives National Bureau of Classification.")
  public NbcRatingEnum getNbcRating() {
    return nbcRating;
  }

  public void setNbcRating(NbcRatingEnum nbcRating) {
    this.nbcRating = nbcRating;
  }

  public ContentRating nbcplRating(NbcplRatingEnum nbcplRating) {
    this.nbcplRating = nbcplRating;
    return this;
  }

   /**
   * The video's rating in Poland.
   * @return nbcplRating
  **/
  @ApiModelProperty(value = "The video's rating in Poland.")
  public NbcplRatingEnum getNbcplRating() {
    return nbcplRating;
  }

  public void setNbcplRating(NbcplRatingEnum nbcplRating) {
    this.nbcplRating = nbcplRating;
  }

  public ContentRating nfrcRating(NfrcRatingEnum nfrcRating) {
    this.nfrcRating = nfrcRating;
    return this;
  }

   /**
   * The video's rating from the Bulgarian National Film Center.
   * @return nfrcRating
  **/
  @ApiModelProperty(value = "The video's rating from the Bulgarian National Film Center.")
  public NfrcRatingEnum getNfrcRating() {
    return nfrcRating;
  }

  public void setNfrcRating(NfrcRatingEnum nfrcRating) {
    this.nfrcRating = nfrcRating;
  }

  public ContentRating nfvcbRating(NfvcbRatingEnum nfvcbRating) {
    this.nfvcbRating = nfvcbRating;
    return this;
  }

   /**
   * The video's rating from Nigeria's National Film and Video Censors Board.
   * @return nfvcbRating
  **/
  @ApiModelProperty(value = "The video's rating from Nigeria's National Film and Video Censors Board.")
  public NfvcbRatingEnum getNfvcbRating() {
    return nfvcbRating;
  }

  public void setNfvcbRating(NfvcbRatingEnum nfvcbRating) {
    this.nfvcbRating = nfvcbRating;
  }

  public ContentRating nkclvRating(NkclvRatingEnum nkclvRating) {
    this.nkclvRating = nkclvRating;
    return this;
  }

   /**
   * The video's rating from the Nacionãlais Kino centrs (National Film Centre of Latvia).
   * @return nkclvRating
  **/
  @ApiModelProperty(value = "The video's rating from the Nacionãlais Kino centrs (National Film Centre of Latvia).")
  public NkclvRatingEnum getNkclvRating() {
    return nkclvRating;
  }

  public void setNkclvRating(NkclvRatingEnum nkclvRating) {
    this.nkclvRating = nkclvRating;
  }

  public ContentRating nmcRating(NmcRatingEnum nmcRating) {
    this.nmcRating = nmcRating;
    return this;
  }

   /**
   * The National Media Council ratings system for United Arab Emirates.
   * @return nmcRating
  **/
  @ApiModelProperty(value = "The National Media Council ratings system for United Arab Emirates.")
  public NmcRatingEnum getNmcRating() {
    return nmcRating;
  }

  public void setNmcRating(NmcRatingEnum nmcRating) {
    this.nmcRating = nmcRating;
  }

  public ContentRating oflcRating(OflcRatingEnum oflcRating) {
    this.oflcRating = oflcRating;
    return this;
  }

   /**
   * The video's Office of Film and Literature Classification (OFLC - New Zealand) rating.
   * @return oflcRating
  **/
  @ApiModelProperty(value = "The video's Office of Film and Literature Classification (OFLC - New Zealand) rating.")
  public OflcRatingEnum getOflcRating() {
    return oflcRating;
  }

  public void setOflcRating(OflcRatingEnum oflcRating) {
    this.oflcRating = oflcRating;
  }

  public ContentRating pefilmRating(PefilmRatingEnum pefilmRating) {
    this.pefilmRating = pefilmRating;
    return this;
  }

   /**
   * The video's rating in Peru.
   * @return pefilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Peru.")
  public PefilmRatingEnum getPefilmRating() {
    return pefilmRating;
  }

  public void setPefilmRating(PefilmRatingEnum pefilmRating) {
    this.pefilmRating = pefilmRating;
  }

  public ContentRating rcnofRating(RcnofRatingEnum rcnofRating) {
    this.rcnofRating = rcnofRating;
    return this;
  }

   /**
   * The video's rating from the Hungarian Nemzeti Filmiroda, the Rating Committee of the National Office of Film.
   * @return rcnofRating
  **/
  @ApiModelProperty(value = "The video's rating from the Hungarian Nemzeti Filmiroda, the Rating Committee of the National Office of Film.")
  public RcnofRatingEnum getRcnofRating() {
    return rcnofRating;
  }

  public void setRcnofRating(RcnofRatingEnum rcnofRating) {
    this.rcnofRating = rcnofRating;
  }

  public ContentRating resorteviolenciaRating(ResorteviolenciaRatingEnum resorteviolenciaRating) {
    this.resorteviolenciaRating = resorteviolenciaRating;
    return this;
  }

   /**
   * The video's rating in Venezuela.
   * @return resorteviolenciaRating
  **/
  @ApiModelProperty(value = "The video's rating in Venezuela.")
  public ResorteviolenciaRatingEnum getResorteviolenciaRating() {
    return resorteviolenciaRating;
  }

  public void setResorteviolenciaRating(ResorteviolenciaRatingEnum resorteviolenciaRating) {
    this.resorteviolenciaRating = resorteviolenciaRating;
  }

  public ContentRating rtcRating(RtcRatingEnum rtcRating) {
    this.rtcRating = rtcRating;
    return this;
  }

   /**
   * The video's General Directorate of Radio, Television and Cinematography (Mexico) rating.
   * @return rtcRating
  **/
  @ApiModelProperty(value = "The video's General Directorate of Radio, Television and Cinematography (Mexico) rating.")
  public RtcRatingEnum getRtcRating() {
    return rtcRating;
  }

  public void setRtcRating(RtcRatingEnum rtcRating) {
    this.rtcRating = rtcRating;
  }

  public ContentRating rteRating(RteRatingEnum rteRating) {
    this.rteRating = rteRating;
    return this;
  }

   /**
   * The video's rating from Ireland's Raidió Teilifís Éireann.
   * @return rteRating
  **/
  @ApiModelProperty(value = "The video's rating from Ireland's Raidió Teilifís Éireann.")
  public RteRatingEnum getRteRating() {
    return rteRating;
  }

  public void setRteRating(RteRatingEnum rteRating) {
    this.rteRating = rteRating;
  }

  public ContentRating russiaRating(RussiaRatingEnum russiaRating) {
    this.russiaRating = russiaRating;
    return this;
  }

   /**
   * The video's National Film Registry of the Russian Federation (MKRF - Russia) rating.
   * @return russiaRating
  **/
  @ApiModelProperty(value = "The video's National Film Registry of the Russian Federation (MKRF - Russia) rating.")
  public RussiaRatingEnum getRussiaRating() {
    return russiaRating;
  }

  public void setRussiaRating(RussiaRatingEnum russiaRating) {
    this.russiaRating = russiaRating;
  }

  public ContentRating skfilmRating(SkfilmRatingEnum skfilmRating) {
    this.skfilmRating = skfilmRating;
    return this;
  }

   /**
   * The video's rating in Slovakia.
   * @return skfilmRating
  **/
  @ApiModelProperty(value = "The video's rating in Slovakia.")
  public SkfilmRatingEnum getSkfilmRating() {
    return skfilmRating;
  }

  public void setSkfilmRating(SkfilmRatingEnum skfilmRating) {
    this.skfilmRating = skfilmRating;
  }

  public ContentRating smaisRating(SmaisRatingEnum smaisRating) {
    this.smaisRating = smaisRating;
    return this;
  }

   /**
   * The video's rating in Iceland.
   * @return smaisRating
  **/
  @ApiModelProperty(value = "The video's rating in Iceland.")
  public SmaisRatingEnum getSmaisRating() {
    return smaisRating;
  }

  public void setSmaisRating(SmaisRatingEnum smaisRating) {
    this.smaisRating = smaisRating;
  }

  public ContentRating smsaRating(SmsaRatingEnum smsaRating) {
    this.smsaRating = smsaRating;
    return this;
  }

   /**
   * The video's rating from Statens medieråd (Sweden's National Media Council).
   * @return smsaRating
  **/
  @ApiModelProperty(value = "The video's rating from Statens medieråd (Sweden's National Media Council).")
  public SmsaRatingEnum getSmsaRating() {
    return smsaRating;
  }

  public void setSmsaRating(SmsaRatingEnum smsaRating) {
    this.smsaRating = smsaRating;
  }

  public ContentRating tvpgRating(TvpgRatingEnum tvpgRating) {
    this.tvpgRating = tvpgRating;
    return this;
  }

   /**
   * The video's TV Parental Guidelines (TVPG) rating.
   * @return tvpgRating
  **/
  @ApiModelProperty(value = "The video's TV Parental Guidelines (TVPG) rating.")
  public TvpgRatingEnum getTvpgRating() {
    return tvpgRating;
  }

  public void setTvpgRating(TvpgRatingEnum tvpgRating) {
    this.tvpgRating = tvpgRating;
  }

  public ContentRating ytRating(YtRatingEnum ytRating) {
    this.ytRating = ytRating;
    return this;
  }

   /**
   * A rating that YouTube uses to identify age-restricted content.
   * @return ytRating
  **/
  @ApiModelProperty(value = "A rating that YouTube uses to identify age-restricted content.")
  public YtRatingEnum getYtRating() {
    return ytRating;
  }

  public void setYtRating(YtRatingEnum ytRating) {
    this.ytRating = ytRating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRating contentRating = (ContentRating) o;
    return Objects.equals(this.acbRating, contentRating.acbRating) &&
        Objects.equals(this.agcomRating, contentRating.agcomRating) &&
        Objects.equals(this.anatelRating, contentRating.anatelRating) &&
        Objects.equals(this.bbfcRating, contentRating.bbfcRating) &&
        Objects.equals(this.bfvcRating, contentRating.bfvcRating) &&
        Objects.equals(this.bmukkRating, contentRating.bmukkRating) &&
        Objects.equals(this.catvRating, contentRating.catvRating) &&
        Objects.equals(this.catvfrRating, contentRating.catvfrRating) &&
        Objects.equals(this.cbfcRating, contentRating.cbfcRating) &&
        Objects.equals(this.cccRating, contentRating.cccRating) &&
        Objects.equals(this.cceRating, contentRating.cceRating) &&
        Objects.equals(this.chfilmRating, contentRating.chfilmRating) &&
        Objects.equals(this.chvrsRating, contentRating.chvrsRating) &&
        Objects.equals(this.cicfRating, contentRating.cicfRating) &&
        Objects.equals(this.cnaRating, contentRating.cnaRating) &&
        Objects.equals(this.cncRating, contentRating.cncRating) &&
        Objects.equals(this.csaRating, contentRating.csaRating) &&
        Objects.equals(this.cscfRating, contentRating.cscfRating) &&
        Objects.equals(this.czfilmRating, contentRating.czfilmRating) &&
        Objects.equals(this.djctqRating, contentRating.djctqRating) &&
        Objects.equals(this.djctqRatingReasons, contentRating.djctqRatingReasons) &&
        Objects.equals(this.ecbmctRating, contentRating.ecbmctRating) &&
        Objects.equals(this.eefilmRating, contentRating.eefilmRating) &&
        Objects.equals(this.egfilmRating, contentRating.egfilmRating) &&
        Objects.equals(this.eirinRating, contentRating.eirinRating) &&
        Objects.equals(this.fcbmRating, contentRating.fcbmRating) &&
        Objects.equals(this.fcoRating, contentRating.fcoRating) &&
        Objects.equals(this.fmocRating, contentRating.fmocRating) &&
        Objects.equals(this.fpbRating, contentRating.fpbRating) &&
        Objects.equals(this.fpbRatingReasons, contentRating.fpbRatingReasons) &&
        Objects.equals(this.fskRating, contentRating.fskRating) &&
        Objects.equals(this.grfilmRating, contentRating.grfilmRating) &&
        Objects.equals(this.icaaRating, contentRating.icaaRating) &&
        Objects.equals(this.ifcoRating, contentRating.ifcoRating) &&
        Objects.equals(this.ilfilmRating, contentRating.ilfilmRating) &&
        Objects.equals(this.incaaRating, contentRating.incaaRating) &&
        Objects.equals(this.kfcbRating, contentRating.kfcbRating) &&
        Objects.equals(this.kijkwijzerRating, contentRating.kijkwijzerRating) &&
        Objects.equals(this.kmrbRating, contentRating.kmrbRating) &&
        Objects.equals(this.lsfRating, contentRating.lsfRating) &&
        Objects.equals(this.mccaaRating, contentRating.mccaaRating) &&
        Objects.equals(this.mccypRating, contentRating.mccypRating) &&
        Objects.equals(this.mcstRating, contentRating.mcstRating) &&
        Objects.equals(this.mdaRating, contentRating.mdaRating) &&
        Objects.equals(this.medietilsynetRating, contentRating.medietilsynetRating) &&
        Objects.equals(this.mekuRating, contentRating.mekuRating) &&
        Objects.equals(this.menaMpaaRating, contentRating.menaMpaaRating) &&
        Objects.equals(this.mibacRating, contentRating.mibacRating) &&
        Objects.equals(this.mocRating, contentRating.mocRating) &&
        Objects.equals(this.moctwRating, contentRating.moctwRating) &&
        Objects.equals(this.mpaaRating, contentRating.mpaaRating) &&
        Objects.equals(this.mpaatRating, contentRating.mpaatRating) &&
        Objects.equals(this.mtrcbRating, contentRating.mtrcbRating) &&
        Objects.equals(this.nbcRating, contentRating.nbcRating) &&
        Objects.equals(this.nbcplRating, contentRating.nbcplRating) &&
        Objects.equals(this.nfrcRating, contentRating.nfrcRating) &&
        Objects.equals(this.nfvcbRating, contentRating.nfvcbRating) &&
        Objects.equals(this.nkclvRating, contentRating.nkclvRating) &&
        Objects.equals(this.nmcRating, contentRating.nmcRating) &&
        Objects.equals(this.oflcRating, contentRating.oflcRating) &&
        Objects.equals(this.pefilmRating, contentRating.pefilmRating) &&
        Objects.equals(this.rcnofRating, contentRating.rcnofRating) &&
        Objects.equals(this.resorteviolenciaRating, contentRating.resorteviolenciaRating) &&
        Objects.equals(this.rtcRating, contentRating.rtcRating) &&
        Objects.equals(this.rteRating, contentRating.rteRating) &&
        Objects.equals(this.russiaRating, contentRating.russiaRating) &&
        Objects.equals(this.skfilmRating, contentRating.skfilmRating) &&
        Objects.equals(this.smaisRating, contentRating.smaisRating) &&
        Objects.equals(this.smsaRating, contentRating.smsaRating) &&
        Objects.equals(this.tvpgRating, contentRating.tvpgRating) &&
        Objects.equals(this.ytRating, contentRating.ytRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acbRating, agcomRating, anatelRating, bbfcRating, bfvcRating, bmukkRating, catvRating, catvfrRating, cbfcRating, cccRating, cceRating, chfilmRating, chvrsRating, cicfRating, cnaRating, cncRating, csaRating, cscfRating, czfilmRating, djctqRating, djctqRatingReasons, ecbmctRating, eefilmRating, egfilmRating, eirinRating, fcbmRating, fcoRating, fmocRating, fpbRating, fpbRatingReasons, fskRating, grfilmRating, icaaRating, ifcoRating, ilfilmRating, incaaRating, kfcbRating, kijkwijzerRating, kmrbRating, lsfRating, mccaaRating, mccypRating, mcstRating, mdaRating, medietilsynetRating, mekuRating, menaMpaaRating, mibacRating, mocRating, moctwRating, mpaaRating, mpaatRating, mtrcbRating, nbcRating, nbcplRating, nfrcRating, nfvcbRating, nkclvRating, nmcRating, oflcRating, pefilmRating, rcnofRating, resorteviolenciaRating, rtcRating, rteRating, russiaRating, skfilmRating, smaisRating, smsaRating, tvpgRating, ytRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRating {\n");
    
    sb.append("    acbRating: ").append(toIndentedString(acbRating)).append("\n");
    sb.append("    agcomRating: ").append(toIndentedString(agcomRating)).append("\n");
    sb.append("    anatelRating: ").append(toIndentedString(anatelRating)).append("\n");
    sb.append("    bbfcRating: ").append(toIndentedString(bbfcRating)).append("\n");
    sb.append("    bfvcRating: ").append(toIndentedString(bfvcRating)).append("\n");
    sb.append("    bmukkRating: ").append(toIndentedString(bmukkRating)).append("\n");
    sb.append("    catvRating: ").append(toIndentedString(catvRating)).append("\n");
    sb.append("    catvfrRating: ").append(toIndentedString(catvfrRating)).append("\n");
    sb.append("    cbfcRating: ").append(toIndentedString(cbfcRating)).append("\n");
    sb.append("    cccRating: ").append(toIndentedString(cccRating)).append("\n");
    sb.append("    cceRating: ").append(toIndentedString(cceRating)).append("\n");
    sb.append("    chfilmRating: ").append(toIndentedString(chfilmRating)).append("\n");
    sb.append("    chvrsRating: ").append(toIndentedString(chvrsRating)).append("\n");
    sb.append("    cicfRating: ").append(toIndentedString(cicfRating)).append("\n");
    sb.append("    cnaRating: ").append(toIndentedString(cnaRating)).append("\n");
    sb.append("    cncRating: ").append(toIndentedString(cncRating)).append("\n");
    sb.append("    csaRating: ").append(toIndentedString(csaRating)).append("\n");
    sb.append("    cscfRating: ").append(toIndentedString(cscfRating)).append("\n");
    sb.append("    czfilmRating: ").append(toIndentedString(czfilmRating)).append("\n");
    sb.append("    djctqRating: ").append(toIndentedString(djctqRating)).append("\n");
    sb.append("    djctqRatingReasons: ").append(toIndentedString(djctqRatingReasons)).append("\n");
    sb.append("    ecbmctRating: ").append(toIndentedString(ecbmctRating)).append("\n");
    sb.append("    eefilmRating: ").append(toIndentedString(eefilmRating)).append("\n");
    sb.append("    egfilmRating: ").append(toIndentedString(egfilmRating)).append("\n");
    sb.append("    eirinRating: ").append(toIndentedString(eirinRating)).append("\n");
    sb.append("    fcbmRating: ").append(toIndentedString(fcbmRating)).append("\n");
    sb.append("    fcoRating: ").append(toIndentedString(fcoRating)).append("\n");
    sb.append("    fmocRating: ").append(toIndentedString(fmocRating)).append("\n");
    sb.append("    fpbRating: ").append(toIndentedString(fpbRating)).append("\n");
    sb.append("    fpbRatingReasons: ").append(toIndentedString(fpbRatingReasons)).append("\n");
    sb.append("    fskRating: ").append(toIndentedString(fskRating)).append("\n");
    sb.append("    grfilmRating: ").append(toIndentedString(grfilmRating)).append("\n");
    sb.append("    icaaRating: ").append(toIndentedString(icaaRating)).append("\n");
    sb.append("    ifcoRating: ").append(toIndentedString(ifcoRating)).append("\n");
    sb.append("    ilfilmRating: ").append(toIndentedString(ilfilmRating)).append("\n");
    sb.append("    incaaRating: ").append(toIndentedString(incaaRating)).append("\n");
    sb.append("    kfcbRating: ").append(toIndentedString(kfcbRating)).append("\n");
    sb.append("    kijkwijzerRating: ").append(toIndentedString(kijkwijzerRating)).append("\n");
    sb.append("    kmrbRating: ").append(toIndentedString(kmrbRating)).append("\n");
    sb.append("    lsfRating: ").append(toIndentedString(lsfRating)).append("\n");
    sb.append("    mccaaRating: ").append(toIndentedString(mccaaRating)).append("\n");
    sb.append("    mccypRating: ").append(toIndentedString(mccypRating)).append("\n");
    sb.append("    mcstRating: ").append(toIndentedString(mcstRating)).append("\n");
    sb.append("    mdaRating: ").append(toIndentedString(mdaRating)).append("\n");
    sb.append("    medietilsynetRating: ").append(toIndentedString(medietilsynetRating)).append("\n");
    sb.append("    mekuRating: ").append(toIndentedString(mekuRating)).append("\n");
    sb.append("    menaMpaaRating: ").append(toIndentedString(menaMpaaRating)).append("\n");
    sb.append("    mibacRating: ").append(toIndentedString(mibacRating)).append("\n");
    sb.append("    mocRating: ").append(toIndentedString(mocRating)).append("\n");
    sb.append("    moctwRating: ").append(toIndentedString(moctwRating)).append("\n");
    sb.append("    mpaaRating: ").append(toIndentedString(mpaaRating)).append("\n");
    sb.append("    mpaatRating: ").append(toIndentedString(mpaatRating)).append("\n");
    sb.append("    mtrcbRating: ").append(toIndentedString(mtrcbRating)).append("\n");
    sb.append("    nbcRating: ").append(toIndentedString(nbcRating)).append("\n");
    sb.append("    nbcplRating: ").append(toIndentedString(nbcplRating)).append("\n");
    sb.append("    nfrcRating: ").append(toIndentedString(nfrcRating)).append("\n");
    sb.append("    nfvcbRating: ").append(toIndentedString(nfvcbRating)).append("\n");
    sb.append("    nkclvRating: ").append(toIndentedString(nkclvRating)).append("\n");
    sb.append("    nmcRating: ").append(toIndentedString(nmcRating)).append("\n");
    sb.append("    oflcRating: ").append(toIndentedString(oflcRating)).append("\n");
    sb.append("    pefilmRating: ").append(toIndentedString(pefilmRating)).append("\n");
    sb.append("    rcnofRating: ").append(toIndentedString(rcnofRating)).append("\n");
    sb.append("    resorteviolenciaRating: ").append(toIndentedString(resorteviolenciaRating)).append("\n");
    sb.append("    rtcRating: ").append(toIndentedString(rtcRating)).append("\n");
    sb.append("    rteRating: ").append(toIndentedString(rteRating)).append("\n");
    sb.append("    russiaRating: ").append(toIndentedString(russiaRating)).append("\n");
    sb.append("    skfilmRating: ").append(toIndentedString(skfilmRating)).append("\n");
    sb.append("    smaisRating: ").append(toIndentedString(smaisRating)).append("\n");
    sb.append("    smsaRating: ").append(toIndentedString(smsaRating)).append("\n");
    sb.append("    tvpgRating: ").append(toIndentedString(tvpgRating)).append("\n");
    sb.append("    ytRating: ").append(toIndentedString(ytRating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

