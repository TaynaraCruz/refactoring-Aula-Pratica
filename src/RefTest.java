import org.junit.Test;
import static org.junit.Assert.*;

public class RefTest {

    @Test
    public void testStatement() {

        Movie mov1 = new Movie("Frozen", 0);
        Movie mov2 = new Movie("SpiderMan", 1);
        Movie mov3 = new Movie("Mulan", 2);
        Movie mov4 = new Movie("LionKing", 1);

        Rental rent1 = new Rental(mov1, 15);
        Rental rent2 = new Rental(mov2, 10);
        Rental rent3 = new Rental(mov3, 20);
        Rental rent4 = new Rental(mov4, 5);

        Customer cos = new Customer("Joao");
        
        cos.addRental(rent1);
        cos.addRental(rent2);
        cos.addRental(rent3);
        cos.addRental(rent4);
        
        assertEquals(cos.statement(), "Rental Record for Joao\n\tFrozen\t21.5\n\tSpiderMan\t30.0\n\tMulan\t27.0\n\tLionKing\t15.0\nAmount owed is 93.5\nYou earned 6 frequent renter points");
       
    }

}