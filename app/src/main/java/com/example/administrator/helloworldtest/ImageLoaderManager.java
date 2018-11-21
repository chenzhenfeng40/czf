package com.example.administrator.helloworldtest;

import android.content.Context;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class ImageLoaderManager {
    private static ImageLoaderManager mInstance;
    public static ImageLoaderManager getmInstance(){
        if (mInstance==null){
            synchronized (ImageLoaderManager.class){
                if (mInstance==null){
                    mInstance=new ImageLoaderManager();
                }
            }
        }
        return mInstance;
    }
    public ImageLoaderManager(){
        if (mInstance==null){
            ImageLoader.getInstance()
                    .init(customImageLoaderConfig(MainActivity.getContext()));
            ImageLoader.getInstance().init(defaultImageLoaderConfig());
        }


    }
    private ImageLoaderConfiguration defaultImageLoaderConfig(){
        return ImageLoaderConfiguration.createDefault(MainActivity.getContext());
    }
    private ImageLoaderConfiguration customImageLoaderConfig(Context context){

    }

    public static DisplayImageOptions options = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.drawable.)
}
