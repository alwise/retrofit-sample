
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class Main {
    static ApiInterface apiInterface;
    public static void main(String[] args) {
        apiInterface = ApiClient.getInstance().create(ApiInterface.class);
//        getAllTodo(apiInterface);
        logIn(apiInterface);
        postFeed(apiInterface);
//        getPosts(apiInterface);
    }

    private static void logIn(ApiInterface apiInterface){
        User user = new User("alwisestudio@gmail.com","Multibrain1994#",false);
        apiInterface.logIn(user).enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {

               if (response.isSuccessful()){
                   System.out.println(response.headers().get("token"));
                   System.out.println(response.headers().toMultimap());
                   System.out.println(response.raw());
                   System.out.println(response.code());
                  UserData userData = response.body();
                   System.out.println(userData.toString());



               }

                System.out.println(response.raw());


            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }


        });
    }


    private static void postFeed(ApiInterface apiInterface){

//        PostModel postModel = new PostModel("Elvis Kemevor",null,"70f36960-a55c-432a-aa8e-91b4e5fee596",null,null,
//                "hello to public one",null,null,0,0,null,null,null,false,null,null,  1,null);

        apiInterface.postNews(new Post("Hello fom app","70f36960-a55c-432a-aa8e-91b4e5fee596",3,0)).enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                System.out.println(response.headers().newBuilder().build().toMultimap());
                System.out.println(response.raw());
                if (response.isSuccessful()){
                    PostModel post = response.body();
                    System.out.println(post.toString());
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                System.out.println("Error: "+t.getLocalizedMessage());
            }
        });
    }

    private static void getPosts(ApiInterface apiInterface){
        apiInterface.getPosts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                if (response.isSuccessful()){
                    System.out.println(response.headers());
                    System.out.println(response.raw());
                    System.out.println(response.body());
                    List<PostModel> postModelList = response.body();
                    for (PostModel post : postModelList ){
                        System.out.println(post.toString());
                        List<PostModel.PostCommentsViewModel> commentsViewModelList = post.getPostComments();
                        if (commentsViewModelList != null){
                            System.out.println(commentsViewModelList.get(0).getComment());
                        }
                    }

                }else {
                    System.out.println(response.headers());
                    System.out.println(response.raw());
                }
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                System.out.println("Error : "+t.getMessage());
                call.cancel();
            }
        });
    }


    private static void getAllTodo(ApiInterface apiInterface){
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


}
