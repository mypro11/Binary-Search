package binary_search;

/**
 * Created by BraslavetsIryna on 13.03.2017.
 */
public class BinarySearch {
    private int[] array;

    public int binarySearch(int[] array, int key) {
        this.array = array;
        int result = search(key, 0, array.length - 1);
        return result;
    }

    private int search(int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int middle = (low + high) / 2;

        if (array[middle] == key) {
            return middle;
        }

        if (array[low] <= array[middle]) {
            if (array[low] <= key && array[middle] >= key) {
                return search(key, low, middle - 1);
            } else {
                return search(key, middle + 1, high);
            }
        } else {
            if (array[middle] <= key && array[high] >= key) {
                return search(key, middle + 1, high);
            } else {
                return search(key, low, middle - 1);
            }
        }
    }
}
