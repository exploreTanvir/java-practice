class Main {
    public int roll;
    public String name;
    public float Mark;
    public void GetData(){
        roll=25;
        name="Touhid";
        Mark=65.25f;
    }
    void Display(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(Mark);
    }
}
class Friend{
    public static void main(String[] args){
        Main s=new Main();
        s.GetData();
        s.Display();
    }
}

