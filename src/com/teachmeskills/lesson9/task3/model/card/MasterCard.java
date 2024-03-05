package com.teachmeskills.lesson9.task3.model.card;

import com.teachmeskills.lesson9.task3.constant.CommissionConst;
import com.teachmeskills.lesson9.task3.constant.CurrencyCode;

public class MasterCard extends Card {
    @Override
    public int getTransferLimit() {
        return 0;
    }

    public MasterCard(int cardNumber, double currentBalance, int cvv, int id) {
        super(cardNumber, currentBalance, cvv, id);
        {
            this.currencyCode = CurrencyCode.USD_CURRENCY_CODE;
            this.commission = CommissionConst.MASTER_CARD_COMMISSION;
        }
    }
}
