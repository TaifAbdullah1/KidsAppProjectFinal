package kids.example.kids.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kids(
    val name: String,
    val lesson: String,
    val image: Int,
    val string: String,
    val uri: String,
    val uripdf :String
):Parcelable



