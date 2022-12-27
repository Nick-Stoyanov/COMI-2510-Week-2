package week_2_project.expense;

import week_2_project.common.UniqueKeyCounter;

/**
 * Abstract representation of an expense
 */
public abstract class Expense extends UniqueKeyCounter
{
    public Expense(double expense, int key, String name)
    {
        this.expense = expense;
        this.key = key;
        this.name = name;
    }

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






}
