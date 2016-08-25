package com.vikash.example.customlistitemselector;

/**
 * Created by einfochips on 24/8/16.
 */
public class TestJava {

 /*   accepted
    I've been frustrated by this myself and finally solved it. As Romain Guy hinted to, there's another state, "android:state_selected", that you must use. Use a state drawable for the background of your list item, and use a different state drawable for listSelector of your list:

    list_row_layout.xml:

    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="?android:attr/listPreferredItemHeight"
    android:background="@drawable/listitem_background"
            >
            ...
    </LinearLayout>
    listitem_background.xml:

    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_selected="true" android:drawable="@color/android:transparent" />
    <item android:drawable="@drawable/listitem_normal" />
    </selector>
    layout.xml that includes the ListView:

            ...
    <ListView
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:listSelector="@drawable/listitem_selector"
            />
            ...
    listitem_selector.xml:

    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true" android:drawable="@drawable/listitem_pressed" />
    <item android:state_focused="true" android:drawable="@drawable/listitem_selected" />
    </selector>

    */
}
