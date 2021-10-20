package kz.litro.utils.base_classes

import android.content.Context
import android.content.SharedPreferences

abstract class BasePrefs(context: Context, prefsName: String) {

    var prefs: SharedPreferences? = null

    companion object {
        private const val LANGUAGE = "language"
    }

    init {
        prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
    }

    fun getLang() = prefs?.getString(LANGUAGE, "ru")

}