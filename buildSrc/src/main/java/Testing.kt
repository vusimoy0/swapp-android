
object Testing {

    private const val version = "1.4.0"
    private const val junit_version = "4.13.2"
    private const val androidx_junit_version = "1.1.3"
    private const val robolectric_version = "4.8"
    private const val executor_rule_version = "2.1.0"
    private const val mockK_version = "1.12.7"

    //core
    const val androidXCore =  "androidx.test:core-ktx:$version"
    const val instantTaskExecutorRule = "androidx.arch.core:core-testing:$executor_rule_version"

    const val runner = "androidx.test:runner:$version"
    const val junit4 = "junit:junit:$junit_version"

    const val androidxJunit4 = "androidx.test.ext:junit-ktx:$androidx_junit_version"
    const val androidxTruth =  "androidx.test.ext:truth:$version"

    const val robolectric = "org.robolectric:robolectric:$robolectric_version"
    const val mockK = "io.mockk:mockk:$mockK_version"
}