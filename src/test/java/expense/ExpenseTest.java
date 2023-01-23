package expense;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class ExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(ExpenseTest.class.getName());
    /**
     * expense
     */
    Expense expense = null;

    /**
     * constructor
     */
    public ExpenseTest()
    {
    }

    /**
     * Create a new concrete expense class
     */
    @BeforeEach
    void setUp()
    {
        expense = new Expense(1, "name")
        {
            /**
             * sets expense
             *
             * @param expense expense
             */
            @Override
            public void setExpense(double expense)
            {
                super.setExpense(expense);
            }

            /**
             * set name
             *
             * @param name name
             */
            @Override
            public void setName(String name)
            {
                super.setName(name);
            }

            /**
             * Returns a string representation
             *
             * @return string representation
             */
            @Override
            public String toString()
            {
                return super.toString();
            }
        };
    }

    /**
     * tear down
     */
    @AfterEach
    void tearDown()
    {
    }

    /**
     * Test setting the expense
     */
    @Test
    void setExpense()
    {
        expense.setExpense(12);
        logger.debug("@test setExpense() " + expense.getExpense());
        assertEquals(12, expense.getExpense());

    }

    /**
     * Test setting the name
     */
    @Test
    void setName()
    {
        expense.setName("testName");
        logger.debug("@test setName " + expense.getName());
        assertTrue(expense.getName().contains("testName"));
    }

    /**
     * Test toString
     */
    @Test
    void testToString()
    {
        assertFalse(this.expense.toString().isEmpty());
    }
}