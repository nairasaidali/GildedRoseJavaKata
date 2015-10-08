package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class AgedBrieTypeItemTest extends TestCase {

    public void testUpdateQuality() throws Exception {
        AgedBrieTypeItem anitem= new AgedBrieTypeItem("Aged Brie", 2,0);

        //Avant la mise à jour
        assertEquals(2, anitem.getSellIn());
        assertEquals(0, anitem.getQuality());


        anitem.updateQuality();

        //Après la mise à jour
        assertEquals(1, anitem.getSellIn());
        assertEquals(1, anitem.getQuality());
    }
}