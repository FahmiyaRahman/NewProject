package interviewQuestions;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice {
public static void main(String[] args) {
	Map <Integer,String> m = new LinkedHashMap<Integer,String>();
	m.put(10,"a");
    m.put(20,"b");
    m.put(30,"c");
    
    Set <Entry <Integer,String> > entrySet= m.entrySet();
    for (Entry<Integer, String> entry : entrySet) {
	//	System.out.println(entry);
		System.out.println(entry.getValue());
		System.out.println("Hello");
	//	System.out.println(entry.getKey());
	}
}
}
