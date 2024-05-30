package Problem_10;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Person person = PersonFactory.getPerson("180cm", "70cm", "red");
                person.draw(i, j);
            }
        }
    }
}
