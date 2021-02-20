package com.javase.oop.ZhuanXingIterface;

import java.util.ArrayList;
import java.util.List;

public class ShopCar {
    private List<Electronics> mlist = new ArrayList<Electronics>();

    public void add(Electronics electronics) {
        mlist.add(electronics);
    }

    public int getSize() {
        return mlist.size();
    }


    public Electronics getListItem(int position) {

        return mlist.get(position);

    }

}
