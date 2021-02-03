import java.util.Scanner;

public class ReverseString {

    public ReverseString() {
    }

    public String reverse(String s){

        char [] letters =   new char[s.length()];
        int index =0;
        for (int i = s.length()-1; i>=0;i--){
            letters[index] = s.charAt(i);
            index ++;
        }
        String rs = "";
        for(int j =0; j <= s.length()-1; j++){
            rs += letters[j];
        }

        return rs;
    }
}
