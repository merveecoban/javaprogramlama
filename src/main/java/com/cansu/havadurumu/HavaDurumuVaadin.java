package com.cansu.havadurumu;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.net.*;
import java.util.*;

@SpringUI
public class HavaDurumuVaadin extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout verticalLayout = new VerticalLayout();

        Weather weather = url_Connect(txt_city.getText());
        Button button = new Button("Hava Durumu Getir");
        Label label =new Label(weather.getCity());
        Label label_weather=new Label(weather.getWeather());
        Label lbl_description=new Label(weather.getDescription());
        Label lbl_temperature=new Label(String.valueOf(weather.getTemperature())+" C");




        setContent(verticalLayout);
    }
}
