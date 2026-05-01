import java.util.HashMap;
import java.util.Scanner;

public class WeatherMonitoring {
    public static void main(String[] args) {
        HashMap<String, double[]> WeatherData = new HashMap<>();
        Scanner s = new Scanner(System.in);

        System.out.println(
                "Options:\n1. Add Weather Data\n2. Display weather data\n3. Update weather data\n4. Temperature exceeds 40C");
        int op = -1;

        while (op != 0) {
            System.out.print("Enter option: ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    s.nextLine();
                    System.out.print("City: ");
                    String city = s.nextLine();

                    System.out.print("Temperature: ");
                    double temp = s.nextDouble();

                    System.out.print("Humidity: ");
                    double hum = s.nextDouble();

                    WeatherData.put(city, new double[] { temp, hum });
                    break;

                case 2:
                    for (String k : WeatherData.keySet()) {
                        System.out.print(k + "\t");
                        for (double f : WeatherData.get(k)) {
                            System.out.print(f + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    s.nextLine();
                    System.out.print("Enter city to update: ");
                    city = s.nextLine();

                    System.out.print("New Temperature: ");
                    temp = s.nextDouble();

                    System.out.print("New Humidity: ");
                    hum = s.nextDouble();

                    WeatherData.put(city, new double[] { temp, hum });
                    break;

                case 4:
                    for (String k : WeatherData.keySet()) {
                        if (WeatherData.get(k)[0] > 40) {
                            System.out.print(k + "\t");
                            for (double f : WeatherData.get(k)) {
                                System.out.print(f + "\t");
                            }
                            System.out.println();
                        }
                    }
            }
        }
    }
}