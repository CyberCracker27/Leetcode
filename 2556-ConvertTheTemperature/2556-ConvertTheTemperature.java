// Last updated: 21/01/2026, 22:08:46
class Solution {
    public double[] convertTemperature(double celsius) {
        double a[]=new double[2];
        a[0]=(celsius+273.15);
        a[1]=(celsius*1.80+32.00);
        return a;
    }
}