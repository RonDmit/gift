public class Main {
    public static void main(String[] args) {

        Gift gift1 = new Gift("NN10", "Сотовый телефон", 6, 0.5);
        Gift gift2 = new Gift("NN11", "Ноутбук", 2, 0.35);
        Gift gift3 = new Gift("NN12", "Автомобиль", 1, 0.15);
        System.out.println(gift1.toString());
    }
}