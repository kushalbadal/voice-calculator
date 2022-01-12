package com.example.hisaabvoicecalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    Button cl;
    Button div1;
    Button mul1 ;
    Button sub1 ;
    Button add1 ;
    Button one1 ;
    Button two1 ;
    Button three1 ;
    Button four1 ;
    Button five1 ;
    Button six1;
    Button seven1 ;
    Button eight1 ;
    Button nine1;
    Button zero1;
    Button point1;
    Button result1;
    Button ex1;
    Button cutt;
    TextView re11;
    TextView re22;
    TextView re33;
    TextView re44;
    Button speak;
    double temp12;
    double temp3;
    String temp2;
    double temp11;
    private TextToSpeech mTTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTTS= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS){
                    int result=   mTTS.setLanguage(Locale.getDefault());
                }
                else{
                    Log.e("TTS","Initialization failed");
                }
            }

        });

        cl = (Button)findViewById(R.id.btnclear);
        div1 = (Button)findViewById(R.id.div);
        mul1 = (Button)findViewById(R.id.mul);
        sub1 =(Button)findViewById(R.id.sub);
        add1 =(Button)findViewById(R.id.add);
        one1 =(Button)findViewById(R.id.one);
        two1 =(Button)findViewById(R.id.two);
        three1 =(Button)findViewById(R.id.three);
        four1 =(Button)findViewById(R.id.four);
        five1 =(Button)findViewById(R.id.five);
        six1 =(Button)findViewById(R.id.six);
        seven1 =(Button)findViewById(R.id.seven);
        eight1 =(Button)findViewById(R.id.eight);
        nine1 =(Button)findViewById(R.id.nine);
        zero1 =(Button)findViewById(R.id.zero);
        point1 =(Button)findViewById(R.id.point);
        result1 =(Button)findViewById(R.id.result);
        cutt =(Button)findViewById(R.id.cut);
        ex1 =(Button)findViewById(R.id.ex);
        re11 =(TextView)findViewById(R.id.re1);
        re22 =(TextView)findViewById(R.id.re2);
        re33 =(TextView)findViewById(R.id.re3);
        re44 =(TextView)findViewById(R.id.re4);
        speak =(Button)findViewById(R.id.sp);


        cl.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                re11.setText("");
                re22.setText("");
                re33.setText("");
                re44.setText("");

            }
        });

        cutt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(re22.getText()==""&&re33.getText()==""){
                    String cl=re11.getText()+"";
                    cl=cl.substring(0,(cl.length()-1));
                    re11.setText(cl+"");
                }
                else if(re33.getText()==""){
                    re22.setText("");

                }
                else if(re44.getText()==""){
                    String cl=re33.getText()+"";
                    cl=cl.substring(0,(cl.length()-1));
                    re33.setText(cl+"");
                }

            }
        });

        speak.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


                Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                startActivityForResult(intent, 1);


            }
        });
        ex1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                exit(0);

            }
        });


        add1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


                re22.setText("+");

            }
        });
        sub1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                re22.setText("-");


            }
        });
        mul1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                re22.setText("*");

            }
        });
        div1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                re22.setText("/");

            }
        });
        one1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "1");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "1");
                    }
                }

            }
        });
        two1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "2");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "2");
                    }
                }


            }
        });


        three1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "3");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "3");
                    }
                }


            }
        });
        //botton 4
        four1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "4");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "4");
                    }
                }

            }
        });
        five1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "5");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "5");
                    }
                }


            }
        });
        six1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "6");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "6");
                    }
                }

            }
        });
        seven1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "7");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "7");
                    }
                }

            }
        });
        eight1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "8");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "8");
                    }
                }

            }
        });
        nine1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "9");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "9");
                    }
                }

            }
        });
        zero1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "0");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + "0");

                    }}


            }
        });
        point1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (re22.getText() == "") {
                    if(re11.length()<19) {
                        String val = re11.getText() + "";
                        re11.setText(val + ".");
                    }
                } else {
                    if(re33.length()<19) {
                        String val = re33.getText() + "";
                        re33.setText(val + ".");
                    }
                }

            }
        });


        result1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(re11.getText()==""||re33.getText()==""){
                    re44.setText("0");
                }
                else {
                    temp12 = Double.parseDouble(re11.getText() + "");
                    temp3 = Double.parseDouble(re33.getText() + "");
                    temp2 = re22.getText() + "";
                    switch (temp2) {
                        case "+":
                            temp11 = temp12 + temp3;
                            String tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "-":
                            temp11 = temp12 - temp3;
                            tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "*":
                            temp11 = temp12 * temp3;
                            tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "/":
                            if(temp11==0&&temp3==0){
                                re44.setText("math error");
                            }
                            else {
                                temp11 = temp12 / temp3;
                                tempf=temp11+"";
                                re44.setText("=" + tempf);
                                break;
                            }
                    }

                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==RESULT_OK && data!=null) {
            ArrayList<String> arraylist = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            String ch=arraylist.get(0);
            int a=0;
            if(ch.equals("hot")||ch.equals("cut")||ch.equals("court")||ch.equals("Court")){
                if(re22.getText()==""&&re33.getText()==""){
                    String cl=re11.getText()+"";
                    cl=cl.substring(0,(cl.length()-1));
                    re11.setText(cl+"");
                }
                else if(re33.getText()==""){
                    re22.setText("");

                }
                else if(re44.getText()==""){
                    String cl=re33.getText()+"";
                    cl=cl.substring(0,(cl.length()-1));
                    re33.setText(cl+"");

                }
            }
            if(ch.equals("clear")){
                re11.setText("");
                re22.setText("");
                re33.setText("");
                re44.setText("");
            }
            if(ch.equals("exit")){
                exit(0);
            }
            if(ch.equals("answer")||ch.equals("Uttar"))
            {
                if(re11.getText()==""||re33.getText()==""){
                    re44.setText("0");
                }
                else {
                    temp12 = Double.parseDouble(re11.getText() + "");
                    temp3 = Double.parseDouble(re33.getText() + "");
                    temp2 = re22.getText() + "";
                    switch (temp2) {
                        case "+":
                            temp11 = temp12 + temp3;
                            String tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "-":
                            temp11 = temp12 - temp3;
                            tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "*":
                            temp11 = temp12 * temp3;
                            tempf=temp11+"";
                            re44.setText("=" + tempf);
                            break;
                        case "/":
                            if(temp11==0&&temp3==0){
                                re44.setText("math error");
                            }
                            else {
                                temp11 = temp12 / temp3;
                                tempf=temp11+"";
                                re44.setText("=" + tempf);
                                break;
                            }
                    }

                }
                String res="The Result is "+re44.getText().toString();
                mTTS.setPitch(1.2f);
                mTTS.setSpeechRate(0.8f);
                mTTS.speak(res,TextToSpeech.QUEUE_FLUSH,null);

            }


            if (re22.getText() == "" && re33.getText() == "") {

                if (  ch.equals("one")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "1");
                        a=1;
                    }

                }
                if (  ch.equals("do") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "2");
                        a=1;
                    }}
                if (  ch.equals("to") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "2");
                        a=1;
                    }}
                if (  ch.equals("two" )) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "2");
                        a=1;
                    }

                }
                if (ch.equals("three") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "3");
                        a=1;
                    }
                }
                if (ch.equals("tree") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "3");
                        a=1;
                    }
                }

                if ( ch.equals("for") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "4");
                        a=1;
                    }

                }
                if ( ch.equals("four") ) {
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "4");
                        a=1;
                    }

                }
                if ( ch.equals("five")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "5");
                        a=1;
                    }

                }
                if ( ch.equals("six")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "6");
                        a=1;
                    }

                }
                if ( ch.equals("seven")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "7");
                        a=1;
                    }

                }
                if ( ch.equals("eight")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "8");
                        a=1;
                    }

                }
                if (ch.equals("nine")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "9");
                        a=1;
                    }

                }
                if ( ch.equals("zero")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + "0");
                        a=1;
                    }

                }
                if ( ch.equals("point")){
                    if (re11.length() < 19) {
                        String val = re11.getText() + "";
                        re11.setText(val + ".");
                        a=1;
                    }

                }
                if ( ch.equals("plus")||ch.equals("Plus")){
                    re22.setText("+");
                    a=1;
                }
                if (ch.equals("minus")){
                    re22.setText("-");
                    a=1;
                }
                if ( ch.equals("multiply" )) {
                    re22.setText("*");
                    a=1;
                }
                if ( ch.equals("into") ) {
                    re22.setText("*");
                    a=1;
                }
                if ( ch.equals("divide")){
                    re22.setText("/");
                    a=1;
                }
                if ( ch.equals("by")){
                    re22.setText("/");
                    a=1;
                }
                if ( ch.equals("buy")){
                    re22.setText("/");
                    a=1;
                }
                if ( ch.equals("bi")){
                    re22.setText("/");
                    a=1;
                }
                if ( ch.equals("bhai")){
                    re22.setText("/");
                    a=1;
                }
            }
            else{
                if (re44.getText() == ""&&re22.getText()!="") {

                    if (  ch.equals("one")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "1");
                            a=1;
                        }

                    }
                    if (  ch.equals("do" )) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "2");
                            a=1;
                        }}
                    if (  ch.equals("to" )) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "2");
                            a=1;
                        }}
                    if (  ch.equals("two") ) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "2");
                            a=1;
                        }

                    }
                    if (ch.equals("three") ) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "3");
                            a=1;
                        }
                    }
                    if (ch.equals("tree") ) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "3");
                            a=1;
                        }
                    }

                    if ( ch.equals("for") ) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "4");
                            a=1;
                        }

                    }
                    if ( ch.equals("four" )) {
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "4");
                            a=1;
                        }

                    }
                    if ( ch.equals("five")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "5");
                            a=1;
                        }

                    }
                    if ( ch.equals("six")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "6");
                            a=1;
                        }

                    }
                    if ( ch.equals("seven")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "7");
                            a=1;
                        }

                    }
                    if ( ch.equals("eight")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "8");
                            a=1;
                        }

                    }
                    if (ch.equals("nine")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "9");
                            a=1;
                        }

                    }
                    if ( ch.equals("zero")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + "0");
                            a=1;
                        }

                    }
                    if ( ch.equals("point")){
                        if (re33.length() < 19) {
                            String val = re33.getText() + "";
                            re33.setText(val + ".");
                            a=1;
                        }

                    }
                }

            }
            if(a==0){
                int i = 0;
                while (ch.length() > i) {
                    char value = ch.charAt(i);
                    i++;

                    if (re22.getText() == "" && re33.getText() == "") {

                        if (value == '1') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "1");

                            }

                        }
                        if (value == '2') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "2");

                            }

                        }
                        if (value == '3') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "3");

                            }

                        }
                        if (value == '4') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "4");
                            }

                        }
                        if (value == '5') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "5");

                            }

                        }
                        if (value == '6') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "6");
                            }

                        }
                        if (value == '7' ) {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "7");
                            }

                        }
                        if (value == '8') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "8");
                            }

                        }
                        if (value == '9') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "9");
                            }

                        }
                        if (value == '0') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + "0");
                            }

                        }
                        if (value == '.') {
                            if (re11.length() < 19) {
                                String val = re11.getText() + "";
                                re11.setText(val + ".");
                            }

                        }
                        if (value == '+') {
                            re22.setText("+");
                        }
                        if (value == '-') {
                            re22.setText("-");
                        }
                        if (value == '*') {
                            re22.setText("*");
                        }
                        if (value == '/') {
                            re22.setText("/");
                        }
                    } else {
                        if (re44.getText() == "" && re22.getText() != "") {

                            if (value == '1') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "1");
                                }

                            }
                            if (value == '2') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "2");
                                }

                            }
                            if (value == '3') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "3");
                                }

                            }
                            if (value == '4') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "4");
                                }

                            }
                            if (value == '5') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "5");
                                }

                            }
                            if (value == '6') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "6");
                                }

                            }
                            if (value == '7') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "7");
                                }

                            }
                            if (value == '8') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "8");
                                }

                            }
                            if (value == '9') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "9");
                                }

                            }
                            if (value == '0') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + "0");
                                }

                            }
                            if (value == '.') {
                                if (re33.length() < 19) {
                                    String val = re33.getText() + "";
                                    re33.setText(val + ".");
                                }

                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    protected void onDestroy() {
        if(mTTS!=null){
            mTTS.stop();
            mTTS.shutdown();
        }
        super.onDestroy();
    }
}
