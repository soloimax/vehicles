public class Test {
    public static void main(String[] args) {

        System.out.println("Значение " + InputOptions.CAR.getOption());
        System.out.println("Значение " + InputOptions.SHIP.getOption());

        System.out.println(InputOptions.getValue(3));

        Menu m = new Menu();
        InputOptions j = InputOptions.getValue(m.InputMenu());

        System.out.println("Значение " + j);
    }
}
