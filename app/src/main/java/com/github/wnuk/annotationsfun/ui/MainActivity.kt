package com.github.wnuk.annotationsfun.ui

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.wnuk.annotationsfun.R
import org.androidannotations.annotations.AfterInject
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.ViewById

@EActivity(R.layout.activity_main)
class MainActivity : AppCompatActivity() {
    @ViewById(R.id.main_text) lateinit var textViews : TextView

    @AfterViews
    protected fun afterViews() {
        textViews.text = "AA"
    }
}
