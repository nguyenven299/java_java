package dao;

import java.util.Date;

public class SanhSu extends Model {
    private String chatLieu = "";

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public SanhSu(String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho, String chatLieu) {
        super(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        this.chatLieu = chatLieu;
    }

    @Override
    public String toString() {
        return super.toString() + " Chat lieu: " + this.chatLieu;
    }
}