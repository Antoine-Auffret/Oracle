package oracle;

public class ServiceA extends Service implements ServiceAInterface{

    public ServiceA(){
    }

    public void methodeA(){

        Oracle.getInstance().defaultPrint("A");
    }

    public void methodeB(){

        Oracle.getInstance().publicPrint("B");
    }
}