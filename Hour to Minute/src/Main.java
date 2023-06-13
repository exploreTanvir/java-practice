import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter hour - ");
        int hour= sc.nextInt();
        int minute=hour*60;


        System.out.println(hour +" hour is equal to "+minute+" minute");
    }
}