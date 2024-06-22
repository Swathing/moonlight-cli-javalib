package com.github.swathing.stream;

public class ControllerConfig {

    private boolean isUsingMultiController, isUsingAbsoluteMoisUsing,
            isUsingMouseButtonsSwap, isUsingTouchScreenTrackpad,
            isUsingReverseScrollDirection, isUsingBackgroundGamepad, isUsingSwapGamepadButtons = false;

    public boolean isUsingMultiController() {
        return isUsingMultiController;
    }

    public boolean isUsingAbsoluteMouse() {
        return isUsingAbsoluteMoisUsing;
    }

    public boolean isUsingMouseButtonsSwap() {
        return isUsingMouseButtonsSwap;
    }

    public boolean isUsingTouchScreenTrackpad() {
        return isUsingTouchScreenTrackpad;
    }

    public boolean isUsingReverseScrollDirection() {
        return isUsingReverseScrollDirection;
    }

    public boolean isUsingBackgroundGamepad() {
        return isUsingBackgroundGamepad;
    }

    public boolean isUsingSwapGamepadButtons() {
        return isUsingSwapGamepadButtons;
    }

    public ControllerConfig setUseMultiController(boolean isUsingMultiController) {
        this.isUsingMultiController = isUsingMultiController;
        return this;
    }

    public ControllerConfig setUseAbsoluteMouse(boolean isUsingAbsoluteMoisUsing) {
        this.isUsingAbsoluteMoisUsing = isUsingAbsoluteMoisUsing;
        return this;
    }

    public ControllerConfig setUseMouseButtonsSwap(boolean isUsingMouseButtonsSwap) {
        this.isUsingMouseButtonsSwap = isUsingMouseButtonsSwap;
        return this;
    }

    public ControllerConfig setUseTouchScreenTrackpad(boolean isUsingTouchScreenTrackpad) {
        this.isUsingTouchScreenTrackpad = isUsingTouchScreenTrackpad;
        return this;
    }

    public ControllerConfig setUseReverseScrollDirection(boolean isUsingReverseScrollDirection) {
        this.isUsingReverseScrollDirection = isUsingReverseScrollDirection;
        return this;
    }

    public ControllerConfig setUseBackgroundGamepad(boolean isUsingBackgroundGamepad) {
        this.isUsingBackgroundGamepad = isUsingBackgroundGamepad;
        return this;
    }

    public ControllerConfig setUseSwapGamepadButtons(boolean isUsingSwapGamepadButtons) {
        this.isUsingSwapGamepadButtons = isUsingSwapGamepadButtons;
        return this;
    }
}
