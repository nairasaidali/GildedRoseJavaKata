package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 07/10/2015.
 */
public class NormalItem extends Item implements QualityControl{
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
            this.setSellIn(this.getSellIn() - 1);
            if(this.getQuality() <50) {


                if (this.getSellIn() >= 0) {
                    if (this.getQuality() > 1) {
                        this.setQuality(this.getQuality() - 1);
                    }

                } else {
                    if (this.getQuality() > 2) {
                        this.setQuality(this.getQuality() - 2 * 1);
                    }

                }
            }
        else
            {
                System.out.println("Incorrect: Qualite < 50.");
            }
    }
}
