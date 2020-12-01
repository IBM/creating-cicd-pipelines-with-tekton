package com.ibm.developer;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class FunctionApp {

	public static JsonObject main(JsonObject args) {
		JsonObject response = new JsonObject();
		JsonPrimitive nameArg = args.getAsJsonPrimitive("name");
		
		String result;
		if (nameArg == null) {
			result = "Hello! Welcome to OpenWhisk...";
		} else {
			result = "Hello " + nameArg.getAsString();
		}
		response.addProperty("body", result);

		return response;
	}
}
