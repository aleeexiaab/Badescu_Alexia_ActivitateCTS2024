package Problem_8;

public class Main8 {
    public static void main(String[] args) {
        MenuComponent8 starterMenu = new Menu8("Starters");
        MenuComponent8 drinksMenu = new Menu8("Drinks");
        MenuComponent8 dessertMenu = new Menu8("Desserts");

        MenuComponent8 softDrinksMenu = new Menu8("Soft Drinks");
        MenuComponent8 coffeeMenu = new Menu8("Coffee");

        MenuComponent8 water = new MenuItem8("Water");
        MenuComponent8 mineralWater = new MenuItem8("Mineral Water");
        MenuComponent8 cola = new MenuItem8("Cola");

        MenuComponent8 espresso = new MenuItem8("Espresso");
        MenuComponent8 latte = new MenuItem8("Latte");

        softDrinksMenu.add(water);
        softDrinksMenu.add(mineralWater);
        softDrinksMenu.add(cola);

        coffeeMenu.add(espresso);
        coffeeMenu.add(latte);

        drinksMenu.add(softDrinksMenu);
        drinksMenu.add(coffeeMenu);

        MenuComponent8 mainMenu = new Menu8("Main Menu");
        mainMenu.add(starterMenu);
        mainMenu.add(drinksMenu);
        mainMenu.add(dessertMenu);

        mainMenu.print();
    }
}
