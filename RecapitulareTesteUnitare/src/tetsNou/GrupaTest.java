package tetsNou;

import org.junit.Test;

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
        assertNotNull(grupa.getNrGrupa());

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
        Grupa grupa=new Grupa(1081);
    }
    @Test
    public void testPromovabilitateRight(){
        Grupa grupa=new Grupa(1081);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<5;i++){
            IStudent student=new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.66,grupa.getPromovabilitate(),0.1);
    }
    @Test
    public void testGetPromovabilitateLimitaSuperioara(){
        Grupa grupa=new Grupa(1100);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(7);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }
    @Test
    public void testGetPromovabilitateLimitaInferioara(){
        Grupa grupa=new Grupa(1100);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(3);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.1);
    }
    @Test(expected = IndexOutOfBoundsException.class)
     public void testGetPromovabilitateErrorCondition(){
        Grupa grupa=new Grupa(1050);
        grupa.getPromovabilitate();
    }
    //CORECT
    @Test
    public void testGetPromovabilitateCardinality1(){
        Grupa grupa=new Grupa(1081);
        IStudent student=new Student();
        student.adaugaNota(8);
        student.adaugaNota(10);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }

}