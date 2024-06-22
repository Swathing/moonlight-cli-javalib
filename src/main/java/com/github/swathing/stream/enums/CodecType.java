package com.github.swathing.stream.enums;

public enum CodecType {

    AV1("av1"),
    H_264("h.264"),
    HEVC("hevc"),
    AUTO("auto");

    private final String name;

    CodecType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
