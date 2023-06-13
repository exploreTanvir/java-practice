//
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        int i,n,j;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your number :");
//        n = scanner.nextInt();
//        for(i=1;i<=n;i++){
//            for(j=1;j<=i;j++){
//                System.out.print(*);
//            }
//            System.out.println();
//        }
//    }
//
//}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int i,n,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        n = scanner.nextInt();
        for(i=n;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }
