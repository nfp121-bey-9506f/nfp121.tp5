package question1;

public class EnsembleTest extends junit.framework.TestCase {
    
    public void test_add(){
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        Ensemble<Integer> e2 = new Ensemble<Integer>();
        Ensemble<Integer> e3 = new Ensemble<Integer>();
        e1.add(1);e1.add(2);e1.add(3);
        assertEquals(true,e1.add(4));
        assertEquals(false,e1.add(4));
        assertEquals(true,e2.add(1));
        assertEquals(false,e2.add(1));
        assertEquals(true,e2.add(2));
        assertEquals(true,e2.add(3));
        assertEquals(true,e3.add(10));
        assertEquals(false,e3.add(10));
        
    }
    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        //question1.Ensemble<Integer> union = e1.union(e2);
        //assertEquals(3, union.size());
        //assertTrue(union.contains(2));
        //assertTrue(union.contains(3));
        //assertTrue(union.contains(4));
    }
    
}
