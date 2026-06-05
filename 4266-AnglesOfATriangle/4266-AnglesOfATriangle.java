// Last updated: 6/5/2026, 12:07:42 PM
class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b<=c || a+c<=b || b+c<=a){
            return new double[0];
        }
        double A=Math.acos((b*b+c*c-a*a)/(2*b*c))*180.0/Math.PI;
        double B=Math.acos((a*a+c*c-b*b)/(2*a*c))*180.0/Math.PI;
        double[] s=new double[]{A,B,180.0-A-B};
        Arrays.sort(s);
        return s;
    }
}