package org.example;

import java.util.*;
import java.util.regex.*;


public class Main {

    static int[] iStart = new int[2];
    static boolean top = false;

    public static void main(String[] args) {


        String input = ".#......................................#................#....#.......##..........................#.....#......#.................." +
                "......#...#...................................#......#...#........#...........................................#.#................." +
                ".....................................................#.......#.............#................#...............#...#...........#....." +
                "..........#...#.......#...........#.......................................#..............#.......#.#......#...............#......." +
                "...#.......................................................................#.................................................#...." +
                ".......#.....#................#.......#..................#......#...........#...............................#....................." +
                ".........#.......#..#...........................#........#.........................#..#.....#....................................." +
                "..........#.......##....................#..............##..##..#...#........................................................#....." +
                "................#............................................................#.......................#...#........................" +
                "...............................................................................................#...........................#......" +
                "#.....#..............#...............#.........#................................................................#........#........" +
                ".....#..#.................................#......................................................................#................" +
                "............................................#....................................................................................." +
                ".............#....................................#.................#...##........#....#....#....................................." +
                ".............#.............#...........##..............#.........#....#................#....................#....................." +
                "..#..#...#.............#....................................#.........................................................#..........." +
                "........................#......#...........#.....#....................#.........................#................................." +
                ".................#................................................................................................................" +
                ".........#.......#..........#...............#................................#........................#.........#......#.........." +
                ".........................................#.........#..........#.........#........................#......................#........." +
                ".#.....................#.............................#.....................#.............................................#........" +
                "...#..#........#...............#......................#..................#........................................#...#..........." +
                "..#...........#..........#......#...............#...............................................................#................." +
                "......#..#.............................#.#..............#......#.................................................................." +
                "......#..........#....#...#.........#...................................................................#...........#............." +
                "............#....#.....#..............................................#.......#..............#........................#..........." +
                "......#.................#...............................................................................#...................#....." +
                "................#................#............................................................................#.....##............" +
                ".........#......................................#....#......#.......................................#........##..........#........" +
                "#........#.........................................#..........#..............#.......#............................................" +
                ".#..........##....................#......................................................................#................#..#...." +
                "...........................................#............................#..........................#....................#........." +
                "......#.......................#.............#......................................................................#.............." +
                "..#.#.....#...#....#....#......#..................................#...................#..........................................." +
                "..#................................#...................................#...#..................................#.......#..........." +
                "....#...............#....................................#..#..............#.........#.........#.#..............................#." +
                "..........#......#.........................#.#.................................#...........................................#.....#" +
                "..................##.................#...........#................................#.............................................#." +
                ".....#......#................#....................................................#..............#.........................#......" +
                "#..............#........#..............................#...........#...............#.....#.............................#.........." +
                "..............#.........................#........................................................#..........................#..##." +
                "...............................................................#..............................................#..................." +
                "......................#.............................................................##.........#...........................#.#...." +
                ".......#................................#................#...........................#...................#.........#.............." +
                ".................................................................#...#.............#.....#...............#........................" +
                "..............................................................#..#...............................#.......#...............#.#......" +
                ".....#.................#......................#..........................................#........................................" +
                "..............................#...............#......#..........#........................#................#......#................" +
                ".............................................#.........#..................................................................#......." +
                "......#..........................#.............#....................................................#................#............" +
                "..................#..............................................#..........................................#....................." +
                "..#.........................................#..............................#...#........................................#..#......" +
                "........#........................#................................................................................................" +
                "...............#...............................#.............#...........................#........................................" +
                "...............................................................................................#....#............................." +
                "............#.....................#...........#.............#.......#..............#.....#.............................#...#......" +
                "..........#..........................................................#.#.......#.................................................." +
                "...#................................#.....................................................................#...................#..." +
                "...#..#...........................#............................#........#.......#.#..........#.......#............................" +
                "...................##......................................#..................##..............................#........#.........." +
                "................##.....................................................................#....................................#....." +
                "....#......................................................#..............#....#.................................#................" +
                "......................#...#............................................................................................#.........." +
                "..#......................#.................................................#.....#.....................................##........." +
                "....................##.......................#............#.#....#......#...........#.............#..#................#...#....##." +
                ".....................................................................................#....#..........#............................" +
                "..................#...............................................#.....#..#............#.....................##.............#...." +
                "......#.................................................................#.....#........#..#......................................." +
                "......#..............................................#........#................#.................................................." +
                "........#........#...........#....................#...............................#..........................................#...." +
                ".##............................................................#............#..............................................#......" +
                "........................#............................#.....#....................#............#...................................." +
                "...#......#.............#..#..#........#...............................................................................#..#....#.." +
                "#.....#...............................................#...#....#................#....#....................................#......." +
                ".................................#..#...........................................................................................#." +
                "..........#.........................#.....................#............................................#.........................." +
                "..............................#........#...................................#..#................................#...#.............#" +
                "...#....................#.............................#..............................#..#..#......................................" +
                "..........#...................#....................#.....##............................#.....................#...................." +
                ".................#..........#.........................##.....................................................#.........#.........." +
                "..........................................................#....................................#..........#......................." +
                ".........................................................#.....#..#.................#..............................#.............." +
                "................#..................#...............#.............#......#............#.................#...................##....." +
                "...................#.....#...............................#.................................#.........##..........................." +
                "......................#..........#..........#...................................#..............#......#..........................." +
                "...........................................................#......#...#.....................#.....#.......................#....#.." +
                ".....................#.........................#.......#.........#................................#.#....................#......#." +
                "...............................#..............................................#......#.................................#........#." +
                "........#...........................................#...#.........................................#.........................#..#.." +
                "..............#............................#.....#.....#.......#...^...........................#................#.........#......." +
                "..........#.#..............#.........#.............#............................................................#................." +
                ".......#..#......#.......................................................................#........................................" +
                "..........#..........................##.............#.....#..........#.............................................#.............." +
                "................#............#.....#................#....#......................................................#........#........" +
                "..#......................##.......................##.....#.....#.............................................#...................." +
                "....#...........#.................................................##........................#...#..#.............................." +
                "...........#..........................#..........................................#...#............................................" +
                "##......#.........#...........#...#................................##................#...................##......#................" +
                ".....................#...............#.............#..........#.#..................#....................#.......#................." +
                "...#..#.....#............#.....#......#.#........................................................................................." +
                "...#..............................................................................................................#.........#....." +
                "..................#..........................#.................................................#.................................." +
                "..........#...................................#.......#..#.....#.................#............##.#......#........#...#............" +
                ".......#....#............................................................................#.......................#................" +
                ".......................#...................#..#.......#..#.............#................#........................................." +
                "........#......................#.......#...........#......##................##..#......#.#....#........#.........................." +
                "...#..................................#........................#.....#..#........................................................." +
                "..#.......#...........#.........#.##..........#...........................................#...........................#..........." +
                "...................#........................................#...........#.................#.#......................#.#............" +
                "#......................#.............................#................................#.............#....#...........#............" +
                ".........#...........................................#.....#......................................#.......................#......." +
                ".......................#.#...............................#........................................................................" +
                "...........................#...............................................................#..............#......................." +
                ".......##..................#..........#......#.....................#.#.............................##..#.................#........" +
                "#.#...........#..........................................................#.....#...##......#......................#..#............" +
                "..#.............................#................#.#.........##..........................................................#........" +
                ".......................................#.......................................#...#.........#.............#......................" +
                "....#.##................................................#....................................................#.#...........#......" +
                "...#............................#.....#............#..................................#..........................................#" +
                ".........#...#..................................#.................#................................#...#.........................." +
                ".....................................#.............................#...#..........#.................#........#.......#............" +
                ".........##........#.#.....................................................................................................#......" +
                "...............................#....#.......#............#......#...................................#...............#............." +
                "....##.#.............................##..........#....#...................#..........................#......#.#.#................." +
                "............#.........#.....#..............................#......................................................................" +
                "..........#...#...#.......................#.............#...................#.##.......#.................#......#................." +
                "..#..#..#...............................#.............#.................................................................#...#....." +
                ".......................#..#.......................#..............#............#..........#........#..............................#" +
                ".....#...............#...##...........#..................#........................................#.....#.....#..................." +
                "....#.....................................#..........#..........#..#.....#...#....#...#...............#..........................#";

//        String input = "....#....." +
//                ".........#" +
//                ".........." +
//                "..#......." +
//                ".......#.." +
//                ".........." +
//                ".#..^....." +
//                "........#." +
//                "#........." +
//                "......#...";

        int rowLength = 130; // Define the row length
        char[][] grid = createGrid(input, rowLength);
        findpositionsInGrid(grid, rowLength);
    }

