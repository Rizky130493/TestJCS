import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Olahrga {
	
	
	public static void main( String args[] ) {
	Scanner input = new Scanner(System.in); 
		int min = 6;
		int max = 7;
		
		
		
		SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
		 Date tanggal = new Date();
		  LocalDate currentDate = LocalDate.now();
	      DayOfWeek day = currentDate.getDayOfWeek();
	      int weekVal = day.getValue();
	      String weekName = day.name();
	      int random_int = (int)Math.floor(Math.random()*(max-min)+min);
	      System.out.println("Jam Berangkat  = " +random_int +" Pagi");
	      System.out.println("Hari, Tanggal, Dan Tahun = "+weekName +" "+format.format(tanggal));
	      if (random_int == 6) {
	      	System.out.println("Pilih Kendaraan Untuk Pergi Berolahraga :");
	      	System.out.println("1.Mobil");
	      	System.out.println("2.Motor");
	      	System.out.println("3.Ojek");
	      	System.out.print("Pilih Kendaraan  = ");
	      	int a = input.nextInt();
	      	switch(a) {
	      	case 1:
	      		if(weekVal == 5) {
	      			System.out.println("lamanya Anda Berolahraga 7 Jam");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+1)+":00");
	      			System.out.println("Biaya Sekali Perjalanan = 20000");
	      			System.out.println("Total Biata Pulang Pergi = " +20000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":00");
	      			break;
	      		}else if(weekVal > 5) {
	      			System.out.println("Hari Ini Adalah Weekend");
	      		}else{
	      			System.out.println("lamanya Anda Berolahraga 8 Jam");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+1)+":00");
	      			System.out.println("Biaya Sekali Perjalanan = 20000");
	      			System.out.println("Total Biata Pulang Pergi = " +20000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":00");
	      		}
	      	case 2:
	      		if(weekVal == 5) {
	      			System.out.println("lamanya Anda Berolahraga 7 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":45");
	      			System.out.println("Biaya Sekali Perjalanan = 5000");
	      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":45");
	      			break;
	      		}else if(weekVal > 5) {
	      			System.out.println("Hari Ini Adalah Weekend");
	      		}else{
	      			System.out.println("lamanya Anda Berolahraga 8 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":45");
	      			System.out.println("Biaya Sekali Perjalanan = 5000");
	      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+9) +":45");
	      		}
	      	case 3:
	      		if(weekVal == 5) {
	      			System.out.println("lamanya Anda Berolahraga 7 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":40");
	      			System.out.println("Biaya Sekali Perjalanan = 5000");
	      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":40");
	      			break;
	      		}else if(weekVal > 5) {
	      			System.out.println("Hari Ini Adalah Weekend");
	      		}else{
	      			System.out.println("lamanya Anda Berolahraga 8 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":40");
	      			System.out.println("Biaya Sekali Perjalanan = 10000");
	      			System.out.println("Total Biata Pulang Pergi = " +10000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+9) +":40");
	      		}	
	      		
	      	}
    }else {
    	System.out.println("Pilih Kendaraan Untuk Pergi Berolahraga :");
      	System.out.println("1.Motor");
      	System.out.println("2.Ojek");
      	System.out.print("Pilih Kendaraan  = ");
      	int a = input.nextInt();
      	switch(a){
      	case 1:
      		if(weekVal == 5) {
      			System.out.println("lamanya Anda Berolahraga 7 Jam");
      			System.out.println("Anda Bisa Berangkat Di Jam 7");
      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":45");
      			System.out.println("Biaya Sekali Perjalanan = 5000");
      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":45");
      			break;
      		}else if(weekVal > 5) {
      			System.out.println("Hari Ini Adalah Weekend");
      		}else{
      			System.out.println("lamanya Anda Berolahraga 8 Jam");
      			System.out.println("Anda Bisa Berangkat Di Jam 7");
      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":45");
      			System.out.println("Biaya Sekali Perjalanan = 5000");
      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
      			System.out.println("Estimasi Sampai Rumah = "+(random_int+9) +":45");
      		}
      		
      		case 2:
      			if(weekVal == 5) {
	      			System.out.println("lamanya Anda Berolahraga 7 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":40");
	      			System.out.println("Biaya Sekali Perjalanan = 5000");
	      			System.out.println("Total Biata Pulang Pergi = " +5000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+8) +":40");
	      			break;
	      		}else if(weekVal > 5) {
	      			System.out.println("Hari Ini Adalah Weekend");
	      		}else{
	      			System.out.println("lamanya Anda Berolahraga 8 Jam");
	      			System.out.println("Anda Bisa Berangkat Di Jam 7");
	      			System.out.println("Estimasi Waktu Sampai = " +(random_int+2)+":40");
	      			System.out.println("Biaya Sekali Perjalanan = 10000");
	      			System.out.println("Total Biata Pulang Pergi = " +10000*2);
	      			System.out.println("Estimasi Sampai Rumah = "+(random_int+9) +":40");
	      		}
      	}
    }

}
}
