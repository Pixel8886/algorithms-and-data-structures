import java.util.Arrays;

public class Parking {
    private final int[] places = new int[10];

    public Parking() {
        Arrays.fill(places, -1);
    }

    public void addClient(int clientId) {
        int index = clientId % 10;

        for (int i = 0; i < places.length; i++) {
            int current = (index + i) % places.length;

            if (places[current] == -1) {
                places[current] = clientId;
                System.out.println("Клиент " + clientId
                        + " занял место " + current);
                return;
            }
        }

        System.out.println("Парковка переполнена. Клиент "
                + clientId + " не найден на парковке");
    }

    public void print() {
        for (int i = 0; i < places.length; i++) {
            System.out.println("Место " + i + ": "
                    + (places[i] == -1 ? "свободно" : places[i]));
        }
    }
}

