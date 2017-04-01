package edu.mirea;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class GetMaxProductsTest extends Assert {

    private int[] testValues;
    private int expectedResult;

    public GetMaxProductsTest(TestPair testPair) {
        this.testValues = testPair.values;
        this.expectedResult = (int) testPair.expectedResult;
    }

    @Test
    public void testGetMaxProduct() throws Exception {
        assertEquals(
                "Invalid getMaxProducts result for case: " + Arrays.toString(testValues),
                App.getMaxProduct(testValues),
                expectedResult
        );
    }

    @Parameterized.Parameters
    public static List<TestPair> testingParameters() {
        return Arrays.asList(
            new TestPair(new int[] {-5, -7, 4, 2, 1, 9}, 315),
            new TestPair(new int[] {4, 5, -19, 3}, 60),
            new TestPair(new int[] {-2, 3, 4}, -24),
            new TestPair(new int[] {-2, 3, 4, 0}, 0),
            new TestPair(new int[] {-10, -10, 1, 1, 1}, 100)
        );
    }

}
