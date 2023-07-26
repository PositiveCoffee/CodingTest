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

        if(min+cook<60){
            System.out.println(hour+ " " +(min+cook));
        }else{
            int overTime = (min+cook)/60 ;
            if(hour+overTime>=24){
                System.out.println(hour+overTime-24 + " " + (min+cook)%60 );
            }else{
                System.out.println(hour+overTime + " " + (min+cook)%60);
            }
        }

    }
}
