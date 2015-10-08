package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class BackstageTypeItemTest extends TestCase {

    public void testUpdateQuality() throws Exception {

        //Test 1: date de vente > 10 (qualité qui augmente de 1)
        BackstageTypeItem item1= new BackstageTypeItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);

        item1.updateQuality();

        assertEquals(14, item1.getSellIn());
        assertEquals(21, item1.getQuality());

        //Test 2: date de vente < 10 et > 6 (qualité qui augmente de 2)
        BackstageTypeItem item2= new BackstageTypeItem("Backstage passes to a TAFKAL80ETC concert", 9, 20);

        item2.updateQuality();

        assertEquals(8, item2.getSellIn());
        assertEquals(22, item2.getQuality());

        //Test 3: date de vente < 6 (qualité qui augmente de 3)
        BackstageTypeItem item3= new BackstageTypeItem("Backstage passes to a TAFKAL80ETC concert", 5, 20);

        item3.updateQuality();

        assertEquals(4, item3.getSellIn());
        assertEquals(23, item3.getQuality());

        //Test 4: date de vente qui est dépassée (qualité réinitialisée à 0)
        BackstageTypeItem item4= new BackstageTypeItem("Backstage passes to a TAFKAL80ETC concert", 0, 20);

        item4.updateQuality();

        assertEquals(-1, item4.getSellIn());
        assertEquals(0, item4.getQuality());
    }
}