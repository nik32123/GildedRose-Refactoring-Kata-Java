package com.gildedrose.processor.resolver;

import com.gildedrose.Item;
import com.gildedrose.processor.AgedBrieItemProcessor;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.processor.SulfurasItemProcessor;

import java.util.LinkedHashMap;
import java.util.function.Predicate;

/**
 * Factory class for creating an ItemProcessorResolver with the appropriate rules for processing items.
 */
public class ItemProcessorResolverFactory {

    private ItemProcessorResolverFactory() {
    }

    /**
     * Creates an ItemProcessorResolver with the appropriate rules for processing items.
     *
     * @return An instance of ItemProcessorResolver
     */
    public static ItemProcessorResolver create() {

        ItemProcessor sulfuras = new SulfurasItemProcessor();
        ItemProcessor agedBrie = new AgedBrieItemProcessor();

        LinkedHashMap<Predicate<Item>, ItemProcessor> rules = new LinkedHashMap<>();
        rules.put(ItemMatchers::isSulfuras, sulfuras);
        rules.put(ItemMatchers::isAgedBrie, agedBrie);

        return new ItemProcessorResolver(rules);
    }
}
