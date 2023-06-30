public class Winner {
    private String name;
    private String surname;
    private String lastname;
    private String town;
    private int year;

    public Winner(String name, String surname, String lastname, String town, int year) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.town = town;
        this.year = year;
    }

    private static String [] names = {"Александр", "Владимир", "Николай", "Ярослав", "Антон", "Вадим", "Олег",
                    "Дмитрий", "Владислав", "Игорь", "Федор", "Максим", "Матвей", "Иван", "Роман", "Кирилл", "Михаил",
                    "Альберт", "Артур", "Богдан", "Виктор", "Виталий", "Всеволод", "Георгий", "Клим"};
    private static String [] surnames = {"Иванов", "Петров", "Сидоров", "Конев", "Вяткин", "Абрамов", "Зуев",
                    "Павленков", "Нераев", "Максименко", "Логинов", "Шилов", "Котов", "Егоров", "Титов", "Орлов",
                    "Макаров", "Зайцев", "Соловьев", "Борисов", "Яковлев", "Романов", "Воробьев", "Сергеев", "Фролов",
                    "Королев", "Гусев", "Белов", "Жуков", "Комаров", "Беляев"};
    private static String [] lastnames = {"Александрович", "Владимирович", "Николаевич", "Ярославович", "Богданович",
    "Вадимович", "Викторович", "Владиславович", "Гаврилович", "Даниилович", "Денисович", "Игоревич", "Максимович",
    "Павлович", "Петрович", "Прохорович", "Степанович", "Акимович", "Викентиевич", "Глебович", "Романович", "Семёнович",
    "Тарасович", "Фадеевич"};
    private static String [] towns = {"Екатеринбург", "Казань", "Нижний Новгород", "Челябинск", "Самара", "Омск",
    "Ростов-на-Дону", "Уфа", "Красноярск", "Воронеж", "Пермь", "Волгоград", "Новосибирск", "Москва", "Санкт-Петербург"};

    public static Winner GenerateWinner(){
        String name = names[(int)(Math.random() * (names.length - 1))];
        String surname = surnames[(int)(Math.random() * (surnames.length - 1))];
        String lastname = lastnames[(int)(Math.random() * (lastnames.length - 1))];
        String town = towns[(int)(Math.random() * (towns.length - 1))];
        int year = 1970 + (int)(Math.random() * 35);
        return new Winner(name, surname, lastname, town, year);
    }

    @Override
    public String toString() {
        return "Победитель: " +  surname + ' ' + name  + ' ' + lastname + ". Из города - " +
                town + ". " + year + " года рождения.";
    }
}