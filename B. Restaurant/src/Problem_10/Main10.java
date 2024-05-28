package Problem_10;

public class Main10 {
    public static void main(String[] args) {
        Client10 client1 = ClientFactory10.getClient("John Doe", "123456789", "john@example.com");
        Client10 client2 = ClientFactory10.getClient("Jane Doe", "987654321", "jane@example.com");
        Client10 client3 = ClientFactory10.getClient("John Doe", "123456789", "john@example.com"); // Should reuse the existing client

        Reservation10 reservation1 = new Reservation10(client1, 1, 4, "18:00");
        Reservation10 reservation2 = new Reservation10(client2, 2, 2, "19:00");
        Reservation10 reservation3 = new Reservation10(client3, 3, 4, "20:00");

        System.out.println(reservation1);
        System.out.println(reservation2);
        System.out.println(reservation3);

        System.out.println(client1 == client3);
    }
}
