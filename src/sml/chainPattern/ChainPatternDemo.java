package sml.chainPattern;

public class ChainPatternDemo {

    public static AbstractLogger getChainLoggers(){
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"this is an information");
        loggerChain.logMessage(AbstractLogger.ERROR,"this is an error");
        loggerChain.logMessage(AbstractLogger.DEBUG,"this is an debug");

    }
}
