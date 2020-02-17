import oracle.Oracle;

public class Main {

    public static void main(String args[]){

        Oracle.getInstance().publicPrint("main");
        Oracle.getInstance().getServiceAInterface().methodeA();
        Oracle.getInstance().getServiceBInterface().methodeC();
        Oracle.getInstance().getServiceBInterface().methodeD();
        Oracle.getInstance().getServiceBInterface().methodeE();
        Oracle.getInstance().getServiceBInterface().methodeF();
    }
}


