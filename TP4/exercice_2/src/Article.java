public class Article {
    private long reference;
    private String intitule;
    private float prixHT;
    private int quentiteEnStock;

    protected static final float TAUX_TVA = 0.20f;

    public Article(long reference, String intitule, float prixHT, int quentiteEnStock) {
        this.reference = reference;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.quentiteEnStock = quentiteEnStock;
    }

    public long getReference() {
        return reference;
    }

    public String getIntitule() {
        return intitule;
    }

    public int getQuentiteEnStock() {
        return quentiteEnStock;
    }

    public void approvisionner(int nombreUnites){
        if(nombreUnites > 0) quentiteEnStock +=nombreUnites;
    }

    public boolean vendre(int nombreUnites){
        if(nombreUnites > quentiteEnStock){
            return false;
        }
        quentiteEnStock -= nombreUnites;
        return true;
    }

    public float prixHT() { return prixHT;}

    // cette méthode calcule et renvoie le prix TTC de l’article
    public float prixTTC() {
        return prixHT * ( 1 + TAUX_TVA);
    }
 // chaîne de caractères exprimant la référence, l’intitulé et le prix de l’article.

    @Override
    public String toString() {
        return "Article{" +
                "reference=" + reference +
                ", intitule='" + intitule + '\'' +
                ", prixHT=" + prixHT +
                ", prixTTC=" + prixTTC() +
                ", quentiteEnStock=" + quentiteEnStock +
                '}';
    }

    public boolean equals(Article unArticle){
        if(unArticle == null) return false;
        return this.reference == unArticle.getReference();
    }

    public static void main(String[] args) {
        Article[] articles = new Article[3];
        articles[0] = new Article(1,"PC HP", 7560.99f,20);
        articles[1] = new Article(2,"PC Dell", 8560.99f,25);
        articles[2] = new Article(3,"PC Macbook", 27560.99f,5);

        // afiichage des article
        for(Article article : articles){
            System.out.println(article);
        }

        // affichage des refereces, quentite, intitule
        System.out.println(" Reference de l'article 1: " + articles[0].getReference());
        System.out.println(" intitule de l'article 1: " + articles[0].getIntitule());
        System.out.println(" quentite en stock  de l'article 1: " + articles[0].getQuentiteEnStock());

        // afichage des prixHT
        System.out.println(" Reference de l'article 1: " + articles[0].prixHT());

        // afichage des prixTTC
        System.out.println(" Reference de l'article 1: " + articles[0].prixTTC());

        // approvisenement
        System.out.println(" Reference de l'article 1: " + articles[0].getQuentiteEnStock());
        articles[0].approvisionner(10);
        System.out.println(" Reference de l'article 1: " + articles[0].getQuentiteEnStock());


        // vendre
        System.out.println(" Reference de l'article 1: " + articles[0].getQuentiteEnStock());
        articles[0].vendre(15);
        System.out.println(" Reference de l'article 1: " + articles[0].getQuentiteEnStock());

        // test equals
        Article articleTest = new Article(1,"PC HP", 7560.99f,20);
        System.out.println(" article 1 == article test " + articles[0].equals(articleTest));
        System.out.println(" article 1 == article 2 " + articles[0].equals(articles[1]));



    }
}
