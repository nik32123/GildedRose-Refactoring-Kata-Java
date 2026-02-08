package com.gildedrose.processor.resolver;

import com.gildedrose.Item;

/**
 * Utility class for matching items based on specific criteria.
 */
final class ItemMatchers {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private ItemMatchers() {
    }

    static boolean isSulfuras(Item item) {
        return SULFURAS.equals(item.name);
    }
}
