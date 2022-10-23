package otus.ru.java.pro.providers.data;

public enum PostData {

    CONTENT("Content");

    private String content;

    PostData(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
