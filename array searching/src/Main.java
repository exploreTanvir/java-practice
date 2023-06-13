import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 1,3, 5, 8};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The number- ");
        int searchValue= sc.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == searchValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value " + searchValue + " found in the array.");
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }
    }
}



