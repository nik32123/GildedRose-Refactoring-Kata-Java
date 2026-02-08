package com.gildedrose;

import com.gildedrose.processor.resolver.ItemProcessorResolver;
import com.gildedrose.processor.resolver.ItemProcessorResolverFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassesTest {

    private static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    private static ItemProcessorResolver itemProcessorResolver;

    @BeforeAll
    static void setup() {
        itemProcessorResolver = ItemProcessorResolverFactory.create();
    }

    @Test
    void increasesBy1_whenSellInGreaterThan10() {
        Item[] items = {new Item(NAME, 15, 20)};
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        app.updateQuality();

        assertItem(items[0], NAME, 14, 21);
    }

    @Test
    void increasesBy2_whenSellInIs10() {
        Item[] items = {new Item(NAME, 10, 20)};
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        app.updateQuality();

        assertItem(items[0], NAME, 9, 22);
    }

    @Test
    void increasesBy3_whenSellInIs5() {
        Item[] items = {new Item(NAME, 5, 20)};
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        app.updateQuality();

        assertItem(items[0], NAME, 4, 23);
    }

    @Test
    void dropsToZero_afterConcert() {
        Item[] items = {new Item(NAME, 0, 20)};
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        app.updateQuality();

        assertItem(items[0], NAME, -1, 0);
    }

    @Test
    void qualityNeverMoreThan50() {
        Item[] items = {new Item(NAME, 10, 50)};
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        app.updateQuality();

        assertItem(items[0], NAME, 9, 50);
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }
}
