/**
 * Solves a function over a given interval
 * @author Jake Conway
 * @version 1.5
 */
public class Solver
{
    /**
     * Graphs a linear equation
     * @param m the m value in y=mx+b
     * @param b the b value in y=mx+b
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphLinear(int m, int b, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, m * i + b);
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a quadratic equation
     * @param a the a value in y=ax^2 + bx + c
     * @param b the b value in y=ax^2 + bx + c
     * @param c the c value in y=ax^2 + bx + c
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphQuadratic(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a*Math.pow(i,2) + b*i + c);
            counter++;
        }
        return ret;
    }

    /**
     * Graphs an exponential  equation
     * @param b the value b in y=b^x
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphExponential(int b, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, Math.pow(b,i));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a quadratic equation
     * @param a the a value in y=ax^b
     * @param b the b value in y=ax^b
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphPower(int a, int b, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a*Math.pow(i,b));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a sine equation
     * @param a the a value in y=asin(bx + c)
     * @param b the b value in y=asin(bx + c)
     * @param c the c value in y=asin(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphSin(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * Math.sin((b * i) + c));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a cosine equation
     * @param a the a value in y=acos(bx + c)
     * @param b the b value in y=acos(bx + c)
     * @param c the c value in y=acos(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphCos(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * Math.cos((b * i) + c));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a tangent equation
     * @param a the a value in y=atan(bx + c)
     * @param b the b value in y=atan(bx + c)
     * @param c the c value in y=atan(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphTan(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * Math.tan((b * i) + c));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a cosecant equation
     * @param a the a value in y=acsc(bx + c)
     * @param b the b value in y=acsc(bx + c)
     * @param c the c value in y=acsc(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphCsc(int a, int b, int c, int xMin, int xMax, double xInc)
    {
                int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * (1.0/Math.sin((b * i) + c)));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a secant equation
     * @param a the a value in y=asec(bx + c)
     * @param b the b value in y=asec(bx + c)
     * @param c the c value in y=asec(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphSec(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int)((xMax-xMin)/xInc);
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * (1.0/Math.cos((b * i) + c)));
            counter++;
        }
        return ret;
    }

    /**
     * Graphs a cotangent equation
     * @param a the a value in y=acot(bx + c)
     * @param b the b value in y=acot(bx + c)
     * @param c the c value in y=acot(bx + c)
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphCot(int a, int b, int c, int xMin, int xMax, double xInc)
    {
        int size = (int) ((xMax-xMin)/xInc);
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, a * (1.0/Math.tan((b * i) + c)));
            counter++;
        }
        return ret;
    }
    
    /**
     * Graphs a cosine equation
     * @param a the a value in y=alogbase(bx+c) + d
     * @param base the base value in y=alogbase(bx+c) + d
     * @param b the b value in y=alogbase(bx+c) + d
     * @param c the c value in y=alogbase(bx+c) + d
     * @param d the d value in y=alogbase(bx+c) + d
     * @param xMin the minimum x value (inclusive)
     * @param xMax the maximum x value (inclusive)
     * @param xInc the amount that the x value increases by
     */
    public static Point[] graphLog(int a, int base, int b, int c, int d, int xMin, int xMax, double xInc)
    {
        int size = (int) (((Math.abs(xMax-xMin))/xInc)+(1/xInc));
        Point[] ret = new Point[size+1];
        int counter = 0;
        for(double i = xMin; i <= xMax; i+=xInc)
        {
            ret[counter] = new Point(i, (a * Math.log((b * i) + c))/Math.log(base) + d);
            counter++;
        }
        return ret;
    }
}
