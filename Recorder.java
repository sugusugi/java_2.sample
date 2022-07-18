import java.util.HashMap;
import java.util.Map;

public class Recorder{
    private Map <String,String> pair = new HashMap<>();

    public void put(String key, String value){
        this.pair.put(key,value);
        System.out.println(key + "=" + value);
    }

    public void get(String key) throws IllegalArgumentException{
        if(this.pair.containsKey(key)){
            System.out.println(this.pair.get(key));
        } else{
            throw new IllegalArgumentException();
        }
    }

    public void delete(){
        this.pair.clear();
        System.out.println("deleted all");
    }

    public void delete(String key) throws IllegalArgumentException{
        if(this.pair.containsKey(key)){
            this.pair.remove(key);
            System.out.println("deleted: " + key);
        } else{
            throw new IllegalArgumentException();
        }
      }
}
