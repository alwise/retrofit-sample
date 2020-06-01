import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    ApiInterface apiInterface = ApiClient.getInstance().create(ApiInterface.class);
        assert false;
        Call<List<Todo>> call = apiInterface.getAllTodo();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                List<Todo> todos = response.body();
                System.out.print(response.raw());
                for (Todo todo : todos  ) {
                    System.out.println(todo.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                System.out.println("Err");
            }
        });
    }


    private static void getAllTodo(){

    }
}
