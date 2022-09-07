package dev.vusi.android.swapp.core.domain

sealed class ProgressBarState {

    object Idle: ProgressBarState()

    object Loading: ProgressBarState()
}