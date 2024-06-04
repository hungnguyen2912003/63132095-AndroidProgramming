package thi.NguyenKhacDuyHung63132095.dethi1.adapter;

public class FamousCity {
    String tenCity;
    String QuocGia;
    String HinhAnh;

    public FamousCity(String tenCity, String quocGia, String hinhAnh) {
        this.tenCity = tenCity;
        QuocGia = quocGia;
        HinhAnh = hinhAnh;
    }

    public String getTenCity() {
        return tenCity;
    }

    public void setTenCity(String tenCity) {
        this.tenCity = tenCity;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }
}
