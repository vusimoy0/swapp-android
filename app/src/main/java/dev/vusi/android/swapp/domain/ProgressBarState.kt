package dev.vusi.android.swapp.domain

sealed class ProgressBarState {

    object Idle: ProgressBarState()

    object Loading: ProgressBarState()
}