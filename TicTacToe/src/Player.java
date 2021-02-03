import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

    private ArrayList<Integer> moves =new ArrayList<Integer>();
    private final String name;
    private final char symbol;

    // constructor
    public Player(char Symbol, String Name){
        this.symbol = Symbol;
        this.name = Name;
    }


    // region Methods

    public int scanChoice(){
        System.out.println();
        System.out.print("Please enter a placement between 1 and 9:");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int move = scan.nextInt();
        moves.add(move);
        return move ;
    }

    public Boolean CheckWin() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);

        List<Integer> firstCol = Arrays.asList(1, 4, 7);
        List<Integer> SecCol = Arrays.asList(2, 5, 8);
        List<Integer> thirdCol = Arrays.asList(3, 6, 9);

        List<Integer> diag1 = Arrays.asList(1, 5, 9);
        List<Integer> diag2 = Arrays.asList(7, 5, 3);

        List<List<Integer>> winners = new ArrayList<>();
        winners.add(topRow);
        winners.add(midRow);
        winners.add(botRow);
        winners.add(firstCol);
        winners.add(SecCol);
        winners.add(thirdCol);
        winners.add(diag1);
        winners.add(diag2);

        for (List<Integer> condition : winners) {
            if (this.moves.containsAll(condition)) {
                return true;
            }
        }
        return false;
    }


    // region Getters and Setters


    public ArrayList<Integer> getMoves() {
        return moves;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName(){
        return name;
    }

    // endregion

    //endregion

}
