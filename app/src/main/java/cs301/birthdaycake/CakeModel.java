package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesLit;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;


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
