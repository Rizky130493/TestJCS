import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Tanggal {

	 public static void main(String[] args) {
		 SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
		 Date tanggal = new Date();
		  LocalDate currentDate = LocalDate.now();
	      DayOfWeek day = currentDate.getDayOfWeek();
	      int weekVal = day.getValue();
	      String weekName = day.name();
	      System.out.println("Hari, Tanggal, Dan Tahun = "+weekName +" "+format.format(tanggal));
	      if (weekVal == 8) {
	    	  System.out.println("jumatan");
	      }else {
	    	  System.out.println("bebas");
	      }
	   }
		 
	 }