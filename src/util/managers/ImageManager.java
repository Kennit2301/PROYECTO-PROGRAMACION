package util.managers;

import util.cache.ImageCache;

import javax.swing.*;
import java.awt.*;

public class ImageManager {

	private static ImageManager instance;

	private final ImageCache imageCache;

	private ImageManager() {

		imageCache = ImageCache.getInstance();
		initImages();
	}

	private void initImages() {

		addPanels();
		addHolders();
		addTabs();
		addPlayerElements();
		addButtons();
		//Characters
		imageCache.addImage("portrait",
				new ImageIcon("img/player/portrait.png").getImage());
	}

	private void addButtons() {
		//Buttons
		imageCache.addImage("attackButtonIdle",
				new ImageIcon("img/ui/buttons/attackButtonIdle.png").getImage());
		imageCache.addImage("attackButtonHover",
				new ImageIcon("img/ui/buttons/2H.png").getImage());
		imageCache.addImage("fleeButtonIdle",
				new ImageIcon("img/ui/buttons/fleeButtonIdle.png").getImage());
		imageCache.addImage("fleeButtonHover",
				new ImageIcon("img/ui/buttons/fleeButtonHover.png").getImage());
		imageCache.addImage("skillButtonIdle",
				new ImageIcon("img/ui/buttons/skillButtonIdle.png").getImage());
		imageCache.addImage("skillButtonHover",
				new ImageIcon("img/ui/buttons/skillButtonHover.png").getImage());
	}

	private void addPlayerElements() {
		//Player Elements
		imageCache.addImage("mp100", new ImageIcon("img/player/mp100.png").getImage());
		imageCache.addImage("mp80", new ImageIcon("img/player/mp80.png").getImage());
		imageCache.addImage("mp60", new ImageIcon("img/player/mp60.png").getImage());
		imageCache.addImage("mp40", new ImageIcon("img/player/mp40.png").getImage());
		imageCache.addImage("mp20", new ImageIcon("img/player/mp20.png").getImage());
		imageCache.addImage("mp0", new ImageIcon("img/player/mp0.png").getImage());
		imageCache.addImage("hp100", new ImageIcon("img/player/hp100.png").getImage());
		imageCache.addImage("hp80", new ImageIcon("img/player/hp80.png").getImage());
		imageCache.addImage("hp60", new ImageIcon("img/player/hp60.png").getImage());
		imageCache.addImage("hp40", new ImageIcon("img/player/hp40.png").getImage());
		imageCache.addImage("hp20", new ImageIcon("img/player/hp20.png").getImage());
		imageCache.addImage("hp0", new ImageIcon("img/player/hp0.png").getImage());
	}

	private void addTabs() {
		//Tabs
		imageCache.addImage("activeTab",
				new ImageIcon("img/ui/tabs/activeTab.png").getImage());
		imageCache.addImage("inactiveTab",
				new ImageIcon("img/ui/tabs/inactiveTab.png").getImage());
		imageCache.addImage("battleTabActive",
				new ImageIcon("img/ui/tabs/battleTabActive.png").getImage());
		imageCache.addImage("battleTabInactive",
				new ImageIcon("img/ui/tabs/battleTabInactive.png").getImage());
		imageCache.addImage("inventoryTabActive",
				new ImageIcon("img/ui/tabs/inventoryTabActive.png").getImage());
		imageCache.addImage("inventoryTabInactive",
				new ImageIcon("img/ui/tabs/inventoryTabInactive.png").getImage());
		imageCache.addImage("statusTabActive",
				new ImageIcon("img/ui/tabs/statusTabActive.png").getImage());
		imageCache.addImage("statusTabInactive",
				new ImageIcon("img/ui/tabs/statusTabInactive.png").getImage());
	}

	private void addHolders() {
		//Holders
		imageCache.addImage("expHolder",
				new ImageIcon("img/ui/holders/expHolder.png").getImage());
		imageCache.addImage("attackHolder",
				new ImageIcon("img/ui/holders/attackHolder.png").getImage());
		imageCache.addImage("defenseHolder",
				new ImageIcon("img/ui/holders/defenseHolder.png").getImage());
		imageCache.addImage("goldHolder",
				new ImageIcon("img/ui/holders/goldHolder.png").getImage());
		imageCache.addImage("dexterityHolder",
				new ImageIcon("img/ui/holders/dexterityHolder.png").getImage());
		imageCache.addImage("intelligenceHolder",
				new ImageIcon("img/ui/holders/intHolder.png").getImage());
		imageCache.addImage("luckHolder",
				new ImageIcon("img/ui/holders/lukHolder.png").getImage());
		imageCache.addImage("headArmorHolder",
				new ImageIcon("img/ui/holders/headArmorHolder.png").getImage());
		imageCache.addImage("chestArmorHolder",
				new ImageIcon("img/ui/holders/chestArmorHolder.png").getImage());
		imageCache.addImage("legArmorHolder",
				new ImageIcon("img/ui/holders/legArmorHolder.png").getImage());
		imageCache.addImage("feetArmorHolder",
				new ImageIcon("img/ui/holders/feetArmorHolder.png").getImage());
		imageCache.addImage("handArmorHolder",
				new ImageIcon("img/ui/holders/handArmorHolder.png").getImage());
		imageCache.addImage("resHolder",
				new ImageIcon("img/ui/holders/resHolder.png").getImage());
		imageCache.addImage("velHolder",
				new ImageIcon("img/ui/holders/velHolder.png").getImage());
		imageCache.addImage("weaponHolder",
				new ImageIcon("img/ui/holders/weaponHolder.png").getImage());
		imageCache.addImage("textHolder",
				new ImageIcon("img/ui/holders/textHolder.png").getImage());
		imageCache.addImage("jobHolder",
				new ImageIcon("img/ui/holders/jobHolder.png").getImage());
		imageCache.addImage("itemHolder",
				new ImageIcon("img/ui/holders/itemHolder.png").getImage());
	}

	private void addPanels() {
		//Paneles
		imageCache.addImage("statusPanel",
				new ImageIcon("img/ui/panels/statusPanel.png").getImage());
		imageCache.addImage("playerPanel",
				new ImageIcon("img/ui/panels/2.png").getImage());
		imageCache.addImage("enemyPanel",
				new ImageIcon("img/ui/panels/1.1png.png").getImage());
		imageCache.addImage("battlePanel",
				new ImageIcon("img/ui/panels/7.png").getImage());
		imageCache.addImage("charactersPanel",
				new ImageIcon("img/ui/panels/charactersPanel.png").getImage());
		imageCache.addImage("skillPanel",
				new ImageIcon("img/ui/panels/skillPanel.png").getImage());
		imageCache.addImage("dialogPanel",
				new ImageIcon("img/ui/panels/dialogPanel.png").getImage());
		imageCache.addImage("skillDetailPanel",
				new ImageIcon("img/ui/panels/skillDetailPanel.png").getImage());
		imageCache.addImage("inventoryPanel",
				new ImageIcon("img/ui/panels/inventoryPanel.png").getImage());
		imageCache.addImage("shopPanel",
				new ImageIcon("img/ui/panels/shopPanel.png").getImage());
	}

	public static ImageManager getInstance() {

		if (instance == null) {
			instance = new ImageManager();
		}
		return instance;
	}

	public Image getImage(String imageName) {

		return imageCache.getImage(imageName);
	}

	public Image getImage(String imageName, Image image) {

		if (imageCache.getImage(imageName) == null) {
			imageCache.addImage(imageName, image);
			return image;
		} else
			return imageCache.getImage(imageName);
	}
}
