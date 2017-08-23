package com.example.hoaht.demoanko

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.db.*

class MainActivity : AppCompatActivity(), AnkoLogger {


    private val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val b = null
//        verticalLayout {
//            padding = dip(30)
//            editText {
//                hint = "Name"
//                textSize = 24f
//            }
//            editText {
//                hint = "Password"
//                textSize = 24f
//            }
//            button("Login") {
//                textSize = 26f
//            }
//        }
//    }

//        tvTitle.setOnClickListener {
        //            toast("Click title")
//
//            browse("https://google.com")
//
//            share("message", "subject")
//
//            alert {
//                alert(Appcompat, "Some text message").show()
//            }.show()

//            someMethod()


//            error("Error")


//        }

//        tvTitle.setTextColor(0xff0000.opaque)

//        val countries = listOf("Russia", "USA", "Japan", "Australia")
//        selector("Where are you from?", countries, { dialogInterface, i ->
//            toast("So you're living in ${countries[i]}, right?")
//        })

//
//        val x = Integer.valueOf(10)
//        val y = Integer.valueOf(10)
//        val a = (x === y) // false
//        val b = (x !== y) // true
//        val c = (x === 10) // false
//        Log.d(TAG, "onCreate: $a-->" + (x === y))
//        Log.d(TAG, "onCreate: $b-->" + (x !== y))
//        Log.d(TAG, "onCreate: $c-->" + (x === 10))
//
//        Log.d(TAG, "onCreate1: $a-->" + (x == y))
//        Log.d(TAG, "onCreate1: $b-->" + (x != y))
//        Log.d(TAG, "onCreate1: $c-->" + (x == 10))

//        tvTitle.setOnClickListener {
//            onClickTitle()
//        }
//
        tvContent.setOnClickListener {
            onClickContent()
        }
    }

    fun onClickTitle() {
        var str3: String = String()
        var str4: String = String()
        str3 = "abc"
        str4 = "abc"

        Log.d(TAG, "onCreate: " + (str3 === str4))
        Log.d(TAG, "onCreate: ")
        Log.d(TAG, "onCreate: ")

        var str1: String = "abc"
        var str2: String = "abc1"
        str2 = "abc"
        val a = (str1 === str2) // true
        val b = (str1 !== str2) // false
        val c = (str1 === "abc") // true
        Log.d(TAG, "onCreate: $a")
        Log.d(TAG, "onCreate: $b")
        Log.d(TAG, "onCreate: $c")

        Log.d(TAG, "onCreate1: $a")
        Log.d(TAG, "onCreate1: $b")
        Log.d(TAG, "onCreate1: $c")
    }

    fun onClickContent() {

        val person1 = Person("Hoa")
        val person2 = Person("Hoa")
        val a = person1 === person2 // false
        val b = person1 !== person2 // true
        val c = person1 == person2 // false
        val d = person1 != person2 // true

        val person3 = Person1(26)
        val person4 = person3
        val a1 = person3 === person4 // false
        val b1 = person3 !== person4 // true
//        person2.name = "The"
        val c1 = person3 == person4 // true
        val d1 = person3 != person4 // false

//        Log.d(TAG, "onCreate: " + a)
//        Log.d(TAG, "onCreate: " + b)
//        Log.d(TAG, "onCreate: " + c)
//        Log.d(TAG, "onCreate: " + d)
//
//        Log.d(TAG, "onCreate1: " + a1)
//        Log.d(TAG, "onCreate1: " + b1)
//        Log.d(TAG, "onCreate1: " + c1)
//        Log.d(TAG, "onCreate1: " + d1)
//
//
//        Log.d(TAG, "onCreate1: " + (person1.equals(person2)))
//        Log.d(TAG, "onCreate1: " + person3.equals(person4))
//        val person:Person = person1.apply {
//            name = ""
//        }
//
//        val person3:Person = with(person1, {
//            this
//        })
//        val a11: Float = 10000f
//        val b11: Float? = a11
//        val c11: Float? = a11
//        Log.d(TAG, "" + (b11 === c11))


        /**
         * acc run for 3 to 2
         * initial value of i = 1
         */
        //        val list = listOf(1, 2, 3)
//        Log.d(TAG, "" + list.reduceRight { i, acc -> acc - i }) // 0


        val list = listOf(4, 2)
        Log.d(TAG, "" + list.flatMap {
            listOf(1, 2, 2)
        }) // [4,8,2,4]

    }

    private val log: AnkoLogger = AnkoLogger(MainActivity::class.java)
    private val logWithASpecificTag = AnkoLogger("my_tag")

    private fun someMethod() {
        log.error("Big brother is watching you!")
    }

    fun openBrowser(url: String) {

        try {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google.com")
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            e.printStackTrace()
        }

    }

    fun showAlert() {

        alert {
            customView {
                editText()
            }
        }.show()
    }

    fun createDatabase() {

        val database = MyDatabaseHelper(this)
        database.use {
            createTable("Customer", true,
                    "id" to INTEGER + PRIMARY_KEY + UNIQUE,
                    "name" to TEXT,
                    "photo" to TEXT)
        }

    }

}
