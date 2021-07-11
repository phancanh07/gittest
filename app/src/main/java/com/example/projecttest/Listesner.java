package com.example.projecttest;

import android.graphics.Bitmap;

public interface Listesner {
    void onImageLoad(Bitmap bitmap);

    void onError();
}
