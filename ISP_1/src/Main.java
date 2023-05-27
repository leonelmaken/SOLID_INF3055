public class Main {
    public static void main(String[] args) {
        ClassC1 classC1 = new ClassC1();
        classC1.foo1();
        classC1.meth1ClientA();
        ClientClassC1 clientClassC1 = new ClientClassC1();
        clientClassC1.meth1ClientC();
    }
}