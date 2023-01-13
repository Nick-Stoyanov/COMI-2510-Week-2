package week_2_project.expense;

/**
 * Travel and entertainment expense
 */
public class TravelEntertainmentExpense
{
    /**
     * Food expense
     */
    private FoodExpense foodExpense;

    /**
     * Hotel Expense
     */
    private HotelExpense hotelExpense;


    /**
     * Constructor
     *
     * @param name         the name of the expense
     * @param hotelExpense the amount of the hotel expense
     * @param foodExpense  the amount of the food expense
     */
    public TravelEntertainmentExpense(String name,
                                      double hotelExpense,
                                      double foodExpense)
    {
        super();
        this.foodExpense = new FoodExpense(foodExpense, name);
        this.hotelExpense = new HotelExpense(hotelExpense, name);


    }

    /**
     * Returns the FoodExpense
     *
     * @return the foodExpense
     */
    public FoodExpense getFood()
    {
        return foodExpense;
    }

    /**
     * The amount of the food expense
     *
     * @return the amount of the food expense
     */
    public double getFoodExpense()
    {
        return this.getFood().getExpense();
    }

    /**
     * Returns the HotelExpense
     *
     * @return the hotelExpense
     */
    public HotelExpense getHotel()
    {
        return this.hotelExpense;
    }

    /**
     * The amount of the hotel expense
     *
     * @return the amount of the hotel expense
     */
    public double getHotelExpense()
    {
        return this.getHotel().getExpense();
    }

    /**
     * Sets the FoodExpense
     *
     * @param foodExpense the FoodExpense to set
     */
    public void setFood(FoodExpense foodExpense)
    {
        this.foodExpense = foodExpense;
    }

    /**
     * Sets the HotelExpense
     *
     * @param hotelExpense the HotelExpense to set
     */
    public void setHotel(HotelExpense hotelExpense)
    {
        this.hotelExpense = hotelExpense;
    }

    /**
     * Returns a string representation of the object
     *
     * @return string representation of the object
     */
    @Override
    public String toString()
    {
        return "TravelEntertainmentExpense{" +
                "foodExpense=" + foodExpense +
                ", hotelExpense=" + hotelExpense +
                '}';
    }
}
