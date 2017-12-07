package com.cansu.havadurumu;

import java.net.*;
import java.io.*;

public class WeatherConnection {
    public Weather url_Connect(String sehir){
        Weather weather = new Weather();
        String result = "";//json çekip bu stringe aktarıcaz
        try {
            URL weather_url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+sehir+"&appid=44db6a862fba0b067b1930da0d769e98");//JSONazan ise textfieldden alacağımız sehir olacak
            HttpURLConnection weather_url_con = (HttpURLConnection) weather_url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(weather_url_con.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                result += line;
            }
            bufferedReader.close();
            return weather = parseResult(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return weather;
        }
    }
}
