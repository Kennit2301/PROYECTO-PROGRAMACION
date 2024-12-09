package util.managers;

import util.cache.FontCache;

import java.awt.*;
import java.io.File;

public class FontManager {

	private static FontManager instance;

	private final FontCache fontCache;

	private FontManager() {

		fontCache = FontCache.getInstance();
		initFonts();
	}

	private void initFonts() {

		fontCache.addFont("Standard", new Font("Arial", Font.BOLD, 15));
	}

	public static FontManager getInstance() {

		if (instance == null) {
			instance = new FontManager();
		}
		return instance;
	}

	public Font getFont(String fontName) {

		return fontCache.getFont(fontName);
	}
}
