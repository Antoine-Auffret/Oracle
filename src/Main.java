import oracle.*;

public class Main {

    public static void main(String args[]){

        Oracle.getInstance().publicPrint("main");
        Oracle.getInstance().getConseilInterface().sansRaison();
        Oracle.getInstance().getConseilInterface().fonctionDemande();
        Oracle.getInstance().getMiracleInterface().realiserMiracle();
        Oracle.getInstance().getEcouteInterface().sansRepondre();
        Oracle.getInstance().getEcouteInterface().repondreConseil();
        Oracle.getInstance().getEcouteInterface().realiserMiracle();
        Oracle.getInstance().getProphetieInterface().enoncerProphetie();
        Oracle.getInstance().getProphetieInterface().predireProphetie();
        Oracle.getInstance().getProphetieInterface().realiserProphetie();
    }
}


