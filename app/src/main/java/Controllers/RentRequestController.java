package Controllers;

import java.util.List;

import Models.Comments;
import Models.RentRequest;
import Provider.GlobalsProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class RentRequestController extends BaseController{
    public RentRequestController() {
        super();
    }

    public void create(RentRequest newRequest) {
        Call<RentRequest> call = this.getService().setRentRequest(newRequest);
        call.enqueue(new Callback<RentRequest>() {
            @Override
            public void onResponse(Call<RentRequest> call, Response<RentRequest> response) {

            }

            @Override
            public void onFailure(Call<RentRequest> call, Throwable t) {

            }
        });
    }

    public void getListFilterByOwner(int id) {
        Call<List<RentRequest>> call = this.getService().getRequestsFilterByOwner(id);
        call.enqueue(new Callback<List<RentRequest>>() {
            @Override
            public void onResponse(Call<List<RentRequest>> call, Response<List<RentRequest>> response) {
                GlobalsProvider.requestsList=response.body();
            }

            @Override
            public void onFailure(Call<List<RentRequest>> call, Throwable t) {

            }
        });


    }
}
