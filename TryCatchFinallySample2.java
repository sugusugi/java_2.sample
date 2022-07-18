import java.util.logging.*;

public class TryCatchFinallySample2{
    public static void main(String[] args){
        Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        logger.setLevel(Level.ALL);
        try{
            logger.warning("try");
            if(args[0].equals("test")){
                throw new Exception();
            }
        } catch(Exception e){
            logger.severe("catch");
        } finally{
            logger.info("finally");
        }
    }
}
