package com.gildedrose.processor.resolver;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.processor.resolver.matcher.ItemMatcher;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Resolver for determining the appropriate ItemProcessor for a given item based on a set of rules.
 */
public class ItemProcessorResolver {

    private final LinkedHashMap<ItemMatcher, ItemProcessor> processorMap;

    public ItemProcessorResolver(LinkedHashMap<ItemMatcher, ItemProcessor> processorMap) {
        this.processorMap = processorMap;
    }

    /**
     * Resolves the appropriate ItemProcessor for the given item based on the defined rules.
     *
     * @param item The item for which to resolve the processor
     * @return The resolved ItemProcessor
     * @throws RuntimeException if no processor is found for the given item
     */
    public ItemProcessor resolve(Item item) {
        for (Map.Entry<ItemMatcher, ItemProcessor> entry : processorMap.entrySet()) {
            if (entry.getKey().match(item)) {
                return entry.getValue();
            }
        }
        throw new RuntimeException("No processor found for item: " + item.name);
    }
}
