package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    public void them(String loaiHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho) {
        sanPham.add(new Model(sanPham.size() + 1, loaiHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa,
                ngayHangHoaNhapKho));
        show();
    }

    @Override
    public void sua(String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa, Date ngayHangHoaNhapKho) {
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
        show();
    }

    @Override
    public void timKiemLoaiHangHoa(String loaiHangHoa) {
        ArrayList<Model> sanPhamTimKiemLoai = new ArrayList<>();
        for (Model model : sanPham) {
            if (model.getLoaiHangHoa().equals(loaiHangHoa)) {
                sanPhamTimKiemLoai.add(model);
            }
        }
        showNewArrayList(sanPhamTimKiemLoai);
    }

    @Override
    public void sapXepTheoGia(boolean aBoolean) {
        if (aBoolean) {
            String tempLoaiHangHoa = "";
            String tempMaHangHoa = "";
            String tempTenHangHoa = "";
            int tempSoHangHoaTonKho = 0;
            int tempGiaNhapHangHoa = 0;
            Date tempNgayNhapKho = new Date();
            for (int i = 0; i < sanPham.size() - 1; i++) {
                for (int j = 0; j < sanPham.size() - 1 - i; j++) {
                    if (sanPham.get(j).getGiaNhapHangHoa() > sanPham.get(j + 1).getGiaNhapHangHoa()) {
                        tempLoaiHangHoa = sanPham.get(j).getLoaiHangHoa();
                        tempMaHangHoa = sanPham.get(j).getMaHangHoa();
                        tempTenHangHoa = sanPham.get(j).getTenHangHoa();
                        tempSoHangHoaTonKho = sanPham.get(j).getSoHangHoaTonKho();
                        tempGiaNhapHangHoa = sanPham.get(j).getGiaNhapHangHoa();
                        tempNgayNhapKho = sanPham.get(j).getNgayHangHoaNhapKho();

                        sanPham.get(j).setLoaiHangHoa(sanPham.get(j + 1).getLoaiHangHoa());
                        sanPham.get(j).setMaHangHoa(sanPham.get(j + 1).getMaHangHoa());
                        sanPham.get(j).setTenHangHoa(sanPham.get(j + 1).getTenHangHoa());
                        sanPham.get(j).setSoHangHoaTonKho(sanPham.get(j + 1).getSoHangHoaTonKho());
                        sanPham.get(j).setGiaNhapHangHoa(sanPham.get(j + 1).getGiaNhapHangHoa());
                        sanPham.get(j).setNgayHangHoaNhapKho(sanPham.get(j + 1).getNgayHangHoaNhapKho());

                        sanPham.get(j + 1).setLoaiHangHoa(tempLoaiHangHoa);
                        sanPham.get(j + 1).setMaHangHoa(tempMaHangHoa);
                        sanPham.get(j + 1).setTenHangHoa(tempTenHangHoa);
                        sanPham.get(j + 1).setSoHangHoaTonKho(tempSoHangHoaTonKho);
                        sanPham.get(j + 1).setGiaNhapHangHoa(tempGiaNhapHangHoa);
                        sanPham.get(j + 1).setNgayHangHoaNhapKho(tempNgayNhapKho);

                    }
                }
            }
            showNewArrayList(sanPham);
        }
        if (!aBoolean) {
            String tempLoaiHangHoa = "";
            String tempMaHangHoa = "";
            String tempTenHangHoa = "";
            int tempSoHangHoaTonKho = 0;
            int tempGiaNhapHangHoa = 0;
            Date tempNgayNhapKho = new Date();
            for (int i = 0; i < sanPham.size() - 1; i++) {
                for (int j = 0; j < sanPham.size() - 1 - i; j++) {
                    if (sanPham.get(j).getGiaNhapHangHoa() < sanPham.get(j + 1).getGiaNhapHangHoa()) {
                        tempLoaiHangHoa = sanPham.get(j).getLoaiHangHoa();
                        tempMaHangHoa = sanPham.get(j).getMaHangHoa();
                        tempTenHangHoa = sanPham.get(j).getTenHangHoa();
                        tempSoHangHoaTonKho = sanPham.get(j).getSoHangHoaTonKho();
                        tempGiaNhapHangHoa = sanPham.get(j).getGiaNhapHangHoa();
                        tempNgayNhapKho = sanPham.get(j).getNgayHangHoaNhapKho();

                        sanPham.get(j).setLoaiHangHoa(sanPham.get(j + 1).getLoaiHangHoa());
                        sanPham.get(j).setMaHangHoa(sanPham.get(j + 1).getMaHangHoa());
                        sanPham.get(j).setTenHangHoa(sanPham.get(j + 1).getTenHangHoa());
                        sanPham.get(j).setSoHangHoaTonKho(sanPham.get(j + 1).getSoHangHoaTonKho());
                        sanPham.get(j).setGiaNhapHangHoa(sanPham.get(j + 1).getGiaNhapHangHoa());
                        sanPham.get(j).setNgayHangHoaNhapKho(sanPham.get(j + 1).getNgayHangHoaNhapKho());

                        sanPham.get(j + 1).setLoaiHangHoa(tempLoaiHangHoa);
                        sanPham.get(j + 1).setMaHangHoa(tempMaHangHoa);
                        sanPham.get(j + 1).setTenHangHoa(tempTenHangHoa);
                        sanPham.get(j + 1).setSoHangHoaTonKho(tempSoHangHoaTonKho);
                        sanPham.get(j + 1).setGiaNhapHangHoa(tempGiaNhapHangHoa);
                        sanPham.get(j + 1).setNgayHangHoaNhapKho(tempNgayNhapKho);

                    }
                }
            }
            showNewArrayList(sanPham);
        }

    }

    @Override
    public void show() {
        for (Model m : sanPham) {
            System.out.println("STT: " + m.getSoThuTu() + " Loai hang: " + m.getLoaiHangHoa() + " Ma hang hoa: "
                    + m.getMaHangHoa() + " Ten hang hoa: " + m.getTenHangHoa() + " So hang ton kho: "
                    + m.getSoHangHoaTonKho() + " Gia nhap hang hoa: " + m.getGiaNhapHangHoa() + " Ngay nhap hang hoa: "
                    + new SimpleDateFormat("dd/MM/yyyy").format(m.getNgayHangHoaNhapKho()));
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
                + new SimpleDateFormat("dd/MM/yyyy").format(m.getNgayHangHoaNhapKho()));
    }

    private int showEachArrays(ArrayList<Model> models, String maSo) {

        for (int i = 0; i < models.size(); i++) {
            if (models.get(i).getMaHangHoa().equals(maSo))
                return i;
        }
        return 0;
    }

    @Override
    public void timKiemKhoangGia(int giaBatDau, int giaKetThuc) {
        ArrayList<Model> models = new ArrayList<>();
        for (Model model : sanPham) {
            if (model.getGiaNhapHangHoa() >= giaBatDau && model.getGiaNhapHangHoa() <= giaKetThuc) {
                models.add(model);
            }
        }
        showNewArrayList(models);
    }

    public void showNewArrayList(ArrayList<Model> models) {
        for (Model m : models) {
            System.out.println("STT: " + m.getSoThuTu() + " Loai hang: " + m.getLoaiHangHoa() + " Ma hang hoa: "
                    + m.getMaHangHoa() + " Ten hang hoa: " + m.getTenHangHoa() + " So hang ton kho: "
                    + m.getSoHangHoaTonKho() + " Gia nhap hang hoa: " + m.getGiaNhapHangHoa() + " Ngay nhap hang hoa: "
                    + new SimpleDateFormat("dd/MM/yyyy").format(m.getNgayHangHoaNhapKho()));
        }
    }

    @Override
    public void timKiemNgay(String maSo) {
        // TODO Auto-generated method stub

    }

    @Override
    public void thongKeTongSoLuongHangHoa() {
        int tongSoLuong = 0;
        for (Model model : sanPham) {
            tongSoLuong = tongSoLuong + model.getSoHangHoaTonKho();
        }
        System.out.println("Tong so luong hang hoa: " + tongSoLuong);
    }

    @Override
    public void thongKeGiaTriNhapKho() {
        int tongSoLuong = 0;
        for (Model model : sanPham) {
            tongSoLuong = tongSoLuong + model.getGiaNhapHangHoa();
        }
        System.out.println("Tong so luong hang hoa: " + tongSoLuong + "đ");
    }

    @Override
    public void thongKeSoLuongTungLoaiHang() {
        int tongSoLuongTP = 0;
        int tongSoLuongSS = 0;
        int tongSoLuongDM = 0;
        for (Model model : sanPham) {
            if (model.getLoaiHangHoa().equals("TP")) {
                tongSoLuongTP = tongSoLuongTP + model.getSoHangHoaTonKho();
            }
        }
        System.out.println("Tong so luong hang hoa thuc pham: " + tongSoLuongTP);
        for (Model model : sanPham) {
            if (model.getLoaiHangHoa().equals("SS")) {
                tongSoLuongSS = tongSoLuongSS + model.getSoHangHoaTonKho();
            }
        }
        System.out.println("Tong so luong hang hoa san su: " + tongSoLuongSS);
        for (Model model : sanPham) {
            if (model.getLoaiHangHoa().equals("DM")) {
                tongSoLuongDM = tongSoLuongDM + model.getSoHangHoaTonKho();
            }
        }
        System.out.println("Tong so luong hang hoa dien may: " + tongSoLuongDM);
    }

    @Override
    public void sapXepTheoNgay(boolean aBoolean) {
        if (aBoolean) {
            String tempLoaiHangHoa = "";
            String tempMaHangHoa = "";
            String tempTenHangHoa = "";
            int tempSoHangHoaTonKho = 0;
            int tempGiaNhapHangHoa = 0;
            Date tempNgayNhapKho = new Date();
            for (int i = 0; i < sanPham.size() - 1; i++) {
                for (int j = 0; j < sanPham.size() - 1 - i; j++) {
                    if (sanPham.get(j).getNgayHangHoaNhapKho().getTime() > sanPham.get(j + 1).getNgayHangHoaNhapKho()
                            .getTime()) {
                        tempLoaiHangHoa = sanPham.get(j).getLoaiHangHoa();
                        tempMaHangHoa = sanPham.get(j).getMaHangHoa();
                        tempTenHangHoa = sanPham.get(j).getTenHangHoa();
                        tempSoHangHoaTonKho = sanPham.get(j).getSoHangHoaTonKho();
                        tempGiaNhapHangHoa = sanPham.get(j).getGiaNhapHangHoa();
                        tempNgayNhapKho = sanPham.get(j).getNgayHangHoaNhapKho();

                        sanPham.get(j).setLoaiHangHoa(sanPham.get(j + 1).getLoaiHangHoa());
                        sanPham.get(j).setMaHangHoa(sanPham.get(j + 1).getMaHangHoa());
                        sanPham.get(j).setTenHangHoa(sanPham.get(j + 1).getTenHangHoa());
                        sanPham.get(j).setSoHangHoaTonKho(sanPham.get(j + 1).getSoHangHoaTonKho());
                        sanPham.get(j).setGiaNhapHangHoa(sanPham.get(j + 1).getGiaNhapHangHoa());
                        sanPham.get(j).setNgayHangHoaNhapKho(sanPham.get(j + 1).getNgayHangHoaNhapKho());

                        sanPham.get(j + 1).setLoaiHangHoa(tempLoaiHangHoa);
                        sanPham.get(j + 1).setMaHangHoa(tempMaHangHoa);
                        sanPham.get(j + 1).setTenHangHoa(tempTenHangHoa);
                        sanPham.get(j + 1).setSoHangHoaTonKho(tempSoHangHoaTonKho);
                        sanPham.get(j + 1).setGiaNhapHangHoa(tempGiaNhapHangHoa);
                        sanPham.get(j + 1).setNgayHangHoaNhapKho(tempNgayNhapKho);

                    }
                }
            }
            showNewArrayList(sanPham);
        }
        if (!aBoolean) {
            String tempLoaiHangHoa = "";
            String tempMaHangHoa = "";
            String tempTenHangHoa = "";
            int tempSoHangHoaTonKho = 0;
            int tempGiaNhapHangHoa = 0;
            Date tempNgayNhapKho = new Date();
            for (int i = 0; i < sanPham.size() - 1; i++) {
                for (int j = 0; j < sanPham.size() - 1 - i; j++) {
                    if (sanPham.get(j).getNgayHangHoaNhapKho().getTime() < sanPham.get(j + 1).getNgayHangHoaNhapKho()
                            .getTime()) {
                        tempLoaiHangHoa = sanPham.get(j).getLoaiHangHoa();
                        tempMaHangHoa = sanPham.get(j).getMaHangHoa();
                        tempTenHangHoa = sanPham.get(j).getTenHangHoa();
                        tempSoHangHoaTonKho = sanPham.get(j).getSoHangHoaTonKho();
                        tempGiaNhapHangHoa = sanPham.get(j).getGiaNhapHangHoa();
                        tempNgayNhapKho = sanPham.get(j).getNgayHangHoaNhapKho();

                        sanPham.get(j).setLoaiHangHoa(sanPham.get(j + 1).getLoaiHangHoa());
                        sanPham.get(j).setMaHangHoa(sanPham.get(j + 1).getMaHangHoa());
                        sanPham.get(j).setTenHangHoa(sanPham.get(j + 1).getTenHangHoa());
                        sanPham.get(j).setSoHangHoaTonKho(sanPham.get(j + 1).getSoHangHoaTonKho());
                        sanPham.get(j).setGiaNhapHangHoa(sanPham.get(j + 1).getGiaNhapHangHoa());
                        sanPham.get(j).setNgayHangHoaNhapKho(sanPham.get(j + 1).getNgayHangHoaNhapKho());

                        sanPham.get(j + 1).setLoaiHangHoa(tempLoaiHangHoa);
                        sanPham.get(j + 1).setMaHangHoa(tempMaHangHoa);
                        sanPham.get(j + 1).setTenHangHoa(tempTenHangHoa);
                        sanPham.get(j + 1).setSoHangHoaTonKho(tempSoHangHoaTonKho);
                        sanPham.get(j + 1).setGiaNhapHangHoa(tempGiaNhapHangHoa);
                        sanPham.get(j + 1).setNgayHangHoaNhapKho(tempNgayNhapKho);

                    }
                }
            }
            showNewArrayList(sanPham);
        }
    }
}
