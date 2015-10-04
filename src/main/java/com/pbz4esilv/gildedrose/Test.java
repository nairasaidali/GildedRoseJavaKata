package com.pbz4esilv.gildedrose;

/**
 * Created by Naira on 02/10/2015.
 */
public class Test {

    public static void main(String[] args){
        System.out.println("Hello Word");
        //Item moi= new Item("Name",12,40);
        //System.out.println(moi.toString());
        Inventory inv = new Inventory();
        inv.display();
        for(int i =0 ; i<50;i++)
        {
            inv.updateQuality();
            System.out.println(" ");
            inv.display();
        }

    }

}
