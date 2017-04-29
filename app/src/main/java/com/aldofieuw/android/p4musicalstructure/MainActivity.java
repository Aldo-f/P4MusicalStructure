package com.aldofieuw.android.p4musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);



        //// Find the View that shows search
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(MainActivity.this, "You clicked on a Search", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        //// Find the View that shows the likes
        TextView likes = (TextView) findViewById(R.id.likes);

        // Set a click listener on that View
        likes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the likes is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(MainActivity.this, "You clicked on a Likes", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link LikesActivity}
                Intent likesIntent = new Intent(MainActivity.this, LikesActivity.class);

                // Start the new activity
                startActivity(likesIntent);
            }
        });

        //// Find the View that shows the settings
        TextView settings = (TextView) findViewById(R.id.settings);

        // Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the settings is clicked on.
            @Override
            public void onClick(View view) {

                // show what happens
                Toast.makeText(MainActivity.this, "You clicked on a settings", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link SettingsActivity}
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);

                // Start the new activity
                startActivity(settingsIntent);
            }
        });

        // TODO: make this a single activity that always shows the post-user data as a new Activity
        //// Find the View that shows the user
        ImageView user = (ImageView) findViewById(R.id.user);

        // Set a click listener on that View
        user.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the user is clicked on.
            @Override
            public void onClick(View view) {
                // show what happens
                Toast.makeText(MainActivity.this, "You clicked on a user", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link UserActivity}
                Intent userIntent = new Intent(MainActivity.this, UserActivity.class);

                // Start the new activity
                startActivity(userIntent);
            }
        });

        //// Find the View that shows the track
        ImageView playTrack = (ImageView) findViewById(R.id.playTrack);

        // Set a click listener on that View
        playTrack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the user is clicked on.
            @Override
            public void onClick(View view) {
                // show what happens
                Toast.makeText(MainActivity.this, "You clicked on a track", Toast.LENGTH_LONG).show();

                // Create a new intent to open the {@link UserActivity}
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);

                // Start the new activity
                startActivity(playIntent);
            }
        });
    }
}
