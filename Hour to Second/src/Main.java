import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter hour - ");
        int hour= sc.nextInt();
        int second=hour*60*60;


        System.out.println(hour +" hour is equal to "+second+" second");
    }
}