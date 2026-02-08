package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for Backstage items.
 */
public class BackstagePassesItemProcessor extends AbstractItemProcessor {

    @Override
    public void updateQuantity(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 5) {
            item.quality += 3;
        } else if (item.sellIn < 10) {
            item.quality += 2;
        } else {
            item.quality += 1;
        }
    }
}
