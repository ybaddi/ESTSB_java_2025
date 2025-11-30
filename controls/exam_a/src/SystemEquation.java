import java.util.Scanner;

public class SystemEquation {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrer les coefficient ax+by=e et cx+dy=f");
        System.out.print("a = ") ; double a = sc.nextDouble();
        System.out.print("b = ") ; double b = sc.nextDouble();
        System.out.print("e = ") ; double e = sc.nextDouble();
        System.out.print("c = ") ; double c = sc.nextDouble();
        System.out.print("d = ") ; double d = sc.nextDouble();
        System.out.print("f = ") ; double f = sc.nextDouble();

        double denominateur = a*d - b*c;

        if (denominateur == 0) {
            System.out.println("le systeme impossible ou indetermine");
        }else{
            double x = (e*d - b*f) / denominateur;
            double y = (a*f -e*c)/denominateur;
            System.out.println("la valeur de x est " + x);
            System.out.println("la valeur de y est " + y);
        }
        sc.close();
    }

    public static void main(String[] args) {
        SystemEquation.run();
    }
}
