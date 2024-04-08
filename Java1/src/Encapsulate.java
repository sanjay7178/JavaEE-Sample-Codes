public class Encapsulate {
    static int name =10;
    public int integer(int name){
        return name;
    }
    public static void myName2(){
        System.out.println("This is void Method2");
    }
    public static void myName(){
        myName2();
        System.out.println("This is void Method1"+" "+name);
    }

    static class zero{}


    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        System.out.println(obj.integer(23));
        myName();
    }
}
