package Collections;
// 1 task

public class Colors {
    // 1 task
    enum Color {
        RED,
        BLACK,
        WHITE,
        GREEN
    }
    public static void main(String[] args) {
    for (Color c : Color.values()) {
        System.out.println(c);
    }
    }
}
