package inheritances;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTheaterTest {




    @Test
    public void testGetName() {

        Shop feedBack = new Shop("KFC", "it can be petter",2,"23");
        assertEquals( "KFC", feedBack.getName());
    }

    @Test
    public void testGetStars() {

        Shop feedBack = new Shop("KFC", "it can be petter",2,"23");
        assertEquals( 2, feedBack.getStars());

    }

    @Test
    public void testGetPriceHappy() {

        Shop feedBack = new Shop("KFC", "it can be petter",2,"23");
        assertEquals( "23", feedBack.getPrice());

    }

    @Test
    public void testToStringHappy() {

        Shop feedBack = new Shop("KFC", "it can be petter",2,"23");
   assertEquals( "Shops name: KFC\n"+"price= 23\n"+"description: it can be petter\n"+"reviews: []\n",feedBack.toString());
    }

    @Test
    public void testAddReviewHappy() {
        Shop feedBack = new Shop("KFC", "it can be petter",2,"23");
        feedBack.addReview("it was perfect", "khaled", 5, feedBack);
        assertEquals("khaled says it was perfect so the 5* stars it is what they expect",feedBack.getReviews().get(0).toString());

    }


}