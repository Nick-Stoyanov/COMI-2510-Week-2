/**
 *
 */
package dashboard;

import gauge.Gauge;

import java.util.ArrayList;

/**
 * Dashboard interface for all types of vehicles.
 *
 * @author Nick
 */
public interface Dashboard
{
    /**
     * Returns the fuel gauge
     *
     * @return the fuel gauge
     */
    Gauge getFuelGauge();

    /**
     * Returns a list of gauges
     *
     * @return a list of gauges
     */
    ArrayList<Gauge> getGaugeList();

    /**
     * Returns the oil gauge
     *
     * @return the oil gauge
     */
    Gauge getOilGauge();

    /**
     * Returns the tire gauge.
     *
     * @return tire gauge
     */
    Gauge getTireGauge();

    /**
     * Sets the fuel gauge
     *
     * @param maximumAmount - maximum amount of fuel
     * @param currentAmount - a full tank of fuel is equal to the maximum amount
     */



    void setFuelGauge(double maximumAmount, double currentAmount);

    /**
     * Sets the oil gauge
     *
     * @param maximumAmount - represents the maximum number of miles before an oil change is required
     * @param currentAmount - represents the number of miles remaining before an oil change is required (e.g. would be set to 0 after an oil change)
     */
    void setOilGauge(double maximumAmount, double currentAmount);

    /**
     * Sets the tire gauge
     *
     * @param maximumAmount - represents the maximum number of miles before a tire change is required
     * @param currentAmount - represents the number of miles remaining before a tire change is required (e.g. would be set to 0 after a tires changed)
     */
    void setTireGauge(double maximumAmount, double currentAmount);


}

