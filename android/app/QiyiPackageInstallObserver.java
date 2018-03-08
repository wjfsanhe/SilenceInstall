package android.app;

import android.os.Bundle;

/**
 * Created by zwx on 18-3-7.
 */

public interface QiyiPackageInstallObserver {
    void onPackageInstalled(String packageName, int returnCode, String msg, Bundle extras);
}
