import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Mark - ");
        int mark= sc.nextInt();
        if(mark>=40 && mark<=100){
            System.out.print("pass");
        }
        else if (mark>100) {
            System.out.print("wrong input");
        }
        else {
            System.out.print("fail");
        }


    }
}
