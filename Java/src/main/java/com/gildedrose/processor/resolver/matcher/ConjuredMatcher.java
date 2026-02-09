package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Conjured items.
 */
public class ConjuredMatcher implements ItemMatcher {

    private static final String CONJURED = "Conjured Mana Cake";

    @Override
    public boolean match(Item item) {
        return CONJURED.equals(item.name);
    }
}
