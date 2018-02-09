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
    String[] images_name ={"eyes", "eyebrows", "glasses", "mustache", "ears", "nose", "mouth",
                            "arms", "hat", "shoes"};
    ImageView[] images_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Store all id's only one time (in the same order as the names!)
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

    public void onSaveInstanceState(Bundle outState) {

        // Always call this
        super.onSaveInstanceState(outState);

        // Save image name and if it is shown or not
        for (int i = 0; i < images_name.length; i++){
            outState.putInt(images_name[i], images_id[i].getVisibility());
        }
    }

    public void onRestoreInstanceState (Bundle inState){

        // Always call this
        super.onRestoreInstanceState(inState);

        // Reload state of image
        for (int i = 0; i < images_name.length; i++){
            images_id[i].setVisibility(inState.getInt(images_name[i]));
        }
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String clicked_item = checkbox.getText().toString();

        for (int i = 0; i < images_name.length; i++){

            // Change only the state of the box that is (un)clicked
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
