package dev.vusi.android.swapp.core.domain

sealed class UIComponent {

    data class Dialog(val title: String, val message: String): UIComponent()

    data class SnackBar(val message: String): UIComponent()
}