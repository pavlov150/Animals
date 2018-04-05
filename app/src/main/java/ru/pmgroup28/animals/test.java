package ru.pmgroup28.animals;

import android.app.ActionBar;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
// create a layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
// create a textview
        TextView textView = new TextView(this);
        textView.setText("This is a TextView");
        textView.setLayoutParams(params);
// create a button
        Button button = new Button(this);
        button.setText("This is a Button");
        button.setLayoutParams(params);
// adds the textview
        layout.addView(textView);
// adds the button
        layout.addView(button);
// create a layout param for the layout
        LinearLayout.LayoutParams layoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        this.addContentView(layout, layoutParam);
    }
}