package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 07/10/2015.
 */
public class AgedBrieTypeItem extends Item implements QualityControl{
    public AgedBrieTypeItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();

        this.setSellIn(this.getSellIn() - 1);
        if(this.getQuality()< 50)
        {
            this.setQuality(this.getQuality()+1);
        }

        else
        {
            System.out.println("Incorrect: Qualite < 50.");
        }
    }
}
