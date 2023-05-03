public class Oops {
    public static void main(String[] args) {
        // Creating the object gourav from Student class
        Student gourav = new Student("Gourav", "BCA", 1911, 499);
        gourav.info();

        Student sourav = new Student("Sourav", "12th", 46, 460);
        sourav.info();

        Student de = new Student();
        de.info();

        // Human h1 = new Human("g1", 34, 100000, false);
        // Human h2 = new Human("g2", 54, 300000, true);
        // Human h3 = new Human("g2", 54, 300000, true);
        // Human h4 = new Human("g2", 54, 300000, true);
        System.out.println(Human.population);
    }

}

/**
 * Human
 */
class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}

class Student {
    String name, classs;
    int roll, marks;

    // default constructor
    Student() {
        // calling another constructor from a constructor
        this("Default", "Final", 100, 500);
    }

    // Constructor of Student class
    Student(String name, String classs, int roll, int marks) {
        this.name = name;
        this.classs = classs;
        this.roll = roll;
        this.marks = marks;
    }

    void info() {
        System.out.println(this.name + " is studying in " + this.classs + " roll number of " + this.roll
                + " and got " + this.marks + " marsks.");
    }
}