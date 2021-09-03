package com.abrahamgudratli.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        ListView drinksList = findViewById(R.id.list_view_drinks);

        Dish[] drinks = {
                new Dish("Mojito", "A minty mojito is the perfect drink for a hot summer's afternoon", 149),
                new Dish("Espresso martini", "For coffee lovers everywhere, the espresso martini is the caffeinated cocktail of choice", 199),
                new Dish("Rum punch", "Alcohol lovers, the Rum Punch martini is the best choice", 119),
                new Dish("Wine", "It is time to spend some good time", 129),
                new Dish("Cosmopolitan", "It is the perfect drink for a hot summer", 159),
                new Dish("Coca Cola", "Nice drink", 169),
                new Dish("Fanta", "It is time to spend some good time", 149),
                new Dish("Pepsi", "It is the perfect drink for a hot summer", 139)

        };

        ArrayAdapter<Dish> dishArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, drinks);
        drinksList.setAdapter(dishArrayAdapter);



    }
}