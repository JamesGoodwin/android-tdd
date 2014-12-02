package com.example;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;

import java.io.File;

/**
 * A Robolectric TestRunner for running tests in a Gradle SubModule.
 * Created by jasondonmoyer on 11/24/14.
 */
public class RobolectricGradleSubModuleTestRunner extends RobolectricTestRunner {

    private static final int MAX_SDK_SUPPORTED_BY_ROBOLECTRIC = 18;

    public RobolectricGradleSubModuleTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    protected String getAndroidManifestPath() {
        return "../app/src/main/AndroidManifest.xml";
    }

    protected String getResPath() {
        return "../app/src/main/res";
    }

    @Override
    protected final AndroidManifest getAppManifest(Config config) {
        String androidManifestPath = getFilePath(getAndroidManifestPath());
        String resPath = getFilePath(getResPath());

        return new AndroidManifest(Fs.fileFromPath(androidManifestPath), Fs.fileFromPath(resPath)) {
            @Override
            public int getTargetSdkVersion() {
                return MAX_SDK_SUPPORTED_BY_ROBOLECTRIC;
            }
        };
    }

    // allow paths to be resolved correctly when running between IDEA/gradle
    private String getFilePath(String filePath) {
        File file = new File(filePath);
        if(!file.exists()) {
            filePath = filePath.replace("app", "deckard-gradle/app");
        }
        return filePath;
    }

}
