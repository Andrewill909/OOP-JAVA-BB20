
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama kota pertama : ");
        String kota1 = input.nextLine();
        kota1.toLowerCase();


        System.out.print("Masukkan nama kota kedua : ");
        String kota2 = input.nextLine();
        kota2.toLowerCase();

        System.out.println(kota1.compareTo(kota2));
        if(kota1.compareTo(kota2) > 0){
            System.out.println("Kedua kota tersebut (urut) : " + kota2 + " dan " + kota1 );
        }else{
            System.out.println("Kedua kota tersebut (urut) : " + kota1 + " dan " + kota2 );

        }
    }
}
