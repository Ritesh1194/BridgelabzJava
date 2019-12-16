package testing.singletonpatterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.designpatternprogram.singleton.EagerInitializationSingleton;

public class TestEagerInitializationSingleton {
	EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.getInstance();

	@Test
	public void getInsatnce_Object_Is_Match_Or_Not() {
		assertEquals(eagerInitializationSingleton, eagerInitializationSingleton.getInstance());
	}

}
