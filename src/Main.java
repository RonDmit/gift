public class Main {
    public static void main(String[] args) {

        Gift gift1 = new Gift("NN10", "Сотовый телефон", 6, 0.50);
        Gift gift2 = new Gift("NN11", "Ноутбук", 2, 0.35);
        Gift gift3 = new Gift("NN12", "Автомобиль", 1, 0.15);

        String result = "Супер розыгрыш от Дворника Василия!!!\n-------------------------------\n";
        result += Gift.giftСhoice(gift1, gift2, gift3) + "\n";
        result += Gift.giftСhoice(gift1, gift2, gift3) + "\n";
        result += Gift.giftСhoice(gift1, gift2, gift3);
        System.out.println(result);
        SaveFile.save("base.txt", result);
    }

}