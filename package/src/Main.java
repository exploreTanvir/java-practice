// Step 1: Define the interface
//interface MyInterface {
//    void sayHello();
//}

// Step 2: Implement the interface in a class
//class MyClass implements MyInterface {
//    public void sayHello() {
//        System.out.println("Hello, World!");
//    }
//}

// Step 3: Create an instance of the class and call the method
//public class Main {
//    public static void main(String[] args) {
//        MyClass myObject = new MyClass();
//        myObject.sayHello();
//    }
//}







interface Student{
    static final int Roll=5623;
    static final String Name="Wahid";
    void Display();
}
class Result implements Student{
    public float Mark;
    public void Display(){
        System.out.println("Roll is : "+Roll);
        System.out.println("Name is : "+Name);
    }

    public void Getmark(){
        Mark=65.45f;
    }
    public void ShowMark() {
        System.out.println("Mark is : " + Mark);
    }}
public class Main{
    public static void main(String[]args){
        Result R=new Result();
        R.Display();
        R.Getmark();
        R.ShowMark();
    }
}