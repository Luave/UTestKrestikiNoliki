package com.example.myapplicatio11212

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        static()

        var btns: Array<Button> = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        ButtonsNoEnabled(btns)
        for (i in btns)
        {

            i.setOnClickListener { v ->
                i.isEnabled = false
                if (xo) {
                    (v as Button).text = "X"
                } else {
                    (v as Button).text = "0"
                }
                xo = !xo
                Proverka(btns)
            }
        }
    }

    fun ButtonsEnabled(buttons: Array<Button>) {
        for (i in buttons) {
            i.isEnabled = true
        }
    }

    fun Proverka(Buttons: Array<Button>){
        if((Buttons[0].text == "X") and (Buttons[1].text == "X") and (Buttons[2].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }
        else if((Buttons[3].text == "X") and (Buttons[4].text == "X") and (Buttons[5].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[6].text == "X") and (Buttons[7].text == "X") and (Buttons[8].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[0].text == "X") and (Buttons[3].text == "X") and (Buttons[6].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[1].text == "X") and (Buttons[4].text == "X") and (Buttons[7].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[2].text == "X") and (Buttons[5].text == "X") and (Buttons[8].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[0].text == "X") and (Buttons[4].text == "X") and (Buttons[8].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[2].text == "X") and (Buttons[4].text == "X") and (Buttons[6].text == "X")){
            TV.text = "Победил X"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[0].text == "0") and (Buttons[1].text == "0") and (Buttons[2].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }
        else if((Buttons[3].text == "0") and (Buttons[4].text == "0") and (Buttons[5].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[6].text == "0") and (Buttons[7].text == "0") and (Buttons[8].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[0].text == "0") and (Buttons[3].text == "0") and (Buttons[6].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[1].text == "0") and (Buttons[4].text == "0") and (Buttons[7].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[2].text == "0") and (Buttons[5].text == "0") and (Buttons[8].text == "0")){
            TV.text = "Победил 0"

            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[0].text == "0") and (Buttons[4].text == "0") and (Buttons[8].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }else if((Buttons[2].text == "0") and (Buttons[4].text == "0") and (Buttons[6].text == "0")){
            TV.text = "Победил 0"
            for(i in Buttons){
                i.isEnabled = false
            }
        }
        else{
            var t: Int = 0
            for(i in Buttons){
                if(i.text != ""){
                    t++
                }
            }

            if(t == 9){
                TV.text = "Ничья"
                for(i in Buttons){
                    i.isEnabled = false
                }
            }
        }
    }


    var xo: Boolean = true

    fun startButton(view: View)
    {
        xo = true
        TV.text = ""
        var btns: Array<Button> = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for(s in 0..8){
            btns[s].text = ""
        }
        ButtonsEnabled(btns)
    }

    fun ButtonsNoEnabled(buttons: Array<Button>) {
        for (i in buttons)
            i.isEnabled = false;
    }


    private fun static() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO); //To change body of created functions use File | Settings | File Templates.
    }
}