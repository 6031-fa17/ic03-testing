import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTest {
    
    //
    // Testing strategy:
    //
    // Partition for intersect(setA, setB) -> result:
    //
    //   setA.size: 0, 1, >1
    //   setB.size: 0, 1, >1
    //   result.size: 0, 1, >1
    //   setA = setB, setA subset-of setB, setA superset-of setB, none of the above
    //
    
    // This test covers setA.size=1, setB.size=1, result.size=0
    @Test
    public void resultIsEmptySet() {
        // setA={5}, setB={8}, result={}
    }
    
    // TODO: add test cases to cover the rest of the partitions, following the example above:
    //    - each test case should be an @Test method
    //    - comment before method says which partitions the test case covers
    //    - comment inside method is the test case, with actual values for setA, setB, result
    // You don't need to do a full Cartesian product, just cover every part.
}
