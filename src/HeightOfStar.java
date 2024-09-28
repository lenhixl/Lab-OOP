import java.util.Scanner;

public class HeightOfStar {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastRow = (n-1)*2+1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (lastRow-((i-1)*2+1))/2; j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((i-1)*2+1); j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= (lastRow-i)/2; j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
