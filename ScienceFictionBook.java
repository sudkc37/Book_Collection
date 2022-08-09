package Library;

public class ScienceFictionBook extends PrintedBook{
    private String Subject;


    public ScienceFictionBook(String title, String auther, int yearOfPublication, int getSize,double weight, String subject) {
        super(title, auther, yearOfPublication, getSize,weight);
        this.Subject = subject;
    }

    public String getSubject() {
        return Subject;
    }

    @Override
    public String toString() {
        return "ScienceFictionBook{" +
                "Subject='" + Subject + '\'' +
                '}';
    }
}
