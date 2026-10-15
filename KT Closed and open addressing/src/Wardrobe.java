import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private final List<Integer>[] hooks = new ArrayList[10];

    public Wardrobe() {
        for (int i = 0; i < hooks.length; i++) {
            hooks[i] = new ArrayList<>();
        }
    }

    public void addClient(int clientId) {
        int index = clientId % 10;

        hooks[index].add(clientId);

        System.out.println("Клиент " + clientId
                + " добавлен на крючок " + index);
    }

    public void print() {
        for (int i = 0; i < hooks.length; i++) {
            System.out.println("Крючок " + i + ": "
                    + (hooks[i].isEmpty() ? "пусто" : hooks[i]));
        }
    }
}
