package com.sanjay.Object;

public class ObjectClone implements Cloneable{
    int rollno;
    String name;

    public ObjectClone(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone s1 = new ObjectClone(19,"Sanjay");
        ObjectClone s2 = (ObjectClone) s1.clone();
        System.out.println(s1.name +" "+s1.rollno);
        System.out.println(s2.name +" "+s2.rollno);
    }
}
