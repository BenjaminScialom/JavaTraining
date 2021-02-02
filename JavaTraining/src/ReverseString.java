import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter the word you wish to reverse: ");
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();

        String r = reverse(word);
        System.out.print(r);
    }

    public static String reverse(String s){

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
