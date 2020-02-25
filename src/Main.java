import oracle.*;

public class Main {

    public static void main(String args[]){

        Oracle.getInstance().publicPrint("main");
        Oracle.getInstance().getConseilInterface().methodeA();
        Oracle.getInstance().getMiracleInterface().methodeC();
        Oracle.getInstance().getMiracleInterface().methodeD();
        Oracle.getInstance().getMiracleInterface().methodeE();
        Oracle.getInstance().getMiracleInterface().methodeF();
        Oracle.getInstance().getEcouteInterface().methodeG();
        Oracle.getInstance().getProphetieInterface().methodeH();
    }
}


