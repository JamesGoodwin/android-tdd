
Important
--------
To get the Espresso tests to run in Android Studio you must create a new test configuration:

Open Run menu | Edit Configurations
Add a new Android Tests configuration
Choose a module
Add a specific instrumentation runner:
android.support.test.runner.AndroidJUnitRunner
Run the configuration
Run the newly created configuration Make sure tests are executed and pass
