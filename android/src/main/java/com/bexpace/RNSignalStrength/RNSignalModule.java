package com.bexpace.RNSignalStrength;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.OkHttpClientProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by bexp on 10/23/16.
 */

public class RNSignalModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNSignalModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        OkHttpClient client = OkHttpClientProvider.getOkHttpClient();
        OkHttpClient replacementClient = client
                .newBuilder()
                .addNetworkInterceptor(new Interceptor() {
               @Override
               public Response intercept(Chain chain) throws IOException {
                   Request originalRequest = chain.request();
                   Request requestWithUserAgent = originalRequest.newBuilder()
                           .addHeader("Hello", "World")
                           .build();
                   return chain.proceed(requestWithUserAgent);
               }
           }
        ).build();
        OkHttpClientProvider.replaceOkHttpClient(replacementClient);
    }

    @Override
    public String getName() {
        return "RNSignalStrength";
    }

    @Override
    public @Nullable Map<String, Object> getConstants() {
        HashMap<String, Object> constants = new HashMap<String, Object>();

        constants.put("signal", "1");
        constants.put("hello", "world");

        return constants;
    }
}