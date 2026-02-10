package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Default processor for items.
 */
public class DefaultItemProcessor extends AbstractItemProcessor {

    @Override
    protected void updateQuantity(Item item) {
        int qualityDecrement = item.sellIn < 0 ? 2 : 1;
        item.quality -= qualityDecrement;
    }
}
