package Classes;

// task 5

public class Movie {
    String title;
    String studio;
    String rating;
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public String getMovie() {
        return title+" "+studio+" "+rating;
    }
    public static void main(String[] args) {
        Movie movie1 = new Movie("Focus", "RatPac", "R");
        Movie movie2 = new Movie("Hero", "20th Century");
        System.out.println(movie1.getMovie());
        System.out.println(movie2.getMovie());
    }
}
