import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){

        String num;
        boolean repeat;
        //random
        String random = rand();
        do{
            repeat = true;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan 2 digit angka <00 - 99> :  ");
            num = input.next();

            repeat = validate(num);

        }while(repeat);

        //Selection

        if(num.equals(random)){

            System.out.println("Congratz !! you won $10,000, the lottery code is " + random);

        } else if(rev(num, random)) {

            System.out.println("Congratz !! you won $3,000, the lottery code is "+ random);

        } else if(exist(num,random)){
            System.out.println("Congratz !! you won $1,000, the lottery code is "+ random);
        }else {
            System.out.println("Ooops, you got nothing, the lottery code is "+ random);
        }
    }

    public static String rand() {
        return Integer.toString((int)(Math.random() * 10)) + Integer.toString((int)(Math.random() * 10));
    }

    public static boolean validate(String n) {
        if((n.length() > 2) || (! n.matches("[0-9][0-9]"))){
            return true;
        }else {
            return false;
        }
    }

    public static boolean rev(String num, String random) {
        String rev = "";
        int length = num.length();
        for(int i = length-1; i>=0; i--){
            rev+= num.charAt(i);
        }
        return rev.equals(random);
    }

    public static boolean exist(String num, String random){
        for(int i=0 ; i< num.length() ; i++){
            if(random.contains(""+num.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
