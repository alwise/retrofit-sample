import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String baseUrl = "https://jsonplaceholder.typicode.com";
    private static Retrofit instance;

    public static Retrofit getInstance() {
        if (instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
