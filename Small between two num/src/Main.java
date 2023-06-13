import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your first number - ");
        int a= sc.nextInt();
        System.out.print("Enter Your first number - ");
        int b= sc.nextInt();
        if(a<b){
            System.out.print("a is small");
        }
        else {
            System.out.print("b is small");
        }
    }
}
