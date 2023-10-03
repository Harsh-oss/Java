public interface InterfaceA {
//    void meth1();
    default void meth2(){
        System.out.println("InterfaceA default method");
        this.meth4();
    }
    static void meth3(){
        System.out.println("InterfaceA static method");
    }
    private void meth4(){
        System.out.println("InterfaceA static method");
    }

    public static void main(String[] args) {
        System.out.println("InterfaceA main() method");
        InterfaceA.meth3();
    }

    default void meth1(){
        System.out.println("InterfaceA method");
    }
}
