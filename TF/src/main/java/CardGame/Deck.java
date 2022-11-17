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

    public boolean isEmpty() {
        return cardsInDeck == 0;
    }

    public void shuffle() {
        int n = numberOfCardsInTheBeginning;
        Random random = new Random();

        for (int i = 0; i < numberOfCardsInTheBeginning; i++) {

            // Pega um index aleatório e passa o após o index atual
            // O argumento é um elo exclusivo (exclusive bound)
            // Será trocado o elemento aleatório com o elemento atual

            int randomValeu = i + random.nextint(n - i);
            PokeCard randomCard = cards[randomValeu];
            cards[randomValeu] = cards[i];
            cards[i] = randomCard;
        }
    }

    public PokeCard drawCard() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("Baralho vazio!")
        }
        return cards[--cardsInDeck];
    }

    public ImageIcon drawCardImage() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("Baralho vazio!");
        }
        return new ImageIcon(cards[--cardsInDeck].toString() + ".png");
    }



}
