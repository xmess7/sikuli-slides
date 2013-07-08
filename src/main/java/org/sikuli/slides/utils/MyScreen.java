/**
Khalid
*/
package org.sikuli.slides.utils;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class MyScreen {
	
	public static Dimension getScreenDimensions(){
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
	
	public static Rectangle getScreenBounds(){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
		return defaultScreen.getDefaultConfiguration().getBounds();
	}
}
