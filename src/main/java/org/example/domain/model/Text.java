package org.example.domain.model;

public class Text {
    private String title;
    private String content;

    private int titleNum;
    private String regDate;

    Text() {
    }

    Text(String title, String content, int titleNum) {
        this.title = title;
        this.content = content;
        this.titleNum = titleNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getTitleNum() {
        return titleNum;
    }

    public void setTitleNum(int tilteNum) {
        this.titleNum = tilteNum;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
