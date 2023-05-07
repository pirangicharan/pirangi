// Functional interface with default method
@FunctionalInterface
interface MyFunctionalInterface1 {
    void doSomething();
     default void doSomethingElse() {
        System.out.println("Doing something else");
    }
}



public class DefaultAndNonDefault {

    public static void main(String[] args) {
        // Using a lambda expression with MyFunctionalInterface1
        // Object should be initialized
        MyFunctionalInterface1 obj1 = () -> System.out.println("Doing something");
        obj1.doSomething(); // Output: Doing something
        obj1.doSomethingElse(); // Output: Doing something else


        MyFunctionalInterface1 obj2 = () -> System.out.println("m");
        obj2.doSomething();
        obj2.doSomethingElse();

    }
}
