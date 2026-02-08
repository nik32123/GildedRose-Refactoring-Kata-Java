package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Aged Brie" items.
 */
public class AgedBrieItemProcessor implements ItemProcessor {

    private final static int MAX_QUALITY = 50;

    @Override
    public void process(Item item) {
        item.sellIn = item.sellIn - 1;

        increaseQualityIfPossible(item);
        if (item.sellIn < 0) {
            increaseQualityIfPossible(item);
        }
    }

    private void increaseQualityIfPossible(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality = item.quality + 1;
        }
    }
}
