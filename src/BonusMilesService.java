public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int bonusMiles;
        bonusMiles = ticketPrice / 20;
        return bonusMiles;
    }

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 2000; // Пример: цена билета
        int miles = service.calculate(ticketPrice);
        System.out.println("Бонусных миль: " + miles);
    }
}