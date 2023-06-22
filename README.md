# music-albums-tracks
Подключена БД (MySQL). Клиент-серверная структура на основе REST. Проект собран на Maven.
База данных включает в себя две таблицы - Альбом и Треки. Свойства id (номер), title (название), artist (автор), release_year (год создания), genre (жанр), num_tracks (количество треков в альбоме) в таблице Альбома. И свойства id (номер), title (название), artist (автор), duration (продолжительность трека), track_number (номер трека), album_id (номер альбома) в таблице Трека.
Приложение написано на Java при помощи Spring и сопутствующих библиотек.

Список эндпоинтов: 
Получить список треков
GET http://localhost:8080/api/tracks
Создать трек
POST http://localhost:8080/api/tracks
Обновить трек
PUT http://localhost:8080/api/tracks
Удалить трек
DELETE http://localhost:8080/api/tracks/
Получить список альбомов
GET http://localhost:8080/api/albums
Создать альбом
POST http://localhost:8080/api/albums/
Обновить альбом
PUT http://localhost:8080/api/albums/
Удалить альбом
DELETE http://localhost:8080/api/albums/

Пример запроса с использованием cURL для получения всех альбомов:
curl -X GET http://localhost:8080/albums
Пример запроса с использованием HTTP для получения альбома по идентификатору:
http GET http://localhost:8080/albums/1
Пример запроса с использованием Wget для создания нового альбома:
wget --header "Content-Type: application/json" \
     --post-data '{"title": "New Album", "artist": "New Artist", "year": 2022}' \
     http://localhost:8080/albums
