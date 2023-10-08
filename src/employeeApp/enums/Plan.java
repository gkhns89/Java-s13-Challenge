package employeeApp.enums;

public enum Plan {

    BASIC("Basic Insurance", 1000),
    STANDARD("Standard Insurance", 2000),
    VIP ("VIP Insurance", 5000);
    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}


