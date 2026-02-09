package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher that matches all items.
 */
public class AllItemsMatcher implements ItemMatcher {

    @Override
    public boolean match(Item item) {
        return true;
    }
}
