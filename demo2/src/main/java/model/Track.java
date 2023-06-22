package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;

    public String artist;

    public Integer duration;

    public Integer trackNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    public Album album;
    public void setId(Long id) {
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
    public Long getId() {
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
