public class Game {
    private int currentPlayer;
    private String[] playerIds;

    private PokeDeck deck;
    private ArrayList<ArrayList<PokeCard>> playerHand;
    private ArrayList<PokeCard> stockPile;

    private PokeCard.Color validColor;
    private PokeCard.Valeu validValeu;

    public Game(String[] player_ids) {
        deck = new Deck();
        deck.shuffle();
        stockPile = new ArrayList<PokeCard>();

        playerIds = player_ids;
        currentPlayer = 0;

        playerHand = new ArrayList<ArrayList<PokeCard>>();

        for (int i = 0; i < 10; i++) {
            ArrayList<PokeCard> hand = new ArrayList<PokeCard>(Arrays.asList(deck.drawCard())):
        }
        playerHand.add(hand);
    }

    public void start(Game game) {
        PokeCard card = deck.drawCard();

    }
}


/* Para envio de mensagens
JLabel message = new JLabel(playerIds[currentPlayer] + " bla bla bla!");
message.setFont(new Font("Arial", Font.BOLD, 48);
JOptionPane.showMessageDialog(null, message);
 */