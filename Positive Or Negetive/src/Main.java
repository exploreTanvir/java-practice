import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your number - ");
        int a= sc.nextInt();
        if(a>0){
            System.out.print("positive");
        }
        else if (a==0) {
            System.out.print("You entered zero");
        }
        else {
            System.out.print("negative");
        }
    }
}