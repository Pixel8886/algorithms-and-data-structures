import java.util.Arrays;

public class LockerRoom {
    private final int[] lockers = new int[10];
    private final int step = 3;

    public LockerRoom() {
        Arrays.fill(lockers, -1);
    }

    public void addClient(int clientId) {
        int index = clientId % 10;

        if (lockers[index] == -1) {
            lockers[index] = clientId;
            System.out.println("Клиент " + clientId
                    + " занял шкафчик " + index);
            return;
        }

        for (int i = 1; i < lockers.length; i++) {
            int current = (clientId + i * step) % lockers.length;

            if (lockers[current] == -1) {
                lockers[current] = clientId;
                System.out.println("Клиент " + clientId
                        + " занял шкафчик " + current);
                return;
            }
        }

        System.out.println("Нет свободных шкафчиков для клиента "
                + clientId);
    }

    public void print() {
        for (int i = 0; i < lockers.length; i++) {
            System.out.println("Шкафчик " + i + ": "
                    + (lockers[i] == -1 ? "свободен" : lockers[i]));
        }
    }
}
