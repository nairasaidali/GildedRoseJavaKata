package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 07/10/2015.
 */
public class ConjuredTypeItem extends Item implements QualityControl{
    public ConjuredTypeItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        this.setSellIn(this.getSellIn() - 1);

        if(this.getQuality() < 50) {

            if (this.getSellIn() >= 0) {
                if (this.getQuality() > 2) {
                    this.setQuality(this.getQuality() - 2);
                }

            } else {
                if (this.getQuality() > 4) {
                    this.setQuality(this.getQuality() - 2 * 2);
                }

            }
        }

        else
        {
            System.out.println("Incorrect: Qualite < 50.");
        }
    }
}
