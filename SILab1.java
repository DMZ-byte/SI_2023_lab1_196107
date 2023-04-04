import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1 {
    public static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : list) {

            if (el % 2 != 0) {

                result.add(el);
            }
        }
        return result;
    }


    private static int sumEvenNumbers(List<Integer> list) {

        int sum = 0; // initialize sum to 0 instead of 1
        for (Integer el : list) {
            if (el % 2 == 0) {
                sum += el; // add el to the sum instead of multiplying
>>>>>>> bug3
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i <= n; i++) {
>>>>>>> bug3
            list.add(sc.nextInt());
        }

        System.out.println(filterOddNumbers(list));

        System.out.println(sumEvenNumbers(list));
    }
}

