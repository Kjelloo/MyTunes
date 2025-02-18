package mytunes.be;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private int id;
    private String name;
    private List<Song> songs;
    private int numberOfSongs;
    private int totalPlaytime; // result in seconds

    public Playlist(int id, String name, List<Song> songs, int numberOfSongs, int totalPlaytime) {
        this.id = id;
        this.name = name;
        if(songs==null) this.songs = new ArrayList<>();
        else this.songs = songs;
        this.numberOfSongs = numberOfSongs;
        this.totalPlaytime = totalPlaytime;
    }

    /**
     * I don't know what this method does
     * @return
     */
    public List<Song> getSongs() {
        return songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public int getNumberOfSongs() {
        if(songs!=null) return songs.size();
        else return 0;
        //return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public int getTotalPlaytime() {
        return totalPlaytime;
    }

    public void setTotalPlaytime(int totalPlaytime) {
        this.totalPlaytime = totalPlaytime;
    }

    public void addSongToPlaylist(Song song) {
        songs.add(song);
    }

    public void removeSongFromPlaylist(Song song)
    {
        songs.remove(song);
    }
}


