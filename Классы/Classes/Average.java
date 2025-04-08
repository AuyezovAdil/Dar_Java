package Classes;
// 4 task
public class Average {
    double q, w, e;
    public Average(double q, double w, double e) {
        this.q = q;
        this.w = w;
        this.e = e;
    }
    public double getAverage() {

        return (q+w+e)/3;
    }
    public static void main(String[] args) {
        Average average1 = new Average(5,16,22);
        System.out.println(average1.getAverage());
    }
}
