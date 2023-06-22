package service;

import exception.TrackNotFoundException;
import model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TrackRepository;

import java.util.List;

@Service
public class TrackService {

    private final TrackRepository trackRepository;

    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public List<Track> getAllTracks() {

        return trackRepository.findAll();
    }

    public Track getTrackById(Long id) {
        return trackRepository.findById(id).orElseThrow(() -> new TrackNotFoundException(id));
    }

    public Track createTrack(Track track) {

        return trackRepository.save(track);
    }

    public Track updateTrack(Long id, Track trackDetails) {
        Track track = trackRepository.findById(id).orElseThrow(() -> new TrackNotFoundException(id));
        track.setTitle(trackDetails.getTitle());
        track.setArtist(trackDetails.getArtist());
        track.setDuration(trackDetails.getDuration());
        track.setTrackNumber(trackDetails.getTrackNumber());
        track.setAlbum(trackDetails.getAlbum());
        return trackRepository.save(track);
    }

    public void deleteTrack(Long id) {
        Track track = trackRepository.findById(id).orElseThrow(() -> new TrackNotFoundException(id));
        trackRepository.delete(track);
    }
}
