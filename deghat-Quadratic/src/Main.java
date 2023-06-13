import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a= scanner.nextDouble();
        System.out.print("Enter your first number: ");
        double b= scanner.nextDouble();
        System.out.print("Enter your first number: ");
        double c= scanner.nextDouble();
        double d=((b*b)-(4*a*c));
        if(d>0){
            double r1=((-b+Math.sqrt(d))/2*a);
            double r2=((-b-Math.sqrt(d))/2*a);
            System.out.println("the root are "+r1 +"and"+ r2);

            }
        else if (d==0) {
            double r=(-b/(2*a));
            System.out.println("the root are "+r);
        }
        else {
            System.out.println("the root are not possible");
        }
    }
}