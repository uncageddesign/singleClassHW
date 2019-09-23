public class Calculator {

    private double valueOne;
    private double valueTwo;

    public Calculator(double valueOne, double valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public double getValueOne(){
        return valueOne;
    }

    public double getValueTwo(){
        return valueTwo;
    }

    public double addValues(){
        return valueOne + valueTwo;
    }

    public double subtractValues(){
        return valueOne - valueTwo;
    }

    public double multiplyValues(){
        return valueOne * valueTwo;
    }

    public double divideValues(){
        return valueOne / valueTwo;
    }

}
