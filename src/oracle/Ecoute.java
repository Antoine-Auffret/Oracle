package oracle;

public class Ecoute extends Service implements EcouteInterface{
    public Ecoute(){
    }

    public void methodeG(){

        Oracle.getInstance().defaultPrint("G");
    }
}
