import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,22,11,33,44,33,22);

		Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}

