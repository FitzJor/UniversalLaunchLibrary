package com.example.launchlibrary.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DefaultRequest(
    @SerializedName("ID_PAGO") val id_pago: Int? = null,
    @SerializedName("ID_PERFIL") val id_perfil: Int? = null,
    @SerializedName("ID_USUARIO") val id_usuario: Int? = null,
    @SerializedName("ID_COMERCIO") val id_comercio: Int? = null,
    @SerializedName("ID_APP") val id_app: Int? = null,
    @SerializedName("IMPORTE") val importe: Double? = null,
    @SerializedName("PROPINA") val propina: Double? = null,
    @SerializedName("ANDROID_DEVICE") val android_device: String? = null,
    @SerializedName("ES_REDSYS") val esRedsys: Boolean? = null,
    @SerializedName("ESTADO") val estado: Int? = null,
    @SerializedName("FECHA_SOLICITUD") val fecha: String? = null
): Serializable