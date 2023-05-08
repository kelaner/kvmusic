package com.example.kvmusic;

public class LocalMusicBean {

    private final String id; //歌曲id
    private final String song; //歌曲名称
    private final String singer; //歌手名称
    private final String album; //专辑名称
    private final String duration; //歌曲时长
    private final String path; //歌曲路径
    private final String albumArt;  //专辑地址

    public LocalMusicBean(String id, String song, String singer, String album, String duration, String path, String albumArt) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.album = album;
        this.duration = duration;
        this.path = path;
        this.albumArt = albumArt;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public String getId() {
        return id;
    }

    public String getSong() {
        return song;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }

    public String getPath() {
        return path;
    }

}
