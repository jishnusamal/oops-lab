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
                System.out.println("Forecast: " + Weather.Forecast.predictWeather(this.temp, this.humidity));
            }
        }
    }
}

class WeatherDemo {
    public static void main(String[] args) {
        Weather.Forecast.City delhi = new Weather.Forecast.City("Delhi", 35.0, 80.0);
        delhi.displayForecast();
        Weather.Forecast.City mumbai = new Weather.Forecast.City("Mumbai", 32.0, 60.0);
        mumbai.displayForecast();
        Weather.Forecast.City kolkata = new Weather.Forecast.City("Kolkata", 28.0, 70.0);
        kolkata.displayForecast();  
        Weather.Forecast.City Bengaluru = new Weather.Forecast.City("Bengaluru", 30.0, 50.0);
        Bengaluru.displayForecast();
    }
}