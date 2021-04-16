import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RandomSuhu {

	 private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

	 public static void main( String args[] ) {
		 Scanner input = new Scanner(System.in); 

	      int min = 35;
	      int max = 39;
	      int ojek;
		  int motor;
		  int mobil;
		  int xx; 
		  int xy;
		  
		  LocalDateTime now = LocalDateTime.now();
	 	     System.out.println("Pukul Untuk Saat Ini = " +dtf.format(now));

	      int random_int = (int)Math.floor(Math.random()*(max-min)+min);
	      System.out.println("Suhu Badan Anda = " +random_int+" Celcius");
	      
	      if (random_int > 37) {
	    	  System.out.println("Anda Sedang sakit");
	    	  System.out.println("Silahkan Pilih Kendaraan Untuk Berobat :");
	 	   
	 		 System.out.println("1.Ojek");
	 	     System.out.println("2.Motor");
	 	     System.out.println("3.Mobil");
	 	     System.out.print("4.Pilih Kendaraan  = ");
	 	     int pilih = input.nextInt();
	 	     switch (pilih){
//	 	  OJEK
	 	    case 1:    
		        ojek = now.getMinute()+40;
		        System.out.print("Estimasi Waktu Anda Sampai Tujuan :");
	        	xx = now.getMinute()+40; 
		        if (xx >60) {	
		        	xy = now.getHour()+1;
		        	System.out.print(xy + ":");
		        	System.out.println(Math.abs(xx-60));
		        }else {
		        	System.out.println(now.getHour()+":"+xx);
		        }
		        System.out.println("Biaya Pergi: 10000");
		        
//		 CASE PULANG PERGI OJEK
		        System.out.println("Atur kendaraan Untuk pulang?");
		        System.out.println("1.Ya");
		        System.out.println("2.Tidak");
		        int atur = input.nextInt();
		        switch(atur){
		        case 1:
		        	System.out.println("Estimasi Lamanya Pemeriksaan 1 jam");
		        	System.out.print("Estimasi Waktu Anda Sampai Rumah :");
		        	xx = now.getMinute()+80; 
			        if (xx > 60) {		        	
			        	xy = now.getHour()+1;
			        	System.out.print((xy +1) +":");
			        	System.out.println(Math.abs(xx-60));
			        }else {
			        	System.out.println(now.getHour()+":" +xx);
			        }
			        System.out.println("Total Biaya Pulang Pergi = " +10000*2);
			        break;
	 	        case 2:
	 	        	System.out.println("Terima Kasih Semoga cepat Sehat");
	 	        	break;
	 	        }
	 	        break;
	 	        
	 	        
//	 	  MOTOR
	 	   case 2:    
		        ojek = now.getMinute()+45;
		        System.out.print("Estimasi Waktu Anda Sampai Tujuan :");
	        	xx = now.getMinute()+45; 
		        if (xx >60) {	
		        	xy = now.getHour()+1;
		        	System.out.print(xy + ":");
		        	System.out.println(Math.abs(xx-60));
		        }else {
		        	System.out.println(now.getHour()+":"+xx);
		        }
		        System.out.println("Biaya Pergi: 10000");
		        
//		 CASE PULANG PERGI MOTOR
		        System.out.println("Atur kendaraan Untuk pulang?");
		        System.out.println("1.Ya");
		        System.out.println("2.Tidak");
		        int atur1 = input.nextInt();
		        switch(atur1){
		        case 1:
		        	System.out.println("Estimasi Lamanya Pemeriksaan 1 jam");
		        	System.out.print("Estimasi Waktu Anda Sampai Rumah :");
		        	xx = now.getMinute()+90; 
			        if (xx > 60) {		        	
			        	xy = now.getHour()+1;
			        	System.out.print((xy +1) +":");
			        	System.out.println(Math.abs(xx-60));
			        }else {
			        	System.out.println(now.getHour()+":" +xx);
			        }
			        System.out.println("Total Biaya Pulang Pergi = " +10000*2);
			        break;
	 	        case 2:
	 	        	System.out.println("Terima Kasih Semoga cepat Sehat");
	 	        	break;
	 	        }
	 	        break;
//	 	   MOBIL 
	 	     case 3:
	 	    	 System.out.print("Estimasi Waktu Anda Sampai Tujuan :");
	 	    	 System.out.print(now.getHour()+1+":" +now.getMinute());
	 	    	 System.out.println("Total Biaya Pulang Pergi = " +20000);
	 	    	 System.out.println("Atur kendaraan Untuk pulang?");
	 		        System.out.println("1.Ya");
	 		        System.out.println("2.Tidak");
	 		        int atur2 = input.nextInt();
	 		        switch(atur2){
	 		        case 1:
	 		        	System.out.println("Estimasi Lamanya Pemeriksaan 1 jam");
	 		        	System.out.print("Estimasi Waktu Anda Sampai Rumah =");
	 			        	System.out.print((now.getHour()+2) +":");
	 			        	System.out.println(now.getMinute());
	 			        System.out.println("Total Biaya Pulang Pergi = " +20000*2);
	 			        break;
	 		        case 2:
	 		        	System.out.println("Terima Kasih Semoga cepat Sehat");
	 		        	break;
	 		        }
	 		        break; 
	 	     }
	      }else{
	    	  System.out.println("Anda Sehat " + ", Jagalah Selalu Kesehatan Anda");
	      }
	 }
}

	


