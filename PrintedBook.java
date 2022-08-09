package Library;

public class PrintedBook extends Book{
    public double Dimensions;
    public double Weight;

    public PrintedBook(String title, String auther, int yearOfPublication, double dimensions, double weight) {
        super(title, auther, yearOfPublication);
        this.Dimensions = dimensions;
       this.Weight = weight;
    }



    public double getDimensions() {
        return Dimensions;
    }

    public double getWeight() {
        return Weight;
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "Dimensions=" + Dimensions +
                ", Weight=" + Weight +
                '}';
    }
}




