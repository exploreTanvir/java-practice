import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your first number - ");
        int a= sc.nextInt();
        System.out.print("Enter Your second number - ");
        int b= sc.nextInt();
        System.out.print("Enter Your third number - ");
        int c= sc.nextInt();

        if(a>b) {
            if(a>c){
                System.out.println("a is big");
            }
            else {
                System.out.println("c is big");
            }
        }
        else{
            if(b>c){
                System.out.println("b is big");
            }
            else {
                System.out.println("c is big");
            }
        }

    }
}