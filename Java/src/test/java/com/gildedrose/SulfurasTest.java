package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {

    private static final String NAME = "Sulfuras, Hand of Ragnaros";

    @Test
    void neverChanges_sellInAndQualityStaySame() {
        Item[] items = {new Item(NAME, 0, 80)};
        GildedRose app = new GildedRose(items);

        updateDays(app, 5);

        assertItem(items[0], NAME, 0, 80);
    }

    @Test
    void neverChanges_evenWithNegativeSellIn() {
        Item[] items = {new Item(NAME, -1, 80)};
        GildedRose app = new GildedRose(items);

        updateDays(app, 5);

        assertItem(items[0], NAME, -1, 80);
    }

    private static void updateDays(GildedRose app, int days) {
        for (int i = 0; i < days; i++) {
            app.updateQuality();
        }
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }
}

