package softDevExam.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import softDevExam.controller.GutenbergController;
import softDevExam.persistence.GutenbergMysql;

@Produces(MediaType.APPLICATION_JSON)
@Path("mysql")
public class MysqlResource {

	private final GutenbergController controller = new GutenbergController(new GutenbergMysql());

	@Context
	UriInfo uriInfo;

	@GET
	@Path("/city/{city}")
	public Response getBooksByCity(@PathParam("city") String city) {
		return controller.getBooksByCity(city).build();
	}

	@GET
	@Path("/book/{book}")
	public Response getCitiesByBook(@PathParam("book") String book) {
		return controller.getCitiesByBook(book).build();
	}

	@GET
	@Path("/author/{author}")
	public Response getBooksAndCitysByAuthor(@PathParam("author") String author) {
		return controller.getBooksByCity(author).build();
	}

	@GET
	@Path("/location/{location}")
	public Response getBooksByLocation(@PathParam("location") String location) {
		return controller.getBooksByCity(location).build();
	}
}