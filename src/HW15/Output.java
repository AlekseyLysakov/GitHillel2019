package HW15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Задание:
// Требуется написать метод который на вход будет принимать последовательности цифр,
// а выводить на экран в псевдографике как в приложении, добавить проверку что все знаки цифры

public class Output {
    private Map<Character, char [][]> charMap;

    public Output() {

        char[][] zero = {
                {' ', '@', '@', '@', '@', ' '},
                {'@', '@', ' ', ' ', '@', '@'},
                {'@', '@', ' ', ' ', '@', '@'},
                {'@', '@', ' ', ' ', '@', '@'},
                {' ', '@', '@', '@', '@', ' '},

        };

        char[][] one = {
                {' ', ' ', '@', '@', ' ', ' '},
                {' ', '@', '@', '@', ' ', ' '},
                {'@', ' ', '@', '@', ' ', ' '},
                {' ', ' ', '@', '@', ' ', ' '},
                {'@', '@', '@', '@', '@', '@'},

        };

        char[][] two = {
                {' ', '@', '@', '@', '@', ' '},
                {'@', ' ', ' ', ' ', '@', '@'},
                {' ', ' ', '@', '@', ' ', ' '},
                {'@', '@', ' ', ' ', ' ', ' '},
                {'@', '@', '@', '@', '@', '@'},

        };

        char[][] three = {
                {'@', '@', '@', '@', '@', ' '},
                {' ', ' ', ' ', ' ', '@', '@'},
                {' ', '@', '@', '@', ' ', ' '},
                {' ', ' ', ' ', ' ', '@', '@'},
                {'@', '@', '@', '@', '@', ' '},

        };

        char[][] four = {
                {'@', '@', ' ', ' ', '@', '@'},
                {'@', '@', ' ', ' ', '@', '@'},
                {'@', '@', '@', '@', '@', '@'},
                {' ', ' ', ' ', ' ', '@', '@'},
                {' ', ' ', ' ', ' ', '@', '@'},

        };

        char[][] five = {
                {'@', '@', '@', '@', '@', '@'},
                {'@', '@', ' ', ' ', ' ', ' '},
                {'@', '@', '@', '@', '@', ' '},
                {' ', ' ', ' ', ' ', '@', '@'},
                {'@', '@', '@', '@', '@', ' '},

        };

        char[][] six = {
                {' ', '@', '@', '@', '@', '@'},
                {'@', '@', ' ', ' ', ' ', ' '},
                {'@', '@', '@', '@', '@', ' '},
                {'@', '@', ' ', ' ', '@', '@'},
                {' ', '@', '@', '@', '@', ' '},

        };

        char[][] seven = {
                {'@', '@', '@', '@', '@', '@'},
                {' ', ' ', ' ', '@', '@', ' '},
                {' ', ' ', '@', '@', ' ', ' '},
                {' ', '@', '@', ' ', ' ', ' '},
                {'@', '@', ' ', ' ', ' ', ' '},

        };

        char[][] eight = {
                {' ', '@', '@', '@', '@', ' '},
                {'@', '@', ' ', ' ', ' ', '@'},
                {' ', '@', '@', '@', '@', ' '},
                {'@', '@', ' ', ' ', '@', '@'},
                {' ', '@', '@', '@', '@', ' '},

        };

        char[][] nine = {
                {' ', '@', '@', '@', '@', ' '},
                {'@', '@', ' ', ' ', ' ', '@'},
                {' ', '@', '@', '@', '@', ' '},
                {' ', ' ', ' ', ' ', '@', '@'},
                {' ', '@', '@', '@', '@', ' '},

        };

        charMap = new HashMap<>();

        charMap.put('0', zero);
        charMap.put('1', one);
        charMap.put('2', two);
        charMap.put('3', three);
        charMap.put('4', four);
        charMap.put('5', five);
        charMap.put('6', six);
        charMap.put('7', seven);
        charMap.put('8', eight);
        charMap.put('9', nine);

    }


    public void printText() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите последовательность из целый положительных чисел");
        String figure = scan.nextLine();
        char[] chars = figure.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (!Character.isDigit(chars[i])) {
                System.out.println(chars[i] + " - не является целым положительны числом");
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (char c : chars) {
                    char[][] ch = charMap.get(c);
                    for (int j = 0; j < ch[i].length; j++) {
                        System.out.print(ch[i][j]);
                    }
                    System.out.print(' ');
                }
                System.out.println();
            }
        }


        public static void main (String[]args){
            Output banner = new Output();
            banner.printText();
        }
    }


