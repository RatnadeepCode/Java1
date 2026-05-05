public class Test {
    int a;
    Test(){
        a = 10;
    }
    void display(){
        System.out.println("Value of a = " +a);
    }
    public static void main(String args[]){
    Test obj = new Test();
    obj.display();
    }
}
