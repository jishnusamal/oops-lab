package Lab_5;

class Weather {
    static class Forecast {
        static String predictWeather(double temp, double humidity) {
            if (temp > 30 && humidity > 70) {
                return "Sunny";
            } else if (temp > 30 && humidity < 70) {
                return "Rainy";
            } else {
                return "Cloudy";
            }
        }
    }
    static class City {
            String cityName;
            double temp;
            double humidity;

        City(String cityName, double temp, double humidity) {
            this.cityName = cityName;
            this.temp = temp;
            this.humidity = humidity;
        }

        void displayForecast() {
            System.out.println("City: " + this.cityName);
            System.out.println("Temperature: " + this.temp);
            System.out.println("Humidity: " + this.humidity);
            System.out.println("Forecast: " + Weather.Forecast.predictWeather(this.temp, this.humidity)+"\n");
        }
    }
}

class WeatherDemo {
    public static void main(String[] args) {
        Weather.City delhi = new Weather.City("Delhi", 35.0, 80.0);
        delhi.displayForecast();
        Weather.City Bengaluru = new Weather.City("Bengaluru", 30.0, 50.0);
        Bengaluru.displayForecast();
    }
}