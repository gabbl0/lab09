package pwo.factory;

public class Thursday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w czwartek super wooooooooooo";
    }

    @Override
    public String createClosingMessage() {
        return "Czwarty dzień pracy w tym tygodniu minął";
    }
}
