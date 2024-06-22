package com.github.swathing;

import com.github.swathing.stream.AudioConfig;
import com.github.swathing.stream.ControllerConfig;
import com.github.swathing.stream.StreamConfig;
import com.github.swathing.stream.VideoConfig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MoonLightBuilder {

    private final String ipAddress;
    private final String application;
    private final VideoConfig videoConfig = new VideoConfig();
    private final AudioConfig audioConfig = new AudioConfig();
    private final StreamConfig streamConfig = new StreamConfig();
    private final ControllerConfig controllerConfig = new ControllerConfig();

    public MoonLightBuilder(String ipAddress, String application) {
        this.application = application;
        this.ipAddress = ipAddress;
    }

    public String getApplication() {
        return application;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public ControllerConfig getControllerConfig() {
        return controllerConfig;
    }

    public VideoConfig getVideoConfig() {
        return videoConfig;
    }

    public AudioConfig getAudioConfig() {
        return audioConfig;
    }

    public StreamConfig getStreamConfig() {
        return streamConfig;
    }

    public void build() {
        try {
            List<String> command = new ArrayList<>();
            ProcessBuilder pb = new ProcessBuilder();
            command.add("moonlight");
            command.add("stream");

            command.add("--resolution");
            command.add(getVideoConfig().getResolution());
            command.add("--fps");
            command.add(String.valueOf(getVideoConfig().getFrameRate()));
            command.add("--bitrate");
            command.add(String.valueOf(getStreamConfig().getBitRateKbps()));
            command.add("--packet-size");
            command.add(String.valueOf(getStreamConfig().getPacketSize()));
            command.add("--display-mode");
            command.add(String.valueOf(getVideoConfig().getDisplayMode()));
            command.add("--audio-config");
            command.add(getAudioConfig().getAudioType());
            command.add("--video-codec");
            command.add(getStreamConfig().getCodecType());
            command.add("--video-decoder");
            command.add(getStreamConfig().getDecoderType());

            command.add("--" + (getVideoConfig().isUsingFramePacing() ? "frame-pacing" : "no-frame-pacing"));
            command.add("--" + (getVideoConfig().isUsingVsync() ? "vsync" : "no-vsync"));
            command.add("--" + (getVideoConfig().isUsingHDR() ? "hdr" : "no-hdr"));

            command.add("--" + (getStreamConfig().isUsingGameOptimization() ? "game-optimization" : "no-game-optimization"));
            command.add("--" + (getStreamConfig().isQuitAfter() ? "quit-after" : "no-quit-after"));
            command.add("--" + (getStreamConfig().isKeepAwake() ? "keep-awake" : "no-keep-awake"));
            command.add("--" + (getStreamConfig().isUsingPerformanceOverlay() ? "performance-overlay" : "no-performance-overlay"));

            command.add("--" + (getAudioConfig().isUsingHostAudio() ? "audio-on-host" : "no-audio-on-host"));
            command.add("--" + (getAudioConfig().onlyOnFocusAudio() ? "mute-on-focus-loss" : "no-mute-on-focus-loss"));

            command.add("--" + (getControllerConfig().isUsingMultiController() ? "multi-controller" : "no-multi-controller"));
            command.add("--" + (getControllerConfig().isUsingAbsoluteMouse() ? "absolute-mouse" : "no-absolute-mouse"));
            command.add("--" + (getControllerConfig().isUsingBackgroundGamepad() ? "background-gamepad" : "no-background-gamepad"));
            command.add("--" + (getControllerConfig().isUsingMouseButtonsSwap() ? "mouse-buttons-swap" : "no-mouse-buttons-swap"));
            command.add("--" + (getControllerConfig().isUsingSwapGamepadButtons() ? "swap-gamepad-buttons" : "no-swap-gamepad-buttons"));
            command.add("--" + (getControllerConfig().isUsingReverseScrollDirection() ? "reverse-scroll-direction" : "no-reverse-scroll-direction"));
            command.add("--" + (getControllerConfig().isUsingTouchScreenTrackpad() ? "touchscreen-trackpad" : "no-touchscreen-trackpad"));

            command.add(ipAddress);
            command.add(application);
            pb.command(command).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
