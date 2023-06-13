import java.util.Scanner;
class Main{
//    public static void main(String[] args){
//
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter Your number - ");
//        int a= sc.nextInt();
//        if(a%2==0){
//            System.out.print("Even");
//        }
//        else {
//            System.out.print("Odd");
//        }
//    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The radius :- ");
        int r= sc.nextInt();
        double area=Math.PI*r*r;

        System.out.println("Circle area is : "+area);
    }
}