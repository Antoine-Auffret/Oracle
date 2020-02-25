package oracle;

public class Conseil extends Service implements ConseilInterface{

    public Conseil(){
    }

    public void sansRaison(){

        Oracle.getInstance().defaultPrint("Fournir des conseils sans aucune raison");
    }

    public void fonctionDemande(){

        Oracle.getInstance().publicPrint("Fournir des conseils en fonction de la demande");
    }
}