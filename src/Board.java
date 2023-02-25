public class Board {
    private String[][] board = new String[10][10];
    private String playerName;
    Board(String playerName)
    {
        this.playerName = playerName;
    }
    void showBoard()
    {
        System.out.println(playerName);
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("[");
                if(this.board[i][j] == null)
                    System.out.print(" ");
                else
                    System.out.print(this.board[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }
    }
    void showHiddenBoard()
    {
        System.out.println(playerName);
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("[");
                if(this.board[i][j] == null)
                    System.out.print(" ");
                else if(this.board[i][j].equals("."))
                    System.out.print(".");
                else if(this.board[i][j].equals("X"))
                    System.out.print("X");
                else
                    System.out.print(" ");
                System.out.print("]");
            }
            System.out.println();
        }
    }
    void placeShip(Ship ship, String direction, int a, int b)
    {
        //waruek czy mozna umiescic(czy jest null)
        if(direction.equals("up"))
        {
            for(int i = 0; i < ship.getLength(); i++)
            {
                this.board[a - 1 - i][b - 1] = "O";
            }
        }
        else if(direction.equals("right"))
        {
            for(int i = 0; i < ship.getLength(); i++)
            {
                this.board[a - 1][b - 1 + i] = "O";
            }
        }
        else if(direction.equals("down"))
        {
            for(int i = 0; i < ship.getLength(); i++)
            {
                this.board[a - 1 + i][b - 1] = "O";
            }
        }
        else if(direction.equals("left"))
        {
            for(int i = 0; i < ship.getLength(); i++)
            {
                this.board[a - 1][b - 1 - i] = "O";
            }
        }
    }
    void attack(int a, int b)
    {
        if(this.board[a - 1][b - 1] == null)
            this.board[a - 1][b - 1] = ".";
        else if(this.board[a - 1][b - 1].equals("O"))
            this.board[a - 1][b - 1] = "X";
    }
    boolean checkWin()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(this.board[i][j] == ("O"))
                {
                    return false;
                }

            }
        }
        return true;
    }
}
