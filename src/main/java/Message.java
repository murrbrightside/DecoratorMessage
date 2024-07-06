import java.util.Scanner;

public class Message {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public Message(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите что-нибудь: ");
        // Чтение строки ввода пользователя
        String input = scanner.nextLine();
        setMessage(input);

    }
}
