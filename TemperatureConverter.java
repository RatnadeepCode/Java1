public class TemperatureConverter {
    double celcius;
    void convert(){
        double fahrenhiet = (celcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenhiet = " +fahrenhiet);
    }
    public static void main(String args[]){
        TemperatureConverter obj = new TemperatureConverter();
        obj.celcius = 37;
        obj.convert();
    }
}
