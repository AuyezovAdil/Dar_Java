package Classes;
// 2 task
public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getArea() {

        System.out.println(this.a * this.b * this.c / 2);
    }

    public void getPerimeter() {

        System.out.println(this.a + this.b + this.c);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.getArea();
        triangle.getPerimeter();
    }
}

