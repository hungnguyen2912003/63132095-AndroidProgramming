package ntu.nguyenkhacduyhung.bottomnavigationview.Friend;

public class Friends {
    String tenBan;
    String hinhanhBan;

    int banChung;

    public Friends(String tenBan, String hinhanhBan, int banChung) {
        this.tenBan = tenBan;
        this.hinhanhBan = hinhanhBan;
        this.banChung = banChung;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getHinhanhBan() {
        return hinhanhBan;
    }

    public void setHinhanhBan(String hinhanhBan) {
        this.hinhanhBan = hinhanhBan;
    }

    public int getBanChung() {
        return banChung;
    }

    public void setBanChung(int banChung) {
        this.banChung = banChung;
    }
}
