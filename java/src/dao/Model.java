package dao;

public class Model {
    private int stt;
    private String loaiHangHoa = "";
    private String maHangHoa = "";
    private String tenHangHoa = "";
    private int soHangHoaTonKho = 0;
    private float giaNhapHangHoa = 0;
    private String ngayHangHoaNhapKho = "";

    public Model(int soThuTu, String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho,
            float giaNhapHangHoa, String ngayHangHoaNhapKho) {
        this.stt = soThuTu;
        this.loaiHangHoa = loaHangHoa;
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soHangHoaTonKho = soHangHoaTonKho;
        this.giaNhapHangHoa = giaNhapHangHoa;
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
    }

    public Model() {
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setSoHangHoaTonKho(int soHangHoaTonKho) {
        this.soHangHoaTonKho = soHangHoaTonKho;
    }

    public void setGiaNhapHangHoa(Float giaNhapHangHoa) {
        this.giaNhapHangHoa = giaNhapHangHoa;
    }

    public void setNgayHangHoaNhapKho(String ngayHangHoaNhapKho) {
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
    }

    public void setLoaiHangHoa(String loaiHangHoa) {
        this.loaiHangHoa = loaiHangHoa;
    }

    public void setSoThuTu(int stt) {
        this.stt = stt;
    }

    public int getSoThuTu() {
        return stt;
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public int getSoHangHoaTonKho() {
        return soHangHoaTonKho;
    }

    public float getGiaNhapHangHoa() {
        return giaNhapHangHoa;
    }

    public String getNgayHangHoaNhapKho() {
        return ngayHangHoaNhapKho;
    }
}
