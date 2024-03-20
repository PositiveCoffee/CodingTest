package Book;

import java.util.Arrays;

public class 암호해독 {
    public static void main(String args[]){
        String[] text = {
                " + -- + - + - ",
                " + --- + - + ",
                " + -- + - + - ",
                " + - + - + - + "
        };

        decrypt(text);
    }

    private static void decrypt(String[] encryptedText){
        Arrays.stream(encryptedText)
                .forEach((s) -> {
                    String result = s.replace(" ","").replace("+","1").replace("-","0");
                    int n = Integer.parseInt(result,2);
                    s = String.valueOf((char)n);
                    System.out.println(s);
                });

    }
}
