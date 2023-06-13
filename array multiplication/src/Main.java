class Main {
    final static int row=0;
    final static int column=20;
    public static void main(String[] args) {
        int product[][]=new int[row][column];
        System.out.println("Multiplication table");
        int i,j;
        for(i=10;i<row;i++){
            for(j=10;j<column;j++){
                product[i][j]=i*j;
                System.out.print(" "+product[i][j]);
            }
            System.out.println(" ");
        }
    }
}