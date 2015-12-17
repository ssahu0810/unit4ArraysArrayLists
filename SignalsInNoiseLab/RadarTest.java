import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests making the radar object and having it search for the given object location
     */
    @Test
    public void testRadar()
    {
        Radar radar_test = new Radar(50,50,20,30);
        radar_test.setNoiseFraction(0.1);
        int highestNum = 0;
        int highestRow = 0;
        int highestCol = 0;
        int currentNum = 0;
        
        //Scans 100 times
        for (int num = 0; num<100;num++)
        {
            radar_test.scan();
        }
        
        //Goes through and searches for most frequently scanned cell
        for (int i = 0; i<50;i++)
        {
            for (int j = 0;j<50;j++)
            {
                currentNum = radar_test.getAccumulatedDetection(i,j);
                if (currentNum>highestNum)
                {
                    highestNum = currentNum;
                    highestRow = i;
                    highestCol = j;
                }
            }
        }
        
        //Checks predicted vs actual
        assertEquals(20,highestRow);
        assertEquals(30,highestCol);
    }
    
    /**
     * Tests making the radar object and having it search for the given object location
     * 3061!
     */
    @Test
    public void testRadar2()
    {
        Radar radar_test = new Radar(100,100,30,61);
        radar_test.setNoiseFraction(0.1);
        int highestNum = 0;
        int highestRow = 0;
        int highestCol = 0;
        int currentNum = 0;
        
        //Scans 100 times
        for (int num = 0; num<100;num++)
        {
            radar_test.scan();
        }
        
        //Goes through and searches for most frequently scanned cell
        for (int i = 0; i<100;i++)
        {
            for (int j = 0;j<100;j++)
            {
                currentNum = radar_test.getAccumulatedDetection(i,j);
                if (currentNum>highestNum)
                {
                    highestNum = currentNum;
                    highestRow = i;
                    highestCol = j;
                }
            }
        }
        
        //Checks predicted vs actual
        assertEquals(30,highestRow);
        assertEquals(61,highestCol);
    }
}
