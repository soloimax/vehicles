public enum OutputOptions
{
    CARS(1), SHIPS(2), PLANES(3), ALL_VEHICLES(98), BACK(99);

    private int op;

    public int getOption()
    {
        return op;
    }

    OutputOptions(int op)
    {
        this.op = op;
    }

    public static OutputOptions getValue(int op)
    {
        for(OutputOptions e: OutputOptions.values())
        {
            if(e.op == op)
            {
                return e;
            }
        }
        return null;
    }
}
