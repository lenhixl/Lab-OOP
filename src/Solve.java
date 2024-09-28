import java.util.Scanner;

public class Solve {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So bac: ");
        int bac = sc.nextInt();
        System.out.println("So bien: ");
        int bien = sc.nextInt();

        if(bac == 1 && bien == 1) {
            double a = sc.nextDouble();
            if(a == 0) System.out.println("Can't solve");
            else {
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                System.out.println((c-b)/a);
                }
        } else if (bac == 1 && bien == 2) {
            double a1 = sc.nextDouble();
            double b1 = sc.nextDouble();
            double c1 = sc.nextDouble();
            double a2 = sc.nextDouble();
            double b2 = sc.nextDouble();
            double c2 = sc.nextDouble();

            double x = a1*b2 - a2*b1;
            double x1 = c1*b2 - c2*b1;
            double x2 = a1*c2 - a2*c1;

            if (x != 0) {
                System.out.println("(" + x1/x + "," + x2/x + ")");
            } else {
                if(x1 != 0 || x2 != 0) {
                    System.out.println("Khong co nghiem");
                } else System.out.println("Vo so nghiem");
            }
        } else {
            double a = sc.nextDouble();
            if (a == 0) System.out.print("Day la ham bac nhat mot an, nhap lai");
            else {
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double delta = b*b - 4*a*c;
                if(delta < 0) System.out.println("Vo nghiem");
                else if(delta == 0) System.out.println(-b/(2*a));
                else System.out.println("(" + (-b+Math.sqrt(delta))/(2*a) + ", " + ((-b-Math.sqrt(delta))/(2*a))+ ")");
            }
        }
    }
}
