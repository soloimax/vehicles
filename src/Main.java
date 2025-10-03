import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vList = new ArrayList<>();

        Menu m = new Menu();
        int i = m.MainMenu();

        do
        {
            if (i == 0)
            {
                i = m.MainMenu();
            }
            else if (i == 1)
            {
                int j = m.InputMenu();

                do
                {
                    switch (j)
                    {
                        case 1:
                            Car c = new Car();
                            System.out.println("Машина");
                            c.SetParams();
                            vList.add(c);
                            System.out.println("Машина добавлена в список транспортных средств.");
                            j = m.InputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 2:
                            Ship s = new Ship();
                            System.out.println("Корабль");
                            s.SetParams();
                            vList.add(s);
                            System.out.println("Корабль добавлена в список транспортных средств.");
                            j = m.InputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 3:
                            Plane p = new Plane();
                            System.out.println("Самолет");
                            p.SetParams();
                            vList.add(p);
                            System.out.println("Самолет добавлена в список транспортных средств.");
                            j = m.InputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 99:
                            i = m.MainMenu();
                            break;
                    }
                } while (j != 99);
            }
            else if (i == 2)
            {
                int j = m.OutputMenu();
                do
                {
                    switch (j)
                    {
                        case 1:
                            System.out.println("Все машины:");
                            for (Vehicle v: vList)
                            {
                                if(v instanceof Car)
                                {
                                    System.out.println(v.ShowDetails());
                                }
                            }
                            j = m.InputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 2:
                            System.out.println("Все корабли:");
                            for (Vehicle v: vList)
                            {
                                if(v instanceof Ship)
                                {
                                    System.out.println(v.ShowDetails());
                                }
                            }
                            j = m.OutputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 3:
                            System.out.println("Все самолеты:");
                            for (Vehicle v: vList)
                            {
                                if(v instanceof Plane)
                                {
                                    System.out.println(v.ShowDetails());
                                }
                            }
                            j = m.OutputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 98:
                            System.out.println("Все транспортные средства:");
                            for (Vehicle v: vList)
                            {
                                System.out.println(v.ShowDetails());
                            }
                            j = m.OutputMenu();
                            if (j == 99) { i = 0; }
                            break;
                        case 99:
                            i = m.MainMenu();
                            break;
                    }
                } while (j != 99);
            }

        } while (i != 99);
    }
}


