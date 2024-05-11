
interface Pizza {
    String getDescription();
    double getPrice();
}

class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic pizza (sos pomidorowy, ser)";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}

class Decorator implements Pizza {
    protected Pizza pizza;

    Decorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

class ExtraCheese extends Decorator {
    ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", dodatkowy ser";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}

class WithoutOlives extends Decorator {
    WithoutOlives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription().replace(", oliwki", "");
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}

public class PizzaDecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheese(pizza); // dodanie dodatkowego sera
        pizza = new WithoutOlives(pizza); // pominięcie oliwek

        System.out.println(pizza.getDescription());
        System.out.println("Cena: " + pizza.getPrice() + " PLN");
    }
}
