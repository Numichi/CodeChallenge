package myfriends.wfrobi.org.mik.oppkata;

import org.junit.Test;
import org.mik.oopkata.domain.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * 
 * @author zamek
 * 
 *         Place task description here
 * 
 */
public class TestKata extends AbstractTest {

	@Test
	public void allTest() {
		classTest();
		objectTest();
		functionalTest();
	}

	public void classTest() {
		try {
			assertTrue(Person.class.isInterface());
			increaseResult(1);

			Method m = Person.class.getMethod("getName"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), String.class);
			increaseResult(1);

			m = Person.class.getMethod("getBirthYear"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), int.class);
			increaseResult(1);

			m = Person.class.getMethod("isStudent"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = Person.class.getMethod("isTeacher"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = Person.class.getMethod("isAssistant"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = Person.class.getMethod("getInstitute"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), Institute.class);
			increaseResult(1);

			assertTrue(Arrays.asList(m.getExceptionTypes()).contains(Exception.class));
			increaseResult(1);

			m = Person.class.getMethod("getSpecialization"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), Specialization.class);
			increaseResult(1);

			assertTrue(Arrays.asList(m.getExceptionTypes()).contains(Exception.class));
			increaseResult(1);

			assertFalse(AbstractPerson.class.isInterface());
			increaseResult(1);

			assertTrue(Modifier.isAbstract(AbstractPerson.class.getModifiers()));
			increaseResult(1);

			assertTrue(Arrays.asList(AbstractPerson.class.getInterfaces()).contains(Person.class));
			increaseResult(1);

			Constructor<?> c = AbstractPerson.class.getConstructor(String.class, int.class);
			assertNotNull(c);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("getName"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), String.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("setName", String.class); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), void.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("getBirthYear"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), int.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("setBirthYear", int.class); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), void.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("isStudent"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("isTeacher"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("isAssistant"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), boolean.class);
			increaseResult(1);

			m = AbstractPerson.class.getMethod("getInstitute"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), Institute.class);
			increaseResult(1);

			assertTrue(Arrays.asList(m.getExceptionTypes()).contains(Exception.class));
			increaseResult(1);

			m = AbstractPerson.class.getMethod("getSpecialization"); //$NON-NLS-1$
			assertNotNull(m);
			increaseResult(1);

			assertEquals(m.getReturnType(), Specialization.class);
			increaseResult(1);

			assertTrue(Arrays.asList(m.getExceptionTypes()).contains(Exception.class));
			increaseResult(1);

			assertFalse(Teacher.class.isInterface());
			increaseResult(1);

			assertFalse(Modifier.isAbstract(Teacher.class.getModifiers()));

			assertEquals(Teacher.class.getSuperclass(), AbstractPerson.class);
			increaseResult(1);

			c = Teacher.class.getConstructor(String.class, int.class, Institute.class);
			assertNotNull(c);
			increaseResult(1);

			assertFalse(Student.class.isInterface());
			increaseResult(1);

			assertFalse(Modifier.isAbstract(Student.class.getModifiers()));

			assertEquals(Student.class.getSuperclass(), AbstractPerson.class);
			increaseResult(1);

			c = Student.class.getConstructor(String.class, int.class, Specialization.class);
			assertNotNull(c);
			increaseResult(1);

			assertFalse(Assistant.class.isInterface());
			increaseResult(1);

			assertFalse(Modifier.isAbstract(Assistant.class.getModifiers()));

			assertEquals(Assistant.class.getSuperclass(), AbstractPerson.class);
			increaseResult(1);

			c = Assistant.class.getConstructor(String.class, int.class);
			assertNotNull(c);
			increaseResult(1);

			assertTrue(Specialization.class.isEnum());
			increaseResult(1);

			assertEquals(0, Specialization.INFORMATICS.ordinal());
			increaseResult(1);

			assertEquals(1, Specialization.MECHANICS.ordinal());
			increaseResult(1);

			assertEquals(2, Specialization.ELECTRIC.ordinal());
			increaseResult(1);

			assertEquals(3, Specialization.ARCHITECT.ordinal());
			increaseResult(1);

			assertTrue(Institute.class.isEnum());
			increaseResult(1);

			assertEquals(0, Institute.MECHANICS.ordinal());
			increaseResult(1);

			assertEquals(1, Institute.INFORMATICS.ordinal());
			increaseResult(1);

			assertEquals(2, Institute.ELECTRICAL.ordinal());
			increaseResult(1);

			assertEquals(3, Institute.ARCHITECT.ordinal());
			increaseResult(1);

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

	private static final String ST_NAME = "Student"; //$NON-NLS-1$
	private static final int S_BY = 1999;

	private static final String TC_NAME = "Teacher"; //$NON-NLS-1$
	private static final int T_BY = 1979;

	private static final String AS_NAME = "Assistant"; //$NON-NLS-1$
	private static final int A_BY = 1986;

	private static final String ZAPHOD = "Zaphod Beeblebrox"; //$NON-NLS-1$

	@SuppressWarnings("unused")
	private void objectTest() {
		Student s1 = new Student(ST_NAME, S_BY, Specialization.ARCHITECT);
		assertNotNull(s1);
		increaseResult(1);

		assertTrue(s1.isStudent());
		increaseResult(1);

		assertFalse(s1.isTeacher());
		increaseResult(1);

		assertFalse(s1.isAssistant());
		increaseResult(1);

		assertEquals(ST_NAME, s1.getName());
		increaseResult(1);

		assertEquals(S_BY,s1.getBirthYear());
		increaseResult(1);

		assertEquals(Specialization.ARCHITECT,s1.getSpecialization());
		increaseResult(1);

		try {
			s1.getInstitute();
			fail();
		} catch (Exception e) {
			increaseResult(1);
		}

		Student s2 = new Student(ST_NAME, S_BY, Specialization.ARCHITECT);
		assertEquals(s1, s2);
		increaseResult(1);

		assertFalse(s1 == s2);
		increaseResult(1);

		s1.setName(null);
		assertEquals(ST_NAME, s1.getName());
		increaseResult(1);

		s1.setName(""); //$NON-NLS-1$
		assertEquals(ST_NAME,s1.getName());
		increaseResult(1);

		s1.setName(ZAPHOD);
		assertEquals(ZAPHOD,s1.getName());
		increaseResult(1);

		assertNotEquals(s1, s2);
		increaseResult(1);

		Teacher t1 = new Teacher(TC_NAME, T_BY, Institute.ELECTRICAL);
		assertNotNull(t1);
		increaseResult(1);

		assertFalse(t1.isStudent());
		increaseResult(1);

		assertTrue(t1.isTeacher());
		increaseResult(1);

		assertFalse(t1.isAssistant());
		increaseResult(1);

		assertEquals(TC_NAME, t1.getName());
		increaseResult(1);

		assertEquals(T_BY, t1.getBirthYear());
		increaseResult(1);

		assertEquals(Institute.ELECTRICAL, t1.getInstitute());

		try {
			t1.getSpecialization();
			fail();
		} catch (Exception e) {
			increaseResult(1);
		}

		Teacher t2 = new Teacher(TC_NAME, T_BY, Institute.ELECTRICAL);
		assertEquals(t1, t2);
		increaseResult(1);

		assertFalse(t1 == t2);
		increaseResult(1);

		t1.setName(null);
		assertEquals(TC_NAME, t1.getName());
		increaseResult(1);

		t1.setName(""); //$NON-NLS-1$
		assertEquals(TC_NAME, t1.getName());
		increaseResult(1);

		t1.setName(ZAPHOD);
		assertEquals(ZAPHOD,t1.getName());
		increaseResult(1);

		assertNotEquals(t1, t2);
		increaseResult(1);

		Assistant a1 = new Assistant(AS_NAME, A_BY);
		assertNotNull(a1);
		increaseResult(1);

		assertFalse(a1.isStudent());
		increaseResult(1);

		assertFalse(a1.isTeacher());
		increaseResult(1);

		assertTrue(a1.isAssistant());
		increaseResult(1);

		assertEquals(AS_NAME, a1.getName());
		increaseResult(1);

		assertEquals(A_BY, a1.getBirthYear());
		increaseResult(1);

		try {
			a1.getSpecialization();
			fail();
		} catch (Exception e) {
			increaseResult(1);
		}

		try {
			a1.getInstitute();
			fail();
		} catch (Exception e) {
			increaseResult(1);
		}

		Assistant a2 = new Assistant(AS_NAME, A_BY);
		assertEquals(a1, a2);
		increaseResult(1);

		assertFalse(a1 == a2);
		increaseResult(1);

		a1.setName(null);
		assertEquals(AS_NAME, a1.getName());
		increaseResult(1);

		a1.setName(""); //$NON-NLS-1$
		assertEquals(AS_NAME, a1.getName());
		increaseResult(1);

		a1.setName(ZAPHOD);
		assertEquals(ZAPHOD, a1.getName());
		increaseResult(1);

		assertNotEquals(a1, a2);
		increaseResult(1);

	}

	private static final String TEACHER_NAMES[] = new String[] { "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$

	private static final int TEACHER_YEARS[] = new int[] { 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992 };

	private static final Institute TEACHER_INSTITUTES[] = new Institute[] { Institute.ARCHITECT, Institute.ARCHITECT,
			Institute.ELECTRICAL, Institute.ELECTRICAL, Institute.INFORMATICS, Institute.INFORMATICS,
			Institute.MECHANICS, Institute.MECHANICS };

	private static final String STUDENT_NAMES[] = new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$

	private static final int STUDENT_YEARS[] = new int[] { 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000 };

	private static final Specialization STUDENT_SPECIALIZATIONS[] = new Specialization[] { Specialization.ARCHITECT,
			Specialization.ARCHITECT, Specialization.ELECTRIC, Specialization.ELECTRIC, Specialization.INFORMATICS,
			Specialization.INFORMATICS, Specialization.MECHANICS, Specialization.MECHANICS };

	private static final String ASSISTANT_NAMES[] = new String[] { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$

	private static final int ASSISTANT_YEARS[] = new int[] { 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977 };

	private void functionalTest() {
		University university = new University();
		for (int i = 0; i < TEACHER_NAMES.length; ++i)
			university.addTeacher(new Teacher(TEACHER_NAMES[i], TEACHER_YEARS[i], TEACHER_INSTITUTES[i]));

		for (int i = 0; i < STUDENT_NAMES.length; ++i)
			university.addStudent(new Student(STUDENT_NAMES[i], STUDENT_YEARS[i], STUDENT_SPECIALIZATIONS[i]));

		for (int i = 0; i < ASSISTANT_NAMES.length; ++i)
			university.addAssistant(new Assistant(ASSISTANT_NAMES[i], ASSISTANT_YEARS[i]));

		Set<Student> sts = university.getStudents();
		assertNotNull(sts);
		increaseResult(1);

		assertEquals(sts.size(), TEACHER_NAMES.length);
		increaseResult(1);
		
		for(String s:TEACHER_NAMES) {
			Person p = university.findPersonByName(s);
			assertNotNull(p);
			increaseResult(1);
		}
		
		for(String s:STUDENT_NAMES) {
			Person p = university.findPersonByName(s);
			assertNotNull(p);
			increaseResult(1);
		}
		
		for(String s:ASSISTANT_NAMES) {
			Person p = university.findPersonByName(s);
			assertNotNull(p);
			increaseResult(1);
		}

		
	}
}
