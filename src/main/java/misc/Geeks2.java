package misc;

class Student {
     int roll_no;
     String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Geeks2 {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] studs;

        // allocating memory for 5 objects of type Student.
        studs = new Student[5];

        // initialize the elements of the array
        studs[0] = new Student(1, "aman");
        studs[1] = new Student(2, "vaibhav");
        studs[2] = new Student(3, "shikar");
        studs[3] = new Student(4, "dharmesh");
        studs[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for(Student stud : studs){
            System.out.println(stud.getRoll_no() + " " + stud.getName());
        }
    }
}