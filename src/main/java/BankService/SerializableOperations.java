package BankService;
import java.io.Serializable;
import java.util.List;

public interface SerializableOperations<T> {
    public void saveToFile(String fileName);
    public List<T> loadFromFile(String fileName);
}
