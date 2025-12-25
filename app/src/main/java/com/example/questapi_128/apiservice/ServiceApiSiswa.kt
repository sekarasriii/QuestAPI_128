package com.example.questapi_128.apiservice

import com.example.questapi_128.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>

    //fungsi ambil satu data siswa (GET by ID)
    @GET("baca1eman.php")
    suspend fun getSatuSiswa(@Query("id") id: Int): DataSiswa

    //fungsi edit data siswa
    @PUT("editTM.php/{id}")
    suspend fun editSatuSiswa(@Query("id") id: Int, @Body dataSiswa: DataSiswa):retrofit2.Response<Void>

    //fungsi hapus data siswa
    @DELETE("deleteTM.php/{id}")
    suspend fun hapusSatuSiswa(@Query("id") id: Int):retrofit2.Response<Void>
}