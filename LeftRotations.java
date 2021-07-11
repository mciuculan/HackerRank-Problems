import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LeftRotations {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> newList = new ArrayList<>();
        if (d > a.size())
            d = d % a.size();
        int posToMove = a.size() - d;
        for (int i = a.size() - posToMove; i < a.size(); i++)
            newList.add(a.get(i));
        for (int i = 0; i < a.size() - posToMove; i++) {
            newList.add(a.get(i));
        }
        return newList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotLeft(a, d);

        System.out.println(result);

        bufferedReader.close();
    }
}
