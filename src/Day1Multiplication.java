public class Day1Multiplication
    {
        public static void main(String[] args)
            {
                int k = 3;
                int l = 1;
                int m;

                while (l<10)
                    {
                    m=k*l;
                    System.out.println(l + " * " + k + " = " + m);
                    l = l + 1;
                    }
            }
    }