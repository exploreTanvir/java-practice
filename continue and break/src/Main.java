import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = scanner.nextInt();
       for(;;){
           if(n<=0){
               continue;
           }
           else {
               break;
           }
       }
        System.out.println("you have entered : " + n);
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number :");
        int a = scanner.nextInt();
        System.out.println("enter your second number :");
        int b = scanner.nextInt();

        for(;;){
            if(a<=0||b<=0){
                System.out.print("You have entered a wrong number");
                break ;
            }
            else {
                int z=a+b;
                System.out.print("your ans is : "+z);
                break ;
            }
        }
    }
}



class  Main{
    public static void main(String[] args){
        int i,j;
       loop1: for(i=1;i<100;i++){
            System.out.println(" ");
            if(i>=10){
                break;
            }
            for(j=1;j<100;j++){
                System.out.print("*");
                if(j==i){
                    continue loop1;
                }
            }
            System.out.println("termination by break");
        }
    }
}
