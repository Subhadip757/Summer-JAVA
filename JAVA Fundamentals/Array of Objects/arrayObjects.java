
class Student{
    public int roll;
    public String name;
    public int marks;
}

public class arrayObjects {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Subhadip";
        s1.marks = 99;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Divya";
        s2.marks = 98;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Elvis";
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

    }
}
