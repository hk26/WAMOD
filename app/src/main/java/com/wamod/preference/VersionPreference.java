package com.wamod.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.wamod.Utils;

/**
 * Created by BrianValente on 4/18/16.
 */
public class VersionPreference extends Preference {
    public VersionPreference(Context context) {
        super(context);
    }

    public VersionPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VersionPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onBindView(final View view) {
        super.onBindView(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                setTitle("WAMOD " + Utils.getVersionName());
                setSummary("WhatsApp " + Utils.getWhatsAppVersionName());

                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
