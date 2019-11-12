import main.java.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import main.java.Course;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GivenBlackBox {
    private Class<Course> classUnderTest;

    @SuppressWarnings("unchecked")
    public GivenBlackBox(Object classUnderTest) {
        this.classUnderTest = (Class<Course>) classUnderTest;
    }

    @Parameters
    public static Collection<Object[]> courseGradesUnderTest() {
        Object[][] classes = {
                {CourseGrades0.class},
                {CourseGrades1.class},
                {CourseGrades2.class},
                {CourseGrades3.class},
                {CourseGrades4.class},
                {CourseGrades5.class}

        };
        return Arrays.asList(classes);
    }

    private Course createCourse(String name) throws Exception {
        Constructor<Course> constructor = classUnderTest.getConstructor(String.class);
        return constructor.newInstance(name);
    }

    Course oneStudent;
    HashMap<String, String> oneStudentExpected = new HashMap<String, String>();

   Course happyDayGradeBoundary;
   HashMap<String, String> happyDayGradeBoundaryExpected = new HashMap<String, String>();

   Course outliersTest;
   HashMap<String, String> outliersTestExpected = new HashMap<String, String>();
   
   Course lowerEdges;
   HashMap<String, String> lowerEdgesExpected = new HashMap<String, String>();
   
   Course sameTest;
   HashMap<String, String> sameTestExpected = new HashMap<String, String>();
   
   Course adjustedCurveTest;
   HashMap<String, String> adjustedCurveExpected = new HashMap<String, String>();
   
   Course adjustedCurveUpperEdge;
   HashMap<String, String> adjustedCurveUpperEdgeExpected = new HashMap<String, String>();
   
    @Before
    public void setUp() throws Exception {

        // One Student


        // all courses should be created like this


        // Course created with two Students having 
   	oneStudent = createCourse("SER316");

        // this would be the expected result after the method countOccurencesLetterGrades is called
//      oneStudent.set_points("Hanna", -10);
//      oneStudentExpected.put("Hanna", "A");

        
        
        // Happy Day Case Grade Boundaries
        // Four Students mix of grades
    happyDayGradeBoundary = createCourse("SER315");
//        happyDayGradeBoundary.set_points("100"  , 100);  //A
//        happyDayGradeBoundary.set_points(">89"  , 90);  //A
//        happyDayGradeBoundary.set_points(">79"  , 89);  //B
//        happyDayGradeBoundary.set_points(">59"  , 79);  //C
//        happyDayGradeBoundary.set_points(">35"  , 59);  //D
//        happyDayGradeBoundary.set_points(">=35" , 35);  //F
//
//        happyDayGradeBoundaryExpected.put("100"  , "A");
//        happyDayGradeBoundaryExpected.put(">89"  , "A");
//        happyDayGradeBoundaryExpected.put(">79"  , "B");
//        happyDayGradeBoundaryExpected.put(">59"  , "C");
//        happyDayGradeBoundaryExpected.put(">35"  , "D");
//        happyDayGradeBoundaryExpected.put(">=35" , "F");
        
    	
       
        //extreme cases
     outliersTest = createCourse("LOL420");
       
//     	outliersTest.set_points("2000"  , 2000);
//     	outliersTest.set_points("200"  , 200);
//        outliersTest.set_points("101"  , 101);
//        outliersTest.set_points("100"  , 100);
//        outliersTest.set_points("60"  , 60);
//        outliersTest.set_points("10"  , 10);
//        outliersTest.set_points("-1" , -1); 
//        outliersTest.set_points("-100" , -100); 
//        outliersTest.set_points("-1000" , -1000);
//        
//        outliersTestExpected.put("2000"  , "A");
//        outliersTestExpected.put("200"  , "A");
//        outliersTestExpected.put("101"  , "A");
//        outliersTestExpected.put("100"  , "A");
//        outliersTestExpected.put("60"  , "C");
//        outliersTestExpected.put("10"  , "F");
//        outliersTestExpected.put("-1"  , "F");
//        outliersTestExpected.put("-100" , "F"); 
//        outliersTestExpected.put("-1000" , "F"); 
        
        //low grades closer to the grading intervals
        lowerEdges = createCourse("SAD123");
        
//        lowerEdges.set_points("100"  , 100); 
//        lowerEdges.set_points("90"  , 90); 
//        lowerEdges.set_points("80"  , 80); 
//        lowerEdges.set_points("60"  , 60); 
//        lowerEdges.set_points("35"  , 36); 
//        lowerEdges.set_points("1" , 1); 
//        lowerEdges.set_points("0" , 0); 
//        
//        lowerEdgesExpected.put("100"  , "A");
//        lowerEdgesExpected.put("89"  , "B");
//        lowerEdgesExpected.put("80"  , "B");
//        lowerEdgesExpected.put("79"  , "C");
//        lowerEdgesExpected.put("60"  , "C");
//        lowerEdgesExpected.put("59" , "D"); 
//        lowerEdgesExpected.put("35"  , "F");
//        lowerEdgesExpected.put("34"  , "F");
//         lowerEdgesExpected.put("1"  , "F");
//         lowerEdgesExpected.put("0"  , "F");
       
        //testing the ability to handle multiple entries
        sameTest = createCourse("ABC123");
        
//        sameTest.set_points("100"  , 100); 
//        sameTest.set_points("100"  , 100); 
//        sameTest.set_points("1"  , 1); 
//        sameTest.set_points("1"  , 1); 
//        sameTest.set_points("1"  , 1); 
//        sameTest.set_points("100"  , 100); 
//        
//        sameTestExpected.put("100"  , "A");
//        sameTestExpected.put("100"  , "A");
//        sameTestExpected.put("1"  , "F");
//        sameTestExpected.put("1"  , "F");
//        sameTestExpected.put("1"  , "F");
//        sameTestExpected.put("100"  , "A");
        
      //checking the curve adjustment on the upper edges of the grade rank
        adjustedCurveTest = createCourse("WOW123");
//       adjustedCurveTest.set_points("50" , 50);
//       adjustedCurveTest.set_points("40" , 40);
//       adjustedCurveTest.set_points("30" , 30);
//       adjustedCurveTest.set_points("20" , 20);
//       adjustedCurveTest.set_points("10" , 10);
//     adjustedCurveTest.set_points("0" , 0);
//     adjustedCurveTest.set_points("-14" , -14);
//        
//        adjustedCurveExpected.put("50"  , "A");
//        adjustedCurveExpected.put("40"  , "A");
//        adjustedCurveExpected.put("30"  , "B");
//      adjustedCurveExpected.put("20"  , "C");
//        adjustedCurveExpected.put("10"  , "C");
//       adjustedCurveExpected.put("0"  , "D");
//      adjustedCurveExpected.put("-14"  , "D");
        
      //checking the curve adjustment on the low edges of the grade rank
        adjustedCurveUpperEdge = createCourse("CAT123");
        adjustedCurveUpperEdge.set_points("50" , 50);
        adjustedCurveUpperEdge.set_points("39" , 39);
        adjustedCurveUpperEdge.set_points("29" , 29);
        adjustedCurveUpperEdge.set_points("9" , 9);
        adjustedCurveUpperEdge.set_points("-15" , -15);
        
        adjustedCurveUpperEdgeExpected.put("50"  , "A");
        adjustedCurveUpperEdgeExpected.put("39"  , "B");
        adjustedCurveUpperEdgeExpected.put("29"  , "C");
        adjustedCurveUpperEdgeExpected.put("9"  , "D");
        adjustedCurveUpperEdgeExpected.put("-15"  , "F");

      
    }

    @After
    public void tearDown() throws Exception {
    }

    // sample test
    @Test
    public void oneStudent() {
        Map<String, String> ans = oneStudent.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(oneStudentExpected));
    }

    // sample test2
    @Test
    public void outliersTest() {
        Map<String, String> ans = outliersTest.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(outliersTestExpected));
    }
    
 // sample test2
    @Test
    public void happyDayGradeBoundaries() {
        Map<String, String> ans = happyDayGradeBoundary.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(happyDayGradeBoundaryExpected));
    }
    @Test
    public void lowerEdges() {
        Map<String, String> ans = lowerEdges.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(lowerEdgesExpected));
    }
    
    @Test
    public void sameTest() {
        Map<String, String> ans = sameTest.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(sameTestExpected));
    }
    
    @Test
    public void adjustedCurveTest() {
        Map<String, String> ans = adjustedCurveTest.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(adjustedCurveExpected));
    }
    
    @Test
    public void adjustedCurveUpperEdge() {
        Map<String, String> ans = adjustedCurveUpperEdge.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(adjustedCurveUpperEdgeExpected));
    }


}
