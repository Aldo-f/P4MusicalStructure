package com.aldofieuw.android.p4musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);


        //// Find the View that shows the Mood1
        LinearLayout mood1 = (LinearLayout) findViewById(R.id.mood1);

        // Set a click listener on that View
        mood1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the settings is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(SearchActivity.this, "You clicked on the first playlist in the first HorizontalScrollView", Toast.LENGTH_LONG).show();

            }
        });

        //// Find the View that shows the Mood2
        LinearLayout mood2 = (LinearLayout) findViewById(R.id.mood2);

        // Set a click listener on that View
        mood2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the settings is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(SearchActivity.this, "You clicked on a mood in the second HorrizontalScrollView", Toast.LENGTH_LONG).show();

            }
        });

        //// Find the View that shows the SearchGenres
        TextView searchGenres = (TextView) findViewById(R.id.searchGenres);

        // Set a click listener on that View
        searchGenres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the settings is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(SearchActivity.this, "You clicked on a 'search all genres'", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link SettingsActivity}
                Intent settingsIntent = new Intent(SearchActivity.this, SearchGenresActivity.class);

                // Start the new activity
                startActivity(settingsIntent);
            }
        });
    }
}
