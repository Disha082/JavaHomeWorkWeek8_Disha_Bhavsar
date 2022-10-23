package JavaProgrammesweek_8;

public class Student5Question25 {
    int id;
    String name;
    int age;
    //created two arg constructor
    Student5Question25(int i, String n){
        id = i;
        name = n;
    }
    //created three arg constructor
    Student5Question25(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    public void display (){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[]){
        Student5Question25 s1 = new Student5Question25(111,"Karan");
        Student5Question25 s2 = new Student5Question25(222,"Araan",25);
        s1.display();
        s2.display();
    }
}
