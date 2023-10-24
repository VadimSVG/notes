package vadimsw.notes.models;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons, full_text;
    private byte[] image; // Поле для хранения изображения в виде массива байт
    @Column(name = "font_family")
    private String fontFamily;
    @Column(name = "font_size")
    private String fontSize;
    @Column(name = "is_italic")
    private Boolean isItalic;
    @Column(name = "is_bold")
    private Boolean isBold;

    public Note(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
    public Note(String title, String anons, String full_text, byte[] image) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.image = image;
    }
    public Note(String title, String anons, String full_text, byte[] image, String fontFamily, String fontSize) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.image = image;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
    public Note(String title, String anons, String full_text, byte[] image, String fontFamily, String fontSize, boolean isItalic, boolean isBold) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.image = image;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isItalic = isItalic;
        this.isBold = isBold;
    }
    public Note() {
    }
    public void setAnons(String anons) {
        this.anons = anons;
    }
    public String getAnons() {
        return anons;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFull_text() {
        return full_text;
    }
    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }
    public void setText(String text) {
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public String getFontFamily() {
        return fontFamily;
    }
    public String getFontSize() {
        return fontSize;
    }
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
    public Boolean getIsItalic() {
        return isItalic;
    }
    public void setIsItalic(Boolean isItalic) {
        this.isItalic = isItalic;
    }
    public Boolean getIsBold() {
        return isBold;
    }
    public void setIsBold(Boolean bold) {
        isBold = bold;
    }
}
