package Controllers;

import java.util.List;

import Models.Comments;
import Models.Department;
import Provider.GlobalsProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class CommentController extends BaseController {
    public CommentController() {
        super();
    }

    public void create(Comments newComment) {
        Call<Comments> call = this.getService().setComments(newComment);
        call.enqueue(new Callback<Comments>() {
            @Override
            public void onResponse(Call<Comments> call, Response<Comments> response) {

            }

            @Override
            public void onFailure(Call<Comments> call, Throwable t) {

            }
        });
    }

    public void getListFilterByDepartment(int id) {
        Call<List<Comments>> call = this.getService().getCommentsFilterByDepartment(id);
        call.enqueue(new Callback<List<Comments>>() {
            @Override
            public void onResponse(Call<List<Comments>> call, Response<List<Comments>> response) {
                GlobalsProvider.commentsList= response.body();
            }

            @Override
            public void onFailure(Call<List<Comments>> call, Throwable t) {

            }
        });


    }
}
