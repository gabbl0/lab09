package pwo.factory;

public class Wednesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Środa.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w środe chce do domu!!!!!!!!!!!!!";
    }

    @Override
    public String createClosingMessage() {
        return "Trzeci dzień pracy w tym tygodniu minął";
    }
}