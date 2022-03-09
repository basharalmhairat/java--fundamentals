package inheritances;

public class Main {
    public static void main(String[] args) {
Restaurant restaurant = new Restaurant("chili",2,"23$");
        System.out.println( new Restaurant("KFC", 4, "21$"));
        System.out.println( new Review("jay","sam" , 2));
        System.out.println( new Review("jack", "it was good", 6));
 restaurant.addReview("rony","mape i will come again",2);
        System.out.println(restaurant.getReviews().get(0).toString());
    }
}
