package org.minimallycorrect.libloader;

import org.junit.Test;

public class LibLoaderChainedTest {
	@Test
	public void testLibLoader() {
		System.setProperty("LibLoader.modsFolder", "src/test/resources/mods");
		System.setProperty("LibLoader.librariesFolder", "src/test/resources/libraries");
		LibLoaderChained.init();
	}
}
