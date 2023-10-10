class Student1{
    String name;
    int regno, marks[]= new int[5], total, Grade;
    double average;
    Student1(String sname, int rno){
        name=sname;
        regno=rno;
        average=0;
    }
    Student1(String sname, int rno, int[] m){
        name=sname;
        regno=rno;
        average=0;
        for(int i=0; i<5; i++) marks[i]=m[i];
    }
    void calculateAverage(){
        for(int i=0; i<5; i++) average+=marks[i];
        average/=5;
        Grade=(int)(average/10);
    }
    void printDetails(){
        System.out.println("Name: "+name+"\nReg no: "+regno);
        for(int i=0; i<5; i++) System.out.println("Mark in subject "+(i+1)+" :"+marks[i]);
        System.out.println("Average: "+average+"\nGrade: "+Grade);
    }  
}
class StudentMarks{
    public static void main(String a[]){
        Student1 s1, s2;
        s1=new Student1(a[0], Integer.parseInt(a[1]));
        int mark[]= new int[5];
        for(int i=0; i<5; i++){
            mark[i]=Integer.parseInt(a[i+4]);
            System.out.println(mark[i]);
        }
        s2=new Student1(a[2], Integer.parseInt(a[3]), mark);
        s1.calculateAverage();
        s2.calculateAverage();
        s1.printDetails();
        s2.printDetails();
    }
}