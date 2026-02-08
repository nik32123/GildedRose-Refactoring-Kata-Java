package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Conjured" items.
 */
public class ConjuredItemProcessor extends AbstractItemProcessor {

    @Override
    public void updateQuantity(Item item) {
        item.quality = item.quality - 2;
    }
}
