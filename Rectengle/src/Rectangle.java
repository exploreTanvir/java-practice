import java.util.Scanner;
class Rectangle{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The number- ");
        int a= sc.nextInt();
        System.out.print("Enter The number- ");
        int b= sc.nextInt();
        int area=a*b;

        System.out.println("Rectangle area is "+area);
    }
}