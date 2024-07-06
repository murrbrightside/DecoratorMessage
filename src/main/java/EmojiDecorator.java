public class EmojiDecorator extends DecoratorMessage{
    Message message;

    public EmojiDecorator(Message message){
        this.message = message;

    }

    @Override
    public String getMess() {
        return  message.getMessage() + "^_^";
    }
}
