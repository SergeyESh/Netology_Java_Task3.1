public class BonusMilesService {
    public int calculate(int price) {
        int cost;
        int mile = 20; // Количество рублей для одной бонусной мили
        cost = price / mile; // Количество бонусных миль
        return cost;
    }
}