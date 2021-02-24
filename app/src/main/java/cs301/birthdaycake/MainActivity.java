package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //Lab 3 Stuff
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        //Checkpoint 2 Button Setup
        Button blowoutButton = (Button)findViewById(R.id.blowoutButton);
        blowoutButton.setOnClickListener(cakeController);


        //Checkpoint 3
        //compound button setup
        CompoundButton compound = findViewById(R.id.switch2);
        compound.setOnCheckedChangeListener(cakeController);

        //Checkpoint4
        //seekbar setup
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) cakeController);

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
