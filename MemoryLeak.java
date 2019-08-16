import java.util.HashMap;
import java.util.Map;

public class MemoryLeak {
	private Map cache = new HashMap();
	public int square(int i) {
		
		int result = i*i;
		cache.put(i, result);
		return result; 
	}
	
	public static void main(String args[]) {
		
		MemoryLeak ml = new MemoryLeak();
		int i=0;
		
		while(true) {
			i=i+1;
			System.out.println("Answer "+ml.square(i));
		}
		
	}
	
}
