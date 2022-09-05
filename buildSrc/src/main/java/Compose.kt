object Compose {
    const val compilerVersion = "1.3.0"
    private const val activity_compose_version = "1.5.1"
    private const val compose_material_version = "1.3.0-beta01"
    private const val compose_ui_version = "1.2.1"

    const val activity = "androidx.activity:activity-compose:$activity_compose_version"
    const val ui = "androidx.compose.ui:ui:$compose_ui_version"
    const val tooling = "androidx.compose.ui:ui-tooling:$compose_ui_version"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$compose_ui_version"

    const val material = "androidx.compose.material:material:$compose_material_version"

    private const val navigation_version = "2.5.1"
    const val navigation = "androidx.navigation:navigation-compose:$navigation_version"

    private const val hilt_navigation_compose_version = "1.0.0"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hilt_navigation_compose_version"

    private const val viewModel_compose_version = "2.5.1"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModel_compose_version"
}