    public static char[][] createGrid(String input, int rowLength) {
        int rows = input.length() / rowLength;
        System.out.println(rows);

        char[][] grid = new char[rows][rowLength];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rowLength; j++) {
                grid[i][j] = input.charAt(i * rowLength + j);
                if (input.charAt(i * rowLength + j) == '^') {
                    iStart[0] = i;
                    iStart[1] = j;
                    top = true;
                }
            }
        }
        return grid;
    }

    public static void findpositionsInGrid(char[][] grid, int rowLength) {
        boolean end = false;
        boolean left = false;
        boolean right = false;
        boolean bottom = false;
        int uniquePlace = 0;
        while (!end) {
            if (top) {
                if (iStart[0] - 1 >= 0 && (grid[iStart[0] - 1][iStart[1]] == '.'|| grid[iStart[0] - 1][iStart[1]]=='^')) {
                    grid[iStart[0] - 1][iStart[1]] = 'X';
                    iStart[0] = iStart[0] - 1;
                    uniquePlace += 1;
                } else if (iStart[0] - 1 >= 0 && grid[iStart[0] - 1][iStart[1]] == 'X') {
                    iStart[0] = iStart[0] - 1;
                } else if (iStart[0] - 1 >= 0 && (iStart[0] - 1 ==0 || grid[iStart[0] - 1][iStart[1]] == '#') &&
                        iStart[1] + 1 < rowLength && (grid[iStart[0]][iStart[1] + 1] == '.'
                        || grid[iStart[0] - 1][iStart[1]]=='^'))
                {
                    uniquePlace += 1;
                    left = true;
                    top = false;
                    grid[iStart[0]][iStart[1] + 1] = 'X';
                    iStart[1] = iStart[1] + 1;

                } else if (iStart[0] - 1 >= 0 && (iStart[0] - 1 ==0||grid[iStart[0] - 1][iStart[1]] == '#') &&
                        iStart[1] + 1 < rowLength && grid[iStart[0]][iStart[1] + 1] == 'X') {
                    left = true;
                    top = false;
                    iStart[1] = iStart[1] + 1;
                } else {
                    end = true;
                }
            } else if (left) {
                if (iStart[1]+1<rowLength &&
                        (grid[iStart[0]][iStart[1]+1] == '.' || grid[iStart[0]][iStart[1]+1] =='^')) {
                    grid[iStart[0]][iStart[1]+1] = 'X';
                    iStart[1] = iStart[1]+ 1;
                    uniquePlace += 1;
                } else if (iStart[1]+1<rowLength && grid[iStart[0]][iStart[1]+1] == 'X') {
                    iStart[1] = iStart[1] + 1;
                } else if (iStart[1] + 1 < rowLength &&( iStart[1] + 1==rowLength-1 || grid[iStart[0]][iStart[1]+1] == '#') &&
                        iStart[0] + 1 < rowLength && (grid[iStart[0]+1][iStart[1]] == '.'
                ||grid[iStart[0]+1][iStart[1]] == '^'))
                {
                    bottom = true;
                    left = false;
                    uniquePlace += 1;
                    grid[iStart[0]][iStart[1] + 1] = 'X';
                    iStart[0] = iStart[0] + 1;
                } else if (iStart[1] + 1 <rowLength && ( iStart[1] + 1==rowLength-1 || grid[iStart[0]][iStart[1]+1] == '#') &&
                        iStart[0] + 1 < rowLength && grid[iStart[0]+1][iStart[1]] == 'X') {
                    bottom = true;
                    left = false;
                    iStart[0] = iStart[0] + 1;
                } else {
                    end = true;
                }
            }
            else if (bottom) {
                if (iStart[0]+1<rowLength &&
                        (grid[iStart[0]+1][iStart[1]] == '.' ||grid[iStart[0]+1][iStart[1]] == '^' )){
                    grid[iStart[0]+1][iStart[1]] = 'X';
                    iStart[0] = iStart[0]+ 1;
                    uniquePlace += 1;
                } else if (iStart[0]+1<rowLength && grid[iStart[0]+1][iStart[1]] == 'X') {
                    iStart[0] = iStart[0] + 1;
                } else if (iStart[0] + 1 < rowLength &&(iStart[0] + 1 ==rowLength-1 || grid[iStart[0]+1][iStart[1]] == '#') &&
                        iStart[1] - 1 >=0 && (grid[iStart[0]][iStart[1]-1] == '.' || grid[iStart[0]][iStart[1]-1] == '^'))
                {
                    right = true;
                    bottom = false;
                    uniquePlace += 1;
                    grid[iStart[0]][iStart[1] + 1] = 'X';
                    iStart[1] = iStart[1] - 1;
                } else if (iStart[0] + 1 <rowLength && (iStart[0] + 1 ==rowLength-1 ||grid[iStart[0]+1][iStart[1]] == '#') &&
                        iStart[1] - 1 >= 0 && grid[iStart[0]][iStart[1]-1] == 'X') {
                    right = true;
                    bottom = false;
                    iStart[1] = iStart[1] - 1;
                } else {
                    end = true;
                }
            }
            else if (right) {
                if (iStart[1]-1>=0 && (grid[iStart[0]][iStart[1]-1] == '.' ||grid[iStart[0]][iStart[1]-1] == '^')) {
                    grid[iStart[0]][iStart[1]-1] = 'X';
                    iStart[1] = iStart[1]- 1;
                    uniquePlace += 1;
                } else if (iStart[1]-1>=0 && grid[iStart[0]][iStart[1]-1] == 'X') {
                    iStart[1] = iStart[1] - 1;
                } else if (iStart[1] - 1 >=0 && (iStart[1] - 1 ==0 ||grid[iStart[0]][iStart[1]-1] == '#') &&
                        iStart[0] - 1 >=0 && (grid[iStart[0]-1][iStart[1]] == '.' ||  grid[iStart[0]-1][iStart[1]] == '^'))
                {
                    top = true;
                    right = false;
                    uniquePlace += 1;
                    grid[iStart[0]][iStart[1] + 1] = 'X';
                    iStart[0] = iStart[0] - 1;

                } else if(iStart[1] - 1 >=0 && (iStart[1] - 1 ==0 ||grid[iStart[0]][iStart[1]-1] == '#' )&&
                        iStart[0] - 1 >=0 && grid[iStart[0]-1][iStart[1]] == 'X'){
                    top = true;
                    right = false;
                    iStart[0] = iStart[0] - 1;
                } else {
                    end = true;
                }
            }
        }
        System.out.println(uniquePlace+1);
    }
}

