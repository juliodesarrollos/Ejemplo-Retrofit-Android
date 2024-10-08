package com.juliovazquez.ejemploretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("consulta_productos.php")
    Call<List<RetrofitProducto>> getAllProducts();
}
