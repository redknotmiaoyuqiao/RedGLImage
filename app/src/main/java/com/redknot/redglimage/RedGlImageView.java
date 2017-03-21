package com.redknot.redglimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.AttributeSet;

/**
 * Created by yuqiaomiao on 21/03/2017.
 */

public class RedGlImageView extends GLSurfaceView {

    private final int CONTEXT_CLIENT_VERSION = 2;

    private Context context;

    public RedGlImageView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public RedGlImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init(){
        this.setEGLContextClientVersion(CONTEXT_CLIENT_VERSION);
        this.setRenderer(new DrawRenderer(this.context));
    }

    public void setImage(Bitmap bitmap){

    }

}
