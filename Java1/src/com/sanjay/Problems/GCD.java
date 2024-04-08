package com.sanjay.Problems;

class APPROACH1 implements GCD{
    int compute2(int c, int d){
        return c%d;
    }
    @Override
    public void compute(int a, int b) {
        int R ;
//        a =b;
//        b = R;
        while ((a%b)>0){
            R = a%b;
            a =b ;
            b= R;
        }
        System.out.println("result: "+b);
    }
}
class APPROACH2 implements GCD{

    @Override
    public void compute(int a, int b) {
        int R ;
//        a =b;
//        b = R;
        int z =0;
        while ((a%b)>0){
            R = a%b;
            a =b ;
            b= R;
            if (z <b){
                z =b ;
            }
        }
        System.out.println("HCF "+z);
    }
}
public interface GCD {
    abstract void compute(int a, int b);
    public static void main(String[] args) {
        APPROACH1 obj = new APPROACH1();
        APPROACH2 obj2 = new APPROACH2();
        obj.compute(42,285);
        obj2.compute(42,285);
//        System.out.println(obj.compute(20,30));
    }
}
