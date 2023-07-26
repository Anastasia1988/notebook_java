
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 800000, "Red"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 850000, "Black"));
        set.add(new Notebook("Notebook 3", 32, "linux", 1500000, "Yellow"));
        set.add(new Notebook("Notebook 4", 64, "linux", 500000, "Blue"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}