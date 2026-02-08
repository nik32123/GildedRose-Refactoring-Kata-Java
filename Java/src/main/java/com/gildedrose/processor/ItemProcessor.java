package com.gildedrose.processor;

import com.gildedrose.Item;

/**
 * Interface for processing items. Implementations of this interface will define the
 * specific rules for updating the sellIn and quality values of different item types.
 */
public interface ItemProcessor {

    /**
     * Process the given item, updating its sellIn and quality values according to the rules for that item type.
     *
     * @param item The item to be processed
     */
    void process(Item item);
}
