package dairy.data.models;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String diaryId;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(String diaryId, int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
        this.diaryId = diaryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getLocalDate() {
        return dateCreated;
    }

    public void setLocalDate(LocalDateTime dateCreated) {
        this.dateCreated = this.dateCreated;
    }
    public String getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }

}
