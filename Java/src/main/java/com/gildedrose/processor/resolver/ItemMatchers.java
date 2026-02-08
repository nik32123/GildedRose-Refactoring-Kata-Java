package com.gildedrose.processor.resolver;

import com.gildedrose.Item;

/**
 * Utility class for matching items based on specific criteria.
 */
final class ItemMatchers {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String AGED_BRIE = "Aged Brie";

    private ItemMatchers() {
    }

    static boolean isSulfuras(Item item) {
        return SULFURAS.equals(item.name);
    }

    static boolean isAgedBrie(Item item) {
        return AGED_BRIE.equals(item.name);
    }
}
