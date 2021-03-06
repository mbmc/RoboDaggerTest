Android Unit Test (POJO and UI)
====

Context
----

Be able to run unit and UI test (without device) on an Android project that is also using a Library, with the latest Dagger, Robolectric and Module override.


Usage
----

From Android Studio, Import the project (don't Open it). Note that the tests won't run through the IDE. This small app can be compiled and installed via the usual way.

To run POJO and UI tests:

```sh
./gradlew unitTest # POJO
./gradlew test # UI
```

Versions used
----

* Android Studio 1.0 RC1
* Gradle 2.2
* Gradle-plugin 0.14.4
* Dagger 1.2.2
* Robolectric 2.4
* robolectric-gradle-plugin 0.14.0
* minSDK 14
* targetSDK 21


Thanks
----

Dagger: https://github.com/square/dagger

Robolectric-gradle-plugin: https://github.com/robolectric/robolectric-gradle-plugin

Robolectric: https://github.com/robolectric/robolectric

Feel free to comment or change anything.