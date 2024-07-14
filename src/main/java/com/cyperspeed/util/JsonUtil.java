package com.cyperspeed.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private ObjectMapper objectMapper = new ObjectMapper();
	{
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
	}

	public String objectToJsonString(Object obj) {
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public Object jsonFileToObject (String filePath, Class clazz) {
		try {
			return objectMapper.readValue(new File(filePath), clazz);
		} catch (StreamReadException e) {
			e.printStackTrace();
			return null;
		} catch (DatabindException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
