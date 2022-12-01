package pwo.factory;

public class Sunday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Dziś nie pracuję";
    }

    @Override
    public String createClosingMessage() {
        return "Siódmy dzień niepracy w tym tygodniu minął";
    }
}
