package edu.mirea;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AreAllNegativesTest extends Assert {

    private int[] testValues;
    private boolean expectedResult;

    public AreAllNegativesTest(TestPair testPair) {
        this.testValues = testPair.values;
        this.expectedResult = (boolean) testPair.expectedResult;
    }

    @Test
    public void testAreAllNegatives() throws Exception {
        assertEquals(
                "Invalid areAllNegativesResult for case: " + Arrays.toString(testValues),
                App.areAllNegatives(testValues),
                expectedResult
        );
    }

    @Parameterized.Parameters
    public static List<TestPair> testingParameters() {
        return Arrays.asList(
                new TestPair(new int[] {-5, -7, 4, 2, 1, 9}, false),
                new TestPair(new int[] {-4, -5, -19, -1}, true),
                new TestPair(new int[] {-2, 3, 4}, false),
                new TestPair(new int[] {-2, -3, -4, -1000000000}, true),
                new TestPair(new int[] {-10, -10, 1, 1, 1}, false)
        );
    }

}
