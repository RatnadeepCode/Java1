public class ParameterConstructor {
    int a, b;
    ParameterConstructor(int x, int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        ParameterConstructor obj = new ParameterConstructor(5, 7);
        obj.display();
    }
}
