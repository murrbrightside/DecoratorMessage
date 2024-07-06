public class DecoratorAddQuotes extends DecoratorMessage{
    Message message;

    public DecoratorAddQuotes(Message message){
        this.message = message;
    }

    @Override
    public String getMess() {
        return "\"" + message.getMessage() + "\"";
    }
}
