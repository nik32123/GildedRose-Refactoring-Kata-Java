package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Processor for "Sulfuras, Hand of Ragnaros" items.
 */
public class SulfurasItemProcessor implements ItemProcessor {

    @Override
    public void process(Item item) {
        // Sulfuras, being a legendary item, never has to be sold or decreases in Quality
    }
}
