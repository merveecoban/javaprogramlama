package com.cansu.havadurumu;

import java.net.*;

public class parseResult {
    public Weather parseResult(String json) throws MalformedURLException, IOException {
        Weather weather = new Weather();
        try {
            JSONObject jsonObject = new JSONObject(json);//yeni bir tane JSON Objesi oluşturduk

            JSONArray jsonArray_weather = jsonObject.getJSONArray("weather");
            JSONObject jsonObject_weather = jsonArray_weather.getJSONObject(0);
            String result_main=jsonObject_weather.getString("main");
            String result_description = jsonObject_weather.getString("description");
            String result_icon = jsonObject_weather.getString("icon");
            JSONObject jsonObject_main = jsonObject.getJSONObject("main");
            Double temperature = jsonObject_main.getDouble("temp");

            String result_city = jsonObject.getString("name");
            Double result_temp = (temperature - 273.00);
            int result_temperature = result_temp.intValue();
            URL icon_url = new URL("http://openweathermap.org/img/w/"+result_icon+".png");



            weather.setCity(result_city);
            weather.setDescription(result_description);
            weather.setTemperature(result_temperature);
            weather.setWeather(result_main);

            return weather;
        } catch (JSONException ex) {
            System.out.println(ex.getMessage());
            return weather;
        }
    }
}
