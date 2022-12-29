package week_2_project.test;

/**
 * Total expense test constants
 * This is very poor practice. You will learn a better way to do this in a future lesson!
 * <p>
 * Note the paths must exist, otherwise you will get a java.io.FileNotFoundException when it is run.
 *
 * @author Nick
 */
public class TotalExpenseConstants
{
    /**
     * input file name
     */
    public static final String INPUT_FILE_NAME = null;
    /**
     * output file name prefix
     * output file name is 3 components path + prefix + suffix
     */
    private static final String OUTPUT_FILE_NAME_PREFIX = null;

    /**
     * output file name suffix
     * output file name is 3 components path + prefix + suffix
     */
    private static final String OUTPUT_FILE_NAME_SUFFIX = null;


    /**
     * output file name path
     * output file name is 3 components path + prefix + suffix
     */
    private static final String OUTPUT_FILE_PATH = null;

    /**
     * Default constructor
     */
    public TotalExpenseConstants()
    {
    }

    /**
     * The input file name
     *
     * @return the input file name
     */
    public static String getInputFileName()
    {
        return INPUT_FILE_NAME;
    }

    /**
     * The output file name prefix (e.g. FileName)
     * output file name is 3 components path + prefix + suffix
     *
     * @return the output file name suffix (e.g. prefix)
     */
    public static String getOutputFileNamePrefix()
    {
        return OUTPUT_FILE_NAME_PREFIX;
    }

    /**
     * The output file name suffix (e.g. '.xlsx')
     * output file name is 3 components path + prefix + suffix
     *
     * @return the output file name suffix (e.g. '.xlsx')
     */
    public static String getOutputFileNameSuffix()
    {
        return OUTPUT_FILE_NAME_SUFFIX;
    }

    /**
     * The output file name path
     * output file name is 3 components path + prefix + suffix
     *
     * @return the output file name path
     */
    public static String getOutputFilePath()
    {
        return OUTPUT_FILE_PATH;
    }

}
