package labbook6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercisee6 {
	public static class Exercise6 {
		public List<Integer> votersList(Map<Integer,LocalDate> map) {
	    	List<Integer> res = new ArrayList<>();
	    	Set<Integer> set = map.keySet();
	        Iterator<Integer> itr = set.iterator();
	        LocalDate today = LocalDate.now();
	        while(itr.hasNext()) {
	        	int id = itr.next();
	        	LocalDate ld = map.get(id);
	        	Period p = ld.until(today);
	        	int age = p.getYears();
	        	if(age>18) {
	        	   res.add(id);
	        	}
	        }
	    	return res;
	    }

		public static void main(String[] args) {
			Map<Integer,LocalDate> map = new HashMap<>();
			map.put(100, LocalDate.of(1999, 5, 5));
			map.put(101, LocalDate.of(2005, 10, 20));
			map.put(103, LocalDate.of(1989, 5, 15));
			map.put(104, LocalDate.of(2005, 2, 27));
			Exercise6 e = new Exercise6();
			List<Integer> list = e.votersList(map);
			System.out.println(list);
		}
	} 

}
