import java.util.Scanner;

public class Week6 {
    public static void main(String[] args){
        int jumMhs, jumSoal = 10,nilaiTemp=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumMhs = scan.nextInt();
        int[] jumlahBenar = new int[jumMhs];

        String[][] jawabanMhs = new String[jumMhs][jumSoal];
        String[] kunci = {"D","B","D","C","C","D","A","E","A","D"};

        //input nilai
        for(int i=0; i< jumMhs; i++){
            System.out.println("Masukkan nilai untuk mahasiswa ke " + (i+1));
            for(int j=0; j< jumSoal; j++){
                System.out.print("Masukkan jawaban nomor " + (j+1) +" : ");
                jawabanMhs[i][j] = scan.next();
            }
        }

        //cek input
        for(int i=0; i< jumMhs; i++){
            nilaiTemp=0;
            for(int j=0; j< jumSoal;j++){
                nilaiTemp = (jawabanMhs[i][j].equalsIgnoreCase(kunci[j])) ? ++nilaiTemp : nilaiTemp;
            }
            jumlahBenar[i] = nilaiTemp;
        }

        for(int i=0; i< jumMhs; i++){
            System.out.println("Mhs "+ i + " jumlah jawaban benar adalah " + jumlahBenar[i]);
        }

    }
}
