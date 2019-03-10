package encrypt.service;

public class MyMessage {

    private String text;

    public MyMessage() {
    }

    public MyMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
