package com.ydnm4528.typicoderetrofit.api

import com.ydnm4528.typicoderetrofit.model.Hospital
import com.ydnm4528.typicoderetrofit.model.HospitalsItem
import retrofit2.Call
import retrofit2.http.*
import android.telecom.Call as Cal1
import com.ydnm4528.typicoderetrofit.model.City as City

interface HospitalApiInterface {

    @GET("hospital")
    fun getAllHospital(): retrofit2.Call<Hospital>


    //Path = {id}  //hospital/3
    @GET("hospital/{id}")
    fun getDetails(
        @Path("id") id: String
    ): retrofit2.Call<HospitalsItem>


    @FormUrlEncoded

    @POST("setup/city")
    fun addCity(
        @Field("city_name") cityName: String
    ): Call<City>


}