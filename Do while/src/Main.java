//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("enter your number :");
////        n = scanner.nextInt();
//        int i;
//        i=10;
//        do{
//            System.out.print(" "+i);
//            i++;
//        }
//        while (i<=10);
//    }
//}






import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//
//        int row,column,y;
//        row=1;
//        do{
//           column=1;
//           do{
//               y=row*column;
//               System.out.print(""+y);
//               column=column+1;
//           }
//           while (column<=3);
//           System.out.println("\n");
//           row=row+1;
//        }
//        while (row<=3);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your number :");
//        int n = scanner.nextInt();
//        int sum = 0;
//        int i = 0;
//
//        do {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        } while (i <= n);
//
//        System.out.println("Sum of even numbers from 0 to " + n + ": " + sum);
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

        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= n);

        System.out.println("Sum of odd numbers from 0 to " + n + ": " + sum);
    }
}

