public class Tabung {
    public double radius, tinggi;

    //jika tidak menerima arg maka set nilai default
    Tabung(){
        radius = 1;
        tinggi = 1;
    }

    //jika menerima arg
    Tabung(double rad, double ting){
        radius = rad;
        tinggi = ting;
    }

    public double getVolume(){
        return Math.PI * radius * radius * tinggi;
    }

    public double getLuasAlas(){
        return Math.PI * radius * radius;
    }

    public void setRadius(double rad){
        radius = rad;
    }

    public void setTinggi(double ting){
        tinggi = ting;
    }


}
