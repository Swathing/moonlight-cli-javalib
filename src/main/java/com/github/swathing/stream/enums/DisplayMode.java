package com.github.swathing.stream.enums;

public enum DisplayMode {

    BORDERLESS("borderless"),
    FULLSCREEN("fullscreen"),
    WINDOWED("windowed");

    private final String name;

    DisplayMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
