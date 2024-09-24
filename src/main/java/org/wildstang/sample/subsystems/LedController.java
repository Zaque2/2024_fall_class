package org.wildstang.sample.subsystems;

import org.wildstang.framework.io.inputs.Input;
import org.wildstang.framework.subsystems.Subsystem;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Subsystem used to test all controller buttons and axes.
 * Each Input has a SmartDashboard widget for its state.
 * A pre-arranged Shuffleboard config can be found at /shuffleboards/input-test.json
 * @author Liam
 */
public class LedController implements Subsystem {

    private AddressableLED led;
    private AddressableLEDBuffer ledBuffer;

    private int port = 0;
    private int length = 53;

    @Override
    public void init() {
        led = new AddressableLED(port);
        ledBuffer = new AddressableLEDBuffer(length);
        led.setLength(ledBuffer.getLength());
        for (int i = 0; i < length; i++){
            ledBuffer.setRGB(i, 0, 0, 0);
        }
        led.setData(ledBuffer);
        led.start();
    }

    @Override
    public void update() {
        
        for (int i = 0; i < length; i++) {
            ledBuffer.setRGB(i, 0, 255, 0);
        }
        
        led.setData(ledBuffer);
        led.start();
    }

    @Override
    public void inputUpdate(Input source) {}

    @Override
    public void selfTest() {}

    @Override
    public void resetState() {}

    @Override
    public String getName() {
        return "LedController";
    }
}