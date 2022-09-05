object Kotlinx {
    private const val kotlinxDatetimeVersion = "0.3.1"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:$kotlinxDatetimeVersion"

    private const val coroutinesCoreVersion = "1.6.4"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesCoreVersion"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesCoreVersion"

    // Need for tests. Plugin doesn't work.
    private const val serializationJsonVersion = "1.3.3"
    const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationJsonVersion"
}