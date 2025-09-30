public abstract class Produit {
    private double PRIX;
    private String name;
    private int anneeDeParution;
    private double prix;

    public abstract String getName();
    public abstract int getAnneeDeParution();
    public abstract double getPrix();
    public abstract void setPrix(int prix);
}
