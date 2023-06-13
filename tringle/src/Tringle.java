
import java.util.Scanner;
class Tringle{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        System.out.print("Enter third number- ");
        int c= sc.nextInt();
        int s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Triangle area is "+area);
    }
}