package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for "Sulfuras" items.
 */
public class SulfurasMatcher implements ItemMatcher {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Override
    public boolean match(Item item) {
        return SULFURAS.equals(item.name);
    }
}
