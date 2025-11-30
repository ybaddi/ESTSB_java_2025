public class PointNom extends Point {
    private String nom;

    public void setPointNom(int x, int y, String nom){
        setPoint(x,y);
        this.nom = nom;
    }
    void setNom(String nom) {
        this.nom = nom;
    }
    void affCoordNom(){
        affCoord();
        System.out.println("Nom : " + nom);
    }

    public static void main(String[] args) {
        PointNom pn = new PointNom();

        pn.setPointNom(2,3,"pointA");
        pn.affCoordNom();

        pn.deplace(2,3);
        pn.setNom("pointB");
        pn.affCoordNom();
    }
}
