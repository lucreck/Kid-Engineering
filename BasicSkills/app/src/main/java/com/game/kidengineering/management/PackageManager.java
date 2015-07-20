package com.game.kidengineering.management;

import com.game.kidengineering.entities.MyPackage;

/**
 * Created by vanhai on 7/20/2015.
 */
public class PackageManager {
    MyPackage[] listPackage;

    public PackageManager() {
        listPackage = new MyPackage[10];
        // cái này s? load lên t? file
        listPackage[0] = new MyPackage(0,"counting", "icon_menu_0", true);
        listPackage[1] = new MyPackage(0,"letter", "icon_menu_1", true);
    }

    public PackageManager(MyPackage[] listPackage) {
        this.listPackage = listPackage;
    }

    public MyPackage[] getListPackage() {
        return listPackage;
    }

    public void setListPackage(MyPackage[] listPackage) {
        this.listPackage = listPackage;
    }
}
