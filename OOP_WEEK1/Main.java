
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int detik;
        boolean repeat;

        do {
            Scanner scan = new Scanner(System.in);
            repeat=false;
            System.out.print("Enter an integer for seconds: ");
            if (scan.hasNextInt()) {
                detik = scan.nextInt();
                int menit = hitungMenit(detik);
                System.out.println(detik + " seconds is " + menit + " minutes and " + (detik - (menit * 60)) + " seconds");
            } else {
                System.out.println("Please enter an integer !!");
                repeat=true;
            }
        }while(repeat);//Repeat ketika input bukan Integer
    }

    public static int hitungMenit(int d){
        return d/60;

    }
}
