import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        String[] hari = {"senin", "selasa","rabu", "kamis","jumat","sabtu","minggu"};
        boolean repeat = true;
        int indexHariIni = 0;

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Program ini akan menghitung 1000 hari kedepan dari input");
            System.out.print("Masukkan nama hari <contoh: senin>: ");
            String answer = input.next();
            for(int i=0;i<hari.length;i++){
                if(answer.equals(hari[i])){
                    repeat = false;
                    indexHariIni = i;
                    break;
                }
            }
        }while(repeat);//program akan mengulang input ketika inputan user bukan nama hari

        //logika: untuk menghitung 1000 hari kedepan, tinggal 1000 % 7 maka hasilnya (sisa) yaitu x hari setelah hari yang diinput
        int indexSeribuHari = indexHariIni + (1000 % 7);//1000 mod 7 adalah 6
        String hasilHari = hari[indexSeribuHari%7];
        System.out.println("1000 hari kedepan adalah hari "+hasilHari);

        //NOTE
        //Jika hendak dibuat lebih dinamis, tinggal menembahkan input banyaknya jumlah hari yang ingin ditambkahkan
        // ,kemudian menggantikan nilai 1000 dengan variabel yang menampungnya





    }
}
