package id.nns.belajar_recycler_view

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kara(
    var photo: Int = 0,
    var name: String? = "",
    var detail: String? = ""
) : Parcelable