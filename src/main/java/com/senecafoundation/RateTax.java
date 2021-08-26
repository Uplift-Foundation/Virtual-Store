package com.senecafoundation;

import com.senecafoundation.PriceHandlers.IChangePrice;

public class RateTax implements IChangePrice {

    @Override
    public double ChangePriceToItem(ITextFormatter item) {
        item.setPrice(item.getPrice() + (item.getPrice() * .02));
        return item.getPrice();
        //2%
    }

}
