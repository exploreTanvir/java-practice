import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter minute - ");
        int minute= sc.nextInt();
        int hour=minute/60;
        int newMinute=minute-(hour*60);


        System.out.println(minute +" minute is equal to "+hour+" hour and "+newMinute+" minute..");
    }
}