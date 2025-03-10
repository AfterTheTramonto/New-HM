import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //#1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = String.join(" ", firstName, middleName, lastName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //#2
        System.out.println(fullName.toUpperCase());
        //#3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);

    }
}