/**
 * Manages a coordinate pair
 * @author Jake Conway
 * @version 1.1
 */
public class Point
{
    public double x; //x and y can be manipulated directly within a program.
    public double y;
    /**
     * Constructs a new Point
     * @param xCoord the X coordinate
     * @param yCoord the Y coordinate
     * @return a new Point object
     */
    public Point(double xCoord, double yCoord)
    {
        x = xCoord;
        y = yCoord;
    }

    /**
     * Returns the X coordinate of the Pair
     * @return the X coordinate of the Pair
     */
    public double getX()
    {
        return x;
    }

    /**
     * Returns the Y coordinate of the Pair
     * @return the Y coordinate of the Pair
     */
    public double getY()
    {
        return y;
    }

    /**
     * Takes in an array of Points and returns the smallest X value
     * @param x an array of Points
     * @return the smallest X value
     */
    public static double getminX(Point[] x)
    {
        double min = (double) Integer.MAX_VALUE;
        for(Point p : x)
        {
            if(p.getX()<min)
            {
                min = p.getX();
            }
        }
        return min;
    }

    /**
     * Takes in an array of Points and returns the smallest Y value
     * @param Y an array of Points
     * @return the smallest X value
     */
    public static double getminY(Point[] y)
    {
        double min = (double) Integer.MAX_VALUE;
        for(Point p : y)
        {
            if(p.getY()<min)
            {
                min = p.getY();
            }
        }
        return min;
    }

    /**
     * Takes in an array of Points and returns the largest X value
     * @param x an array of Points
     * @return the largest X value
     */
    public static double getmaxX(Point[] x)
    {
        double max = (double) Integer.MIN_VALUE;
        for(Point p : x)
        {
            if(p.getX()>max)
            {
                max = p.getX();
            }
        }
        return max;
    }

    /**
     * Takes in an array of Points and returns the largest Y value
     * @param x an array of Points
     * @return the largest Y value
     */
    public static double getmaxY(Point[] y)
    {
        double max = (double) Integer.MIN_VALUE;
        for(Point p : y)
        {
            if(p.getY()>max)
            {
                max = p.getY();
            }
        }
        return max;
    }
}
