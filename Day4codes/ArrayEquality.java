
import java.util.Arrays;

public class ArrayEquality{
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={1,3,2,5,4};
        int[] array3={1,2,3,4,5};
        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.equals(array1, array3));
    }
}