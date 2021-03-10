import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random ran = new Random();
        //random
        int rand = ran.nextInt(101);

        int input = -1;

        System.out.println("Guess a magic number between 0 and 100");

        do{
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your guess : ");
            if(scan.hasNextInt()){
                input = scan.nextInt();
                if(input > 100 || input < 0)
                    continue;
            }else{
                continue;
            }

            if(input > rand){
                System.out.println("Your guess is too high");
            }else if(input < rand){
                System.out.println("Your guess is too low");
            }

        }while(input != rand);

        System.out.println("Yes, the number is " + rand);

    }
}
