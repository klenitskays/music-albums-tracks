package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String artist;

    private Integer duration;

    private Integer trackNumber;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Album album;

    // Конструкторы, геттеры и сеттеры
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }
    public Album getAlbum() {
        return album;
    }

    public Integer getDuration() {
        return duration;
    }
}
