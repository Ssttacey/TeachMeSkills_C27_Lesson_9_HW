package com.teachmeskills.lesson9.task3.fabric;

import com.teachmeskills.lesson9.task3.model.card.Belcard;
import com.teachmeskills.lesson9.task3.model.card.Card;
import com.teachmeskills.lesson9.task3.model.card.MasterCard;
import com.teachmeskills.lesson9.task3.model.card.VisaCard;

/**
 * information about cards. creating an object and an array of cards
 */

public class CardFabric {
    public static Card[] createCards() {
        Card card1 = new Belcard(23435664, 56.9, 345, 1 );
        Card card2 = new Belcard(29877656, 198.99, 123, 2 );
        Card card3 = new MasterCard(98765654, 567.0, 789, 3);
        Card card4 = new VisaCard(234516786, 438.6, 386, 4);

        Card[] cards = {card1, card2, card3, card4};
        return cards;
    }
}
