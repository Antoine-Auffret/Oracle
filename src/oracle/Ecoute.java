package oracle;

public class Ecoute extends Service implements EcouteInterface{

    public Ecoute(){
    }

    public void sansRepondre(){

        Oracle.getInstance().defaultPrint("Écouter les besoins sans répondre");
    }

    public void repondreConseil(){

        Oracle.getInstance().defaultPrint("Écouter les besoins et répondre un conseil");
    }

    public void realiserMiracle(){

        Oracle.getInstance().defaultPrint("Écouter les besoins et réaliser un miracle");
    }
}
