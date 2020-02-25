package oracle;

public class Miracle extends Service implements MiracleInterface{

    public Miracle(){
    }

    public void realiserMiracle(){

        Oracle.getInstance().defaultPrint("Réaliser des miracles");
    }
}
