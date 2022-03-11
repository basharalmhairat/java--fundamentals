package inheritances;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String price;
    private int stars;
    private ArrayList<Review> reviews = new ArrayList<>();


    Shop(String name, String description,int stars, String price) {
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.price = price;
    }

    public String toString() {
        return  "Shops " + "name: "+name+System.lineSeparator()+
                "price= " +price+System.lineSeparator()+
                "description: "+description+System.lineSeparator()+
                "reviews: "+reviews+System.lineSeparator();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(String body, String author, int stars, Shop shop){

        reviews.add(new Review(body, author, stars,this));
        int AVES = 0;
        for (Review Col:this.reviews) {
            AVES = AVES + Col.getStars();}
        this.setStars(AVES / this.reviews.size());
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }
}