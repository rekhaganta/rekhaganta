package labbook3;

import java.util.Scanner;

public class Exe2 {
	 public String getImage(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
     }
     public static void main(String[] ar)
     {
            Exe2 p = new Exe2();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = s.next();
            System.out.println(p.getImage(str));
     }
}


