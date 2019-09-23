public class WaterBottle {

    private double volume;

    public WaterBottle(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    public double takeDrink(){
        return volume -= 10;
    }

    public double emptyBottle(){
        return volume = 0;
    }

    public double fillBottle(){
        return volume = 100;
    }
}
