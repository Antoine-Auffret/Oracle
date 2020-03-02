package oracle;

public class PiedsNoirs extends Conseil {

    private String nomOracle;

    public PiedsNoirs(String nomOracle) {
        this.nomOracle = nomOracle;
    }

    @Override
    public void sansRaison() {
        super.sansRaison();
    }

    @Override
    public void fonctionDemande() {
        super.fonctionDemande();
    }

    @Override
    public String toString() {
        return "PiedsNoirs{" +
                "nomOracle='" + nomOracle + '\'' +
                '}';
    }
}
