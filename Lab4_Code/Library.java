import java.util.ArrayList;
import java.util.List;

public class Library {  
    private final List<String> books = new ArrayList<>();

    public void add(String title) { books.add(title); }
    public int size()             { return books.size(); }
    public List<String> titles()  { return new ArrayList<>(books); }
}
