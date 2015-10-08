package com.pbz4esilv.gildedrose;

public class Inventory implements QualityControl{

    private Item[] items; // Les tableaux ne sont pas adaptés à la gestion d'un inventaire (ajout ou suppression) du fait de sa taille fixe imposée

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }
    /*public Inventory() {
        super();
        items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };

    }*/

    public void display()
    {
       for( int i = 0; i < items.length; i++) {
           System.out.println(items[i].toString());
       }

    }

    @Override
    public void updateQuality() {
        for(int i=0; i<items.length;i++)
        {
            items[i].updateQuality();
        }
    }
}

