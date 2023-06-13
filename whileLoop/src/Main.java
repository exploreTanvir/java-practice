//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your number :");
//        n = scanner.nextInt();
//        int i,n,j;
//        i=1;
//        while (i<=10){
//            System.out.print(" "+i);
//            i++;
//        }
//    }
//}


//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your number :");
//        n = scanner.nextInt();
//        int i,n,j;
//        i=10;
//        while (i>=1){
//            System.out.print(" "+i);
//            i--;
//        }
//    }
//}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of even numbers from 0 to " + n + ": " + sum);
    }
}

