package labbook6;

import java.util.HashMap;
import java.util.Set;

public class Exercise4 {
    public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
    {
           HashMap<String,String> medal = new HashMap<>();
           Set<String> set = stu.keySet();
           for(String s:set)
           {
                  Integer marks = stu.get(s);
                  if(marks>=90){
                        medal.put(s,"Gold");
                  }
                  else if(marks >=80){
                        medal.put(s,"Silver");
                  }
                  else if(marks>=70){
                        medal.put(s,"Bronze");
                  }
           }
           return medal;
    }
    public static void main(String[] args)
    {
           HashMap<String,Integer> stu = new HashMap<>();
           Exercise4 p = new Exercise4();
           stu.put("Amulya",65);
           stu.put("sravani",76);
           stu.put("Shivani",89);
           stu.put("Sruthi",90);
           stu.put("Sai",93);
           System.out.println("the following students won the medals according to their marks : \n" +p.getStudent(stu));
    }


}
