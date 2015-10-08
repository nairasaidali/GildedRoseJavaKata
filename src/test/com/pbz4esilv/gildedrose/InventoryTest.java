package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class InventoryTest extends TestCase {

    public void testDisplay() throws Exception {

        ConjuredTypeItem conj = new ConjuredTypeItem("Conjured Mana Cake",3,6);
        Item[] items = new Item[] {conj};

        Inventory invent = new Inventory(items);

        invent.display();
        assertEquals("Conjured Mana Cake/3/6", items[0].toString());

    }

    public void testUpdateQuality() throws Exception {
        ConjuredTypeItem conj = new ConjuredTypeItem("Conjured Mana Cake",3,6);
        Item[] items = new Item[] {conj};

        Inventory invent = new Inventory(items);

        invent.updateQuality();

        assertEquals(4, items[0].getQuality());
        assertEquals(2, items[0].getSellIn());
    }
}