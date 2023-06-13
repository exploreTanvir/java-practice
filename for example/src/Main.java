import java.util.Scanner;
class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your number :");
//        n = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            if(i==3){
                continue;
            }
            System.out.print(" "+i);
        }
    }
}