package controller;

import java.util.ArrayList;
import java.util.Date;

import dao.Model;

public interface EventListener {

    void setData(ArrayList<Model> sanPham);

    void them(String loaiHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho);

    void sua(String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa, Date ngayHangHoaNhapKho);

    void xoa(String maSo);

    void timKiemLoaiHangHoa(String loaiHangHoa);

    void timKiemNgay(String maSo);

    void timKiemKhoangGia(int giaBatDau, int giaKetThuc);

    void sapXepTheoGia(boolean aBoolean);

    void sapXepTheoNgay(boolean aBoolean);

    void thongKeTongSoLuongHangHoa();

    void thongKeGiaTriNhapKho();

    void thongKeSoLuongTungLoaiHang();

    void show();

    void showEachData(String maSo);
}
