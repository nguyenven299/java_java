package controller;

import java.util.ArrayList;

import dao.Model;

public class HandleEvent implements EventListener {

    ArrayList<Model> sanPham = new ArrayList<>();
    private Model sanPhamSua = new Model();

    public void xoaSanPham(String maHangHoa) {
        for (int i = 0; i < sanPham.size(); i++) {
            if (sanPham.get(i).getMaHangHoa().equals(maHangHoa)) {
                sanPham.remove(i);
            }
        }
        show();
    }

    @Override
    public void them(String loaiHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, float giaNhapHangHoa,
            String ngayHangHoaNhapKho) {
        sanPham.add(new Model(sanPham.size() + 1, loaiHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa,
                ngayHangHoaNhapKho));
        show();
    }

    @Override
    public void sua(String tenHangHoa, int soHangHoaTonKho, float giaNhapHangHoa, String ngayHangHoaNhapKho) {
        sanPhamSua.setTenHangHoa(tenHangHoa);
        sanPhamSua.setSoHangHoaTonKho(soHangHoaTonKho);
        sanPhamSua.setGiaNhapHangHoa(giaNhapHangHoa);
        sanPhamSua.setNgayHangHoaNhapKho(ngayHangHoaNhapKho);
        int index = showEachArrays(sanPham, sanPhamSua.getMaHangHoa());
        sanPham.remove(index);
        sanPham.add(index, sanPhamSua);
        show();

    }

    @Override
    public void xoa(String maSo) {
        sanPham.remove(showEachArrays(sanPham, maSo));
    }

    @Override
    public void timKiem(String maSo) {

        int index = binarySearch(sanPham, 0, sanPham.size() - 1, decodeASCII(maSo));
        showModel(sanPham.get(index));
    }

    @Override
    public void sapXep() {
        // TODO Auto-generated method stub

    }

    @Override
    public void thongKe() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        for (Model m : sanPham) {
            System.out.println("STT: " + m.getSoThuTu() + " Loai hang: " + m.getLoaiHangHoa() + " Ma hang hoa: "
                    + m.getMaHangHoa() + " Ten hang hoa: " + m.getTenHangHoa() + " So hang ton kho: "
                    + m.getSoHangHoaTonKho() + " Gia nhap hang hoa: " + m.getGiaNhapHangHoa() + " Ngay nhap hang hoa: "
                    + m.getNgayHangHoaNhapKho());
        }
    }

    @Override
    public void setData(ArrayList<Model> sanPham) {
        this.sanPham.addAll(sanPham);
        show();
    }

    @Override
    public void showEachData(String maSo) {
        sanPhamSua = sanPham.get(showEachArrays(sanPham, maSo));
        showModel(sanPhamSua);
    }

    private void showModel(Model m) {
        System.out.println("STT: " + m.getSoThuTu() + " Loai hang: " + m.getLoaiHangHoa() + " Ma hang hoa: "
                + m.getMaHangHoa() + " Ten hang hoa: " + m.getTenHangHoa() + " So hang ton kho: "
                + m.getSoHangHoaTonKho() + " Gia nhap hang hoa: " + m.getGiaNhapHangHoa() + " Ngay nhap hang hoa: "
                + m.getNgayHangHoaNhapKho());
    }

    private int showEachArrays(ArrayList<Model> models, String maSo) {

        for (int i = 0; i < models.size(); i++) {
            if (models.get(i).getMaHangHoa().equals(maSo))
                return i;
        }
        return 0;
    }

    private int binarySearch(ArrayList<Model> aModels, int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;

            if (decodeASCII(aModels.get(mid).getMaHangHoa()) == x) {
                return mid;
            }
            if (decodeASCII(aModels.get(mid).getMaHangHoa()) > x) {
                return binarySearch(aModels, l, mid - 1, x);
            }
            return binarySearch(aModels, l, mid + 1, x);
        }
        return 0;

    }

    private int decodeASCII(String toString) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] text = toString.trim().toCharArray();
        for (char ch : text) {
            stringBuilder.append((byte) ch);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
