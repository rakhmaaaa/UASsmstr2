package Model;

public class CovidStatus {
    private String Id;
    private int Rank;
    private String TwoLetterSymbol;
    private String ThreeLetterSymbol;
    private int InfectionRisk;
    private int CaseFatalityRate;
    private int RecoveryProporation;
    private int TotalCases;
    private int NewCases;
    private int TotalDeaths;
    private int TotalRecovered;
    private int NewRecovered;
    private int ActiveCases;
    private int TotalTest;
    private int Population;
    private int oneCaseevery_x_ppl;
    private int oneTestevery_x_ppl;
    private int Deaths_1M_pop;
    private int SeriousCritical;

    public static void add(CovidStatus s) {
    }

    public String get_Id() {return Id; }
    public void set_Id(String Id) {this.Id = Id;}

    public int get_Rank() {return Rank;}
    public void set_Rank(int Rank) {this.Rank = Rank;}

    public String get_TwoLetterSymbol() {return TwoLetterSymbol;}
    public void set_TwoLetterSymbol() {this.TwoLetterSymbol = TwoLetterSymbol;}

    public String get_ThreeLetterSymbol() {return ThreeLetterSymbol;}
    public void set_ThreeLetterSymboll() {this.ThreeLetterSymbol = ThreeLetterSymbol;}

    public int get_InfectionRisk() {return InfectionRisk;}
    public void set_InfectionRisk(int InfectionRisk) {this.InfectionRisk = InfectionRisk;}

    public int get_CaseFatalityRate() {return CaseFatalityRate;}
    public void set_CaseFatalityRate(int CaseFatalityRate) {this.CaseFatalityRate = CaseFatalityRate;}

    public int get_RecoveryProporation() {return RecoveryProporation;}
    public void set_RecoveryProporation(int RecoveryProporation) {this.RecoveryProporation = RecoveryProporation;}

    public int get_TotalCases() {return TotalCases;}
    public void set_TotalCases(int TotalCases) {this.TotalCases = TotalCases;}

    public int get_NewCases() {return NewCases;}
    public void set_NewCases(int NewCases) {this.NewCases = NewCases;}

    public int get_TotalDeaths() {return TotalDeaths;}
    public void set_TotalDeaths(int TotalDeaths) {this.TotalDeaths = TotalDeaths;}

    public int get_TotalRecovered() {return TotalRecovered;}
    public void set_TotalRecovered(int TotalRecovered) {this.TotalRecovered = TotalRecovered;}

    public int get_NewRecovered() {return NewRecovered;}
    public void set_NewRecovered(int NewRecovered) {this.NewRecovered = NewRecovered;}

    public int get_ActiveCases() {return ActiveCases;}
    public void set_ActiveCases(int ActiveCases) {this.ActiveCases = ActiveCases;}

    public int get_TotalTest() {return TotalTest;}
    public void set_TotalTest(int TotalTest) {this.TotalTest = TotalTest;}

    public int get_Population() {return Population;}
    public void set_Population(int Population) {this.Population = Population;}

    public int get_oneCaseevery_x_ppl() {return oneCaseevery_x_ppl;}
    public void set_oneCaseevery_x_ppl(int oneCaseevery_x_ppl) {this.oneCaseevery_x_ppl = oneCaseevery_x_ppl;}

    public int get_oneTestevery_x_ppl() {return oneTestevery_x_ppl;}
    public void set_oneTestevery_x_ppl(int oneTestevery_x_ppl) {this.oneTestevery_x_ppl = oneTestevery_x_ppl;}

    public int get_Deaths_1M_pop() {return Deaths_1M_pop;}
    public void set_Deaths_1M_pop(int Deaths_1M_pop) {this.Deaths_1M_pop = Deaths_1M_pop;}

    public int get_SeriousCritical() {return SeriousCritical;}
    public void set_SeriousCritical(int SeriousCritical) {this.SeriousCritical = SeriousCritical;}


    public CovidStatus(String Id, int Rank, String TwoLetterSymbol, String ThreeLetterSymbol, int InfectionRisk, int CaseFatalityRate,
                       int RecoveryProporation, int TotalCases, int NewCases, int TotalDeaths, int TotalRecovered, int NewRecovered, int ActiveCases,
                       int TotalTest, int Population, int oneCaseevery_x_ppl, int oneTestevery_x_ppl, int Deaths_1M_pop, int SeriousCritical ){
        this.Id = Id;
        this.Rank = Rank;
        this.TwoLetterSymbol = TwoLetterSymbol;
        this.ThreeLetterSymbol = ThreeLetterSymbol;
        this.InfectionRisk = InfectionRisk;
        this.CaseFatalityRate = CaseFatalityRate;
        this.RecoveryProporation = RecoveryProporation;
        this.TotalCases = TotalCases;
        this.NewCases = NewCases;
        this.TotalDeaths = TotalDeaths;
        this.TotalRecovered = TotalRecovered;
        this.NewRecovered = NewRecovered;
        this.TotalTest = TotalTest;
        this.Population = Population;
        this.oneCaseevery_x_ppl = oneCaseevery_x_ppl;
        this.oneTestevery_x_ppl = oneTestevery_x_ppl;
        this.Deaths_1M_pop = Deaths_1M_pop;
        this.SeriousCritical = SeriousCritical;

    }
    public CovidStatus(){

    }
    

    public void set_TwoLetterSymbol(String twoLetterSymbol) {
    }

    public void set_ThreeLetterSymbol(String threeLetterSymbol) {
    }
}
