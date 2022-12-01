package pwo.factory;

public class Saturday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Sobotnia praca nie idzie";
    }

    @Override
    public String createClosingMessage() {
        return "Szósty dzień pracy w tym tygodniu minął";
    }
}
