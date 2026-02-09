package com.gildedrose;

import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.processor.resolver.ItemProcessorResolver;

class GildedRose {

    protected Item[] items;
    protected final ItemProcessorResolver itemProcessorResolver;

    public GildedRose(Item[] items, ItemProcessorResolver itemProcessorResolver) {
        this.items = items;
        this.itemProcessorResolver = itemProcessorResolver;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemProcessor itemProcessor = itemProcessorResolver.resolve(item);
            itemProcessor.process(item);
        }
    }
}
