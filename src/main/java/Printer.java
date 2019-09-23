public class Printer {

    private double paper;
    private double tonerVolume;

    public Printer(){
        this.paper = 100;
        this.tonerVolume = 500;
    }

    public double getPaper() {
        return paper;
    }

    public double getTonerVolume(){
        return tonerVolume;
    }

    public double print(double pages, double copies){
        double printing = pages * copies;

        if(paper > printing && tonerVolume > printing){
            paper -= printing;
        }
        return getPaper();
    }

}
