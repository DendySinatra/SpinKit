package android.spinkit;

import android.spinkit.sprite.Sprite;
import android.spinkit.style.ChasingDots;
import android.spinkit.style.Circle;
import android.spinkit.style.CubeGrid;
import android.spinkit.style.DoubleBounce;
import android.spinkit.style.FadingCircle;
import android.spinkit.style.FoldingCube;
import android.spinkit.style.MultiplePulse;
import android.spinkit.style.MultiplePulseRing;
import android.spinkit.style.Pulse;
import android.spinkit.style.PulseRing;
import android.spinkit.style.RotatingCircle;
import android.spinkit.style.RotatingPlane;
import android.spinkit.style.ThreeBounce;
import android.spinkit.style.WanderingCubes;
import android.spinkit.style.Wave;

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
