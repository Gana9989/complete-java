/*PolyMorphism Concept in OOPS */
class student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gana";
        s1.age = 18;

        s1.printInfo(s1.name, s1.age);
    }
}