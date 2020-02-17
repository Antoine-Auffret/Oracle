package oracle;

public class ServiceB extends Service implements ServiceBInterface{

    public ServiceB(){
    }

    public void methodeC(){

        Oracle.getInstance().defaultPrint("C");
    }

    public void methodeD(){

        Oracle.getInstance().publicPrint("D");
    }

    public void methodeE(){

        Oracle.getInstance().getServiceAInterface().methodeA();
    }

    public void methodeF(){

        Oracle.getInstance().getServiceA().methodeB();
    }
}
