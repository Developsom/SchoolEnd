package CollectiesLussen;
import java.util.HashMap;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap<Integer, String>();
    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < 10; i++){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
    public String translate(Integer number){
        return numericAlpha.get(number);
    }
}
