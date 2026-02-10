package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/**
 * Matcher for Backstage Passes items.
 */
public class BackstagePassesMatcher implements ItemMatcher {

    @Override
    public boolean match(Item item) {
        return ItemNames.BACKSTAGE_PASSES.equals(item.name);
    }
}
