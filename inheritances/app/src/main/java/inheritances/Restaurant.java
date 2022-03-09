package inheritances;

import java.util.ArrayList;

public class Restaurant {

    private final String name;
    private int stars;
    private final String price;
    private final ArrayList<Review> reviews = new ArrayList<>();


    Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setStars(int stars) {
        if (stars >5 || stars <0 ) {
            System.out.println("please input between 0 and 5 only");
        }
        else {
            this.stars = stars;
        }
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }


    public String toString(){
     return String.format("There is a restaurant called %s have a %d* stars and it costs %s",
             this.getName(), this.getStars(), this.getPrice());
    }

    public void addReview( String author,String body, int stars) {
        reviews.add(new Review(body, author, stars));
        int AVES = 0;
        for (Review Col:this.reviews) {
            AVES = AVES + Col.getStars();}
        this.setStars(AVES / this.reviews.size());
    }
}
