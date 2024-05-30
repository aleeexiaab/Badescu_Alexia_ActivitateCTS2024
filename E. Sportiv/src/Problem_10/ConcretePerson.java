package Problem_10;

public class ConcretePerson implements Person{
    private String height;
    private String width;
    private String shirtColor;

    public ConcretePerson(String height, String width, String shirtColor) {
        this.height = height;
        this.width = width;
        this.shirtColor = shirtColor;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing person at (" + x + ", " + y + ") with dimensions [" + height + " x " + width + "] wearing " + shirtColor + " shirt.");
    }
}
