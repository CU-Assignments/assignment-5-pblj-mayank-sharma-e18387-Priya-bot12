import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            // Autoboxing: converting int to Integer
            numbers.add(Integer.parseInt(token));
        }

        int sum = 0;
        for (Integer num : numbers) {
            // Unboxing: converting Integer to int
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
