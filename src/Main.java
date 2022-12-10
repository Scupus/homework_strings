import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String completeName = lastName + firstName + middleName;
        System.out.println(completeName);
        System.out.println("=============================  Задание 2 ==================================");

        String completeName2 = completeName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + completeName2);
    }
}