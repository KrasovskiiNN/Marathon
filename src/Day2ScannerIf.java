import java.util.Scanner;

public class Day2ScannerIf
    {
        public static void main(String[] args)
            {
                Scanner s = new Scanner(System.in);
                System.out.println("Введите количество этажей:");
                int stages = s.nextInt();

                if(stages > 0 && stages < 5)
                    {
                        System.out.println("Малоэтажный дом");
                    }
                else if (stages > 4 && stages < 9)
                    {
                        System.out.println("Среднеэтажный дом");
                    }
                else if (stages > 8)
                    {
                        System.out.println("Многоэтажный дом");
                    }
                else
                    {
                        System.out.println("Ошибка ввода");
                    }
            }
    }