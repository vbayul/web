package org.luxoft;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.luxoft.hibernate.HibernateMapping;
import org.luxoft.object.File;
import org.luxoft.object.Line;

public class Controller{

	public String convertsFile()
	{
		HibernateMapping hbm = new HibernateMapping();
		List<File> files = hbm.files();
		return convetFilesToString(files);
	}
	
	private String convetFilesToString(List<File> files)
	{
		JSONGenerator json = new JSONGenerator();
		JSONArray jsons =  json.JSONFiles(files);
		return JSONObject.valueToString(jsons);
	}
	
	public String convertsLines(int idFile)
	{
		HibernateMapping hbm = new HibernateMapping();
		List<Line> files = hbm.lines(idFile);
		return convetLinesToString(files);
	}
	
	private String convetLinesToString(List<Line> lines)
	{
		JSONGenerator json = new JSONGenerator();
		JSONArray jsons =  json.JSONLines(lines);
		return JSONObject.valueToString(jsons);
	}
}
