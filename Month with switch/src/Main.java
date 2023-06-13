import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month name : ");
        int month = scanner.nextInt();

        String monthN;
        switch (month) {
            case 1:
                monthN="January";
                break;
            case 2:
                monthN="February";
                break;
            case 3:
                monthN="March";
                break;
            case 4:
                monthN="April";
                break;
            case 5:
                monthN="May";
                break;
            case 6:
                monthN="June";
                break;
            case 7:
                monthN="July";
                break;
            case 8:
                monthN="August";
                break;
            case 9:
                monthN="September";
                break;

            case 11:
                monthN="November";
                break;
            case 12:
                monthN="December";
                break;

            default:
                monthN="Invalid";
        }
        System.out.println("The month is: " + monthN);
    }
}
