package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Abstract base class for item processors that provides common functionality
 * for updating the sellIn and quality values of items.
 */
public abstract class AbstractItemProcessor implements ItemProcessor {

    private final static int QUALITY_MIN = 0;
    private final static int QUALITY_MAX = 50;

    @Override
    public void process(Item item) {
        updateSellsIn(item);
        updateQuantity(item);
        ensureQualityBounds(item);
    }

    /**
     * Updates the quality of the item.
     *
     * @param item The item to update
     */
    protected abstract void updateQuantity(Item item);

    /**
     * Ensures that the quality of the item is within the defined bounds and adjusts it if necessary.
     *
     * @param item The item to check and adjust if necessary
     */
    protected void ensureQualityBounds(Item item) {
        if (item.quality < getQualityMin()) {
            item.quality = getQualityMin();
        }
        if (item.quality > getQualityMax()) {
            item.quality = getQualityMax();
        }
    }

    /**
     * Updates the sellIn value of the item.
     *
     * @param item The item to update
     */
    protected void updateSellsIn(Item item) {
        item.sellIn -= 1;
    }

    /**
     * Default maximum quality value for items.
     *
     * @return The maximum quality value for items
     */
    protected int getQualityMax() {
        return QUALITY_MAX;
    }

    /**
     * Default minimum quality value for items.
     *
     * @return The minimum quality value for items
     */
    protected int getQualityMin() {
        return QUALITY_MIN;
    }
}
