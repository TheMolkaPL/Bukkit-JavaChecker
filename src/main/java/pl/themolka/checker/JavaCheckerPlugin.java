package pl.themolka.checker;

import org.bukkit.plugin.java.JavaPlugin;

public class JavaCheckerPlugin extends JavaPlugin {
	
	public static final String VERSION = "Release 1.0";
	
	@Override
	public void onEnable() {
		System.out.println("==> Start of JavaChecker version " + VERSION + " by TheMolkaPL");
		System.out.println("[JavaChecker] Your system is " + System.getProperty("os.name"));
		System.out.println("[JavaChecker] Your system version is " + System.getProperty("os.version"));
		System.out.println("[JavaChecker] Your Java version is " + System.getProperty("java.version"));
		System.out.println("==> End of JavaChecker");
	}
	
}
