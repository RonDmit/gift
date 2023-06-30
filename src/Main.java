public class Main {
    public static void main(String[] args) {

        Gift gift1 = new Gift("NN10", "Сотовый телефон", 6, 0.45);
        Gift gift2 = new Gift("NN11", "Ноутбук", 2, 0.35);
        Gift gift3 = new Gift("NN12", "Автомобиль", 1, 0.15);
        System.out.println(gift1.toString());
        gift1.changeNumberOfGifts(8);
        gift1.changeDropChange(0.50);
        System.out.println(gift1.toString());
        Winner winner1 = Winner.GenerateWinner();
        System.out.println(winner1);

    }
}