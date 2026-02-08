package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalItemTest {

    @Test
    void degradesBy1_beforeSellDate() {
        Item[] items = {new Item("foo", 5, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "foo", 4, 9);
    }

    @Test
    void degradesBy2_afterSellDate() {
        Item[] items = {new Item("foo", 0, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "foo", -1, 8);
    }

    @Test
    void qualityNeverNegative() {
        Item[] items = {new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "foo", -1, 0);
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }
}
