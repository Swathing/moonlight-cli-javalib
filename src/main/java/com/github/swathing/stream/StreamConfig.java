package com.github.swathing.stream;

import com.github.swathing.stream.enums.CodecType;
import com.github.swathing.stream.enums.DecoderType;

public class StreamConfig {

    private int packetSize = 1024;
    private int bitRateKbps = 30000;
    private CodecType codecType = CodecType.AUTO;
    private DecoderType decoderType = DecoderType.AUTO;
    private boolean useGameOptimization, keepAwake, usePerformanceOverlay, isQuitAfter = false;

    public int getBitRateKbps() {
        return bitRateKbps;
    }

    public int getPacketSize() {
        return packetSize;
    }

    public String getCodecType() {
        return codecType.getName();
    }

    public String getDecoderType() {
        return decoderType.getName();
    }

    public boolean isUsingGameOptimization() {
        return useGameOptimization;
    }

    public boolean isQuitAfter() {
        return isQuitAfter;
    }

    public boolean isKeepAwake() {
        return keepAwake;
    }

    public boolean isUsingPerformanceOverlay() {
        return usePerformanceOverlay;
    }

    public StreamConfig setBitRateKbps(int bitRateKbps) {
        this.bitRateKbps = bitRateKbps;
        return this;
    }

    public StreamConfig setCodecType(CodecType codecType) {
        this.codecType = codecType;
        return this;
    }

    public StreamConfig setDecoderType(DecoderType decoderType) {
        this.decoderType = decoderType;
        return this;
    }

    public StreamConfig setUseGameOptimization(boolean useGameOptimization) {
        this.useGameOptimization = useGameOptimization;
        return this;
    }

    public StreamConfig setQuitAfter(boolean isQuitAfter) {
        this.isQuitAfter = isQuitAfter;
        return this;
    }

    public StreamConfig setKeepAwake(boolean keepAwake) {
        this.keepAwake = keepAwake;
        return this;
    }

    public StreamConfig setUsePerformanceOverlay(boolean usePerformanceOverlay) {
        this.usePerformanceOverlay = usePerformanceOverlay;
        return this;
    }

    public StreamConfig setPacketSize(int packetSize) {
        this.packetSize = packetSize;
        return this;
    }
}
