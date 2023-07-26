package ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if2525 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());

        int totalMinutes = hour * 60 + min + cook;
        int newHour = totalMinutes / 60 % 24;
        int newMin = totalMinutes % 60;

        System.out.println(newHour + " " + newMin);

    }
}
