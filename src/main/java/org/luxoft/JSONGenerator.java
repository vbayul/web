package org.luxoft;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.luxoft.object.File;
import org.luxoft.object.Line;

public class JSONGenerator {

	public JSONArray JSONLines(List<Line> lines)
	{
		JSONArray json = new JSONArray();
		JSONObject jsonObj;

		for (Line line : lines)
		{		
				jsonObj = new JSONObject();
				jsonObj.put("id", line.getId());
				jsonObj.put("longWord", line.getLongWord());
				jsonObj.put("shortWord", line.getShortWord());
				jsonObj.put("lineLength", line.getLineLength());
				jsonObj.put("avgWord", line.getAvgWord());

				json.put(jsonObj);
			
		}
		return json;
	}

	public JSONArray JSONFiles(List<File> files)
	{
		JSONArray json = new JSONArray();
		JSONObject jsonObj;

		for (File file : files)
		{
			jsonObj = new JSONObject();
			jsonObj.put("id", file.getId());
			jsonObj.put("filename", file.getFileName());
			jsonObj.put("longWord", file.getLongWord());
			jsonObj.put("shortWord", file.getShortWord());
			jsonObj.put("lineLength", file.getLineLength());
			json.put(jsonObj);
		}

		return json;
	}
}
