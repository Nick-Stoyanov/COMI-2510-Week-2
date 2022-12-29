/**
 * Instantiation of Automobile
 */
package week_2_project.dashboard;

import week_2_project.common.UniqueKeyCounter;
import week_2_project.gauge.Gauge;

import java.util.ArrayList;

/**
 * Define class
 */
public class Automobile extends UniqueKeyCounter implements Dashboard
{
    /**
     * List of gauges for this automobile
     */
    private final ArrayList<Gauge> gaugeList = new ArrayList<>();
    /**
     * Average MPG
     */
    private final double mpg = 0;
    /**
     * Name
     */
    private String name = null;
    /**
     * Unique key
     */
    private int key = 0;


    /**
     * Default constructor
     *
     * @param name the name
     */
    public Automobile(String name)
    {
        this.name = name;
    }

    /**
     * Returns the fuel gauge
     *
     * @return the fuel gauge
     */
    public Gauge getFuelGauge()
    {
        return getFuelGauge();
    }

    /**
     * Returns a list of gauges
     *
     * @return the gauge list
     */
    @Override
    public ArrayList<Gauge> getGaugeList()
    {
        return gaugeList;
    }

    /**
     * Returns the oil gauge
     *
     * @return the oilGauge
     */
    @Override
    public Gauge getOilGauge()
    {

        return getOilGauge();
    }

    /**
     * Returns the tire gauge
     *
     * @return the tireGauge
     */
    @Override
    public Gauge getTireGauge()
    {
        return this.getTireGauge();
    }

    /**
     * Sets the fuel gauge
     *
     * @param maximumAmount - maximum amount of fuel
     * @param currentAmount - a full tank of fuel is equal to the maximum amount
     */
    @Override
    public void setFuelGauge(double maximumAmount, double currentAmount)
    {

    }

    /**
     * Sets the oil gauge
     *
     * @param maximumAmount - represents the maximum number of miles before an oil change is required
     * @param currentAmount - represents the number of miles remaining before an oil change is required (e.g. would be set to 0 after an oil change)
     */
    @Override
    public void setOilGauge(double maximumAmount, double currentAmount)
    {

    }

    /**
     * Sets the tire gauge
     *
     * @param maximumAmount - represents the maximum number of miles before a tire change is required
     * @param currentAmount - represents the number of miles remaining before a tire change is required (e.g. would be set to 0 after a tires changed)
     */
    @Override
    public void setTireGauge(double maximumAmount, double currentAmount)
    {

    }

    /**
     * Returns the key for the object
     *
     * @return key the key
     */
    @Override
    public int getKey()
    {
        return key;
    }

    /**
     * Set key
     *
     * @param key the key
     */
    @Override
    public void setKey(int key)
    {
        this.key = key;
    }

    /**
     * Get mpg
     *
     * @return the mpg
     */
    public double getMpg()
    {
        return mpg;
    }

    /**
     * Get name
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set name
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * to string results
     *
     * @return string representation
     */
    @Override
    public String toString()
    {
        return "Automobile{" +
                "gaugeList=" + gaugeList +
                ", mpg=" + mpg +
                ", name='" + name + '\'' +
                ", key=" + key +
                '}';
    }
}
