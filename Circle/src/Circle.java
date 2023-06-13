import java.util.Scanner;
class Circle{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The radius :- ");
        int r= sc.nextInt();
        double area=Math.PI*r*r;

        System.out.println("Circle area is : "+area);
    }
}