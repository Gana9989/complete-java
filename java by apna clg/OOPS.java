class Pen {
    String color;
    String type;// ballPen; gel

    public void write() {
        System.out.println("The type of this Pen is " + this.type);
    }

    public void printcolor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ballpoint";

        Pen p3 = new Pen();
        p3.color = "red";
        p3.type = "Sparkel";

        Student s1 = new Student();
        s1.name = "J.Gana Sai Surya";
        s1.age = 18;

        Student s2 = new Student(s1);
        s2.printInfo();

        p1.printcolor();
        p1.write();
        p2.printcolor();
        p2.write();
        p3.printcolor();
        p3.write();

        s1.printInfo();
    }
}