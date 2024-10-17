
package PlaylistLagu;



public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Night Changes");
        playlist.addSong("December");
        playlist.addSong("Calm Down");
        playlist.addSong("Kill Bill");

        System.out.println("Playlist:");
        playlist.displayPlaylist();
    }
}