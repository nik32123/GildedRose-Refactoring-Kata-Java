package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Sulfuras, Hand of Ragnaros" items.
 */
public class SulfurasItemProcessor extends AbstractItemProcessor {

    private final static int QUALITY_MAX = 80;

    @Override
    protected void updateQuantity(Item item) {
        // Sulfuras, being a legendary item, never has to be sold or decreases in Quality
    }

    @Override
    protected void updateSellsIn(Item item) {
        // Sulfuras, being a legendary item, never has to be sold or decreases in Quality
    }

    @Override
    protected int getQualityMax() {
        return QUALITY_MAX;
    }
}
