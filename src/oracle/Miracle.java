package oracle;

public class Miracle extends Service implements MiracleInterface{

    public Miracle(){
    }

    public void methodeC(){

        Oracle.getInstance().defaultPrint("C");
    }

    public void methodeD(){

        Oracle.getInstance().publicPrint("D");
    }

    public void methodeE(){

        Oracle.getInstance().getConseilInterface().methodeA();
    }

    public void methodeF(){

        Oracle.getInstance().getConseil().methodeB();
    }
}
