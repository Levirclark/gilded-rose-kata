package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 20, 20) ,
        		new Item("General Item", 20, 20), 
        		new Item("General Old Item", 1, 20), 
        		new Item("General Overdue Item", 0, 20), 
        		new Item("Aged Brie", 0, 20),
        		new Item("Aged Brie", 50, 20),
        		new Item("Aged Brie", -5, 20),
        		new Item("Aged Brie", 20, 20),
        		new Item("Aged Brie", 20, 50),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 50, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20),
        		new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50),
        		new Item("Conjured Apple", 20, 20),
        		new Item("Conjured Tablet", 1, 20),
        		new Item("Conjured Piano", 0, 20)
        		};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(20, app.items[0].sellIn);
        assertEquals("General Item", app.items[1].name);
        assertEquals(19, app.items[1].quality);
        assertEquals(19, app.items[1].sellIn);
        assertEquals("General Old Item", app.items[2].name);
        assertEquals(19, app.items[2].quality);
        assertEquals(0, app.items[2].sellIn);
        assertEquals("General Overdue Item", app.items[3].name);
        assertEquals(18, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);
        assertEquals("Aged Brie", app.items[4].name);
        assertEquals(22, app.items[4].quality);
        assertEquals(-1, app.items[4].sellIn);
        assertEquals("Aged Brie", app.items[5].name);
        assertEquals(21, app.items[5].quality);
        assertEquals(49, app.items[5].sellIn);
        assertEquals("Aged Brie", app.items[6].name);
        assertEquals(22, app.items[6].quality);
        assertEquals(-6, app.items[6].sellIn);
        assertEquals("Aged Brie", app.items[7].name);
        assertEquals(21, app.items[7].quality);
        assertEquals(19, app.items[7].sellIn);
        assertEquals("Aged Brie", app.items[8].name);
        assertEquals(50, app.items[8].quality);
        assertEquals(19, app.items[8].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[9].name);
        assertEquals(21, app.items[9].quality);
        assertEquals(49, app.items[9].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[10].name);
        assertEquals(21, app.items[10].quality);
        assertEquals(10, app.items[10].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[11].name);
        assertEquals(22, app.items[11].quality);
        assertEquals(9, app.items[11].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[12].name);
        assertEquals(22, app.items[12].quality);
        assertEquals(5, app.items[12].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[13].name);
        assertEquals(23, app.items[13].quality);
        assertEquals(4, app.items[13].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[14].name);
        assertEquals(23, app.items[14].quality);
        assertEquals(0, app.items[14].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[15].name);
        assertEquals(0, app.items[15].quality);
        assertEquals(-1, app.items[15].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[16].name);
        assertEquals(50, app.items[16].quality);
        assertEquals(0, app.items[16].sellIn);
        assertEquals("Conjured Apple", app.items[17].name);
        assertEquals(18, app.items[17].quality);
        assertEquals(19, app.items[17].sellIn);
        assertEquals("Conjured Tablet", app.items[18].name);
        assertEquals(18, app.items[18].quality);
        assertEquals(0, app.items[18].sellIn);
        assertEquals("Conjured Piano", app.items[19].name);
        assertEquals(16, app.items[19].quality);
        assertEquals(-1, app.items[19].sellIn);
    }

}
