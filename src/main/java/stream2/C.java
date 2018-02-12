package stream2;

public class C implements A{

    public void method(){
        A.super.method();
    }
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}

