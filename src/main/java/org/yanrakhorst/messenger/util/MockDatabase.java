package org.yanrakhorst.messenger.util;

import java.util.HashMap;
import java.util.Map;

import org.yanrakhorst.messenger.model.Message;
import org.yanrakhorst.messenger.model.Profile;

public class MockDatabase {

	public static Map<Long, Message> messages = new HashMap<>();
	public static Map<Long, Profile> profiles = new HashMap<>();
	
	
}
