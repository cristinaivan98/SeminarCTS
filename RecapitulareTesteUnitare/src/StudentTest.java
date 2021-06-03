import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void constructorCuUnParametru(){
        String nume="Cristina";
        Student student=new Student("Cristina");
        Assert.assertEquals(nume,student.getNume());
        Assert.assertNotNull(student.getNote());
    }
    @Test
    public void constructorFaraParam(){
        Student student=new Student();
        Assert.assertNotNull("numele nu a fost initializat",student.getNume());
        Assert.assertNotNull("notele nu au fost initializate",student.getNote());
    }
    @Test
    public void adaugaNota(){
        Student student=new Student();
        student.adaugaNota(5);
        int nota=5;
        assertEquals(nota,student.getNota(0));
    }
    @Test
    public void dimensiuneNota(){
        Student student =new Student();
        student.adaugaNota(7);
        student.adaugaNota(5);
        Assert.assertEquals(2,student.getNote().size());
    }
    @Test
    public void calculeazaMedia(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(6);
        Assert.assertEquals(5.5,student.calculeazaMedie(),0.1);
    }
    @Test
    public void calculeazaMedieFaraNote(){
        Student student=new Student();
        Assert.assertEquals(0,student.calculeazaMedie(),0.1);
    }
    @Test
    public void calculeazaMedieOSinguraNota(){
        Student student=new Student();
        student.adaugaNota(6);
        Assert.assertEquals(6,student.calculeazaMedie(),0.1);
    }
    @Test
    public void areRestantaAdevarat(){
        Student student=new Student();
        student.adaugaNota(3);
        student.adaugaNota(7);
        Assert.assertEquals(true,student.areRestante());
    }
    @Test
    public void areRestantaFals(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        Assert.assertEquals(false,student.areRestante());
    }
    @Test
    public void getNotaException(){
        Student student=new Student();
        student.adaugaNota(6);
        student.adaugaNota(8);
        try{
            student.getNota(3);
            Assert.fail("nu trebuia sa ajunga aici, met nu arunca exceptie");
        }catch(IndexOutOfBoundsException var1){

        }catch(Exception var2){
            Assert.fail();
        }
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void getNotaExceptionJunit4(){
        Student student=new Student();
        student.adaugaNota(6);
        student.adaugaNota(8);
        student.getNota(4);
    }
}