import java.util.logging.*;

public class TryCatchFinallySample2{
    private static Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());
    public static void main(String[] args){
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
