import java.util.Comparator;
import java.util.List;

public class ArraysSorter {

    // Поиск для byte[]
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            byte midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для char[]
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            char midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для double[]
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            double midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для float[]
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            float midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для int[]
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для long[]
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            long midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для short[]
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            short midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    // Поиск для объектов с Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int comparison = c.compare(midVal, key);
            if (comparison < 0)
                low = mid + 1;
            else if (comparison > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }
}
public class Collections {

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, 0, list.size(), key);
    }

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, int fromIndex, int toIndex, T key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Comparable<? super T> midVal = list.get(mid);
            int comparison = ((Comparable<? super T>) midVal).compareTo(key);
            if (comparison < 0)
                low = mid + 1;
            else if (comparison > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, 0, list.size(), key, c);
    }

    public static <T> int binarySearch(List<? extends T> list, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = list.get(mid);
            int comparison = c.compare(midVal, key);
            if (comparison < 0)
                low = mid + 1;
            else if (comparison > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1; // key not found
    }
}