package com.example.questapi_128.repositori

import com.example.questapi_128.apiservice.ServiceApiSiswa
import com.example.questapi_128.modeldata.DataSiswa


interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
    //edit: tambahkan fungsi getSatuSiswa
    suspend fun getSatuSiswa(id: Int): DataSiswa
    suspend fun editSatuSiswa(id:Int, dataSiswa: DataSiswa):retrofit2.Response<Void>
    suspend fun hapusSatuSiswa(id:Int):retrofit2.Response<Void>

}
class jaringanRepositoryDataSiswa (
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
    .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
    //edit:
    override suspend fun getSatuSiswa(id: Int): DataSiswa = serviceApiSiswa.getSatuSiswa(id)
}