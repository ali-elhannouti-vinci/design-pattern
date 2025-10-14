public class Album {
    private final String title;
    private final String artistName;
    private final String label;
    private final String producteur;
    private final String pays;
    private final String version;
    private final String genre;
    private final int anneeParution;
    private final boolean isARemaster;
    private final int anneeParutionOriginale;
    private final float debit;
    private final float debitAbonne;

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getLabel() {
        return label;
    }

    public String getProducteur() {
        return producteur;
    }

    public String getPays() {
        return pays;
    }

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public boolean isARemaster() {
        return isARemaster;
    }

    public int getAnneeParutionOriginale() {
        return anneeParutionOriginale;
    }

    public float getDebit() {
        return debit;
    }

    public float getDebitAbonne() {
        return debitAbonne;
    }

    private Album(AlbumBuilder builder){
        this.title = builder.title;
        this.artistName = builder.artistName;
        this.label = builder.label;
        this.producteur = builder.producteur;
        this.pays = builder.pays;
        this.version = builder.version;
        this.genre = builder.genre;
        this.anneeParution = builder.anneeParution;
        this.isARemaster = builder.isARemaster;
        this.anneeParutionOriginale = builder.anneeParutionOriginale;
        this.debit = builder.debit;
        this.debitAbonne = builder.debitAbonne;


    }

    public static class AlbumBuilder {
        private final String title;
        private final String artistName;
        private String label;
        private String producteur;
        private String pays;
        private String version;
        private String genre;
        private int anneeParution;
        private boolean isARemaster;
        private int anneeParutionOriginale;
        private float debit;
        private float debitAbonne;

        public AlbumBuilder(String title, String artistName) {
            this.title = title;
            this.artistName = artistName;
        }

        public AlbumBuilder label(String label){
            this.label = label;
            return this;
        }

        public AlbumBuilder producteur(String producteur){
            this.producteur = producteur;
            return this;
        }

        public AlbumBuilder pays(String pays){
            this.pays = pays;
            return this;
        }

        public AlbumBuilder version(String version){
            this.version = version;
            return this;
        }

        public AlbumBuilder genre(String genre){
            this.genre = genre;
            return this;
        }

        public AlbumBuilder anneeParution(int anneeParution){
            this.anneeParution = anneeParution;
            return this;
        }

        public AlbumBuilder isARemaster(boolean isARemaster){
            this.isARemaster = isARemaster;
            return this;
        }

        public AlbumBuilder anneeParutionOriginale(int anneeParutionOriginale){
            this.anneeParutionOriginale = anneeParutionOriginale;
            return this;
        }

        public AlbumBuilder debit(float debit){
            this.debit = debit;
            return this;
        }

        public AlbumBuilder debitAbonne(float debitAbonne) {
            this.debitAbonne = debitAbonne;
            return this;
        }

        public Album build(){
            return new Album(this);
        }
    }

}
