public class ToUpperCaseDecorator extends DecoratorMessage{
    Message message;

    public ToUpperCaseDecorator(Message message){
        this.message = message;
    }

    @Override
    public String getMess() {
        return  message.getMessage().toUpperCase();
    }

}
