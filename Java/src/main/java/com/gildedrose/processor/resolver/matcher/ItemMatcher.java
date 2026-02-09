package com.gildedrose.processor.resolver.matcher;

import com.gildedrose.Item;

/* *
 * Interface for matching items based on specific criteria.
 */
public interface ItemMatcher {

    /**
     * Determines if the given item matches the criteria defined by this matcher.
     *
     * @param item The item to be evaluated
     * @return true if the item matches the criteria, false otherwise
     */
    boolean match(Item item);
}
