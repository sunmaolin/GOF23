package sml.mediatorPattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("robert");
        User john = new User("john");

        robert.sendMessage("你好");
        john.sendMessage("你也好");
    }
}
