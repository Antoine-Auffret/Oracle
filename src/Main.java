import oracle.*;

public class Main {

    public static void main(String args[]){

        System.out.println(Oracle.getInstance().getPiedsNoirs());
        Oracle.getInstance().getPiedsNoirs().sansRaison();
        Oracle.getInstance().getPiedsNoirs().fonctionDemande();

        System.out.println(Oracle.getInstance().getOreilleCasse());
        Oracle.getInstance().getOreilleCasse().sansRepondre();
        Oracle.getInstance().getOreilleCasse().repondreConseil();
        Oracle.getInstance().getOreilleCasse().realiserMiracle();

        System.out.println(Oracle.getInstance().getHuronsWendat());
        Oracle.getInstance().getHuronsWendat().realiserMiracle();

        System.out.println(Oracle.getInstance().getMohawks());
        Oracle.getInstance().getMohawks().enoncerProphetie();
        Oracle.getInstance().getMohawks().predireProphetie();
        Oracle.getInstance().getMohawks().realiserProphetie();
    }
}


