import java.util.Scanner;

public class Day2ScannerFor
    {
        public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите два числа:");

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a >= b)
                    {
                        System.out.println("Некорректный ввод!");
                    }
                else
                    {
                        for (int c = a + 1; c < b; c++)
                            {
                                if (c % 5 == 0 && c % 10 !=0)
                                {
                                    System.out.print(c+" ");
                                }
                            }
                    }
            }
    }
