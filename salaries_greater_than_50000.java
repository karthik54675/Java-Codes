import java.util.*;

public class salaries_greater_than_50000 {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(25000, 50000, 60000);

        for (Integer salary : salaries) {
            if (salary > 50000) {
                System.out.println(salary);
            }
        }
    }
}