package pwo.factory;

public class Friday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Piątkowa praca praca praca super!!!!!!";
    }

    @Override
    public String createClosingMessage() {
        return "Piąty dzień pracy w tym tygodniu minął";
    }
}
