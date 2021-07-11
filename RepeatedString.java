import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        // Write your code here
        if (s.equals("a")) {
            return n;
        }
        long freq = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a')
                freq++;
        long repRamase = 0;
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a')
                repRamase++;
        }
        return freq * (n/s.length()) + repRamase;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = repeatedString(s, n);

        System.out.println(result);

        bufferedReader.close();
    }
}
