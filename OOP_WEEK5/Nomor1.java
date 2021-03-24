public class Nomor1 {
    public static void main(String[] args){

        Tabung tabung1 = new Tabung(5,10);
        System.out.println(tabung1.radius);
        System.out.println(tabung1.tinggi);
        System.out.println(tabung1.getLuasAlas());
        System.out.println(tabung1.getVolume());


        Tabung tabung2 = new Tabung(7.5,15.5);
        System.out.println(tabung2.radius);
        System.out.println(tabung2.tinggi);
        System.out.println(tabung2.getLuasAlas());
        System.out.println(tabung2.getVolume());

        //apabila tidak mengirimkan nilai radius dan tinggi (alias default)
        Tabung tabung3 = new Tabung();
        System.out.println(tabung3.radius);
        System.out.println(tabung3.tinggi);
        System.out.println(tabung3.getLuasAlas());
        System.out.println(tabung3.getVolume());

    }
}
