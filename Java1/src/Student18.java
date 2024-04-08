import com.sun.jdi.ObjectCollectedException;

public class Student18 implements Cloneable {
    int rollno;
    String s;

    public Student18(int rollno, String s) {
        this.rollno = rollno;
        this.s = s;
    }
    protected Object clone() throws ObjectCollectedException, CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student18 s1 = new Student18(1011,"Sanjay");
        Student18 s2 = (Student18)s1.clone();
        System.out.println(s1.rollno+" "+s1.s);
        System.out.println(s2.rollno+" "+s2.s);
    }
}
