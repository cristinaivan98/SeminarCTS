import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GrupaTest {
    @Test
    public void testConstructorNrGrupaCorect(){
        Grupa grupa=new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());

    }
    @Test
    public void testConstructorExista(){
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }
    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa=new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa=new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionConstructorInferior(){
        Grupa grupa=new Grupa(900);


    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionConstructorSuperior(){
        Grupa grupa=new Grupa(1600);
    }
    @Test(timeout = 500)
    public void testPerformance(){
        Grupa grupa=new Grupa(1055);
    }


}