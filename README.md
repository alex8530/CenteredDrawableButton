CenteredDrawableButton
=======================

[ ![Download](https://api.bintray.com/packages/kobakei/maven/centereddrawablebutton/images/download.svg) ](https://bintray.com/kobakei/maven/centereddrawablebutton/_latestVersion)
[![JitPack](https://jitpack.io/v/kobakei/CenteredDrawableButton.svg)](https://jitpack.io/#kobakei/CenteredDrawableButton)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-CenteredDrawableButton-green.svg?style=true)](https://android-arsenal.com/details/1/3222)

Android custom button with centered drawable

![Screenshot](https://raw.githubusercontent.com/kobakei/CenteredDrawableButton/master/photos/screenshot.png)

## Gradle

Add the following dependency to your app build.gradle.

```groovy
dependencies {
    compile 'io.github.kobakei:centereddrawablebutton:1.0.4'
}
```

[JitPack.io](https://jitpack.io/#kobakei/CenteredDrawableButton) is also available.

## Usage

```xml
<io.github.kobakei.centereddrawablebutton.CenteredDrawableButton
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:background="@drawable/button_bg"
        app:drawableLeft="@drawable/foo"
        app:drawableRight="@drawable/foo"
        app:drawableTop="@drawable/foo"
        app:drawableBottom="@drawable/foo"
        app:drawablePadding="@dimen/drawable_padding"
        app:text="@string/foo"
        app:textColor="@color/white"
        app:textSize="@dimen/font_size"
        app:textStyle="bold|italic"/>
```

## License

```
Copyright (c) 2016 Keisuke Kobayashi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
