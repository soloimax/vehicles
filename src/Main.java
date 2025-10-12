import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vList = new ArrayList<>();

        Menu m = new Menu();
        int i = m.MainMenu();
        if (i == 0)
        {
            i = m.MainMenu();
        }

        do
        {
            if (i == 0)
            {
                i = m.MainMenu();
            }
            else if (i == 1)
            {
                InputOptions j = InputOptions.getValue(m.InputMenu());
                while (j == null)
                {
                    j = InputOptions.getValue(m.InputMenu());
                }

                do
                {
                    switch (j)
                    {
                        case InputOptions.CAR:
                            Car c = new Car();
                            System.out.println("Машина");
                            c.SetParams();
                            vList.add(c);
                            System.out.println("Машина добавлена в список транспортных средств.");
                            j = InputOptions.getValue(m.InputMenu());
                            if (j == null) { j = InputOptions.getValue(m.InputMenu()); }
                            else if (j == InputOptions.BACK) { i = 0; }
                            break;
                        case InputOptions.SHIP:
                            Ship s = new Ship();
                            System.out.println("Корабль");
                            s.SetParams();
                            vList.add(s);
                            System.out.println("Корабль добавлена в список транспортных средств.");
                            j = InputOptions.getValue(m.InputMenu());
                            if (j == null) { j = InputOptions.getValue(m.InputMenu()); }
                            else if (j == InputOptions.BACK) { i = 0; }
                            break;
                        case InputOptions.PLANE:
                            Plane p = new Plane();
                            System.out.println("Самолет");
                            p.SetParams();
                            vList.add(p);
                            System.out.println("Самолет добавлена в список транспортных средств.");
                            j = InputOptions.getValue(m.InputMenu());
                            if (j == null) { j = InputOptions.getValue(m.InputMenu()); }
                            else if (j == InputOptions.BACK) { i = 0; }
                            break;
                        case InputOptions.BACK:
                            i = m.MainMenu();
                            break;
                    }
                } while (j != InputOptions.BACK);
            }
            else if (i == 2)
            {
                OutputOptions j = OutputOptions.getValue(m.OutputMenu());
                while (j == null)
                {
                    j = OutputOptions.getValue(m.OutputMenu());
                }
                do
                {
                    switch (j)
                    {
                        case OutputOptions.CARS:
                            System.out.println("Все машины:");
                            if(!vList.isEmpty()) {
                                for (Vehicle v : vList) {
                                    if (v instanceof Car) {
                                        System.out.println(v.ShowDetails());
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("***Нет транспортных средств***");
                            }
                            j = OutputOptions.getValue(m.OutputMenu());
                            if (j == null) { OutputOptions.getValue(m.OutputMenu()); }
                            else if (j == OutputOptions.BACK) { i = 0; }
                            break;
                        case OutputOptions.SHIPS:
                            System.out.println("Все корабли:");
                            if(!vList.isEmpty()) {
                                for (Vehicle v : vList) {
                                    if (v instanceof Ship) {
                                        System.out.println(v.ShowDetails());
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("***Нет транспортных средств***");
                            }
                            j = OutputOptions.getValue(m.OutputMenu());
                            if (j == null) { OutputOptions.getValue(m.OutputMenu()); }
                            else if (j == OutputOptions.BACK) { i = 0; }
                            break;
                        case OutputOptions.PLANES:
                            System.out.println("Все самолеты:");
                            if(!vList.isEmpty())
                            {
                                for (Vehicle v : vList) {
                                    if (v instanceof Plane) {
                                        System.out.println(v.ShowDetails());
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("***Нет транспортных средств***");
                            }
                            j = OutputOptions.getValue(m.OutputMenu());
                            if (j == null) { OutputOptions.getValue(m.OutputMenu()); }
                            else if (j == OutputOptions.BACK) { i = 0; }
                            break;
                        case OutputOptions.ALL_VEHICLES:
                            System.out.println("Все транспортные средства:");
                            if(!vList.isEmpty())
                            {
                                for (Vehicle v : vList)
                                {
                                    System.out.println(v.ShowDetails());
                                }
                            }
                            else
                            {
                                System.out.println("***Нет транспортных средств***");
                            }
                            j = OutputOptions.getValue(m.OutputMenu());
                            if (j == null) { OutputOptions.getValue(m.OutputMenu()); }
                            else if (j == OutputOptions.BACK) { i = 0; }
                            break;
                        case OutputOptions.BACK:
                            i = m.MainMenu();
                            break;
                    }
                } while (j != OutputOptions.BACK);
            }

        } while (i != 99);
    }
}


