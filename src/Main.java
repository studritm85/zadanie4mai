public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BonusMilesService service = new BonusMilesService();
        int price = 10_999;
        ;
        int miles; // должно получиться 500
        miles = service.calculate(price);
        System.out.println(miles);
    }
}


