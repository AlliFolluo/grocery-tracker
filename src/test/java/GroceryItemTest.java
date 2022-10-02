import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryItemTest {

    @Test
    public void shouldHaveAnItemNameOfGrapesDeptOfProducePriceOf5AndNotOnSale(){
        GroceryItem underTest = new GroceryItem("Grapes","Produce",5,false);
        String name = underTest.getName();
        String department = underTest.getDepartment();
        double price = underTest.getPrice();
        boolean isOnSale = underTest.getOnSale();
        assertEquals("Grapes", name);
        assertEquals("Produce", department);
        assertEquals(5.0, price);
        assertEquals(false, isOnSale);
    }

    @Test
    public void grapesShouldHaveAPriceOf4AfterA20PercentSale(){
        GroceryItem underTest = new GroceryItem("Grapes","Produce",5,false);
        underTest.activateSale(.20);
        double price = underTest.getPrice();
        boolean isOnSale = underTest.getOnSale();
        assertEquals(4.0, price);
        assertEquals(true,isOnSale);

    }
}
