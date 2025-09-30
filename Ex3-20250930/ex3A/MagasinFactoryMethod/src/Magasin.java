import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
    private Map<String,Produit> etagere = new HashMap<String,Produit>();
    public void ajouterProduit(String name, int anneeDeParution){
        Produit p=this.createProduit(name,anneeDeParution);
        etagere.put(name,p);
    }
    public Produit retournerProduit(String name){
        return etagere.get(name);
    }
    public abstract Produit createProduit(String name,int anneeDeParution);
}
