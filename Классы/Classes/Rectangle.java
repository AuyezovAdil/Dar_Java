package Classes;
// 3 task

public class Rectangle {
    int x;
    int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getArea() {
        return x*y;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
    }
}
