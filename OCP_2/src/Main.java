public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1();
        A a = new A(c1);
        a.bar();
    }
}