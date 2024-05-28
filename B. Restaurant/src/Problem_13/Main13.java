package Problem_13;

public class Main13 {
    public static void main(String[] args) {
        Table13 table = new Table13();
        System.out.println(table);

        table.reserve();
        System.out.println(table);

        table.occupy();
        System.out.println(table);

        table.free();
        System.out.println(table);

        table.occupy();
        System.out.println(table);

        table.reserve();
        System.out.println(table);
    }
}
