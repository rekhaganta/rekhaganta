package labbook6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	//public class Excerise1 {
		 public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
		    {
		        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
		            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
		            {
		                return (o1.getValue()).compareTo(o2.getValue());
		            }
		        });
		        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		        for (Map.Entry<String, Integer> aa : list) {
		            temp.put(aa.getKey(), aa.getValue());
		        }
		        return temp;
		    }
		    public static void main(String[] args)
		    {
		        HashMap<String, Integer> hm = new HashMap<String, Integer>();
		        hm.put("sree", 100);
		        hm.put("roja", 90);
		        hm.put("praveen", 45);
		        hm.put("abhhi", 457);
		        hm.put("riya", 12);
		        hm.put("dillu", 58);
		        Map<String, Integer> hm1 = sortByValue(hm);
		        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
		            System.out.println("Key is : " + en.getKey() +", Value = " + en.getValue());
		        }
		    }
	}

