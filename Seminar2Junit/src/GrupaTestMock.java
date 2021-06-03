import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTestMock {
    @Test
    public void testAdaugaStudent(){
        IStudent student=new DummyStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getStudenti().size());
    }
    @Test
    public void testGetPromovabilitate(){
        IStudent stundent=new StubStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(stundent);

        assertEquals(1,grupa.getPromovabilitate(),0.1);

    }
    @Test
    public void testGetPromovabilitateFakeStudent(){
        Grupa grupa=new Grupa(1081);
        for (int i=0;i<8;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(false);
            grupa.adaugaStudent(student);

        }
        for (int i=0;i<2;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestanta(true);
            grupa.adaugaStudent(student);

        }
        assertEquals(0.8,grupa.getPromovabilitate(),0.1);

    }

}