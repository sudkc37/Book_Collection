package Library;

public class DramaBook {
    private int Time;
    private String Place;

    public DramaBook(int time, String place) {
        this.Time = time;
        this.Place = place;
    }

    public int getTime() {
        return Time;
    }

    public String getPlace() {
        return Place;
    }

    @Override
    public String toString() {
        return "DramaBook{" +
                "Time=" + Time +
                ", Place='" + Place + '\'' +
                '}';
    }
}
