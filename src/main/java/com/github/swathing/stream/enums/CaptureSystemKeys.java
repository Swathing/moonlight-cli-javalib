package com.github.swathing.stream.enums;

public enum CaptureSystemKeys {

    ALWAYS("always"),
    FULLSCREEN("fullscreen"),
    NEVER("never");

    private final String name;

    CaptureSystemKeys(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
