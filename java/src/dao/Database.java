package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Database {
        private static ArrayList<Model> sanPham = new ArrayList<>();

        public static ArrayList<Model> getData() throws ParseException {

                sanPham.add(new ThucPham("TP", "TP01", "Ga quay", 100, 100000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2021"), "Ca"));
                sanPham.add(new ThucPham("TP", "TP02", "Vit quay Bac Kinh", 100, 250000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2021"), "Ga"));
                sanPham.add(new ThucPham("TP", "TP03", "Suon heo nương", 100, 50000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "Vit"));
                sanPham.add(new SanhSu("SS", "TP04", "To sanh", 100, 25000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2009"), "Gom"));
                sanPham.add(new SanhSu("SS", "TP05", "Chen Sanh", 100, 20000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2021"), "Xi mang"));
                sanPham.add(new SanhSu("SS", "TP06", "Noi ", 100, 70000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2015"), "Da"));
                sanPham.add(new DienMay("DM", "TP07", "Iphone 13 pro max 512Gb Blue ", 100, 13000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("23/01/2021"), "Iphone"));
                sanPham.add(new DienMay("DM", "TP08", "Google Pixel 6Pro", 100, 25000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Google"));
                sanPham.add(new SanhSu("SS", "TP09", "Am tra", 100, 500000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2011"), "Su"));
                sanPham.add(new ThucPham("TP", "TP010", "Heo rung chien xu", 100, 320000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2009"), "Ngong"));

                return sanPham;
        }

}
