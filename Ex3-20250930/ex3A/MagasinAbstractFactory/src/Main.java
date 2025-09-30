public class Main {
    public static void main(String[] args) {
        Magasin magasinDVD = new Magasin(new DVDFactory());
        magasinDVD.ajouterProduit("Deadpool 3",2024);
        magasinDVD.ajouterProduit("Deadpool 2",2017);
        System.out.println(magasinDVD.retournerProduit("Deadpool 2").toString());

        Magasin magasinLivre = new Magasin(new LivreFactory());
        magasinLivre.ajouterProduit("Harry Potter 1",1990);
        magasinLivre.ajouterProduit("One Piece tome 1",1985);
        System.out.println(magasinLivre.retournerProduit("One Piece tome 1").toString());

    }
}
