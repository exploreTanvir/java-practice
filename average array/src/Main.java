import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int i;
        int arr[]=new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a= scanner.next();
        for(i=0;i<=a.length()-1;i++){
            System.out.print(i);
            System.out.print(arr);
        }
    }
}