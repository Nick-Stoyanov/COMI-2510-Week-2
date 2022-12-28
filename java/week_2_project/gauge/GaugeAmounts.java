package week_2_project.gauge;

/**
 * Gauge amounts interface. Gauges have a "maximum" amount and "current" amount.
 * The current amount is never more than the maximum.
 * The current can start at 0 and reach the maximum, or start at the maximum and go to 0.
 *
 * @author Nick
 */
public interface GaugeAmounts
{
    /**
     * Returns the current amount. Gauges have a "maximum" amount and "current" amount.
     * The current amount is never more than the maximum.
     * The current can start at 0 and reach the maximum, or start at the maximum and go to 0.
     *
     * @return the current amount
     */
    double getCurrentAmount();

    /**
     * Returns the maximum amount
     *
     * @return the maximum amount
     */
    double getMaximumAmount();

    /**
     * Sets the current amount. Gauges have a "maximum" amount and "current" amount.
     * The current amount is never more than the maximum.
     * The current can start at 0 and reach the maximum, or start at the maximum and go to 0.
     *
     * @param currentAmount the current amount
     */
    void setCurrentAmount(double currentAmount);

    /**
     * Sets the maximum amount
     *
     * @param maximumAmount the maximum amount
     */
    void setMaximumAmount(double maximumAmount);


}
