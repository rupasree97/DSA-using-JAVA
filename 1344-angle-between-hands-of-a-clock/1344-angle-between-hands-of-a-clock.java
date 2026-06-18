class Solution {
    public double angleClock(int hour, int minutes) {
       
       double h = 30.0 * (hour%12)+(0.5* minutes); 
       double m = 6.0 * minutes;
        double angle =Math.abs(h - m);
    return Math.min(angle, 360.0 - angle);
        
    }
}