public interface InterfaceB {
    void show(String data);
    default void meth1(){
        System.out.println("InterfaceB method");
    }
}
