package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Conjured items.
 */
public class ConjuredMatcher implements ItemMatcher {

    @Override
    public boolean match(Item item) {
        return ItemNames.CONJURED.equals(item.name);
    }
}
