package Exercice1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir les coordonnees du premiere point (x1,y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Saisir les coordonnées du deuxième point (x2, y2) :");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Saisir les coordonnées du troisième point (x3, y3) :");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        point p1 = new point(x1, y1);
        point p2 = new point(x2, y2);
        point p3 = new point(x3, y3);

        TroisPoint troisPoints = new TroisPoint(p1, p2, p3);
        
        System.out.println("Les coordonnées des points sont :");
        System.out.println("PREMIER POINT: " + p1.toString());
        System.out.println("DEUXIEME POINT: " + p2.toString());
        System.out.println("TROISIEME POINT: " + p3.toString());

        System.out.println("Distance entre le premier et le deuxieme point : " + p1.calculerDistance(p2));
        System.out.println("Distance entre le deuxième et le troisieme point : " + p2.calculerDistance(p3));
        System.out.println("Distance entre le premier et le troisieme point : " + p1.calculerDistance(p3));

        System.out.println("Milieu entre le premier et le deuxieme point : " + p1.calculerMilieu(p2));
        System.out.println("Milieu entre le deuxieme et le troisième point : " + p2.calculerMilieu(p3));
        System.out.println("Milieu entre le premier et le troisième point : " + p1.calculerMilieu(p3));

        boolean alignes = troisPoints.sontAlignes();
        System.out.println("Les trois points sont alignés : " + alignes);
        boolean isocele = troisPoints.estIsocele();
        System.out.println("Les trois points forment un triangle isocèle : " + isocele);
        scanner.close();
    }
}
