package HW16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

// Задание:
// пользователь должен выбирать количество игр
// пользователь должен иметь возможность прервать игру
// после прекращения игры пользователь должен увидеть результат
// результат надо сохранить в файл - https://www.baeldung.com/java-write-to-file

public class Game {

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.yourChoice();

    }

 void yourChoice() {
     int count = 0;
     int PersonWinCount = 0;
     int ComputerWinCount = 0;

        System.out.println("Введите количество игр: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Будет сыграно количество игр: " + x);

        for (int i = 1; i <= x; i++) {
            System.out.println("Игра №" + i);
            System.out.println("Введите число от одного до трёх: \n 1 - Камень; \n 2 - Ножницы; \n 3 - Бумага.");
            Scanner scan1 = new Scanner(System.in);
            int number = scan1.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Ваш ход: Камень");
                    break;
                case 2:
                    System.out.println("Ваш ход: Ножницы");
                    break;
                case 3:
                    System.out.println("Ваш ход: Бумага");
                    break;
                default:
                    System.out.println("Вы ввели неправильное число");
            }

            double numberOfComputer = Math.random();

            if (numberOfComputer > 0 && numberOfComputer <= 0.33) {
                System.out.println("Ход компьютера: Камень");
                if (number == 1) {
                    System.out.println("ничья");
                    ++PersonWinCount;
                    ++ComputerWinCount;
                } else if (number == 2) {
                    System.out.println("Вы проиграли");
                    ++ComputerWinCount;
                } else {
                    System.out.println("Вы победили");
                    ++PersonWinCount;
                }
            } else if (numberOfComputer > 0.33 && numberOfComputer <= 0.66) {
                System.out.println("Ход компьютера: Ножницы");
                if (number == 1) {
                    System.out.println("Вы победили");
                    ++PersonWinCount;
                } else if (number == 2) {
                    System.out.println("Ничья");
                    ++PersonWinCount;
                    ++ComputerWinCount;
                } else {
                    System.out.println("Вы проиграли");
                    ++ComputerWinCount;
                }
            } else {
                System.out.println("Ход компьютера: Бумага");
                if (number == 1) {
                    System.out.println("Вы проиграли");
                    ++ComputerWinCount;
                } else if (number == 2) {
                    System.out.println("Вы победили");
                    ++PersonWinCount;
                } else {
                    System.out.println("Ничья");
                    ++PersonWinCount;
                    ++ComputerWinCount;
                }
            }
            count++;

            if (count < x) {
                System.out.println("Вы хотите продолжить игру? Введите ДА / НЕТ");
                Scanner scan2 = new Scanner(System.in);
                String continueGame = scan2.nextLine();
                if (!continueGame.equals("ДА")) {
                    break;
                }
            }
        }
     System.out.println("Счёт: " + PersonWinCount + " : " + ComputerWinCount);
          try {
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Aleksey\\Documents\\Hillel\\HW16\\text.txt");
                String totalScore = "Счёт: " + PersonWinCount + " : " + ComputerWinCount;
                fileOutputStream.write(totalScore.getBytes());
                fileOutputStream.close();
            }catch(IOException e) {
         System.out.print("Exception");
     }

 }

}
