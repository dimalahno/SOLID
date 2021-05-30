package kz.solid.lsp.mediaplayer_lsp_solution;

public class VideoUnsupportedException extends RuntimeException{

    public VideoUnsupportedException(String message) {
        super(message);
    }
}
