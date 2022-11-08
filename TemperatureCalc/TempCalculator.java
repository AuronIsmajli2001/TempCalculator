public class TempCalculator {
    public double celsiusIntoFahrenheit(double c){
   double fahrenheit = c * 9 / 5 + 32;
   return fahrenheit;
    }
    public double fahrenheitIntoCelsius(double f){
        double celsius = (f - 32) * 5 / 9;
        return celsius;
    }
    public double celsiusIntoKelvin(double c){
    double kelvin = c + 273.15;
    return kelvin;
    }
   public double kelvinIntoCelsius(double k){
       double celsius = k - 273.15;
       return celsius;
   }
   public double fahrenheitIntoKelvin(double f){

       double kelvin  = (f-32) * 5/9 + 273.15;
       return kelvin;

   }
   public double kelvinIntoFahrenheit(double k){

        double fahrenheit = (k-273.15) * 9/5 +32;

        return  fahrenheit;
    }
}
