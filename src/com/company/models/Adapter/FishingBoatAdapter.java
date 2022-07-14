package com.company.models.Adapter;

public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
