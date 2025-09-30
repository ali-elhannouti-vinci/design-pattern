public class LivreFactory implements ProductAbstractFactory{
    @Override
    public Produit createProduct(String name, int anneeDeParution) {
        return new Livre(name,anneeDeParution);
    }
}
