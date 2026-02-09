package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Aged Brie items.
 */
public class AgedBrieMatcher implements ItemMatcher {

    private static final String AGED_BRIE = "Aged Brie";

    @Override
    public boolean match(Item item) {
        return AGED_BRIE.equals(item.name);
    }
}
