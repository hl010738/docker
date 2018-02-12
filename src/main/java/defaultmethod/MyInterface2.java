package defaultmethod;

public interface MyInterface2 {

    default void myDefaultMethod(){
        System.out.println("my default method2");
    }
}
