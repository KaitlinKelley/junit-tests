import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student s1;

    @Before
    public void setUp(){
        s1 = new Student(0, "name");
        s1.addGrade(88);
        s1.addGrade(95);
    }

    @Test
    public void testIfIdIsSet(){
        assertEquals(0, s1.getId(), 0);
    }

    @Test
    public void testIfNameIsSet(){
        assertEquals("name", s1.getName());
    }

    @Test
    public void testIfGradesIsSet(){
        assertNotNull(s1.getGrades());
    }

    @Test
    public void testGetId(){
        assertEquals(0, s1.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("name", s1.getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(2, s1.getGrades().size());
        s1.getGrades().add(85);
        assertEquals(3, s1.getGrades().size());
        assertSame(85, s1.getGrades().get(2));
    }

    @Test
    public void testGetGradeAverage(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(50);
        grades.add(55);
        grades.add(60);
        assertEquals(91.5, s1.getGradeAverage(), 0.4);
    }

//    @Test
//    public void testGetGrades(){
//        assertEquals(, Student.getGrades());
//    }

}
