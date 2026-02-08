package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Conjured items are not yet supported")
class ConjuredTest {

    private static final String NAME = "Conjured Mana Cake";

    @Test
    void degradesBy2_beforeSellDate() {
        Item[] items = {new Item(NAME, 3, 6)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], NAME, 2, 4);
    }

    @Test
    void degradesBy2_afterSellDate() {
        Item[] items = {new Item(NAME, 0, 6)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], NAME, -1, 2);
    }

    @Test
    void qualityNeverNegative() {
        Item[] items = {new Item(NAME, 3, 1)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItem(items[0], NAME, 2, 0);
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertEquals(name, item.name);
        assertEquals(sellIn, item.sellIn);
        assertEquals(quality, item.quality);
    }
}
