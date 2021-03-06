package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.view.View.OnTouchListener;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
   private CakeView cakeView;
   private CakeModel cakeModel;

    public CakeController(CakeView otherCakeView) {
        cakeView = otherCakeView;
        cakeModel = cakeView.getCakeModel();
    }

    public void onClick(CakeView view)
    {
        android.util.Log.d("CakeController", "clicked");
    }

    public void onClick(View v){
        Log.d("Blow out", "button clicked");
        cakeModel.candlesLit = false;
        cakeView.invalidate();
    }

    //compound button
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        Log.d("Has Candles", "onCheckedChanged");
        cakeModel.hasCandles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean userInput) {
        Log.d("seekbar", "new numCandles");
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cakeModel.sizeY = motionEvent.getY();
            cakeModel.sizeX = motionEvent.getX();
            cakeModel.isBalloon = true;
            //grab coordinates here
            cakeModel.touchY = motionEvent.getY();
            cakeModel.touchX = motionEvent.getX();
            cakeModel.touch = true;
            cakeView.invalidate();
        }
        return true;
    }

    /* @Override
    public void onClick(View view) {
        Log.d("test", "testing");

    }

     */
}
