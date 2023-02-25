import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        start();
    }
    static void start()
    {
        Board player1Board = new Board("Player 1");
        Board player2Board = new Board("Player 2");
        Ship playerShip1 = new Ship(2);
        Ship playerShip2 = new Ship(3);
        Ship playerShip3 = new Ship(4);
        int a;
        int b;
        String direction;
        for(int i = 0; i < 4; i++)
        {
            player1Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player1Board.placeShip(playerShip1, direction, a, b);

        }
        for(int i = 0; i < 3; i++)
        {
            player1Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player1Board.placeShip(playerShip2, direction, a, b);

        }
        for(int i = 0; i < 2; i++)
        {
            player1Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player1Board.placeShip(playerShip3, direction, a, b);
        }
        for(int i = 0; i < 4; i++)
        {
            player2Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player2Board.placeShip(playerShip1, direction, a, b);

        }
        for(int i = 0; i < 3; i++)
        {
            player2Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player2Board.placeShip(playerShip2, direction, a, b);

        }

        for(int i = 0; i < 2; i++)
        {
            player2Board.showBoard();
            System.out.print("Place your ships(column, row and direction): ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            Scanner scan3 = new Scanner(System.in);
            direction = scan3.nextLine();
            player2Board.placeShip(playerShip3, direction, a, b);
        }
        player1Board.showHiddenBoard();
        player2Board.showHiddenBoard();

        while(player1Board.checkWin() == false && player2Board.checkWin() == false)
        {
            System.out.println("Player 1's turn: ");
            Scanner scan1 = new Scanner(System.in);
            a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            b = scan2.nextInt();
            player2Board.attack(a, b);
            player1Board.showHiddenBoard();
            player2Board.showHiddenBoard();
            if(player2Board.checkWin() == true)
            {
                System.out.println("Player 1 wins");
                break;
            }
            System.out.println("Player 2's turn: ");
            Scanner scan3 = new Scanner(System.in);
            a = scan3.nextInt();
            Scanner scan4 = new Scanner(System.in);
            b = scan4.nextInt();
            player1Board.attack(a, b);
            player1Board.showHiddenBoard();
            player2Board.showHiddenBoard();
            if(player1Board.checkWin() == true)
            {
                System.out.println("Player 2 wins");
                break;
            }
        }
    }
}