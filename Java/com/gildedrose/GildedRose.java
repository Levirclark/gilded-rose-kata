package com.gildedrose;

class GildedRose {
    Item[] items;
    private final String SULFURUS = "Sulfuras, Hand of Ragnaros";
    private final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private final String AGED_BRIE = "Aged Brie";
    private final String CONJURED_PREFIX = "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            

            items[i].sellIn = getUpdatedSellIn(items[i]);
            items[i].quality = getUpdatedQuality(items[i]);
            
        }
    }
    
    private int getUpdatedQuality(Item item) {
    	
    	int updatedQuality = item.quality;
    	boolean itemIsNormal = true;
    	
    	if(item.name.equals(SULFURUS)) {
    		return getUpdatedSulfurusQuality(item);
        }
    	
    	if(item.name.equals(AGED_BRIE)){
    		itemIsNormal = false;
    		updatedQuality = getUpdatedAgedBrieQuality(item);
    	}
    	
    	if(item.name.equals(BACKSTAGE_PASS)) {
    		itemIsNormal = false;
    		updatedQuality = getUpdatedBackstagePassQuality(item);
    	}
    	
    	if(itemIsConjured(item)) {
    		itemIsNormal = false;
    		updatedQuality = getUpdatedConjuredQuality(item);
    	}
    	
    	//The item is a regular item
    	
    	if(itemIsNormal) {
        	updatedQuality = getUpdatedGeneralItemQuality(item);
    	}
    	
    	if(updatedQuality < 0) {
    		updatedQuality = 0;
    	}
    	
    	if(updatedQuality > 50) {
    		updatedQuality = 50;
    	}
    	
        return updatedQuality;
    }
    
    private int getUpdatedSellIn(Item item) {
    	if(item.name.equals(SULFURUS)) {
    		return item.sellIn;
    	}
    	return item.sellIn - 1;
    }
    
    private boolean itemIsConjured(Item item) {
	//TODO This function returns true if the item is conjured. Currently any item with a name starting with "Conjured" counts. This needs to be verified with Allison.
    	if(item.name == null) {
    		return false;
    	}
    	return item.name.startsWith(CONJURED_PREFIX);
    }
    
    private int getUpdatedSulfurusQuality(Item item) {
    	return 80;
    }
    
    private int getUpdatedAgedBrieQuality(Item item) {
    	int updatedQuality = item.quality;
    	updatedQuality++;
		if(item.sellIn < 0) {
			updatedQuality++;
		}
		return updatedQuality;
    }
    
    private int getUpdatedBackstagePassQuality(Item item) {
    	int updatedQuality = item.quality;
    	int qualityIncrement = 1;
		if(item.sellIn < 10) {
			qualityIncrement++;
		}
		if(item.sellIn < 5) {
			qualityIncrement++;
		}
		updatedQuality += qualityIncrement;
		if(item.sellIn < 0) {
			updatedQuality = 0;
		}
    	return updatedQuality;
    }
    
    private int getUpdatedConjuredQuality(Item item) {
    	int updatedQuality = item.quality;
    	updatedQuality-= 2;
    	if(item.sellIn < 0) {
    		updatedQuality-= 2;
    	}	
    	return updatedQuality;
    }
    
    private int getUpdatedGeneralItemQuality(Item item) {
    	int updatedQuality = item.quality;
    	updatedQuality--;
    	if(item.sellIn < 0) {
    		updatedQuality--;
    	}	
    	return updatedQuality;
    }
}
