package oop10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop10/product.properties"));
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		TV tv = (TV) tvClass.getConstructor().newInstance();
		
		String speakerName = prop.getProperty	("speaker");
		try {
			Class speakerClass = Class.forName(speakerName);
			Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
			tv.setSpeaker(speaker);
		}catch (Exception e) {}
			
		tv.powerOn();
		tv.powerDown();
		tv.chanelUp();
		tv.chanelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerDown();

	}
}
