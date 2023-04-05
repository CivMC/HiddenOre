plugins {
	`java-library`
	id("net.civmc.civgradle.plugin")
	id("io.papermc.paperweight.userdev") version "1.3.1"
}

civGradle {
	paper {
		pluginName = "HiddenOre"
	}
}

dependencies {
	paperDevBundle("1.19.4-R0.1-SNAPSHOT")
}
