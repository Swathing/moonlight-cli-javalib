package com.github.swathing.stream;

import com.github.swathing.stream.enums.AudioType;

public class AudioConfig {

    private AudioType audioType = AudioType.STEREO;
    private boolean isUsingHostAudio, onlyOnFocusAudio = false;

    public String getAudioType() {
        return audioType.getName();
    }

    public boolean isUsingHostAudio() {
        return isUsingHostAudio;
    }

    public boolean onlyOnFocusAudio() {
        return onlyOnFocusAudio;
    }

    public AudioConfig setUseHostAudio(boolean isUsingHostAudio) {
        this.isUsingHostAudio = isUsingHostAudio;
        return this;
    }

    public AudioConfig setAudioOnlyOnFocus(boolean onlyOnFocusAudio) {
        this.onlyOnFocusAudio = onlyOnFocusAudio;
        return this;
    }

    public AudioConfig setAudioType(AudioType audioType) {
        this.audioType = audioType;
        return this;
    }
}
