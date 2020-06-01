import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiInterface {

    @GET("/todos/")
    Call<List<Todo>> getAllTodo();

}
