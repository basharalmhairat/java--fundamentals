package inheritances;

public class Main {
    public static void main(String[] args) {
Restaurant restaurant = new Restaurant("chili",2,"23$");
        System.out.println( new Restaurant("KFC", 4, "21$"));
        System.out.println( new Review("jay","sam" , 2,restaurant));
        System.out.println( new Review("jack", "it was good", 6,restaurant));
 restaurant.addReview("rony","perhaps i will not come again",0);
        restaurant.addReview("rony","perhaps i will come again",4);
        System.out.println(restaurant.getReviews().get(0).toString());
    Theater aser=new Theater("aser",3);
       aser.addMovie("Dream");
        System.out.println(new Theater("CASE",2));
        System.out.println(new Shop("CASE2","it was perfect",4,"44"));
    }
}
