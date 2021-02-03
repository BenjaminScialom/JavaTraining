public class Board {

    char[][] gameBoard = {{' ', '|',' ', '|', ' '},
            {'-','+','-','+','-'},
            {' ', '|',' ', '|', ' '},
            {'-','+','-','+','-'},
            {' ', '|',' ', '|', ' '}};

    // Constructor
    public Board() {

    }

    // region Methods

    public void display(){

        for(char[] row : this.gameBoard ){
            for(char col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void Update(int choice, char Symbol){

        switch (choice){
            case 1:
                gameBoard[0][0] = Symbol;
                break;
            case 2:
                gameBoard[0][2] = Symbol;
                break;
            case 3:
                gameBoard[0][4] = Symbol;
                break;
            case 4:
                gameBoard[2][0] = Symbol;
                break;
            case 5:
                gameBoard[2][2] = Symbol;
                break;
            case 6:
                gameBoard[2][4] = Symbol;
                break;
            case 7:
                gameBoard[4][0] = Symbol;
                break;
            case 8:
                gameBoard[4][2] = Symbol;
                break;
            case 9:
                gameBoard[4][4] = Symbol;
                break;

            default:
                break;
        }


    }

    // endregion
}
