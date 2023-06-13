import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The number- ");
        int d1= sc.nextInt();
        System.out.print("Enter The number- ");
        int d2= sc.nextInt();

         double area=(0.5*(d1*d2));

        System.out.println("Rhombus area is "+area);
    }
}