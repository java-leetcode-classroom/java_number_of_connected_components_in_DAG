import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    final private Solution sol = new Solution();
    @Test
    void countConnectedExample1() {
        assertEquals(2, sol.countConnected(5, new int[][]{
                {0,1},
                {1,2},
                {3,4}
        }));
    }
    @Test
    void countConnectedExample2() {
        assertEquals(1, sol.countConnected(5, new int[][]{
                {0,1},
                {1,2},
                {2,3},
                {3,4}
        }));
    }
}