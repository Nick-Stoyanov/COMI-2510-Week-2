package week_2_project.expense;

import week_2_project.common.UniqueKeyCounter;

/**
 * Abstract representation of an expense
 */
public abstract class Expense extends UniqueKeyCounter
{
    /**
     * The expense amount
     */
    private double expense;
    /**
     * Unique object key
     */
    private int key;
    /**
     * Name of the expense
     */
    private String name;

    /**
     * Constructor
     *
     * @param expense expense amount
     * @param name    expense name
     */
    public Expense(double expense, String name)
    {
        this.expense = expense;
        this.name = name;
    }

    /**
     * gets expense
     *
     * @return expense
     */
    public double getExpense()
    {
        return expense;
    }

    /**
     * sets expense
     *
     * @param expense expense
     */
    public void setExpense(double expense)
    {
        this.expense = expense;
    }

    /**
     * gets key
     *
     * @return key
     */
    @Override
    public int getKey()
    {
        return key;
    }

    /**
     * set key
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
    {
        this.key = key;
    }

    /**
     * get name
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * set name
     *
     * @param name name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * to string
     *
     * @return
     */
    @Override
    public String toString()
    {
        return "Expense{" +
                "expense=" + expense +
                ", key=" + key +
                ", name='" + name + '\'' +
                '}';
    }
}
