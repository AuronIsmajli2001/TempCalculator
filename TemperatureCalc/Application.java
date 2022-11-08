import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner Pyet = new Scanner(System.in);
        System.out.println("Deshironi te konvertoni temperature? - PO/JO: ");
        String Temp = Pyet.next().toUpperCase();
        if(Temp != "PO")
        while (Temp.equals("PO")) {
            Scanner sc = new Scanner(System.in);
            TempCalculator tempCalc = new TempCalculator();
            System.out.println("Shenoni temperaturen: ");
            double tempValue = sc.nextDouble();
            System.out.println("Shenoni njesine e temperatures:");
            String tempUnit = sc.next();// K

            System.out.println("Ne cilen njesine doni ta konvertoni:");
            String wantedUnit = sc.next();
            if (tempUnit.toUpperCase().charAt(0) == 'C' && wantedUnit.toUpperCase().charAt(0) == 'F') {
                double temp = tempCalc.celsiusIntoFahrenheit(tempValue);
                System.out.println(tempValue + " Celcius eshte e barabarte me : " + temp + " Fahrenheit.");
            } else if (tempUnit.toUpperCase().charAt(0) == 'F' && wantedUnit.toUpperCase().charAt(0) == 'C') {
                double temp = tempCalc.fahrenheitIntoCelsius(tempValue);
                System.out.println(tempValue + " Fahrenheit eshte e barabarte me : " + temp + " Celcius.");
            } else if (tempUnit.toUpperCase().charAt(0) == 'C' && wantedUnit.toUpperCase().charAt(0) == 'K') {
                double temp = tempCalc.celsiusIntoKelvin(tempValue);
                System.out.println(tempValue + " Celcius eshte e barabarte me : " + temp + " Kelvin.");
            } else if (tempUnit.toUpperCase().charAt(0) == 'K' && wantedUnit.toUpperCase().charAt(0) == 'C') {
                double temp = tempCalc.kelvinIntoCelsius(tempValue);
                System.out.println(tempValue + " Kelvin eshte e barabarte me : " + temp + " Celcius");
            } else if (tempUnit.toUpperCase().charAt(0) == 'F' && wantedUnit.toUpperCase().charAt(0) == 'K') {
                double temp = tempCalc.fahrenheitIntoKelvin(tempValue);
                System.out.println(tempValue + " Fahrenheit eshte e barabarte me : " + temp + " Kelvin.");
            } else if (tempUnit.toUpperCase().charAt(0) == 'K' && wantedUnit.toUpperCase().charAt(0) == 'F') {
                double temp = tempCalc.kelvinIntoFahrenheit(tempValue);
                System.out.println(tempValue + " Kelvin eshte e barabarte me : " + temp + " Fahrenheit");
            } else {
                System.out.println("Gabim ne hyrje shenoni prape");
            }




        }


    }
}
