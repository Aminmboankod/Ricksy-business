package edu.craptocraft.ricksy.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CrystalExtenderTest {
    
    CrystalExpender packExpender;
    CreditCard abradolph;
    

    @Before
    public void setup() {
        packExpender = new CrystalExpender(3, 50);
        abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    }


    @Test
    public void testConstructor() {
        assertNotNull(packExpender);
    }

    @Test
    public void testToString() {
        assertEquals("stock: 3\nitemCost: 50.0", packExpender.toString());
    }

    @Test
    public void testDispatch() {
        packExpender.dispatch(abradolph);
        assertEquals(2950d, abradolph.credit(), 0);
    }

}
