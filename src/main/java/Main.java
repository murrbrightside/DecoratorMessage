public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        DecoratorMessage decoratorMessage = new EmojiDecorator(message);

        System.out.println(decoratorMessage.getMess());

    }
}
