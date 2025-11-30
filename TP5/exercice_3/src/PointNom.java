public class PointNom extends Point{
    private String nom;

    public PointNom(int x, int y, String nom){
    super(x,y);
    this.nom=nom;
    }

    public void affCoord(){
        System.out.println("affcourd of pointname");
    }
    public void affCoordNom(){
        super.affCoord();
        System.out.println("Nom : " + nom);
    }

    public static void main(String[] args) {
        PointNom p1 = new PointNom(2, 3, "A");
        p1.affCoordNom();

        PointNom p2 = new PointNom(5, -1, "B");
        p2.affCoordNom();
    }
}
