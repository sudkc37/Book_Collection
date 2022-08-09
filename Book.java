package Library;

public class Book {
    private String Title;
    private String Auther;
    private int YearOfPublication;
    private int numberofPeices;

    public Book(String title, String auther, int yearOfPublication, int numberofPeices) {
        this.Title = title;
        this.Auther = auther;
        this.YearOfPublication = yearOfPublication;
        this.numberofPeices = numberofPeices;
    }

    public Book(String title, String auther, int yearOfPublication) {
    }



    public String getTitle() {
        return Title;
    }

    public String getAuther() {
        return Auther;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public int getNumberOfPeices(){return numberofPeices;}

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Auther='" + Auther + '\'' +
                ", numberOfPeices='" + numberofPeices + '\'' +
                ", YearOfPublication=" + YearOfPublication +
                '}';
    }
}
