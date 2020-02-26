import oracle.*;

public class Main {

    public static void main(String args[]){

        Oracle.getInstance().publicPrint("main");
        Oracle.getInstance().getPiedsNoirs().sansRaison();
        Oracle.getInstance().getPiedsNoirs().fonctionDemande();
        Oracle.getInstance().getOreilleCasse().sansRepondre();
        Oracle.getInstance().getOreilleCasse().repondreConseil();
        Oracle.getInstance().getOreilleCasse().realiserMiracle();
        Oracle.getInstance().getHuronsWendat().realiserMiracle();
        Oracle.getInstance().getMohawks().enoncerProphetie();
        Oracle.getInstance().getMohawks().predireProphetie();
        Oracle.getInstance().getMohawks().realiserProphetie();
        /*Oracle.getInstance().getConseilInterface().sansRaison();
        Oracle.getInstance().getConseilInterface().fonctionDemande();
        Oracle.getInstance().getMiracleInterface().realiserMiracle();
        Oracle.getInstance().getEcouteInterface().sansRepondre();
        Oracle.getInstance().getEcouteInterface().repondreConseil();
        Oracle.getInstance().getEcouteInterface().realiserMiracle();
        Oracle.getInstance().getProphetieInterface().enoncerProphetie();
        Oracle.getInstance().getProphetieInterface().predireProphetie();
        Oracle.getInstance().getProphetieInterface().realiserProphetie();*/
    }
}


