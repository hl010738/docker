package defaultmethod;

public interface MyInterface1 {

    default void myDefaultMethod(){
        System.out.println("my default method");
    }
}
