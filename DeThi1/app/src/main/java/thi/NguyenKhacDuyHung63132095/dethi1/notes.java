package thi.NguyenKhacDuyHung63132095.dethi1;

public class notes {
    int id;
    String Title;
    String Description;

    public notes(int id, String title, String description) {
        this.id = id;
        Title = title;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
