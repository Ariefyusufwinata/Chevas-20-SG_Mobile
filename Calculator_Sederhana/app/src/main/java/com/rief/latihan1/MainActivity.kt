package com.rief.latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener {
            val input1 = edt_pertama.text.toString().trim()
            val input2 = edt_kedua.text.toString().trim()

            when {
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(
                            this,
                            "Input Pertama Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_pertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText (
                            this,
                            "Input Kedua Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_kedua.requestFocus()
                }
                else -> {
                    val tambah = input1.toInt() + input2.toInt()
                    tv_result.text = tambah.toString()
                }
            }
        }

        btn_kali.setOnClickListener {
            val input1 = edt_pertama.text.toString().trim()
            val input2 = edt_kedua.text.toString().trim()

            when {
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(
                            this,
                            "Input Pertama Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_pertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText (
                            this,
                            "Input Kedua Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_kedua.requestFocus()
                }
                else -> {
                    val kali = input1.toInt() * input2.toInt()
                    tv_result.text = kali.toString()
                }
            }
        }

        btn_kurang.setOnClickListener {
            val input1 = edt_pertama.text.toString().trim()
            val input2 = edt_kedua.text.toString().trim()

            when {
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(
                            this,
                            "Input Pertama Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_pertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText (
                            this,
                            "Input Kedua Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_kedua.requestFocus()
                }
                else -> {
                    val kurang = input1.toInt() - input2.toInt()
                    tv_result.text = kurang.toString()
                }
            }
        }

        btn_bagi.setOnClickListener {
            val input1 = edt_pertama.text.toString().trim()
            val input2 = edt_kedua.text.toString().trim()

            when {
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(
                            this,
                            "Input Pertama Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_pertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText (
                            this,
                            "Input Kedua Belum Ada",
                            Toast.LENGTH_SHORT
                    ).show()
                    edt_kedua.requestFocus()
                }
                else -> {
                    var bagi = input1.toDouble() / input2.toDouble()
                    tv_result.text = bagi.toString()
                }
            }

        }
    }
}