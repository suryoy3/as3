package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;


class InternationalNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    Card.Mutable c;

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    c = deck.getCard();
    c.show(true);
    dealer.dealCard(c);

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    return true;
  }
}