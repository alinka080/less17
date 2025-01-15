package z1;

public class Practicum {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(); // создайте StringBuilder с началом start
        hello.append("Алина."); // добавьте подстроку "<ваше имя>"
        hello.append(" Я из города"); // добавьте подстроку ". Я из города "
        hello.append(" х"); // добавьте подстроку "<ваш город>."



        String asString = start + hello.toString();
        System.out.println(asString);
    }
}
