package com.example.adtrace_flutter_oaid;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.adtrace.sdk.oaid.AdTraceOaid;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AdTraceOaid.readOaid(this);
    }
}
