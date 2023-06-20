CREATE DATABASE music CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE TABLE albums (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    artist VARCHAR(255) NOT NULL,
    release_year YEAR,
    genre VARCHAR(255),
    num_tracks INT
);
CREATE TABLE tracks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    artist VARCHAR(255) NOT NULL,
    duration TIME,
    track_number INT,
    album_id INT,
    FOREIGN KEY (album_id) REFERENCES albums(id)
);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('The Dark Side of the Moon', 'Pink Floyd', 1973, 'Progressive Rock', 10);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Nevermind', 'Nirvana', 1991, 'Grunge', 13);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Back in Black', 'AC/DC', 1980, 'Hard Rock', 10);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Thriller', 'Michael Jackson', 1982, 'Pop', 9);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Jagged Little Pill', 'Alanis Morissette', 1995, 'Alternative Rock', 12);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Born to Run', 'Bruce Springsteen', 1975, 'Rock', 8);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Purple Rain', 'Prince', 1984, 'Pop Rock', 9);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('Ten', 'Pearl Jam', 1991, 'Grunge', 11);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('The Joshua Tree', 'U2', 1987, 'Rock', 11);
INSERT INTO albums (title, artist, release_year, genre, num_tracks)
VALUES ('American Idiot', 'Green Day', 2004, 'Punk Rock', 13);

INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Stairway to Heaven', 'Led Zeppelin', '00:08:03', 4, 2);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Like a Rolling Stone', 'Bob Dylan', '00:06:13', 2, 3);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Smells Like Teen Spirit', 'Nirvana', '00:05:01', 1, 4);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Hotel California', 'Eagles', '00:06:31', 4, 1);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('I Will Always Love You', 'Whitney Houston', '00:04:35', 3, 5);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Hey Jude', 'The Beatles', '00:07:11', 1, 6);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Billie Jean', 'Michael Jackson', '00:04:54', 2, 7);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Thunderstruck', 'AC/DC', '00:04:53', 1, 8);
INSERT INTO tracks (title, artist, duration, track_number, album_id)
VALUES ('Sweet Child O'' Mine', 'Guns N'' Roses', '00:05:55', 1, 9);





