package com.github.swathing.stream;

import com.github.swathing.stream.enums.DisplayMode;

public class VideoConfig {

    private DisplayMode displayMode = DisplayMode.FULLSCREEN;
    private String resolution = "1920x1080";
    private boolean isUsingVsync = true;
    private boolean isUsingHDR, useFramePacing = false;
    private int frameRate = 60;

    public String getDisplayMode() {
        return displayMode.getName();
    }

    public int getFrameRate() {
        return frameRate;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isUsingFramePacing() {
        return useFramePacing;
    }

    public boolean isUsingVsync() {
        return isUsingVsync;
    }

    public boolean isUsingHDR() {
        return isUsingHDR;
    }

    public VideoConfig setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
        return this;
    }

    public VideoConfig setUseFramePacing(boolean useFramePacing) {
        this.useFramePacing = useFramePacing;
        return this;
    }

    public VideoConfig setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public VideoConfig setUseVsync(boolean useVsync) {
        this.isUsingVsync = useVsync;
        return this;
    }

    public VideoConfig setFrameRate(int frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    public VideoConfig setUseHDR(boolean useHDR) {
        this.isUsingHDR = useHDR;
        return this;
    }
}
