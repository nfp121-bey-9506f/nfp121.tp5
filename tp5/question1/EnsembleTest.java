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

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
    
    public void test_intersection(){
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        Ensemble<Integer> e2 = new Ensemble<Integer>();
        Ensemble<Integer> e3 = new Ensemble<Integer>();
        e1.add(1);e1.add(2);e1.add(3);e1.add(4);
        e2.add(2);e2.add(4);e2.add(6);e2.add(8);
        e3.add(1);e3.add(3);e3.add(5);e3.add(7);
        
        Ensemble<Integer> e1InterE2 = e1.inter(e2);
        Ensemble<Integer> e1InterE3 = e1.inter(e3);
        Ensemble<Integer> e2InterE3 = e2.inter(e3);
        
        Ensemble<Integer> e1E2 = new Ensemble<Integer>(); e1E2.add(2);e1E2.add(4);
        Ensemble<Integer> e1E3 = new Ensemble<Integer>(); e1E3.add(1);e1E3.add(3);
        
        assertEquals(e1E2,e1InterE2);
        assertEquals(e1InterE3,e1E3);
        assertEquals(0,e2InterE3.size());
        
        
    }
    public void test_difference(){
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        Ensemble<Integer> e2 = new Ensemble<Integer>();
        Ensemble<Integer> e3 = new Ensemble<Integer>();
        
        e1.add(1);e1.add(2);e1.add(3);e1.add(4);
        e2.add(1);e2.add(4);e2.add(6);e2.add(8);
        e3.add(0);e3.add(6);e3.add(5);e3.add(3);
        
        Ensemble<Integer> e1DifferE2 = e1.diff(e2);
        Ensemble<Integer> e1DifferE3 = e1.diff(e3);
        Ensemble<Integer> e2DifferE3 = e2.diff(e3);
        Ensemble<Integer> e2DifferE1 = e2.diff(e1);
        Ensemble<Integer> e3DifferE1 = e3.diff(e1);
        Ensemble<Integer> e3DifferE2 = e3.diff(e2);
        
        Ensemble<Integer> e1E2 = new Ensemble<Integer>(); e1E2.add(2);e1E2.add(3);
        Ensemble<Integer> e1E3 = new Ensemble<Integer>(); e1E3.add(1);e1E3.add(2);e1E3.add(4);
        Ensemble<Integer> e2E3 = new Ensemble<Integer>(); e2E3.add(1);e2E3.add(4);e2E3.add(8);
        Ensemble<Integer> e2E1 = new Ensemble<Integer>(); e2E1.add(6);e2E1.add(8);
        Ensemble<Integer> e3E1 = new Ensemble<Integer>(); e3E1.add(0);e3E1.add(6);e3E1.add(5);
        Ensemble<Integer> e3E2 = new Ensemble<Integer>(); e3E2.add(0);e3E2.add(5);e3E2.add(3);
        
        assertEquals(e1E2,e1DifferE2);
        assertEquals(e1DifferE3,e1E3);
        assertEquals(e2E3,e2DifferE3);
        assertEquals(e2E1,e2DifferE1);
        assertEquals(e3DifferE1,e3E1);
        assertEquals(e3E2,e3DifferE2);
    }
    public void test_diffSymetrique(){
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        Ensemble<Integer> e2 = new Ensemble<Integer>();
        Ensemble<Integer> e3 = new Ensemble<Integer>();
        
        e1.add(1);e1.add(2);e1.add(3);e1.add(4);e1.add(33);
        e2.add(1);e2.add(4);e2.add(6);e2.add(8);
        e3.add(0);e3.add(6);e3.add(5);e3.add(3);
        
        Ensemble<Integer> e1DiffSymE2 = e1.diffSym(e2);
        Ensemble<Integer> e1DiffSymE3 = e1.diffSym(e3);
        Ensemble<Integer> e2DiffSymE3 = e2.diffSym(e3);
        
        Ensemble<Integer> e1E2 = new Ensemble<Integer>(); e1E2.add(2);e1E2.add(3);e1E2.add(33);e1E2.add(6);e1E2.add(8);
        Ensemble<Integer> e1E3 = new Ensemble<Integer>(); e1E3.add(1);e1E3.add(2);e1E3.add(4);e1E3.add(33);e1E3.add(0);e1E3.add(6);
        e1E3.add(5);
        Ensemble<Integer> e2E3 = new Ensemble<Integer>(); e2E3.add(1);e2E3.add(4);e2E3.add(8);e2E3.add(0);e2E3.add(5);e2E3.add(3);
        
        assertEquals(e1E2,e1DiffSymE2);
        assertEquals(e1DiffSymE3,e1E3);
        assertEquals(e2E3,e2DiffSymE3);
    }
    
    
}
