import java.util.*;
import java.util.stream.*;

public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
        int numbers_sum = Arrays.stream(numbers).sum();
        int range_sum = IntStream.range(1, numbers.length + 2).sum();
        return range_sum - numbers_sum;
    }

}
