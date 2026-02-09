package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Backstage Passes items.
 */
public class BackstagePassesMatcher implements ItemMatcher {

    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    public boolean match(Item item) {
        return BACKSTAGE.equals(item.name);
    }
}
