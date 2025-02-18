package mytunes.dal.interfaces;

import mytunes.be.Playlist;
import mytunes.dal.exception.DALexception;

import java.util.List;

public interface IPlaylistRepository {
    List<Playlist> getAllPlaylists() throws DALexception;

    Playlist createPlaylist(String playName) throws DALexception;

    void deletePlaylist(Playlist playlist) throws DALexception;

    void updatePlaylistName(Playlist playlist, String newPlaylistName) throws DALexception;

    int getNumberOfSongsOnPlaylist(Playlist playlist) throws DALexception;

    double getTotalTimeOnPlaylist(Playlist playlist) throws DALexception;

    Playlist getPlaylist(int id) throws DALexception;

    //updating a playlist when we add a new item
    void updateTotalTimeOnPlaylistADD(Playlist playlist, int addedSongTime) throws DALexception;

    void incrementTheNumberOfSongsOnPlaylist(Playlist playlist) throws DALexception;;

    void decrementTheNumberOfSongsOnPlaylist(Playlist playlist) throws DALexception;
    void updateTotalTimeOnPlaylistREMOVE(Playlist playlist, int addedSongTime) throws DALexception;
}
