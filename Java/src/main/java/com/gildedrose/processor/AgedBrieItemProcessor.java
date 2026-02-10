package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Aged Brie" items.
 */
public class AgedBrieItemProcessor extends AbstractItemProcessor {

    @Override
    public void updateQuantity(Item item) {
        int qualityIncrement = item.sellIn < 0 ? 2 : 1;
        item.quality += qualityIncrement;
    }
}
