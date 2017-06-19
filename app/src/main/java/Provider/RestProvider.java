package Provider;

import java.util.List;

import Models.Comments;
import Models.Department;
import Models.RentRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by Pavilion on 18/6/2017.
 */
public interface RestProvider {
    @GET("/departments")
    Call<List<Department>> getDepartment();

    @POST("/departments")
    Call<Department> setDepartment(@Body Department department);

    @GET("/user-departments/{id_owner}")
    Call<List<Department>> getDepartmentsFilterByOwner(@Path("id_owner") int id_owner);

    @POST("/comments")
    Call<Comments> setComments(@Body Comments comment);

    @GET("/comments/{id_department}")
    Call<List<Comments>> getCommentsFilterByDepartment(@Path("id_department") int id_department);

    @POST("/requests")
    Call<RentRequest> setRentRequest(@Body RentRequest request);

    @GET("/comments/{id_owner}")
    Call<List<RentRequest>> getRequestsFilterByOwner(@Path("id_owner") int id_owner);


}
