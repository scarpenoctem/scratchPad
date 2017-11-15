package utilities;

import java.util.Map;

public class MapUtil {
	
	public static String/*Map<Object, Object> */ returnType(Object key) {
		StringBuilder type = new StringBuilder();
		if(key instanceof String) {
			type.append("They key is a string\n");
		} else if (key instanceof int[] ) {
			type.append("This is an int array key\n");
		} else if (key instanceof Integer) {
			type.append("This is an Integer key\n");
		}
		return type.toString();
	}
}
