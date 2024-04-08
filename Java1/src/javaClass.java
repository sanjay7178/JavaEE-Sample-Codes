import java.io.IOException;
import java.util.EmptyStackException;

public class javaClass {
    public static void main(String[] args) {
        try{
            System.out.print(1);
            throw new Exception();
        }
        catch(IOException e){
            System.out.print(2);
        }
        catch (EmptyStackException e){
            System.out.print(3);
        }
        catch (Exception e){
            System.out.print(4);
        }finally {
            System.out.print(5);
        }
    }
}
