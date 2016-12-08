package io.github.kobakei.centereddrawablebutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Custom button class with centered drawable.
 * Created by keisukekobayashi on 16/02/29.
 */
public class CenteredDrawableButton extends RelativeLayout {

    private TextView textView;

    public CenteredDrawableButton(Context context) {
        super(context);
        initializeView(context, null, 0);
    }
    public CenteredDrawableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeView(context, attrs, 0);
    }
    public CenteredDrawableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeView(context, attrs, defStyleAttr);
    }

    private void initializeView(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.CenteredDrawableButton,
                defStyleAttr,
                0);

        Drawable drawableLeft = a.getDrawable(R.styleable.CenteredDrawableButton_drawableLeft);
        Drawable drawableRight = a.getDrawable(R.styleable.CenteredDrawableButton_drawableRight);
        Drawable drawableTop = a.getDrawable(R.styleable.CenteredDrawableButton_drawableTop);
        Drawable drawableBottom = a.getDrawable(R.styleable.CenteredDrawableButton_drawableBottom);
        int drawablePadding =
                a.getDimensionPixelSize(R.styleable.CenteredDrawableButton_drawablePadding, 0);

        CharSequence text = a.getText(R.styleable.CenteredDrawableButton_text);
        int textColor = a.getColor(R.styleable.CenteredDrawableButton_textColor, -1);
        ColorStateList textColorStateList =
                a.getColorStateList(R.styleable.CenteredDrawableButton_textColor);
        int textSize = a.getDimensionPixelSize(R.styleable.CenteredDrawableButton_textSize, 0);
        int textStyle = a.getInt(R.styleable.CenteredDrawableButton_textStyle, 0);

        textView = new TextView(context, attrs);
        textView.setDuplicateParentStateEnabled(true);
        textView.setClickable(false);
        textView.setText(text);
        textView.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        if (textColor >= 0) {
            textView.setTextColor(textColor);
        }
        if (textColorStateList != null) {
            textView.setTextColor(textColorStateList);
        }
        if (textSize > 0) {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawableLeft, drawableTop, drawableRight, drawableBottom);
        textView.setCompoundDrawablePadding(drawablePadding);
        Typeface tf = Typeface.defaultFromStyle(textStyle);
        textView.setTypeface(tf);
        RelativeLayout.LayoutParams params
                = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        textView.setLayoutParams(params);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        addView(textView);

        a.recycle();
    }

    public TextView getTextView() {
        return textView;
    }
}
