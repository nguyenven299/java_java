package dao;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Model> sanPham = new ArrayList<>();

    public static ArrayList<Model> getData() {

        sanPham.add(new Model(1, "TP", "TP01", "Ga quay", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(2, "TP", "TP02", "Ga quay1", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(3, "TP", "TP03", "Ga quay2", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(4, "SS", "TP04", "Ga quay3", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(5, "SS", "TP05", "Ga quay4", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(6, "SS", "TP06", "Ga quay5", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(7, "DM", "TP07", "Ga quay6", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(8, "DM", "TP08", "Ga quay7", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(9, "SS", "TP09", "Ga quay8", 100, 100000, "20/10/2021"));
        sanPham.add(new Model(10, "TP", "TP010", "Ga quay9", 100, 100000, "20/10/2021"));

        return sanPham;
    }

}
