package com.github.swathing.stream.enums;

public enum AudioType {

    STEREO("stereo"),
    SURROUND5_1("5.1-surround"),
    SURROUND7_1("7.1-surround");

    private final String name;

    AudioType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
