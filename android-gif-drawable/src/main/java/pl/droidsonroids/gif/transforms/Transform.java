package pl.droidsonroids.gif.transforms;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import pl.droidsonroids.gif.GifDrawable;

/**
 * Interface to support clients performing custom transformations before the current GIF Bitmap is drawn.
 */
public interface Transform {

	/**
	 * Called by {@link GifDrawable} when its {@link GifDrawable#onBoundsChange(Rect)} is called.
	 * @param bounds new bounds
	 */
	void onBoundsChange(Rect bounds);

	/**
	 * Called by {@link GifDrawable} when its {@link GifDrawable#draw(Canvas)} is called.
	 *
	 * @param canvas The canvas supplied by the system to draw on.
	 * @param paint  The paint to use for custom drawing.
	 * @param buffer The current Bitmap for the GIF.
	 */
	void onDraw(Canvas canvas, Paint paint, Bitmap buffer);
}
