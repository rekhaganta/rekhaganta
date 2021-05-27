package labbook3;

import java.time.LocalDate;
import java.time.Period;

public class Exe9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1998, 03, 24);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(date, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());

	}
}

