package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
    }

    @Test
    void testAddStudent() {
        assertEquals(0, students.getStudents().size());
        students.addNewStudent("66xxx", "Tull");
        assertEquals(1, students.getStudents().size());
        students.addNewStudent("66xxxx", "Garfield", 70);
        assertEquals(2, students.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        students.addNewStudent("66xxx", "Tull");
        students.addNewStudent("66xxxx", "Garfield");
        Student student = students.findStudentById("66");
        assertNull(student);
        student = students.findStudentById("66xxxx");
        assertNotNull(student);
    }

    @Test
    void testGiveScoreToId(){
        students.addNewStudent("66xxxx", "Tull", 100);
        assertEquals(100, students.findStudentById("66xxxx").getScore());
        students.giveScoreToId("66xxxx", 2000);
        assertEquals(2100, students.findStudentById("66xxxx").getScore());
    }

    @Test
    void testViewGradeOfId(){
        students.addNewStudent("66xxxx", "Mon", 50);
        assertEquals("D", students.viewGradeOfId("66xxxx"));
        students.giveScoreToId("66xxxx", 30);
        assertEquals("A", students.viewGradeOfId("66xxxx"));
    }
}