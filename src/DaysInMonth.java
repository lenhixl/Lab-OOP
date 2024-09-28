import java.util.Scanner;

public class DaysInMonth {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month want to check: ");
        int month = sc.nextInt();
        while(month > 12 || month < 1) {
            System.out.print("Enter again: ");
            month = sc.nextInt();
        }

        System.out.print("Enter the year of the month: ");
        int year = sc.nextInt();
        while (year < 1) {
            System.out.print("Enter again: ");
            year = sc.nextInt();
        }

        int days = 0;

        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if((year % 4 == 0 || year % 100 == 0) && year % 400 != 0){
                    days = 29;
                    break;
                } else {
                    days = 28;
                    break;
                }
        }

        System.out.print(days);
    }
}
