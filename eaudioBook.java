package Library;

public class eaudioBook extends Ebook{
    public int getNumberOfTrack;

    public eaudioBook(String title, String auther, int yearOfPublication, int getSize, int getNumberOfTrack) {
        super(title, auther, yearOfPublication, getSize);
        this.getNumberOfTrack = getNumberOfTrack;
    }


    public int getGetNumberOfTrack() {
        return getNumberOfTrack;
    }


    @Override
    public String toString() {
        return "eaudioBook{" +
                "getNumberOfTrack=" + getNumberOfTrack +
                '}';
    }
}
