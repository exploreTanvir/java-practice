
class Main {
    public static void main(String[] args) {

        int[][] a= {{15, 30, 10, 52}, {52, 62, 38, 25}};
        int[][] b= {{25, 45, 53, 28}, {42, 36, 57, 62}};
        int[][] sum = new int[2][3];
        int row, column;

        for (row = 0; row < a.length; row++) {
            for (column = 0; column < a[0].length; column++) {
                sum[row][column]=a[row][column]+b[row][column];
            }
            System.out.println(" ");
        }
        for (row = 0; row < a.length; row++) {
            for (column = 0; column < a[0].length; column++) {
                System.out.print(sum[row][column]);
            }
            System.out.println(" ");
        }
    }
}