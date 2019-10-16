import io.nuclio.Context;
import io.nuclio.Event;
import io.nuclio.EventHandler;
import io.nuclio.Response;

public class Handler implements EventHandler {

    @Override
    public Response handleEvent(Context context, Event event) {
       return new Response().setBody("hello world jake");
    }
}

