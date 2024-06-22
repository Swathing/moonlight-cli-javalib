package com.github.swathing.stream.enums;

public enum DecoderType {

    SOFTWARE("software"),
    HARDWARE("hardware"),
    AUTO("auto");

    private final String name;

    DecoderType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
