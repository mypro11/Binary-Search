package binary_search;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BinarySearchTest {
    private BinarySearch search;
    int[] array = {5,6,7,8,9,1,2,3,4};

    @Before
    public void init(){
       search = new BinarySearch();
    }

    @Test
    public void searchMiddleValue(){
        int expectedResult = 4;
        int actualResult = search.binarySearch(array, 9);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void searchValueInLeftPart(){
        int expectedResult = 1;
        int actualResult = search.binarySearch(array, 6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void searchValueInRightPart(){
        int expectedResult = 8;
        int actualResult = search.binarySearch(array, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void searchInSortedArrayMiddleValue(){
        int expectedResult = 4;
        int actualResult = search.binarySearch(array, 9);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void searchDefunctValue(){
        int expectedResult = -1;
        int actualResult = search.binarySearch(array, 33);
        assertEquals(expectedResult, actualResult);
    }
}
