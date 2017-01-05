package com.wamod.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.wamod.Utils;

/**
 * Created by BrianValente on 4/18/16.
 */
public class SwitchPreference extends android.preference.SwitchPreference {
    public SwitchPreference(Context context) {
        super(context);
    }

    public SwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        com.wamod.preference.Preference.loadColors(view);
    }
}
