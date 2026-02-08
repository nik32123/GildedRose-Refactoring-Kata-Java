package com.gildedrose.processor.resolver;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Resolver for determining the appropriate ItemProcessor for a given item based on a set of rules.
 */
public class ItemProcessorResolver {

    private final LinkedHashMap<Predicate<Item>, ItemProcessor> processorMap;

    public ItemProcessorResolver(LinkedHashMap<Predicate<Item>, ItemProcessor> processorMap) {
        this.processorMap = processorMap;
    }

    /**
     * Resolves the appropriate ItemProcessor for the given item based on the defined rules.
     *
     * @param item The item for which to resolve the processor
     * @return An Optional containing the resolved ItemProcessor, or empty if no processor matches
     */
    public Optional<ItemProcessor> resolve(Item item) {
        for (Map.Entry<Predicate<Item>, ItemProcessor> entry : processorMap.entrySet()) {
            if (entry.getKey().test(item)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }
}
