import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;


import java.util.List;

public interface ApiInterface {
    String token =
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI3MGYzNjk2MC1hNTVjLTQzMmEtYWE4ZS05MWI0ZTVmZWU1OTYiLCJlbWFpbCI6ImFsd2lzZXN0dWRpb0BnbWFpbC5jb20iLCJqdGkiOiJlN2YwN2JlZS1lYTc4LTQ3NTktODcyNC1lYWQ2NDRhYzhiODUiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3JvbGUiOiJVc2VyIiwiZXhwIjoxNTkxOTc2ODk4LCJpc3MiOiIuLyIsImF1ZCI6Ii4vIn0.GiWNXJNkATpWWR4rSHupD0_kQiisfgOS8CvF40SNB04";
    @GET("/todos/")
    Call<List<Todo>> getAllTodo();

    @GET("/todos/{id}")
    Call<Todo> getOneTodo(@Path("id") int id);

    @POST("/AppApi/api/Account/login/")
    Call<UserData> logIn(@Body User user);

    @Headers({
        "Authorization:Bearer "+token,
        "Content-Type:application/json"
    })
    @POST("/AppApi/api/Post/create")
    Call<PostModel> postNews(@Body Post post);


    @Headers({
            "Authorization:Bearer "+token,
            "Content-Type: application/json"
    })
    @GET("/AppApi/api/Post/posts/")
    Call<List<PostModel>> getPosts();




}
