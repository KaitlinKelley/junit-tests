import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;


public class CohortTest {

    Cohort c1;

    Student s1;
    Student s2;

    @Before
    public void setUp(){
        c1 = new Cohort();
    }

    @Test
    public void testAddStudent(){
        c1.addStudent(s1);
        assertEquals(1, c1.getStudents().size());
        c1.addStudent(s2);
        assertEquals(2, c1.getStudents().size());
        assertSame(s1, c1.getStudents().get(0));
        assertSame(s2, c1.getStudents().get(1));
    }

    @Test
    public void testGetStudents(){

    }


}
