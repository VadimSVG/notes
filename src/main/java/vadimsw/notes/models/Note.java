package vadimsw.notes.models;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons, full_text;
    private byte[] image; // Поле для хранения изображения в виде массива байт

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
}
