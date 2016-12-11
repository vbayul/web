package org.luxoft;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;

@Path("/files")
public class Service 
{
	@GET
	@Produces("application/json")
	public Response fileList() throws JSONException
	{
		Controller controller = new Controller();
		String result =  controller.convertsFile();
		
		return Response.status(200).entity(result).build(); 
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Response fileContent(@PathParam("id") int id) throws JSONException
	{		
		Controller controller = new Controller();
		String result =  controller.convertsLines(id);

		return Response.status(200).entity(result).build(); 
	}

}
