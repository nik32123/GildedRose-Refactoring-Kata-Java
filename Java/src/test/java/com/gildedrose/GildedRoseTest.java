package com.gildedrose;

import com.gildedrose.processor.resolver.ItemProcessorResolver;
import com.gildedrose.processor.resolver.ItemProcessorResolverFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private static ItemProcessorResolver itemProcessorResolver;

    @BeforeAll
    static void setup() {
        itemProcessorResolver = ItemProcessorResolverFactory.create();
    }

    @Test
    void afterOneDay() {
        Item[] items = textFixtureItems();
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        updateDays(app, 1);

        assertAll(
            () -> assertItem(items[0], "+5 Dexterity Vest", 9, 19),
            () -> assertItem(items[1], "Aged Brie", 1, 1),
            () -> assertItem(items[2], "Elixir of the Mongoose", 4, 6),
            () -> assertItem(items[3], "Sulfuras, Hand of Ragnaros", 0, 80),
            () -> assertItem(items[4], "Sulfuras, Hand of Ragnaros", -1, 80),
            () -> assertItem(items[5], "Backstage passes to a TAFKAL80ETC concert", 14, 21),
            () -> assertItem(items[6], "Backstage passes to a TAFKAL80ETC concert", 9, 50),
            () -> assertItem(items[7], "Backstage passes to a TAFKAL80ETC concert", 4, 50),
            () -> assertItem(items[8], "Conjured Mana Cake", 2, 4)
        );
    }

    @Test
    void afterTwoDays() {
        Item[] items = textFixtureItems();
        GildedRose app = new GildedRose(items, itemProcessorResolver);

        updateDays(app, 2);

        assertAll(
            () -> assertItem(items[0], "+5 Dexterity Vest", 8, 18),
            () -> assertItem(items[1], "Aged Brie", 0, 2),
            () -> assertItem(items[2], "Elixir of the Mongoose", 3, 5),
            () -> assertItem(items[3], "Sulfuras, Hand of Ragnaros", 0, 80),
            () -> assertItem(items[4], "Sulfuras, Hand of Ragnaros", -1, 80),
            () -> assertItem(items[5], "Backstage passes to a TAFKAL80ETC concert", 13, 22),
            () -> assertItem(items[6], "Backstage passes to a TAFKAL80ETC concert", 8, 50),
            () -> assertItem(items[7], "Backstage passes to a TAFKAL80ETC concert", 3, 50),
            () -> assertItem(items[8], "Conjured Mana Cake", 1, 2)
        );
    }

    private static void updateDays(GildedRose app, int days) {
        for (int i = 0; i < days; i++) {
            app.updateQuality();
        }
    }

    private static void assertItem(Item item, String name, int sellIn, int quality) {
        assertAll(
            () -> assertEquals(name, item.name),
            () -> assertEquals(sellIn, item.sellIn),
            () -> assertEquals(quality, item.quality)
        );
    }

    private static Item[] textFixtureItems() {
        return new Item[]{
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            new Item("Conjured Mana Cake", 3, 6)
        };
    }
}
