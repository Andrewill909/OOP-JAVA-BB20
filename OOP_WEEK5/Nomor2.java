import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Nomor2 {


    public static void main(String[] args){
        GregorianCalendar kalender = new GregorianCalendar();

        System.out.println("Tanggal hari ini : " + kalender.get(Calendar.DATE));
        System.out.println("Bulan : " + (kalender.get(Calendar.MONTH) + 1));
        System.out.println("Tahun : " + kalender.get(Calendar.YEAR));
        System.out.println("\nDengan format lainya : " + kalender.getTime());

        //Untuk menghitung waktu yang dilewati sejak 1 januari 1970 dapat menggunakan method getTimeInMillis(long)

        long day = TimeUnit.MILLISECONDS.toDays(kalender.getTimeInMillis());
        long year = day / 365;
        day %= 365;
        long month = day / 30;
        day %= 30;

        //dengan asumsi 1 tahun adalah 365 hari dan tiap bulan adalah 30 hari
        System.out.println("Waktu yang telah berlalu dari 1 januari 1970 ke sekarang adalah " + year + " Tahun " + month + " Bulan " + day + " hari.");


    }
}
