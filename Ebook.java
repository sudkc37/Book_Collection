package Library;

public class Ebook extends Book{
    public int getSize;

    public Ebook(String title, String auther, int yearOfPublication, int getSize) {
        super(title, auther, yearOfPublication);
        this.getSize = getSize;
    }


    public int getGetSize() {
        return getSize;
    }




    @Override
    public String toString() {
        return "Ebook{" +
                "getSize=" + getSize +
                '}';
    }
}
