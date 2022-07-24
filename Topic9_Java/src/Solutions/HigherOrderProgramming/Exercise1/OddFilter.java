package Solutions.HigherOrderProgramming.Exercise1;

import java.util.List;

public class OddFilter implements Filter {
    @Override
    public boolean apply(List<Integer> filteredList, Integer element) {
        return element % 2 == 1;
    }
}
