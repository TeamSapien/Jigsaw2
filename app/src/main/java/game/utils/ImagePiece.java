package game.utils;

import android.graphics.Bitmap;

/**
 * Created by Lily on 15/2/8.
 */
public class ImagePiece {
    private int index;
    private Bitmap bitmap;

    public ImagePiece(){

    }
    public ImagePiece(int index,Bitmap bitmap){
        this.index=index;
        this.bitmap=bitmap;
    }

    public int getIndex() {
        return index;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public String toString() {
        return "ImagePiece{" +
                "index=" + index +
                ", bitmap=" + bitmap +
                '}';
    }
}
