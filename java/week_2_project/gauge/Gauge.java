package week_2_project.gauge;

import week_2_project.common.UniqueKeyCounter;

/**
 * This is an abstract implementation of a gauge amount.
 *
 * @author Nick
 */
public abstract class Gauge extends UniqueKeyCounter implements GaugeAmounts
{
    /**
     * The current amount
     */
    private double currentAmount;
    /**
     * Object instance key
     */
    private int key;
    /**
     * The maximum amount
     */
    private double maximumAmount;

    /**
     * Constructor
     */
    protected Gauge()
    {
        super();
        int tot = this.getKey() + 1;
        this.setKey(tot);
    }

    /**
     * * Returns the current amount. Gauges have a "maximum" amount and "current" amount.
     * The current amount is never more than the maximum. The current can start at 0 and
     * reach the maximum, or start at the maximum and go to 0.
     *
     * @return the current amount
     */
    public double getCurrentAmount()
    {
        return this.currentAmount;
    }

    /**
     * Sets the current amount. Gauges have a "maximum" amount and "current" amount.
     * The current amount is never more than the maximum.
     * The current can start at 0 and reach the maximum, or start at the maximum and go to 0.
     *
     * @param currentAmount the current amount
     */
    public void setCurrentAmount(double currentAmount)
    {
        this.currentAmount = currentAmount;
    }

    /**
     * Returns the key for the object
     *
     * @return the key
     */
    @Override
    public int getKey()
    {
        return this.key;
    }

    /**
     * sets the key for the object
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
    {
        this.key = key;
    }

    /**
     * Returns the maximum amount
     *
     * @return the maximum amount
     */
    public double getMaximumAmount()
    {
        return this.maximumAmount;
    }

    /**
     * Sets the maximum amount
     *
     * @param maximumAmount the maximum amount
     */
    public void setMaximumAmount(double maximumAmount)
    {
        this.maximumAmount = maximumAmount;
    }

    /**
     * Returns a string representation
     *
     * @return string representation
     */
    @Override
    public String toString()
    {
        return "Gauge{" +
                "currentAmount=" + currentAmount +
                ", key=" + key +
                ", maximumAmount=" + maximumAmount +
                '}';
    }

}
