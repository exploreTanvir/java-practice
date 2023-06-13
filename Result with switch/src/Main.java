import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's Mark (out of 100):");
        int Mark = scanner.nextInt();

        String grade;
        switch (Mark / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            case 4:
                grade = "D";
                break;
            default:
                grade="F";
        }
        System.out.println("The student's grade is: " + grade);
    }
}
