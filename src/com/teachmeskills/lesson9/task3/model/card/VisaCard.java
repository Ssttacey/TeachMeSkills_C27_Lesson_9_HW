package com.teachmeskills.lesson9.task3.model.card;

import com.teachmeskills.lesson9.task3.constant.CommissionConst;
import com.teachmeskills.lesson9.task3.constant.CurrencyCode;

public class VisaCard extends Card {

    public VisaCard(int cardNumber, double currentBalance, int cvv, int id) {
        super(cardNumber, currentBalance, cvv, id);
        {
            this.currencyCode = CurrencyCode.BYN_CURRENCY_CODE;
            this.commission = CommissionConst.VISA_CARD_COMMISSION;
        }
    }

    @Override
    public int getTransferLimit() {
        return 0;
    }
}

