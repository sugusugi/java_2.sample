import java.util.logging.*;

public class TryCatchFinallySample{
    public static void main(String[] args){
        try{
            System.out.println("try");
            if(args[0].equals("test")){
                throw new Exception();
            }
        } catch(Exception e){
            System.out.println("catch");
        } finally{
            System.out.println("finally");
        }
    }
}
