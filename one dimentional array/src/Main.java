
class Main {
    public static void main(String[] args) {
    int numbers[]={6,8,10,52,32,25,85,21,65,48,37};
    int sum=0;
    for(int number:numbers){
        sum+=number;
    }
    double average=sum/numbers.length;
        System.out.println("Sum = "+sum);
        System.out.print("Average = "+average);
    }

}