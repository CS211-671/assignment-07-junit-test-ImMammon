package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610451095", "Mic");
    }

    @Test
    void testAddScore(){
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
        s1.addScore(20.5);
        assertEquals(31, s1.getScore());
    }

    @Test
    void testCalculateScore(){
        s1.addScore(70);
        assertEquals ("B", s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("Micron");
        assertEquals("Micron", s1.getName());
    }

    @Test
    void testIsId(){
        assertTrue(s1.isId("6610451095"));
    }
}