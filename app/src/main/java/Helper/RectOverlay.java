package Helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;

public class RectOverlay extends GraphicOverlay.Graphic{
    private int rect_color = Color.RED;
    private float stroke_width = 4.0f;
    private Paint rect_paint;

    private GraphicOverlay graphicOverlay;
    private Rect rect;



    public RectOverlay(GraphicOverlay graphicOverlay, Rect rect) {
        super(graphicOverlay);
        rect_paint = new Paint();
        rect_paint.setColor(rect_color);
        rect_paint.setStyle(Paint.Style.STROKE);

        this.graphicOverlay = graphicOverlay;
        this.rect = rect;
    }

    @Override
    public void draw(Canvas canvas) {
        RectF rectf = new RectF(rect);
        rectf.left = translateX(rectf.left);
        rectf.right= translateX(rectf.right);
        rectf.top = translateY(rectf.top);
        rectf.bottom = translateY(rectf.bottom);

        canvas.drawRect(rectf,rect_paint);

    }
}
