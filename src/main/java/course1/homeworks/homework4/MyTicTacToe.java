package course1.homeworks.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyTicTacToe {
    // поле
    public static char[][] map;

    // размер поля
    public static final int SIZE = 3;

    // победное количество точек
    public static final int DOT_TO_WIN = 3;

    // описание точек
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '*';

    // сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    // рандом
    public static final Random RANDOM = new Random();

    /**
     * Инициализация поля
     */
    public static void __initMap__() {
        map = new char[SIZE][SIZE];
        for (char[] chars : map) {
            for (int j = 0; j < chars.length; j++) {
                Arrays.fill(chars, DOT_EMPTY);
            }
        }
    }

    /**
     * Вывод готового поля в консоль
     */
    public static void printMap() {
        // нумерация верхней строки
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // вывод поля
        for (int i = 0; i < map.length; i++) {
            // вывод номера строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X - Y:");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while(!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
            System.out.println("Робот походил в координаты " + (x + 1) + " и " + (y + 1));
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkDiagonal(char symbol) {
        boolean right, left;
        right = true;
        left = true;
        for (int i = 0; i < SIZE; i++) {
            right &= (map[i][i] == symbol);
            left &= (map[SIZE-i-1][i] == symbol);
        }
        if (right || left) {
            return true;
        }
        return false;
    }

    public static boolean checkLanes(char symbol) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }
            if (cols || rows) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        __initMap__();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkDiagonal(DOT_X) || checkLanes(DOT_X)) {
                System.out.println("Победил человек.");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkDiagonal(DOT_O) || checkLanes(DOT_O)) {
                System.out.println("Победил робот.");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Конец игры.");
    }
}
