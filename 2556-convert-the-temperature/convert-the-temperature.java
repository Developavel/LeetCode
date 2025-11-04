class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = {celsius + 273.15, celsius * 1.8 + 32};
        return ans;
    }
}