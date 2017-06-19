package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Models.Department;
import Provider.GlobalsProvider;
import Provider.RestProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class DepartmentController extends BaseController {


    public DepartmentController() {
        super();
    }


    public void create(Department newDepartment) {
        Call<Department> call = this.getService().setDepartment(newDepartment);
        call.enqueue(new Callback<Department>() {
            @Override
            public void onResponse(Call<Department> call, Response<Department> response) {

            }

            @Override
            public void onFailure(Call<Department> call, Throwable t) {

            }
        });
    }

    public void getList() {
        Call<List<Department>> call = this.getService().getDepartment();
        call.enqueue(new Callback<List<Department>>() {
            @Override
            public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {
                GlobalsProvider.departmentsList = response.body();
            }
            @Override
            public void onFailure(Call<List<Department>> call, Throwable t) {

            }
        });


    }
    public void getListFilterByOwner(int id) {
        Call<List<Department>> call = this.getService().getDepartmentsFilterByOwner(id);
        call.enqueue(new Callback<List<Department>>() {
            @Override
            public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {
                GlobalsProvider.departmentsList = response.body();
            }

            @Override
            public void onFailure(Call<List<Department>> call, Throwable t) {

            }
        });
    }

}
