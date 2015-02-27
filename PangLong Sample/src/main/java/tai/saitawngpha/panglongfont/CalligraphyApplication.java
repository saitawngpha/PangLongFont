package tai.saitawngpha.panglongfont;

import android.app.Application;
import tai.saitawngpha.panglongfont.R;
import tai.saitawngpha.panglongfont.CalligraphyConfig;

/**
 * Created by chris on 06/05/2014.
 * For Calligraphy.
 */
public class CalligraphyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/PangLong.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}
