import java.util.HashMap;
import java.util.Map;

public class Magasin {
    private Map<String,Produit> etagere = new HashMap<String,Produit>();
    private ProductAbstractFactory fac;

    public Magasin(ProductAbstractFactory fac) {
        this.fac = fac;
    }

    public void ajouterProduit(String name, int anneeDeParution){
        Produit p = fac.createProduct(name,anneeDeParution);
        etagere.put(name,p);
    }
    public Produit retournerProduit(String name){
        return etagere.get(name);
    }
}
