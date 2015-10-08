package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class LegendaryItemTest extends TestCase {

    public void testUpdateQuality() throws Exception {
        LegendaryItem anitem= new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80);

        assertEquals(0, anitem.getSellIn());
        assertEquals(80, anitem.getQuality());

        anitem.updateQuality();

        assertEquals(0, anitem.getSellIn());
        assertEquals(80, anitem.getQuality());
    }
}