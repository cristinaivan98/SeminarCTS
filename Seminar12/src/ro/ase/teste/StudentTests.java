package ro.ase.teste;

import org.junit.Test;
import ro.ase.cts.Student;

import static org.junit.Assert.*;

public class StudentTests {
    @Test
    public void testConstructorCuUnParametru(){
        String nume="Cristina";
        Student student=new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());

    }
    @Test
    public void testConstructorFaraParam(){
        Student student=new Student();
        assertNotNull("Atributul note nu a fost initializat",student.getNote());
        assertNotNull("Atributul nume nu a fost initializat",student.getNume());

    }
    @Test
    public void testAdaugaNota(){
        Student student=new Student();
        int nota=5;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }
    @Test
    public void testDimensiuneNota(){
        Student student=new Student();
        int nota=10;
        student.adaugaNota(nota);
        int nota2=8;
        student.adaugaNota(nota2);
        assertEquals(2,student.getNote().size());
    }
    @Test
    public void testCalculeazaMedie(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        assertEquals(6.5,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testCalculeazaMedieFaraNote(){
        Student student=new Student();
        assertEquals(0,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testCalcMedieCuONota(){
        Student student=new Student();
        student.adaugaNota(5);
        assertEquals(5,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testAreRestanteAdevarat(){
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(4);
        assertEquals(true,student.areRestante());
    }
    @Test
    public void testNuAreRestante(){
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(8);
        assertEquals(false,student.areRestante());
    }
    @Test
    public void testGetNotaException(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        try{
            student.getNota(5);
            fail("nu trebuia sa ajunga aici, met nu arunca exceptie");
        }catch (IndexOutOfBoundsException e){

        }
        catch(Exception e){
            fail();
        }
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptionJunit4(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.getNota(5);

    }
//    @Test
//    public void testGetNotaExceptionJunit5(){
//        Student student=new Student();
//        student.adaugaNota(5);
//        student.adaugaNota(7);
//        assertThrows(IndexOutOfBoundsException.class,(()->{student.getNota(5);}));
//    }
}