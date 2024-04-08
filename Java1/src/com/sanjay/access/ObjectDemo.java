package com.sanjay.access;


public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num = num;
this.gpa = gpa;
    }

//    @Override
//    public int hashCode() {
//        return num;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.num == ((ObjectDemo)obj).num;
//    }

    @Override
    public String toString() {
        return super.toString();
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(55,56.3f);
        ObjectDemo obj2 = new ObjectDemo(55,56.3f);
        if (obj == obj2){
            System.out.println("obj is equal to obj2*");
        }
        int  a = obj.num;

        if (obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
    }

}
