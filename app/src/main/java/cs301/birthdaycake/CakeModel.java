package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesLit;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;

    // hewlett
    public boolean touch = false;
    public boolean isBalloon = false;
    public float sizeX = 400f;
    public float sizeY = 400f;
    public float touchY = 400f;
    public float touchX = 400f;

    public CakeModel(){
        candlesLit = true;
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
    }

    public boolean getCandlesLit()
    {
        return candlesLit;
    }

    public boolean getHasCandles()
    {
        return hasCandles;
    }

    public int getNumCandles()
    {
        return numCandles;
    }


}
