package Library;
import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addItem(T t){
        this.items.add(t);
    }

    public T getLatestItem(){
        return this.items.get(items.size()-1);
    }

    public <T> int getAvailableCount(Library<T> library){
        return library.getItems().size();
    }






    public List<T> getItems(){
        return items;
    }


    @Override
    public String toString() {
        return "Library{" +
                "items=" + items +
                '}';
    }
}
