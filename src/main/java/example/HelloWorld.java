package example;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorld {
  @GET
  @Path("sayhello")
  public String sayHelloWorld() {
    String result = "Hello, world";
    System.out.println(result);
    return result;
  }
}
