package com.gildedrose.processor.resolver;

import com.gildedrose.processor.AgedBrieItemProcessor;
import com.gildedrose.processor.BackstagePassesItemProcessor;
import com.gildedrose.processor.ConjuredItemProcessor;
import com.gildedrose.processor.DefaultItemProcessor;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.processor.SulfurasItemProcessor;
import com.gildedrose.processor.resolver.matcher.AgedBrieMatcher;
import com.gildedrose.processor.resolver.matcher.AllItemsMatcher;
import com.gildedrose.processor.resolver.matcher.BackstagePassesMatcher;
import com.gildedrose.processor.resolver.matcher.ConjuredMatcher;
import com.gildedrose.processor.resolver.matcher.ItemMatcher;
import com.gildedrose.processor.resolver.matcher.SulfurasMatcher;

import java.util.LinkedHashMap;

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

        LinkedHashMap<ItemMatcher, ItemProcessor> rules = new LinkedHashMap<>();
        rules.put(new SulfurasMatcher(), new SulfurasItemProcessor());
        rules.put(new AgedBrieMatcher(), new AgedBrieItemProcessor());
        rules.put(new ConjuredMatcher(), new ConjuredItemProcessor());
        rules.put(new BackstagePassesMatcher(), new BackstagePassesItemProcessor());
        rules.put(new AllItemsMatcher(), new DefaultItemProcessor());

        return new ItemProcessorResolver(rules);
    }
}
