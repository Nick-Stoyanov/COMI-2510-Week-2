package week_2_project.poi;

/**
 * Poi data
 *
 * @author Nick
 */
public class PoiData
{
    /**
     * The column number
     */
    private int columnNumber;
    /**
     * The row number
     */
    private int rowNumber;
    /**
     * The object value
     */
    private Object value;

    /**
     * Constructor
     *
     * @param columnNumber column number
     * @param rowNumber    row number
     * @param cellDouble   cell as a double
     */
    public PoiData(int columnNumber, int rowNumber, double cellDouble)
    {
        this.setColumnNumber(columnNumber);
        this.setRowNumber(rowNumber);
        this.setValue(cellDouble);
    }

    /**
     * Constructor
     *
     * @param columnNumber column number
     * @param rowNumber    row number
     * @param cellString   cell as string
     */
    public PoiData(int columnNumber, int rowNumber, String cellString)
    {
        this.setColumnNumber(columnNumber);
        this.setRowNumber(rowNumber);
        this.setValue(cellString);
    }


    /**
     * Gets the column number
     *
     * @return the columnNumber
     */
    public int getColumnNumber()
    {
        return this.columnNumber;
    }

    /**
     * Sets the column number
     *
     * @param columnNumber the columnNumber to set
     */
    public void setColumnNumber(int columnNumber)
    {
        this.columnNumber = columnNumber;
    }

    /**
     * Gets the row number
     *
     * @return the rowNumber
     */
    public int getRowNumber()
    {
        return this.rowNumber;
    }

    /**
     * Sets the row number
     *
     * @param rowNumber the rowNumber
     */
    public void setRowNumber(int rowNumber)
    {
        this.rowNumber = rowNumber;
    }

    /**
     * Get value
     *
     * @return the value
     */
    public Object getValue()
    {
        return value;
    }

    /**
     * Set value
     *
     * @param value the value
     */
    protected void setValue(Object value)
    {
        this.value = value;
    }

    /**
     * Returns a string representation
     *
     * @return string representation
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(" this.getRowNumber()= ").append(this.getRowNumber());
        sb.append(" this.getColumnNumber()= ").append(this.getColumnNumber());
        sb.append(" this.getValue()= ").append(this.getValue());
        return (sb.toString());

    }
}
