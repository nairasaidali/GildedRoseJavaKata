package com.pbz4esilv.gildedrose;

import junit.framework.TestCase;

/**
 * Created by Naira on 07/10/2015.
 */
public class NormalItemTest extends TestCase {

    public void testUpdateQuality() throws Exception {

        //Test 1: date de vente >= 0 (quantité qui diminue de 1)
        NormalItem item1 = new NormalItem("Elixir of the Mongoose", 5, 6);

            item1.updateQuality();
            assertEquals(4, item1.getSellIn());
            assertEquals(5, item1.getQuality());

        //Test 2: date de vente < 0 (quantité qui diminue deux fois plus vite donc qui diminue de 2 au lieu de 1)
        NormalItem item2 = new NormalItem("+5 Dexterity Vest", -1, 20);

            item2.updateQuality();
            assertEquals(-2, item2.getSellIn());
            assertEquals(18, item2.getQuality());



    }
}