package app.revanced.integrations.youtube.patches;

import app.revanced.integrations.youtube.settings.Settings;

@SuppressWarnings("unused")
public final class DisableSplashScreenPatch {

    private static final boolean SPLASH_SCREEN_DISABLED = Settings.DISABLE_SPLASH_SCREEN.get();

    /**
     * Injection point.
     */
    public static boolean isSplashEnabled() {
        return !SPLASH_SCREEN_DISABLED;
    }
}