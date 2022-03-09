package inheritances;

public class Review {

    private String body;
    private String author;
    private int stars;

    public Review(String author,String body,  int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;

    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return String.format("%s says %s so the %d* stars it is what they expect",
                this.getAuthor(), this.getBody(), this.getStars());
    }
}
