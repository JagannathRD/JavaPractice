import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapFre {

	public static void PrintFrequency(List<String> tokenList) {
	    Map<String,Integer> m= new TreeMap<>();
	    for(String l:tokenList){
	        if(m.containsKey(l)){
	        int v= m.get(l);
	        m.put(l, ++v);
	       
	            }
	    else
	    m.put(l, 1);
	    }
	    m.forEach((k,v)->System.out.println(k+" "+v));
	    }
	    
public static void main(String[] args) {
	
	List<String> names= Arrays.asList("dog","cat","horse","dog","cat","lion","horse","horse");
	MapFre.PrintFrequency(names);
}
	}

