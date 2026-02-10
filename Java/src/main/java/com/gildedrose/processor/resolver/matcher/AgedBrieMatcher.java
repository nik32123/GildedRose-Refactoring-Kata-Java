package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Aged Brie items.
 */
public class AgedBrieMatcher implements ItemMatcher {

    @Override
    public boolean match(Item item) {
        return ItemNames.AGED_BRIE.equals(item.name);
    }
}
