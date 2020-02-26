package oracle;

public class Oracle {

    private static Oracle instance = new Oracle();
    private PiedsNoirs piedsNoirs;
    private OreilleCasse oreilleCasse;
    private HuronsWendat huronsWendat;
    private Mohawks mohawks;
    /*private Conseil conseil;
    private Miracle miracle;
    private Ecoute ecoute;
    private Prophetie prophetie;*/

    private Oracle() {
        piedsNoirs = new PiedsNoirs();
        oreilleCasse = new OreilleCasse();
        huronsWendat = new HuronsWendat();
        mohawks = new Mohawks();
        /*conseil = new Conseil();
        miracle = new Miracle();
        ecoute = new Ecoute();
        prophetie = new Prophetie();*/
    }

    public static Oracle getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("publicPrint : " + m);
    }

    public PiedsNoirs getPiedsNoirs() {
        return (PiedsNoirs)piedsNoirs;
    }

    public OreilleCasse getOreilleCasse() {
        return (OreilleCasse)oreilleCasse;
    }

    public HuronsWendat getHuronsWendat() {
        return (HuronsWendat)huronsWendat;
    }

    public Mohawks getMohawks() {
        return (Mohawks)mohawks;
    }

    /*public ConseilInterface getConseilInterface() {

        return (ConseilInterface)conseil;
    }

    public MiracleInterface getMiracleInterface() {

        return (MiracleInterface)miracle;
    }

    public EcouteInterface getEcouteInterface() {

        return (EcouteInterface)ecoute;
    }

    public ProphetieInterface getProphetieInterface() {

        return (ProphetieInterface)prophetie;
    }*/
}