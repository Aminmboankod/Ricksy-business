package edu.craptocraft.ricksy.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CrystalExtenderTest {
    
    CrystalExpender packExpender;
    

    @Before
    public void setup() {
        packExpender = new CrystalExpender(3, 50);
    }


    @Test
    public void testConstructor() {
        assertNotNull(packExpender);
    }

    @Test
    public void testToString() {
        assertEquals("stock: 3\nitemCost: 50.0", packExpender.toString());
    }

}
