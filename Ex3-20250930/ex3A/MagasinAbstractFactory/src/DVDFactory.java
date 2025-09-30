public class DVDFactory implements ProductAbstractFactory {

    @Override
    public Produit createProduct(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
