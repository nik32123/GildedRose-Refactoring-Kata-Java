package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Conjured" items.
 */
public class ConjuredItemProcessor implements ItemProcessor {

    private final static int MIN_QUALITY = 0;

    @Override
    public void process(Item item) {
        item.sellIn = item.sellIn - 1;
        item.quality = item.quality - 2;

        if (item.quality < MIN_QUALITY) {
            item.quality = MIN_QUALITY;
        }
    }
}
