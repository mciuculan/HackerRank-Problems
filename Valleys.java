import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Valleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int noValleys = 0;
        int counter = 0;
        int i = 0, exCounter;
        char[] arr = path.toCharArray();
        for (char j : arr) {
            exCounter = counter;
            if (j == 'D')
                counter--;
            if (j == 'U')
                counter++;
            if (counter == 0 && exCounter < 0)
                noValleys++;
            i++;
        }
        return noValleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        System.out.println(result);

        bufferedReader.close();
    }
}
