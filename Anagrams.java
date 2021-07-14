import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Anagrams {

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int[] frequency = new int[27];
        int toRemove = 0;
        for (int i = 0; i < a.length(); i++) {
            frequency[a.charAt(i) - 97]++;
        }
        for (int i = 0; i < b.length(); i++) {
            frequency[b.charAt(i) - 97]--;
        }
        for (int i = 0; i < 27; i++) {
            toRemove += Math.abs(frequency[i]);
        }
        return toRemove;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = makeAnagram(a, b);

        System.out.println(res);

        bufferedReader.close();
    }
}
