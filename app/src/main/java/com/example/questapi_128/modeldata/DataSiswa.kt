package com.example.questapi_128.modeldata

import com.example.questapi_128.modeldata.DetailSiswa
import kotlinx.serialization.Serializable
import kotlin.Int

@Serializable
data class DataSiswa (
    val id : Int,
    val nama: String,
    val alamat: String,
    val telpon: String
)
