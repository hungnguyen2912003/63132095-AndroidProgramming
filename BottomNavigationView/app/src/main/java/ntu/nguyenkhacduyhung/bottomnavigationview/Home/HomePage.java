package ntu.nguyenkhacduyhung.bottomnavigationview.Home;

public class HomePage {

    String avatar;
    String tenNguoiDangBai;

    String tgDangBai;

    String noidungDang;

    String anhBai;

    int soLike, soCmt, soShare;

    public HomePage(String avatar, String tenNguoiDangBai, String tgDangBai, String noidungDang, String anhBai, int soLike, int soCmt, int soShare) {
        this.avatar = avatar;
        this.tenNguoiDangBai = tenNguoiDangBai;
        this.tgDangBai = tgDangBai;
        this.noidungDang = noidungDang;
        this.anhBai = anhBai;
        this.soLike = soLike;
        this.soCmt = soCmt;
        this.soShare = soShare;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTenNguoiDangBai() {
        return tenNguoiDangBai;
    }

    public void setTenNguoiDangBai(String tenNguoiDangBai) {
        this.tenNguoiDangBai = tenNguoiDangBai;
    }

    public String getTgDangBai() {
        return tgDangBai;
    }

    public void setTgDangBai(String tgDangBai) {
        this.tgDangBai = tgDangBai;
    }

    public String getNoidungDang() {
        return noidungDang;
    }

    public void setNoidungDang(String noidungDang) {
        this.noidungDang = noidungDang;
    }

    public String getAnhBai() {
        return anhBai;
    }

    public void setAnhBai(String anhBai) {
        this.anhBai = anhBai;
    }

    public int getSoLike() {
        return soLike;
    }

    public void setSoLike(int soLike) {
        this.soLike = soLike;
    }

    public int getSoCmt() {
        return soCmt;
    }

    public void setSoCmt(int soCmt) {
        this.soCmt = soCmt;
    }

    public int getSoShare() {
        return soShare;
    }

    public void setSoShare(int soShare) {
        this.soShare = soShare;
    }
}
