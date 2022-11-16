import java.util.List;

public class Deck {

    private int numberOfCardsInTheBeginning = 30;
    private PokeCard[] cards;
    private int cardsInDeck;
    //public static final int NCARDS = 6;
	//private List<pokemon> cartas;

    public deck {
        cards = new PokeCard[numberOfCardsInTheBeginning];
    }

    public void reset() {
        // Programar algo que resete tudo para o estágio inicial.

        //
        cardsInDeck = numberOfCardsInTheBeginning;
    }



}
