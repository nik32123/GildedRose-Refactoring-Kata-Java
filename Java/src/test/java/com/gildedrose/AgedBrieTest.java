package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    @Test
    void increasesBy1_beforeSellDate() {
        Item[] items = {new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "Aged Brie", 1, 1);
    }

    @Test
    void increasesBy2_afterSellDate() {
        Item[] items = {new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "Aged Brie", -1, 12);
    }

    @Test
    void qualityNeverMoreThan50() {
        Item[] items = {new Item("Aged Brie", 5, 50)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], "Aged Brie", 4, 50);
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }
}
