import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Year - ");
        int year= sc.nextInt();
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.print("This is a leap year");
        }
        else {
            System.out.print("This is not a leap year");
        }
    }
}