interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango: Sweet");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango: Very Juicy");
    }
}

public class MangoDemo {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m2.taste();
    }
}