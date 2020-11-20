package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    public var firstPlayer = true;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button00 =  findViewById(R.id.btn00) as Button;
        val button01 =  findViewById(R.id.btn01) as Button;
        val button02 =  findViewById(R.id.btn02) as Button;
        val button10 =  findViewById(R.id.btn10) as Button;
        val button11 =  findViewById(R.id.btn11) as Button;
        val button12 =  findViewById(R.id.btn12) as Button;
        val button20 =  findViewById(R.id.btn20) as Button;
        val button21 =  findViewById(R.id.btn21) as Button;
        val button22 =  findViewById(R.id.btn22) as Button;
        val reset = findViewById(R.id.reset) as Button;


        button00.setOnClickListener(){
checkPlayer(button00);
            checkWinner(button00,button01,button02,button10,button11,button12,button20,button21,button22);


        }
        button01.setOnClickListener(){
            checkPlayer(button01);
checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }


        button02.setOnClickListener(){
            checkPlayer(button02);
            checkWinner(button00,button01,button02,button10,button11,button12,button20,button21,button22);

        }
        button10.setOnClickListener(){
            checkPlayer(button10);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        button11.setOnClickListener(){
            checkPlayer(button11);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);

        }
        button12.setOnClickListener(){
            checkPlayer(button12);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        button20.setOnClickListener(){
            checkPlayer(button20);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);

        }
        button21.setOnClickListener(){
            checkPlayer(button21);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        button22.setOnClickListener(){
            checkPlayer(button22);
            checkWinner(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
reset.setOnClickListener(){
   reset(button00, button01, button02, button10, button11, button12, button20, button21, button22);



}

    }

    fun checkWinner(
        button00: Button,
        button01: Button,
        button02: Button,
        button10: Button,
        button11: Button,
        button12: Button,
        button20: Button,
        button21: Button,
        button22: Button
    )
    {
if (button00.text.toString()==button01.text.toString() && button01.text.toString()==button02.text.toString() && button02.text.isNotEmpty() ){
showToast(button00.text.toString());
    disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
}

        if (button10.text.toString()==button11.text.toString() && button11.text.toString()==button12.text.toString() && button12.text.isNotEmpty() ){
            showToast(button10.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }


        if (button20.text.toString()==button21.text.toString() && button21.text.toString()==button22.text.toString() && button22.text.isNotEmpty() ){
            showToast(button20.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }

        if (button00.text.toString()==button10.text.toString() && button10.text.toString()==button20.text.toString() && button20.text.isNotEmpty() ){
            showToast(button00.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }

        if (button01.text.toString()== button11.text.toString() && button11.text.toString()==button21.text.toString() && button21.text.isNotEmpty() ){
            showToast(button01.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        if (button02.text.toString()== button12.text.toString() && button12.text.toString()==button22.text.toString() && button22.text.isNotEmpty() ){
            showToast(button02.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }

        if (button00.text.toString()== button11.text.toString() && button11.text.toString()==button22.text.toString() && button22.text.isNotEmpty() ){
            showToast(button00.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        if (button02.text.toString()== button11.text.toString() && button11.text.toString()==button20.text.toString() && button20.text.isNotEmpty() ){
            showToast(button02.text.toString());
            disable(button00, button01, button02, button10, button11, button12, button20, button21, button22);
        }
        if (button00.text.isNotEmpty() && button01.text.isNotEmpty() && button02.text.isNotEmpty()
            && button10.text.isNotEmpty() && button11.text.isNotEmpty() && button12.text.isNotEmpty()
            && button20.text.isNotEmpty() && button21.text.isNotEmpty()   && button22.text.isNotEmpty()){

            Toast.makeText(applicationContext,"it's a tie.play again! ",Toast.LENGTH_LONG).show();

        }



    }

    private fun disable(
        button00: Button,
        button01: Button,
        button02: Button,
        button10: Button,
        button11: Button,
        button12: Button,
        button20: Button,
        button21: Button,
        button22: Button
    ) {
        button00.isClickable=false;
        button01.isClickable=false;
        button02.isClickable=false;
        button10.isClickable=false;
        button11.isClickable=false;
        button12.isClickable=false;
        button20.isClickable=false;
        button21.isClickable=false;
        button22.isClickable=false;

    }

    fun showToast(message: String) {
        Toast.makeText(applicationContext,"winner is "+message+". Play Again!",Toast.LENGTH_LONG).show()

    }

    fun reset(
        button00: Button,
        button01: Button,
        button02: Button,
        button10: Button,
        button11: Button,
        button12: Button,
        button20: Button,
        button21: Button,
        button22: Button
    ) {

        button00.text="";
        button01.text="";
        button02.text="";
        button10.text="";
        button11.text="";
        button12.text="";
        button20.text="";
        button21.text="";
        button22.text="";

        button00.isClickable=true;
        button01.isClickable=true;
        button02.isClickable=true;
        button10.isClickable=true;
        button11.isClickable=true;
        button12.isClickable=true;
        button20.isClickable=true;
        button21.isClickable=true;
        button22.isClickable=true;

        firstPlayer = true;
    }



    fun checkPlayer(button: Button) {
    if (firstPlayer== true){

        firstPlayer = false;
        button.text = "X";

    }else{
        button.text="O";
        firstPlayer=true;


    }
    button.isClickable = false;

}





}