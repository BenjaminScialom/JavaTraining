public class Main {

    public static void main(String[] args) {

        Player player1 = new Player('X',"Ben");
        Player player2 = new Player('O', "Zac");

        Board board = new Board();

        int i =0;
        while (i<= 9){

            // Players 1 turn
            int choiceP1 = player1.scanChoice();
            board.Update(choiceP1, player1.getSymbol());
            board.display();
            if(player1.CheckWin()){
                System.out.println(player1.getName() + " won! Congrats.");
                System.exit(0);
            }

            // Player 2 turn
            int choiceP2 = player2.scanChoice();
            board.Update(choiceP2, player2.getSymbol());
            board.display();
            if(player2.CheckWin()){
                System.out.println(player2.getName() + " won! Congrats.");
                System.exit(0);
            }
            if(i==9){
                System.out.println("It's a draw!");
            }
            i++;
        }


    }
}
