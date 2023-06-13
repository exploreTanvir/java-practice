
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int f0=0,f1=1,f,i,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        n = scanner.nextInt();

        for(i=0;i<=n;i++){
            f=f0+f1;
            System.out.print(f+"\t");
            f1=f0;
            f0=f;

        }
    }

}