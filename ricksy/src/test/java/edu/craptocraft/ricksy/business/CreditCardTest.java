package edu.craptocraft.ricksy.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
    
    CreditCard abradolh;

    @Before
    public void setup() {
        abradolh = new CreditCard("Abradolph Lincler", "4916119711304546");
    }

    @Test
    public void testConstructor() {
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertNotNull(abradolph);
    }

    @Test
    public void testTostring() {
        assertEquals("owner: Abradolph Lincler\nnumber: 4916119711304546\ncredit: 3000.0EZI", abradolh.toString());
    }
}
