package service;

import exception.AlbumNotFoundException;
import model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AlbumRepository;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album getAlbumById(Long id) {
        return albumRepository.findById(id).orElseThrow(() -> new AlbumNotFoundException(id));
    }

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbum(Long id, Album albumDetails) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new AlbumNotFoundException(id));
        album.setTitle(albumDetails.getTitle());
        album.setArtist(albumDetails.getArtist());
        album.setYear(albumDetails.getYear());
        return albumRepository.save(album);
    }

    public void deleteAlbum(Long id) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new AlbumNotFoundException(id));
        albumRepository.delete(album);
    }
}
