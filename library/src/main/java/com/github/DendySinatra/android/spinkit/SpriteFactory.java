package com.github.DendySinatra.android.spinkit;

import com.github.DendySinatra.android.spinkit.sprite.Sprite;
import com.github.DendySinatra.android.spinkit.style.ChasingDots;
import com.github.DendySinatra.android.spinkit.style.Circle;
import com.github.DendySinatra.android.spinkit.style.CubeGrid;
import com.github.DendySinatra.android.spinkit.style.DoubleBounce;
import com.github.DendySinatra.android.spinkit.style.FadingCircle;
import com.github.DendySinatra.android.spinkit.style.FoldingCube;
import com.github.DendySinatra.android.spinkit.style.MultiplePulse;
import com.github.DendySinatra.android.spinkit.style.MultiplePulseRing;
import com.github.DendySinatra.android.spinkit.style.Pulse;
import com.github.DendySinatra.android.spinkit.style.PulseRing;
import com.github.DendySinatra.android.spinkit.style.RotatingCircle;
import com.github.DendySinatra.android.spinkit.style.RotatingPlane;
import com.github.DendySinatra.android.spinkit.style.ThreeBounce;
import com.github.DendySinatra.android.spinkit.style.WanderingCubes;
import com.github.DendySinatra.android.spinkit.style.Wave;

/**
 * Created by ybq.
 */
public class SpriteFactory {

    public static Sprite create(Style style) {
        Sprite sprite = null;
        switch (style) {
            case ROTATING_PLANE:
                sprite = new RotatingPlane();
                break;
            case DOUBLE_BOUNCE:
                sprite = new DoubleBounce();
                break;
            case WAVE:
                sprite = new Wave();
                break;
            case WANDERING_CUBES:
                sprite = new WanderingCubes();
                break;
            case PULSE:
                sprite = new Pulse();
                break;
            case CHASING_DOTS:
                sprite = new ChasingDots();
                break;
            case THREE_BOUNCE:
                sprite = new ThreeBounce();
                break;
            case CIRCLE:
                sprite = new Circle();
                break;
            case CUBE_GRID:
                sprite = new CubeGrid();
                break;
            case FADING_CIRCLE:
                sprite = new FadingCircle();
                break;
            case FOLDING_CUBE:
                sprite = new FoldingCube();
                break;
            case ROTATING_CIRCLE:
                sprite = new RotatingCircle();
                break;
            case MULTIPLE_PULSE:
                sprite = new MultiplePulse();
                break;
            case PULSE_RING:
                sprite = new PulseRing();
                break;
            case MULTIPLE_PULSE_RING:
                sprite = new MultiplePulseRing();
                break;
            default:
                break;
        }
        return sprite;
    }
}
