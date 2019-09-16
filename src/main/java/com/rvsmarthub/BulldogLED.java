package com.rvsmarthub;

import io.silverspoon.bulldog.core.gpio.DigitalOutput;
import io.silverspoon.bulldog.core.platform.Board;
import io.silverspoon.bulldog.core.platform.Platform;
import io.silverspoon.bulldog.core.util.BulldogUtil;
import io.silverspoon.bulldog.raspberrypi.RaspiNames;
  
public class BulldogLED {
  
  public static void main(String[] args) {
    //Detect the board we are running on
    Board board = Platform.createBoard();
    
    //Set up a digital output
    DigitalOutput output = board.getPin(RaspiNames.P1_11).as(DigitalOutput.class);

    // Blink the LED
    output.high();
    BulldogUtil.sleepMs(1000);
    output.low();
    }
}