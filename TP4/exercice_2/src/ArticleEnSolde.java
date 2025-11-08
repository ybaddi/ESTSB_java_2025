public class ArticleEnSolde extends  Article{
    private float tauxDeRemise;

    public ArticleEnSolde(long reference, String intitule, float prixHT, int quentiteEnStock, float tauxDeRemise) {
        super(reference, intitule, prixHT, quentiteEnStock);
        this.tauxDeRemise = tauxDeRemise;
    }

    public float getTauxDeRemise() {
        return tauxDeRemise;
    }

    public void setTauxDeRemise(float tauxDeRemise) {
        this.tauxDeRemise = tauxDeRemise;
    }

    // redéfinir cette méthode pour retourner le prix HT après application de la remise
    @Override
    public float prixHT(){
        return prixHT() * ( 1 - tauxDeRemise /100);
    }

    // redéfinir si nécessaire pour calculer le prix TTC sur le prix soldé
    @Override
    public float prixTTC(){
        return prixHT() * ( 1 + TAUX_TVA);

    }


    @Override
    public String toString() {
        return "ArticleEnSolde{" +
                "tauxDeRemise=" + tauxDeRemise +
                "reference=" + getReference() +
                ", intitule='" + getIntitule() + '\'' +
                ", prixHT=" + String.format("%.2F",prixHT()) +
                ", prixTTC=" + String.format("%.2F",prixTTC()) +
                ", quentiteEnStock=" + getQuentiteEnStock() +
                '}';
    }
}
