package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 07/10/2015.
 */
public class LegendaryItem extends Item implements QualityControl{

    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void updateQuality() {
        super.updateQuality();
    }
}
