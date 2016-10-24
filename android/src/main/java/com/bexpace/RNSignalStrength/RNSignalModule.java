package com.bexpace.RNSignalStrength;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bexp on 10/23/16.
 */

public class RNSignalModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNSignalModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
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