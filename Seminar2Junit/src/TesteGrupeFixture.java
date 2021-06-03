import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteGrupeFixture {
    private Grupa grupa;
    @Before
    public void setup(){//met speciala care se apeleaza inainte de fiecare test
        grupa=new Grupa(1081);
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<10;i++){
            IStudent student=new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
    }
    @Test(timeout = 500)

    @Category({getPromovabilitateCategory.class,TesteUrgenteCategory.class})
    public void testGetPromovabilitatePerformance(){
        {

            grupa.getPromovabilitate();


        }
    }
}
