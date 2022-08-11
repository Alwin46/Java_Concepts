import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j
{
    static Logger logger=Logger.getLogger(log4j.class);

    public static void main(String[] args)
    {
        PropertyConfigurator.configure("log4j.properties");
        logger.debug("This is debug logger");
        logger.info("This is info logger");
        logger.warn("This is warning logger");
        logger.error("This is error logger");
        logger.fatal("This is fatal logger");
    }
}
