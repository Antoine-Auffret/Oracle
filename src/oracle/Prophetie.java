package oracle;

public class Prophetie extends Service implements ProphetieInterface{
    public Prophetie(){
    }

    public void enoncerProphetie(){

        Oracle.getInstance().defaultPrint("Énoncer une prophétie");
    }

    public void predireProphetie(){

        Oracle.getInstance().defaultPrint("Prédire une prophétie");
    }

    public void realiserProphetie(){

        Oracle.getInstance().defaultPrint("Réaliser une prophétie");
    }
}
