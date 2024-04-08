public class genclss {
    // reversing a list of numbers
    int[] a;
    public genclss(int a[]){//creating a constructor
        this.a=a;

    }void Method1(){
        for(int x:a) {
            System.out.println(x);
        }}
    void reversing(){
        int j;
        j=a.length;
        for(int i=0;i>j;i++) {
            int temp;
            temp=a[i];//temp stores 1st element of a array
            a[j]=a[i];// here jth value of a array stores to 1 st value
            a[j]=temp;//here the 1st value comes to jth position
            j--;//value j becomes one valus less
            System.out.println(a[i]);
            System.out.println(a[j]);
        }}
    public static void main(String[] args){
        int[] a= {1,6,77,9,0,7};
        genclss obj=new genclss(a);
        obj.Method1();
        obj.reversing();
        obj.Method1();
    }
}