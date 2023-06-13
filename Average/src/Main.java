import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The number- ");
        int a= sc.nextInt();
        System.out.print("Enter The number- ");
        int b= sc.nextInt();
        System.out.print("Enter The number- ");
        int c= sc.nextInt();
        int average=(a+b+c)/2;

        System.out.println("Average area is "+average);
    }
}