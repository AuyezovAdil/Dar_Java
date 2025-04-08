package OOP;

public class Student {
   private String name;
   private int id;
   private int year;
   public Student(String name, int id, int year) {
       this.name = name;
       this.id = id;
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public int getId() {
       return id;
    }
    public void setId(int id) {
       this.id = id;
    }
    public int increaseYear() {
       return year++;
    }
}
