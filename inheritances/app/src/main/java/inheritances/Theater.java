package inheritances;
import java.util.ArrayList;

public class Theater {
    private String name;
    private int stars;
    private final ArrayList<Review> reviews = new ArrayList<>();
    private final ArrayList<String> movies = new ArrayList<>();

    Theater(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    public void addMovie(String movieName) {
        movies.add(movieName);
    }

    public String toString() {
        return "Theater " + "name: " + name + System.lineSeparator() +
                "stars= " + stars + System.lineSeparator() +
                "movies: " + movies + System.lineSeparator() +
                "reviews: " + reviews + System.lineSeparator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void removeMovie(String movieName) {
        movies.remove(movieName);
    }

    public void addReview(String body, String author, int stars, Theater theater) {

        reviews.add(new Review(body, author, stars, this));
        int AVES = 0;
        for (Review Col : this.reviews) {
            AVES = AVES + Col.getStars();
        }
        this.setStars(AVES / this.reviews.size());
    }
}
