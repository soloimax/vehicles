public enum MainMenuOptions
{
    Input(1), Output(2), Exit(99);

    private int op;

    public int getOp()
    {
        return op;
    }

    MainMenuOptions(int op)
    {
        this.op = op;
    }
}


