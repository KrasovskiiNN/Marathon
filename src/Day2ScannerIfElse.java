import java.util.Scanner;

public class Day2ScannerIfElse
    {
        public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите значение числа x:");

                double x = scanner.nextDouble();
                double y;

                if ( x >= 5)
                    {
                        y = (( x * x - 10) / (x + 7));
                        System.out.println("y=" + y);
                    }
                else if ( x > -3 && x < 5)
                    {
                        y = (( x + 3 ) * ( x * x - 2));
                        System.out.println("y=" + y);
                    }
                else
                    {
                        System.out.println("y = 420");
                    }
            }
    }