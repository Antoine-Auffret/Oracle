package oracle;

public class Oracle {

    private static Oracle instance = new Oracle();
    private PiedsNoirs piedsNoirs;
    private OreilleCasse oreilleCasse;
    private HuronsWendat huronsWendat;
    private Mohawks mohawks;

    private Oracle() {
        piedsNoirs = new PiedsNoirs("Esprit de la nuit");
        oreilleCasse = new OreilleCasse("Fétiche Arumbaya");
        huronsWendat = new HuronsWendat("Sanglier flambloyant");
        mohawks = new Mohawks("Homme de lumière");
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
}