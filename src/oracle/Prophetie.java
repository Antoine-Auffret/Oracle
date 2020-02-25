package oracle;

public class Prophetie extends Service implements ProphetieInterface{
    public Prophetie(){
    }

    public void methodeH(){

        Oracle.getInstance().defaultPrint("H");
    }
}
