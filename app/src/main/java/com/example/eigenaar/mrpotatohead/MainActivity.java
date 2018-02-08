package com.example.eigenaar.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // To store all the name and id's of the images
    String[] images_name ={"eyes", "eyebrows", "glasses", "mustache", "ears", "nose", "mouth", "arms", "hat", "shoes"};
    ImageView[] images_id;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Store all id's only one time (in the same order!)
        images_id = new ImageView[]{
                findViewById(R.id.eyes),
                findViewById(R.id.eyebrows),
                findViewById(R.id.glasses),
                findViewById(R.id.mustache),
                findViewById(R.id.ears),
                findViewById(R.id.nose),
                findViewById(R.id.mouth),
                findViewById(R.id.arms),
                findViewById(R.id.hat),
                findViewById(R.id.shoes)};
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String clicked_item = checkbox.getText().toString();

        for (int i = 0; i < images_name.length; i++){
            if (images_name[i].equals(clicked_item)){
                if (checkbox.isChecked()) {
                    images_id[i].setVisibility(View.VISIBLE);
                } else {
                    images_id[i].setVisibility(View.INVISIBLE);
                }
            }
        }

    }
}
