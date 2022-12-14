import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCollection {

	public static void main(String[] args) {
//kada nam je potrebno da imamo dva podatka broj i ime k=moze da se koristi i ovo
		HashMap<Integer,String> employeeIDNameMap= new HashMap<Integer,String>();
		
		employeeIDNameMap.put(100, "Zeljka");
		employeeIDNameMap.put(101, "Erne");
		employeeIDNameMap.put(102, "Laza");
		employeeIDNameMap.put(103, "Filip");
		
		
		Iterator ite = employeeIDNameMap.entrySet().iterator();
		
		while(ite.hasNext()){
		Map.Entry<Integer, String> keyvalue = (Entry<Integer, String>) ite.next();
		System.out.println(keyvalue.getKey()+keyvalue.getValue());
		}
		
		
		
		System.out.println();
		
		
		
		//for loop nacin
		
		for (Map.Entry<Integer, String> entry : employeeIDNameMap.entrySet()) {
		System.out.println(entry.getKey()+ entry.getValue());
		
		}
		
	}

}
