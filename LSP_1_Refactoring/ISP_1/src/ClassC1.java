public class ClassC1 implements BigInterface{
    @Override
    public void foo1() {
        System.out.println("Je suis Foo1 C1");
    }

    @Override
    public void foo2() {
        System.out.println("Je suis Foo2 C1");
    }

    @Override
    public void meth1ClientA() {
    }

    @Override
    public void meth2ClientA() {

    }

    @Override
    public void methClientB() {

    }

    @Override
    public void meth1ClientC() {
        System.out.println("Je suis meth1Client C1");
    }

    @Override
    public void meth2ClientC() {
        System.out.println("Je suis meth2Client C1");
    }

    @Override
    public void meth3ClientC() {
        System.out.println("Je suis meth3Client C1");
    }
}
