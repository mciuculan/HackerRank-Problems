import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Clouds {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int pathLen = 0;
        for (int i = 0; i < c.size(); i++) {
            if (i + 2 < c.size() && c.get(i) == 0 && c.get(i + 2) == 0) {
                pathLen++;
                i++;
                System.out.println("sare peste doua la elem " + i);
                continue;
            }
            if (i + 1 < c.size() && c.get(i) == 0 && c.get(i + 1) == 0) {
                pathLen++;
                System.out.println("sare peste 1 la elem " + i);
                continue;
            }
            if (c.get(i) == 1) {
                System.out.println("gaseste 1 la poz " + i);
                continue;
            }
        }
        return pathLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = jumpingOnClouds(c);

        System.out.println(result);

        bufferedReader.close();
    }
}
