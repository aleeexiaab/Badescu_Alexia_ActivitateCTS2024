package Problem_13;

public class Main {
    public static void main(String[] args) {
        Seat seat = new Seat();

        seat.reserve();
        seat.occupy();
        seat.free();
        seat.occupy();
        seat.free();
        seat.reserve();
        seat.reserve();
        seat.free();
        seat.occupy();
    }
}
