class Student{
    String name;
    Student(){
        name="Unknown";
    }
    Student(String a){
        name=a;
    }
    void display(){
        System.out.println("Name: "+name);
    }
}

class StudentBasic{
    public static void main(String a[]){
        Student s1, s2;
        s1=new Student();
        s2=new Student(a[0]);
        s1.display();
        s2.display();
    }
}