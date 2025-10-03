import java.util.Scanner;

public class Menu
{
    public static int MainMenu()
    {
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберете пункт меню:");
        System.out.println("1 - Ввод данных");
        System.out.println("2 - Вывод данных");
        System.out.println("99 - Выход");

        selection = input.nextInt();
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

        selection = input.nextInt();
        return selection;
    }

    public static int OutputMenu()
    {
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.println("Выберете пункт меню:");
        System.out.println("1 - Показать все машины");
        System.out.println("2 - Показать все корабли");
        System.out.println("3 - Показать все самолеты");
        System.out.println("98 - Показать все транспортные средства");
        System.out.println("99 - Назад");

        selection = input.nextInt();
        return selection;
    }


}
