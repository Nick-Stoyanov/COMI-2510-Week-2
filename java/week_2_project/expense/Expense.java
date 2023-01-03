package week_2_project.expense;

import week_2_project.common.UniqueKeyCounter;

/**
 * Abstract representation of an expense
 *
 * @author Nick
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
    protected Expense(double expense, String name)
    {
        int tot = this.getKey() + 1;
        this.setKey(tot);
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
        return this.expense;
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
        return this.key;
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
        return this.name;
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
     * Returns a string representation
     *
     * @return string representation
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
