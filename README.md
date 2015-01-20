
#### Important
To get the Espresso tests to run in Android Studio you must create a new test configuration:

<ol>
<li>Open Run menu | Edit Configurations</li>
<li>Add a new Android Tests configuration</li>
<li>Choose the androidTest module</li>
<li>Add a specific instrumentation runner:
<code>android.support.test.runner.AndroidJUnitRunner</code></li>
<li>Run the newly created configuration Make sure tests are executed and pass</li>
</ol>
