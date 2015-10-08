package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 07/10/2015.
 */
public class BackstageTypeItem extends Item implements QualityControl{
    public BackstageTypeItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        this.setSellIn(this.getSellIn()-1);

        if(this.getQuality() < 50) {


            if (this.getSellIn() >= 0) {
                if (this.getQuality() < 50) {
                    this.setQuality(this.getQuality() + 1);

                    if (this.getSellIn() < 10 && this.getQuality() < 50) {
                        this.setQuality(this.getQuality() + 1);

                        if (this.getSellIn() < 6 && this.getQuality() < 50) {
                            this.setQuality(this.getQuality() + 1);
                        }
                    }
                }
            }

            else {
                this.setQuality(this.getQuality() - this.getQuality());
            }
        }
        else
        {
            System.out.println("Incorrect: Qualite < 50.");
        }
    }
}
