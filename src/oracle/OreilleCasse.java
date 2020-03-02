package oracle;

public class OreilleCasse extends Ecoute {

    private String nomOracle;

    public OreilleCasse(String nomOracle) {
        this.nomOracle = nomOracle;
    }

    @Override
    public void sansRepondre() {
        super.sansRepondre();
    }

    @Override
    public void repondreConseil() {
        super.repondreConseil();
    }

    @Override
    public void realiserMiracle() {
        super.realiserMiracle();
    }

    @Override
    public String toString() {
        return "OreilleCasse{" +
                "nomOracle='" + nomOracle + '\'' +
                '}';
    }
}
