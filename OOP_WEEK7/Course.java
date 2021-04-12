import java.util.Arrays;
import java.util.Scanner;

class Course {

    private String courseName;
    String[] students = {};
    private int numberOfStudents = 0;

    Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void addStudent(String student){
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        this.students[this.students.length - 1] = student;
        this.numberOfStudents++;

    }

    public void dropStudent(String student){
        int index = -1;
        for(int i=0; i< this.students.length; i++){
            if(this.students[i].compareToIgnoreCase(student) == 0)
                index = i;
        }
        if(index != -1){
            String[] newstud = new String[this.students.length-1];
            for(int i=0,k=0; i<this.students.length; i++){
                if(i == index) continue;

                newstud[k++]=this.students[i];
            }
            this.students = newstud.clone();
            this.numberOfStudents--;
        }else{
            System.out.println("data tidak ditemukan");
        }

    }

    public String getStudents(){
        return String.join(",", this.students);
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }



}

class TestCourse{

    public static void main(String[] args){

        boolean repeat = true;
        int choice,ch1,ch2;

        TestCourse test = new TestCourse();
        Course course1 = new Course("course1");
        Course course2 = new Course("course2");

        while(repeat){
            Scanner input = new Scanner(System.in);
            System.out.println("\n\nMenu pengolahan data course & student");
            System.out.println("1. Tambahkan data");
            System.out.println("2. Hapus data");

            System.out.print("Masukkan pilihan : ");
            choice = input.nextInt();

            switch (choice){
            case 1:

                String stud;
                System.out.print("Masukkan course yang akan ditambahkan data (1/2) : ");
                ch1 = input.nextInt();
                if(ch1 == 1){
                    Scanner input2 = new Scanner(System.in);

                    System.out.println("Jumlah student saat ini: " + course1.getNumberOfStudents());
                    System.out.print("Masukkan nama student : ");
                    stud = input2.nextLine();
                    course1.addStudent(stud);
                    System.out.println("Jumlah student sekarang " + course1.getNumberOfStudents() + "\nList student : " + course1.getStudents());
                }else if(ch1 == 2){
                    Scanner input3 = new Scanner(System.in);

                    System.out.println("Jumlah student saat ini: " + course2.getNumberOfStudents());
                    System.out.print("Masukkan nama student : ");
                    stud = input3.nextLine();
                    course2.addStudent(stud);
                    System.out.println("Jumlah student sekarang " + course2.getNumberOfStudents() + "\nList student : " + course2.getStudents());
                }
                break;

            case 2:
                Scanner input4 = new Scanner(System.in);

                String del;
                System.out.print("Masukkan course yang akan dihapus datanya (1/2) : ");
                ch2 = input.nextInt();
                if(ch2 == 1){
                    System.out.println("List student saat ini : "+ course1.getStudents() +" ,berjumlah " + course1.getNumberOfStudents() + " orang");
                    System.out.print("Masukkan nama student yang akan dihapus : ");
                    del = input4.nextLine();
                    course1.dropStudent(del);
                    System.out.println("List student saat ini : "+ course1.getStudents() +" ,berjumlah " + course1.getNumberOfStudents() + " orang");
                }else if(ch2 == 2){
                    System.out.println("List student saat ini : "+ course2.getStudents() +" ,berjumlah " + course2.getNumberOfStudents() + " orang");
                    System.out.print("Masukkan nama student yang akan dihapus : ");
                    del = input4.nextLine();
                    course2.dropStudent(del);
                    System.out.println("List student saat ini : "+ course2.getStudents() +" ,berjumlah " + course2.getNumberOfStudents() + " orang");
                }

                break;
            }
        }


    }

}
