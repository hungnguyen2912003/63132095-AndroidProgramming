package ntu.nguyenkhacduyhung.bottomnavigationview.Notify;

public class Notify {
    String anhAuthor;
    String thoigianDang;
    String noiDung;

    public Notify(String anhAuthor, String thoigianDang, String noiDung) {
        this.anhAuthor = anhAuthor;
        this.thoigianDang = thoigianDang;
        this.noiDung = noiDung;
    }

    public String getAnhAuthor() {
        return anhAuthor;
    }

    public void setAnhAuthor(String anhAuthor) {
        this.anhAuthor = anhAuthor;
    }

    public String getThoigianDang() {
        return thoigianDang;
    }

    public void setThoigianDang(String thoigianDang) {
        this.thoigianDang = thoigianDang;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
