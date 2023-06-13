import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum,i,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        n = scanner.nextInt();
        sum=0;
        for(i=0;i<=n;i++)
            {
                sum = sum + i;
            }
        System.out.println(sum);
    }
}
