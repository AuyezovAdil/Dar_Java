package Classes;
// 1 task
public class Student {
    String name;
    String surname;
    String address;
    int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Address: %s, ID:%02d", this.name, this.surname, this.address, this.id);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alisa", "Smith", "Koktem-1", 24);
        Student student2 = new Student("Abay", "Zhan", "Atakent", 35);
        Student student3 = new Student("Berik", "Soprano", "Semey", 2);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
