package edu.craptocraft.ricksy.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ReceptivoTest {
    
    CrystalExpender packExpender;
    Receptivo receptivo;
    UfosPark ufosPark;

    @Before
    public void setup() {
        packExpender = new CrystalExpender(3, 50);
        receptivo = new Receptivo();
        ufosPark = new UfosPark();
        
    }

    @Test
    public void testRegistra() {
        
        receptivo.registra(packExpender);
        assertNotNull(packExpender);
        assertNotNull(receptivo.getObservers());
        assertEquals(1d, receptivo.getObservers().size(), 0);

        receptivo.registra(ufosPark);
        assertNotNull(ufosPark);
        assertNotNull(receptivo.getObservers());
        assertEquals(2d, receptivo.getObservers().size(), 0);
    }
}
