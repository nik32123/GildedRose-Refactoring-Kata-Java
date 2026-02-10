package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for "Sulfuras" items.
 */
public class SulfurasMatcher implements ItemMatcher {

    @Override
    public boolean match(Item item) {
        return ItemNames.SULFURAS.equals(item.name);
    }
}
