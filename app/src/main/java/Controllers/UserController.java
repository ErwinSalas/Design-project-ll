package Controllers;


import Models.User;
import Provider.GlobalsProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class UserController extends BaseController{
    public UserController() {
        super();
    }

    public void create(User newUser) {
        Call<User> call = this.getService().registerUser(newUser);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                GlobalsProvider.AuthUser=response.body();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
    public void authenticateUser(String user,String psas){
        Call<User> call = this.getService().authUser(user,psas);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.body()!=null){
                    GlobalsProvider.AuthUser=response.body();
                }
                else {
                    GlobalsProvider.AuthUser=null;
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                GlobalsProvider.AuthUser=null;
            }
        });

    }
}
