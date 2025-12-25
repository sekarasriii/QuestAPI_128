package com.example.questapi_128.repositori

import com.example.questapi_128.apiservice.ServiceApiSiswa
import com.example.questapi_128.modeldata.DataSiswa


interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
}
