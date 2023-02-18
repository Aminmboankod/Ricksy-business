package edu.craptocraft.ricksy.business;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class UfosParkTest {
    
    UfosPark ufosPark;
    CreditCard abradolh;

    @Before
    public void setup(){
        abradolh = new CreditCard("Abradolph Lincler", "4916119711304546");
        ufosPark = new UfosPark();

    }

    @Test
    public void testConstructor() {
        assertNotNull(ufosPark);
    }

    /*
    * Construye el componente de reserva de Ovnis.
    * Recibe el objeto tarjeta de crédito del invitado/a
    * en el método dispatch(card)
    * y realiza un cargo a la tarjeta.
    * Si hay saldo suficiente se reserva un UberOvni
    * de los que estén libres.
    * El coste del ovni es de 500 EZIs.
    */

    @Test
    public void testdispatch(){
        ufosPark.dispatch(abradolh);
        assertEquals(2500d, abradolh.credit(), 0);
    }

    @Test
    public void testAdd() {

        // Flota vacía
        assertNotEquals("{dox=null, unx=null}", ufosPark.getFlota());

        // Añadimos flota:
        String[] ufosID = { "unx", "dox"};
        for (String ovni : ufosID) {
            ufosPark.add(ovni);
        }
        assertEquals("{dox=null, unx=null}", ufosPark.getFlota().toString());
    }

    @Test
    public void testgetUfoOf() {
        String[] ufosID = { "unx", "dox"};
        for (String ovni : ufosID) {
            ufosPark.add(ovni);
        }
        ufosPark.dispatch(abradolh);
        assertEquals("unx", ufosPark.getUfoOf(abradolh.number()));
    }
}
