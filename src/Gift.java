import java.util.ArrayList;
import java.util.List;

public class Gift {
    private String ID;
    private String nameGift;
    private int numberOfGifts;
    private double dropChange;
    private static List listID = new ArrayList();

    public Gift(String ID, String nameGift, int numberOfGifts, double dropChange) {
        if (ID == null)
            throw new NullPointerException("Вы ничего не ввели");
        if (nameGift == null)
            throw new NullPointerException("Вы ничего не ввели");
        if (numberOfGifts == 0)
            throw new NullPointerException("Не может быть равен 0");
        if (dropChange == 0)
            throw new NullPointerException("Не может быть равен 0");
        if (checkID(ID))
            throw new NullPointerException("Уже есть такое ID");
        this.ID = ID;
        this.nameGift = nameGift;
        this.numberOfGifts = numberOfGifts;
        this.dropChange = dropChange;
        listID.add(ID);
    }
    public void changeNumberOfGifts(int numberOfGifts){
        this.numberOfGifts = numberOfGifts;
    }
    public void changeDropChange(double dropChange){
        this.dropChange = dropChange;
    }

    public String getID() {
        return ID;
    }

    public String getNameGift() {
        return nameGift;
    }

    public int getNumberOfGifts() {
        return numberOfGifts;
    }

    public double getDropChange() {
        return dropChange;
    }

    public static List getListID() {
        return listID;
    }

    @Override
    public String toString() {
        return "Подарки: \n" +
                "ID = '" + ID + "'\n" +
                "Наименование подарка - '" + nameGift + "'\n" +
                "Количество подарков - " + numberOfGifts + " шт." + '\n'  +
                "Шанс выпадания - " + dropChange * 100 + '%';
    }
    public boolean checkID(String ID){
        List list = getListID();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == ID) return true;
        }
        return false;
    }
    public static String giftСhoice(Gift... arr){
        double sum = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberOfGifts() > 0) {
                sum += arr[i].getDropChange();
            }
        }
        double random = Math.random() * sum;
        sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i].getDropChange();
            if (random <= sum) {
                result = Gift.showGifts(arr, "Разыгрывается: ");
                result += Winner.GenerateWinner() + "\n";
                result += "Поздравляем, Ваш приз - " + arr[i].getNameGift() + "!!!\n";
                arr[i].changeNumberOfGifts(arr[i].getNumberOfGifts() - 1);
                result += Gift.showGifts(arr, "Осталось в розыгрыше: ");
                break;
            }
        }
        return result;
    }
    public static String showGifts(Gift[] arr, String message){
        String result = message;
        for (int i = 0; i < arr.length; i++){
            result += arr[i].getNameGift() + ": " + arr[i].getNumberOfGifts() + " шт. ";
        }
        return result + "\n";
    }

}
