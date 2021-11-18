package controller;

import java.util.ArrayList;

import dao.Model;

public interface EventListener {

    void setData(ArrayList<Model> sanPham);

    void them(String loaiHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, float giaNhapHangHoa,
            String ngayHangHoaNhapKho);

    void sua(String tenHangHoa, int soHangHoaTonKho, float giaNhapHangHoa, String ngayHangHoaNhapKho);

    void xoa(String maSo);

    void timKiem(String maSo);

    void sapXep();

    void thongKe();

    void show();

    void showEachData(String maSo);
}
