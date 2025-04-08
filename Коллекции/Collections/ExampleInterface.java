package Collections;
 // 3 task

interface Flyable {
    void fly();
}


class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}


class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}




