package com.example.nayibo;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

/**
 * Created by nayibo on 2018/1/26.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFresco(this);
    }

    private void initFresco(Context context) {
        ImagePipelineConfig.newBuilder(context).setDownsampleEnabled(true).build();
        Fresco.initialize(context);
    }
}
