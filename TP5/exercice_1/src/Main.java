public class Main {
    public static void main(String[] args) {
        Point p =new Point();
        p.initialise(1,3);
        p.deplace(2,3);

        PointA pA =new PointA();
        pA.initialise(1,3);
        pA.deplace(2,3);
        pA.affiche();
    }
}
