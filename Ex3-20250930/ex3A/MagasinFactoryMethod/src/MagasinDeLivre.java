public class MagasinDeLivre extends Magasin {
    @Override
    public Produit createProduit(String name, int anneeDeParution) {
        return new Livre(name,anneeDeParution);
    }
}
