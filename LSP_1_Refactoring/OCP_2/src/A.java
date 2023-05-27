public class A {
    private C c;

    public A(C c) {
        this.c = c;
    }

    public void bar(){
        c.subBar();
    }

    public void foo(){
        c.subFoo();
    }
}
