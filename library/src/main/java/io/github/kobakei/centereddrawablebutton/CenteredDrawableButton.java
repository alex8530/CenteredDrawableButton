package io.github.kobakei.centereddrawablebutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Custom button class with centered drawable.
 * Created by keisukekobayashi on 16/02/29.
 */
public class CenteredDrawableButton extends LinearLayout {
    public CenteredDrawableButton(Context context) {
        super(context);
        initializeView(context, null);
    }
    public CenteredDrawableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeView(context, attrs);
    }

    private void initializeView(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CenteredDrawableButton);

        Drawable drawableLeft = a.getDrawable(R.styleable.CenteredDrawableButton_drawableLeft);
        int drawablePadding = a.getDimensionPixelSize(R.styleable.CenteredDrawableButton_drawablePadding, 0);

        CharSequence text = a.getText(R.styleable.CenteredDrawableButton_text);
        int textColor = a.getColor(R.styleable.CenteredDrawableButton_textColor, -1);
        ColorStateList textColorStateList = a.getColorStateList(R.styleable.CenteredDrawableButton_textColor);
        int textSize = a.getDimensionPixelSize(R.styleable.CenteredDrawableButton_textSize, 0);

        ImageView imageView = new ImageView(context, attrs);
        if (drawableLeft != null) {
            imageView.setImageDrawable(drawableLeft);
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        if (drawablePadding > 0) {
            imageView.setPadding(0, 0, drawablePadding, 0);
        }
        LinearLayout.LayoutParams params1 = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        imageView.setLayoutParams(params1);
        addView(imageView);

        TextView textView = new TextView(context, attrs);
        textView.setText(text);
        if (textColor >= 0) {
            textView.setTextColor(textColor);
        }
        if (textColorStateList != null) {
            textView.setTextColor(textColorStateList);
        }
        if (textSize > 0) {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        }
        LinearLayout.LayoutParams params2 = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(params2);
        addView(textView);

        setGravity(Gravity.CENTER);

        a.recycle();
    }
}
