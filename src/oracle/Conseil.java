package oracle;

public class Conseil extends Service implements ConseilInterface{

    public Conseil(){
    }

    public void methodeA(){

        Oracle.getInstance().defaultPrint("A");
    }

    public void methodeB(){

        Oracle.getInstance().publicPrint("B");
    }
}