package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class ConjuredTypeItemTest extends TestCase {

    public void testUpdateQuality() throws Exception {

        //Test 1: date de vente >= 0 (quantité qui diminue deux fois plus vite que pour les item normaux i.e qui diminue de 2 au lieu de 1)
        ConjuredTypeItem item1= new ConjuredTypeItem("Conjured Mana Cake", 3,6);

        item1.updateQuality();

        assertEquals(2, item1.getSellIn());
        assertEquals(4, item1.getQuality());

        //Test 2: date de vente < 0 (quantité qui diminue deux fois plus vite que pour les item normaux i.e qui diminue de 4 au lieu de 2)
        ConjuredTypeItem item2= new ConjuredTypeItem("Conjured Mana Cake", -1,6);

        item2.updateQuality();

        assertEquals(-2, item2.getSellIn());
        assertEquals(2, item2.getQuality());
    }
}