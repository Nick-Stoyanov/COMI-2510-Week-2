/**
 * Instantiation of Automobile
 */
package week_2_project.dashboard;

import week_2_project.common.UniqueKeyCounter;
import week_2_project.gauge.FuelGauge;
import week_2_project.gauge.Gauge;
import week_2_project.gauge.OilGauge;
import week_2_project.gauge.TireGauge;

import java.util.ArrayList;

/**
 * Define class
 *
 * @author Nick
 */
public class Automobile extends UniqueKeyCounter implements Dashboard
{
    /**
     * Sets mpg
     * @param mpg mpg
     */
    public void setMpg(double mpg)
    {

        this.mpg = mpg;
    }

    /**
     * Average MPG
     */
    private double mpg = 0;
    /**
     * List of gauges for this automobile
     */
    private ArrayList<Gauge> gaugeList;
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

        super();

        int tot = this.getKey() + 1;
        this.setKey(tot);

        this.name = name;

        gaugeList = new ArrayList<>();
        FuelGauge fuelGauge = new FuelGauge();
        gaugeList.add(fuelGauge);

        OilGauge oilGauge = new OilGauge();
        gaugeList.add(oilGauge);

        TireGauge tireGauge = new TireGauge();
        gaugeList.add(tireGauge);
    }

    /**
     * Returns a list of gauges
     *
     * @return the gauge list
     */
    @Override
    public ArrayList<Gauge> getGaugeList()
    {
        return this.gaugeList;
    }

    /**
     * Returns the fuel gauge
     *
     * @return the fuel gauge
     */
    public Gauge getFuelGauge()
    {
        int index = 0;

        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof FuelGauge)
            {
                index = i;
            }
        }
        return gaugeList.get(index);
    }


    /**
     * Returns the oil gauge
     *
     * @return the oilGauge
     */

    @Override
    public Gauge getOilGauge()
    {
        int index = 0;

        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof OilGauge)
            {
                index = i;
            }
        }
        return gaugeList.get(index);
    }

    /**
     * Returns the tire gauge
     *
     * @return the tireGauge
     */
    @Override
    public Gauge getTireGauge()
    {
        int index = 0;

        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof TireGauge)
            {
                index = i;
            }
        }
        return gaugeList.get(index);
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
        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof FuelGauge)
            {
                gaugeList.get(i).setMaximumAmount(maximumAmount);
                gaugeList.get(i).setCurrentAmount(currentAmount);
            }
        }
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
        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof OilGauge)
            {
                gaugeList.get(i).setMaximumAmount(maximumAmount);
                gaugeList.get(i).setCurrentAmount(currentAmount);
            }
        }
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
        for (int i = 0; i < gaugeList.size(); i++)
        {
            if (gaugeList.get(i) instanceof TireGauge)
            {
                gaugeList.get(i).setMaximumAmount(maximumAmount);
                gaugeList.get(i).setCurrentAmount(currentAmount);
            }
        }
    }

    /**
     * Returns the key for the object
     *
     * @return key the key
     */
    @Override
    public int getKey()
    {
        return this.key;
    }

    /**
     * Set key
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
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
        return this.mpg;
    }

    /**
     * Get name
     *
     * @return name
     */
    public String getName()
    {
        return this.name;
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
