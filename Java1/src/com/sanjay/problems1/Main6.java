package com.sanjay.problems1;
//3.Write a Java Program to implement multilevel inheritance by
//        applying various access controls to its data members and methods.
import java.io.DataInputStream;
class Student
{
    private int rollno;
    private String name;
    DataInputStream dis=new DataInputStream(System.in);
    public void getrollno()
    {
        try
        {
            System.out.println("Enter rollno ");
            rollno=Integer.parseInt(dis.readLine());
            System.out.println("Enter name ");
            name=dis.readLine();
        }
        catch(Exception e){ }
    }
    void putrollno()
    {
        System.out.println("Roll No ="+rollno);
        System.out.println("Name ="+name);
    }
}
class Marks extends Student
{
    protected int m1,m2,m3;
    void getmarks()
    {
        try
        {
            System.out.println("Enter marks :");
            m1=Integer.parseInt(dis.readLine());
            m2=Integer.parseInt(dis.readLine());
            m3=Integer.parseInt(dis.readLine());
        }
        catch(Exception e) { }
    }
    void putmarks()
    {
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
    }
}
class Result extends Marks
{
    private float total;
    void compute_display()
    {
        total=m1+m2+m3;
        System.out.println("Total marks :" +total);
    }
}
class MultilevelDemo
{
    public static void main(String arg[])
    {
        Result r=new Result();
        r.getrollno();
        r.getmarks();
        r.putrollno();
        r.putmarks();
        r.compute_display();
    }
}