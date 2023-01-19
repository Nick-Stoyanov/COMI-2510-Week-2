package expense;

/**
 * Static utility to calculate expenses
 *
 * @author Nick
 */
public class ExpenseHelper
{
    /**
     * default constructor
     */
    protected ExpenseHelper()
    {
        super();
    }

    /**
     * Calculates the cost of food for the trip.
     *
     * @param tripDataTotal tripDataTotal the total length of the trip in mile
     * @param maxDuration   the maximum duration (time) that can be traveled
     * @param foodCost      the daily cost of food
     * @return the cost of food for the trip.
     */
    public static double getFoodCosts(double tripDataTotal, double maxDuration, double foodCost)
    {
        return (((int) (tripDataTotal / maxDuration)) * foodCost);
    }

    /**
     * Calculate the fuel costs for the trip.
     *
     * @param tripDataTotal the total length of the trip in miles
     * @param mpg           the miles per gallon
     * @param gasPerUnit    the cost of a gallon of fuel
     * @return the fuel costs for the trip.
     */
    public static double getFuelCosts(double tripDataTotal, double mpg, double gasPerUnit)
    {
        return (((int) (tripDataTotal / mpg)) * gasPerUnit);
    }

    /**
     * Calculates the cost of hotel(s) for the trip.
     *
     * @param tripDataTotal the total length of the trip in miles
     * @param maxDuration   the maximum duration (time) that can be traveled
     * @param hotelCost     the cost of a hotel room
     * @return the cost of hotel(s) for the trip.
     */
    public static double getHotelCosts(double tripDataTotal, double maxDuration, double hotelCost)
    {
        return (((int) (tripDataTotal / maxDuration)) * hotelCost);
    }

    /**
     * Calculates the cost of an oil change for the trip.
     *
     * @param tripDataTotal the total length of the trip in miles
     * @param maxDistance   the maximum distance that can be traveled
     * @param oilChange     the cost of an oil change
     * @return the cost of an oil change for the trip.
     */
    public static double getOilCosts(double tripDataTotal, double maxDistance, double oilChange)
    {
        return (((int) (tripDataTotal / maxDistance)) * oilChange);
    }

    /**
     * Calculates the cost of wear and tear on the tires for the trip
     *
     * @param tripDataTotal the total length of the trip in miles
     * @param maxDistance   the maximum distance that can be traveled
     * @param fourTires     the cost of four new tires
     * @return the cost of wear and tear on the tires for the trip
     */
    public static double getTireCosts(double tripDataTotal, double maxDistance, double fourTires)
    {
        return (((int) (tripDataTotal / maxDistance)) * fourTires);
    }

}
