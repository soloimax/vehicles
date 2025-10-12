import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Menu
{
    protected static int[] mainoptionsArray = new int[] {1,2,99};

    public static int MainMenu()
    {
        int selection = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберете пункт меню:");
        System.out.println("1 - Ввод данных");
        System.out.println("2 - Вывод данных");
        System.out.println("99 - Выход");

        try
        {
            selection = input.nextInt();
        }
        catch (Exception e)
        {
            selection = 0;
        }


        int serachResult = binarySearch(mainoptionsArray, 0, mainoptionsArray.length, selection);

        if(serachResult < 0)
        {
            System.out.println("Выберете раздел меню");
            selection = 0;
        }


        return selection;
    }

    public static int InputMenu()
    {
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберете тип транспортного средства:");
        System.out.println("1 - Машина");
        System.out.println("2 - Корабль");
        System.out.println("3 - Самолет");
        System.out.println("99 - Назад");

        try
        {
            selection = input.nextInt();
        }
        catch (Exception e)
        {
            selection = 0;
        }

        InputOptions res = InputOptions.getValue(selection);

        if(res == null)
        {
            System.out.println("Выберете раздел меню");
        }

        return selection;
    }

    public static int OutputMenu()
    {
        int selection = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберете пункт меню:");
        System.out.println("1 - Показать все машины");
        System.out.println("2 - Показать все корабли");
        System.out.println("3 - Показать все самолеты");
        System.out.println("98 - Показать все транспортные средства");
        System.out.println("99 - Назад");

        try
        {
            selection = input.nextInt();
        }
        catch (Exception e)
        {
            selection = 0;
        }

        OutputOptions res = OutputOptions.getValue(selection);
        if(res == null)
        {
            System.out.println("Выберете раздел меню");
        }

        return selection;
    }
}
