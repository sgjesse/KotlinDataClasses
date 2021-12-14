package dk.gjesse.kotlindataclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clazz = TestData::class
        println(clazz.isData)
        println(clazz.primaryConstructor)
    }
}