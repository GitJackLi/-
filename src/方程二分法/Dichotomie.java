package 方程二分法;
public class Dichotomie {
 
    public static void main(String[] args)
    {
        double a = 1, b = 1.5, delta = 0.005;
        double x1 = a;
        double x2 = b;
        while(x2 - x1 > delta)
        {
            double diff = x2 - x1;
            if (isArea(x1, x2))
                x1 = x1 + diff / 2;
            else
            {
                x2 = x1;
                x1 = x1 - diff;
            }
        } 
        System.out.println("结果:" + x1);
    }
     
    private static boolean isArea(double x1, double x2)
    {
        boolean result = true;
        if(f(x1) * f(x2) > 0)
            result = false;
        else if(f(x1) * f(x2) < 0)
            result = true;
        return result;
    }
     
    private static double f(double x)
    {
        return x*x*x - x -1;
    }
}