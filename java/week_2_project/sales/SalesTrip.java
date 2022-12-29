package week_2_project.sales;

import week_2_project.common.UniqueKeyCounter;

/**
 * Sales trip
 */
public class SalesTrip extends UniqueKeyCounter
{
    /**
     * To city
     */
    private String destinationCity;
    /**
     * From city
     */
    private String fromCity;
    /**
     * The distance between the two cities
     */
    private double distance;
    /**
     * The duration (time) of travel between the two cities
     */
    private double duration;
    /**
     * Unique object key
     */
    private int key;

    /**
     * Constructor
     *
     * @param destinationCity to city
     * @param fromCity        from city
     * @param distance        distance
     * @param duration        duration
     */
    public SalesTrip(String destinationCity, String fromCity, double distance, double duration)
    {
        this.destinationCity = destinationCity;
        this.fromCity = fromCity;
        this.distance = distance;
        this.duration = duration;
    }

    /**
     * Returns the destination (to) city
     *
     * @return destination (to) city
     */
    public String getDestinationCity()
    {
        return destinationCity;
    }

    /**
     * Sets the destination (to) city
     *
     * @param destinationCity destination (to) city
     */
    public void setDestinationCity(String destinationCity)
    {
        this.destinationCity = destinationCity;
    }

    /**
     * Returns the from city
     *
     * @return from city
     */
    public String getFromCity()
    {
        return fromCity;
    }

    /**
     * Sets the from city
     *
     * @param fromCity from city
     */
    public void setFromCity(String fromCity)
    {
        this.fromCity = fromCity;
    }

    /**
     * Returns the distance between the cities
     *
     * @return distance between the cities
     */
    public double getDistance()
    {
        return distance;
    }

    /**
     * Sets the distance
     *
     * @param distance distance
     */
    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    /**
     * Returns the duration (time) of travel between the two cities
     *
     * @return duration (time) of travel between the two cities
     */
    public double getDuration()
    {
        return duration;
    }

    /**
     * Sets the duration
     *
     * @param duration the duration
     */
    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    /**
     * Returns the unique object key
     *
     * @return unique object key
     */
    public int getKey()
    {
        return key;
    }

    /**
     * Sets the unique object key
     *
     * @param key unique object key
     */
    protected void setKey(int key)
    {
        this.key = key;
    }
}
