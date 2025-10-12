public enum InputOptions
{
    CAR(1), SHIP(2), PLANE(3), BACK(99);

    private int op;

    public int getOption()
    {
        return op;
    }

    InputOptions(int op)
    {
        this.op = op;
    }

    public static InputOptions getValue(int op)
    {
        for(InputOptions e: InputOptions.values())
        {
            if(e.op == op)
            {
                return e;
            }
        }
        return null;
    }
}
