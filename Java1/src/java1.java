public class java1
{
    public static void main(String[] args) {
        final A sanjay = new A("sai sanjay");
        sanjay.name = "other name";
//        sanjay = new A("saisanjay");
        System.out.println(sanjay);
        A obj;

        obj = new A("dfhhfhdf");
}
}
class A{
    final int num =10;
    String name ;
    public A(String name){
//        System.out.println("object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}