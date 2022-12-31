package week_2_project.expense;

import week_2_project.common.UniqueKeyCounter;

/**
 * Total expense
 *
 * @author Nick
 */
public class TotalExpense extends UniqueKeyCounter
{
    /**
     * total cost of food
     */
    private double foodCost;
    /**
     * total wear and tear on the four tires
     */
    private double fourTires;
    /**
     * total cost of fuel
     */
    private double fuelCost;
    /**
     * total cost of hotel
     */
    private double hotelCost;
    /**
     * unique key object
     */
    private int key;
    /**
     * name of total expense
     */
    private String name;
    /**
     * total cost of oil change
     */
    private double oilChange;
    /**
     * purchase price
     */
    private double purchasePrice;

    /**
     * Constructor
     *
     * @param name name of the expense
     */
    public TotalExpense(String name)
    {
        this.name = name;
    }


    /**
     * Add the food cost to the current total
     *
     * @param foodCost the foodCost to add
     */
    public void addFoodCost(double foodCost)
    {
        this.setFoodCost(this.getFoodCost() + foodCost);
    }

    /**
     * Add the cost of four tires to the current total
     *
     * @param fourTires the fourTires to add
     */
    public void addFourTires(double fourTires)
    {
        this.setFourTires(this.getFourTires() + fourTires);
    }

    /**
     * Add the cost of fuel to the current total
     *
     * @param fuelCost the fuelCost to add
     */
    public void addFuelCost(double fuelCost)
    {
        this.setFuelCost(this.getFuelCost() + fuelCost);
    }

    /**
     * Add the hotel cost to the current total
     *
     * @param hotelCost the hotelCost to add
     */
    public void addHotelCost(double hotelCost)
    {
        this.setHotelCost(this.getHotelCost() + hotelCost);
    }

    /**
     * Add the cost of an oil change to the current total
     *
     * @param oilChange the oilChange to add
     */
    public void addOilChange(double oilChange)
    {
        this.setOilChange(this.getOilChange() + oilChange);
    }

    /**
     * Add the purchase price to the current total
     *
     * @param purchasePrice the purchasePrice to add
     */
    public void addPurchasePrice(double purchasePrice)
    {
        this.setPurchasePrice(this.getPurchasePrice() + purchasePrice);
    }


    /**
     * Returns the food cost
     *
     * @return the food cost
     */
    public double getFoodCost()
    {
        return this.foodCost;
    }

    /**
     * sets the fuel cost
     *
     * @param foodCost the food cost
     */
    public void setFoodCost(double foodCost)
    {
        this.foodCost = foodCost;
    }

    /**
     * Returns the four tire cost
     *
     * @return the fourTires
     */
    public double getFourTires()
    {
        return this.fourTires;
    }

    /**
     * Sets the cost of four tires
     *
     * @param fourTires the fourTires to set
     */
    private void setFourTires(double fourTires)
    {
        this.fourTires = fourTires;
    }

    /**
     * Returns the fuel cost
     *
     * @return the fuelCost
     */
    public double getFuelCost()
    {
        return this.fuelCost;
    }

    /**
     * Sets the fuel cost
     *
     * @param fuelCost the fuelCost to set
     */
    private void setFuelCost(double fuelCost)
    {
        this.fuelCost = fuelCost;
    }

    /**
     * Returns the hotel cost
     *
     * @return the hotelCost
     */
    public double getHotelCost()
    {
        return this.hotelCost;
    }

    /**
     * Sets the hotel cost
     *
     * @param hotelCost the hotelCost to set
     */
    private void setHotelCost(double hotelCost)
    {
        this.hotelCost = hotelCost;
    }

    /**
     * Returns the object key
     *
     * @return the object key
     */
    @Override
    public int getKey()
    {
        return this.key;
    }

    /**
     * Sets the object key
     *
     * @param key the key for the object
     */
    @Override
    protected void setKey(int key)
    {
        this.key = key;
    }

    /**
     * Returns the name
     *
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Set the name
     *
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * The cost of an oil change
     *
     * @return the oilChange
     */
    public double getOilChange()
    {
        return this.oilChange;
    }

    /**
     * Sets the cost of an oil change
     *
     * @param oilChange the oilChange to set
     */
    private void setOilChange(double oilChange)
    {
        this.oilChange = oilChange;
    }

    /**
     * Returns the purchase price of an automobile
     *
     * @return the purchasePrice
     */
    public double getPurchasePrice()
    {
        return this.purchasePrice;
    }

    /**
     * Sets the purchase price of an automobile
     *
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    /**
     * The grand total cost of all expenses
     *
     * @return the grand total cost of all expenses
     */
    public double getGrandTotalCost()
    {
        return foodCost + fourTires + fuelCost + hotelCost + oilChange + purchasePrice;
    }

    /**
     * Returns a string representation of the object
     *
     * @return string representation of the object
     */
    @Override
    public String toString()
    {
        return "TotalExpense{" +
                "foodCost=" + foodCost +
                ", fourTires=" + fourTires +
                ", fuelCost=" + fuelCost +
                ", hotelCost=" + hotelCost +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", oilChange=" + oilChange +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
}
