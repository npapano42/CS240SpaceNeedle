package proj1;

public class SpaceNeedle
{
    static int scale = 10;
    public static void main(String[] args)
    {
        needle();
        saucer_top();
        saucer_bottom();
        needle();
        tower();
        saucer_top();
    }
    public static void needle()
    {
        for (int i = 0; i < scale; i++)
        {
            for (int j = 0; j < scale * 3; j++)
            {
                System.out.print(" ");
            }

            System.out.println("||");
        }
    }

    public static void saucer_top()
    {
        int factor = 3;
        for (int i = 0; i < scale; i++)
        {
            for (int j = 0; j < factor*(scale-i-1); j++)
            {
                System.out.print(" ");
            }

            System.out.print("__/");

            for (int x = 0; x < factor*i; x++)
            {
                System.out.print(":");
            }

            System.out.print("||");

            for (int x = 0; x < factor * i; x++)
            {
                System.out.print(":");
            }

            System.out.println("\\__");
        }

        System.out.print("|");

        for (int j = 0; j < (scale * 6); j++)
        {
            System.out.print("\"");
        }

        System.out.println("|");
    }

    public static void saucer_bottom()
    {
        for (int i = 0; i < scale; i++)
        {
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print(" ");
            }

            System.out.print("\\_");

            for (int j = 0; j < scale * 3 - (2 * i) - 1; j++)
            {
                System.out.print("/\\");
            }

            System.out.println("_/");
        }
    }

    public static void tower()
    {
        for (int i = 0; i < 4 * scale; i++)
        {
            for (int j = 0; j < 2 * scale + 1; j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < scale - 2; j++)
            {
                System.out.print("%");
            }
            System.out.print("||");
            for (int j = 0; j < scale - 2; j++)
            {
                System.out.print("%");
            }
            System.out.println("|");
        }
    }

}
