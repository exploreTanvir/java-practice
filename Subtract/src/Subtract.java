import java.util.Scanner;
class Subtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number- ");
        int a = sc.nextInt();
        System.out.print("Enter The number- ");
        int b = sc.nextInt();
        int subtract = a - b;

        System.out.println("The ans is " + subtract);
    }
}