package de.telran.hw27_11_23;

import java.util.Scanner;

public class BattleshipGame {
    private static final int BOARD_SIZE = 10;
    private static final int[] SHIP_SIZES = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    private char[][] player1Board;
    private char[][] player2Board;

    public BattleshipGame() {
        player1Board = new char[BOARD_SIZE][BOARD_SIZE];
        player2Board = new char[BOARD_SIZE][BOARD_SIZE];

        initializeBoards();
    }

    private void initializeBoards() {
        initializeBoard(player1Board);
        initializeBoard(player2Board);
    }

    private void initializeBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '~'; // Пустая клетка
            }
        }
    }

    private void printBoard(char[][] board) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void placeShips(char[][] board, String playerName) {
        Scanner scanner = new Scanner(System.in);
        for (int size : SHIP_SIZES) {
            System.out.println(playerName + ", расставьте корабль размером " + size);
            printBoard(board);

            int x, y;
            do {
                System.out.print("Введите координаты (горизонталь, вертикаль): ");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (!isValidPlacement(board, x, y, size));

            placeShip(board, x, y, size);
        }
    }

    private boolean isValidPlacement(char[][] board, int x, int y, int size) {
        if (x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE) {
            System.out.println("Неверные координаты. Попробуйте еще раз.");
            return false;
        }

        if (board[x][y] != '~') {
            System.out.println("На этом месте уже есть корабль. Попробуйте еще раз.");
            return false;
        }

        return isSpaceAvailable(board, x, y, size);
    }

    private boolean isSpaceAvailable(char[][] board, int x, int y, int size) {
        // Проверяем, что место под корабль не занято другими кораблями
        for (int i = x; i < x + size; i++) {
            if (i >= BOARD_SIZE || board[i][y] != '~') {
                System.out.println("Нельзя разместить корабль здесь. Попробуйте еще раз.");
                return false;
            }
        }
        return true;
    }

    private void placeShip(char[][] board, int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            board[i][y] = 'O'; // 'O' обозначает корабль
        }
    }

    private boolean isGameOver(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 'O') {
                    return false; // Найден непотопленный корабль
                }
            }
        }
        return true; // Все корабли потоплены
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        // Игрок 1
        System.out.print("Игрок 1, введите ваше имя: ");
        String player1Name = scanner.nextLine();
        placeShips(player1Board, player1Name);

        // Игрок 2
        System.out.print("Игрок 2, введите ваше имя: ");
        String player2Name = scanner.nextLine();
        placeShips(player2Board, player2Name);

        // Начало игры
        while (true) {
            // Ход игрока 1
            System.out.println(player1Name + ", ваш ход!");
            printBoard(player2Board);

            int x, y;
            do {
                System.out.print("Введите координаты (горизонталь, вертикаль): ");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE);

            if (player2Board[x][y] == 'O') {
                System.out.println("Попадание!");
                player2Board[x][y] = 'X'; // 'X' обозначает попадание
            } else {
                System.out.println("Промах!");
            }

            if (isGameOver(player2Board)) {
                System.out.println(player1Name + " победил!");
                break;
            }

            // Ход игрока 2
            System.out.println(player2Name + ", ваш ход!");
            printBoard(player1Board);

            do {
                System.out.print("Введите координаты (горизонталь, вертикаль): ");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE);

            if (player1Board[x][y] == 'O') {
                System.out.println("Попадание!");
                player1Board[x][y] = 'X';
            } else {
                System.out.println("Промах!");
            }

            if (isGameOver(player1Board)) {
                System.out.println(player2Name + " победил!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.play();
    }
}
