public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.manufacturer = "Volvo";
        c1.model = "V70";
        c1.BHP = 350;
        c1.price = 13_00_00;

        c2.manufacturer = "Mini";
        c2.model = "Cooper S";
        c2.BHP = 600;
        c2.price = 1_000_000;

        System.out.println(c1.manufacturer + " " + c1.model + " kostar " + c1.price + "kr och har " + c1.BHP + " BHP.");
        System.out.println(c2.manufacturer + " " + c2.model + " kostar " + c2.price + "kr och har " + c2.BHP + " BHP.");
    }
}
