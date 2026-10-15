public class Main {
    public static void main(String[] args) {
        int[] clients = {12, 25, 37, 42, 55, 67};

        Parking parking = new Parking();
        Wardrobe wardrobe = new Wardrobe();
        LockerRoom lockerRoom = new LockerRoom();

        System.out.println("=== ПАРКОВКА ===");
        for (int client : clients) {
            parking.addClient(client);
        }
        parking.print();

        System.out.println("\n=== ГАРДЕРОБ ===");
        for (int client : clients) {
            wardrobe.addClient(client);
        }
        wardrobe.print();

        System.out.println("\n=== ШКАФЧИКИ ===");
        for (int client : clients) {
            lockerRoom.addClient(client);
        }
        lockerRoom.print();
    }
}
