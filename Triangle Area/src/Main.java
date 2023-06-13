import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your first number : ");
        int a= sc.nextInt();
        System.out.print("Enter Your second number : ");
        int b= sc.nextInt();
        System.out.print("Enter Your third number : ");
        int c= sc.nextInt();

        if (((a+b)>c) && ((b+c)>a) &&((c+a)>b)){
            int s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("triangle area is ="+area);
        }
	  else{
            System.out.println("triangle is not possible");}
    }
}