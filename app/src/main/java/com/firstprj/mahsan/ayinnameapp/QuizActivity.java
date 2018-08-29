package com.firstprj.mahsan.ayinnameapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Mahsan on 02/28/2017.
 */

public class QuizActivity extends Activity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mWrongView;
    private TextView mQuestionView;
    private TextView mQuestionSession;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private TextView mAllView;

    private  String mAnswer;
    private int mScore = 0;
    private  int mWrong = 0;
    private int mAll=0;
    private  int mQuestionNumber = rnd();
    private int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mWrongView = (TextView) findViewById(R.id.wrong);
        mAllView = (TextView) findViewById(R.id.all);
        mQuestionSession = (TextView) findViewById(R.id.sessions);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);



            updateQuestion();


        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //My logic for Button goes in here
                if(mAll<30)
                {
                    mAll = mAll+1;
                    updateAll(mAll);
                }


                if (mButtonChoice1.getText()== mAnswer)
                {

                    ////////

                    if (mAll < 30){
                        updateQuestion();
                        mScore = mScore+1;
                        updateScore(mScore);
                        Toast.makeText(QuizActivity.this,"پاسخ شما صحیح بود",Toast.LENGTH_SHORT).show();
                    }
                    ///////


                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }


                } else {
                    if (mAll <30)
                    {
                        mWrong = mWrong+1;
                        updateWrong(mWrong);
                        Toast.makeText(QuizActivity.this,"پاسخ شما غلط بود",Toast.LENGTH_SHORT).show();
                        String s = mQuestionLibrary.getQuestionSessions(mQuestionNumber);
                        if (s=="1")
                            s1++;
                        if (s=="2")
                            s2++;
                        if (s=="3")
                            s3++;
                        if (s=="4")
                            s4++;
                        if (s=="5")
                            s5++;
                        if (s=="6")
                            s6++;
                        if (s=="7")
                            s7++;
                        if (s=="8")
                            s8++;
                        if (s=="9")
                            s9++;
                        if (s=="10")
                            s10++;
                    }


                    if (mAll < 30){
                        updateQuestion();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //My logic for Button goes in here
                if(mAll<30)
                {
                    mAll = mAll+1;
                    updateAll(mAll);
                }
                if (mButtonChoice2.getText()== mAnswer)
                {

                    if (mAll < 30){
                        updateQuestion();
                        mScore = mScore+1;
                        updateScore(mScore);
                        Toast.makeText(QuizActivity.this,"پاسخ شما صحیح بود",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }


                } else {
                    if(mAll<30){
                        mWrong = mWrong+1;
                        updateWrong(mWrong);
                        Toast.makeText(QuizActivity.this,"پاسخ شما غلط بود",Toast.LENGTH_SHORT).show();

                        String s = mQuestionLibrary.getQuestionSessions(mQuestionNumber);
                        if (s=="1")
                            s1++;
                        if (s=="2")
                            s2++;
                        if (s=="3")
                            s3++;
                        if (s=="4")
                            s4++;
                        if (s=="5")
                            s5++;
                        if (s=="6")
                            s6++;
                        if (s=="7")
                            s7++;
                        if (s=="8")
                            s8++;
                        if (s=="9")
                            s9++;
                        if (s=="10")
                            s10++;
                    }


                    if (mAll < 30){
                        updateQuestion();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //My logic for Button goes in here
                if(mAll<30)
                {
                    mAll = mAll+1;
                    updateAll(mAll);
                }
                if (mButtonChoice3.getText()== mAnswer)
                {

                    if (mAll < 30){
                        updateQuestion();
                        mScore = mScore+1;
                        updateScore(mScore);
                        Toast.makeText(QuizActivity.this,"پاسخ شما صحیح بود",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }


                } else {
                    if (mAll<30)
                    {
                        mWrong = mWrong+1;
                        updateWrong(mWrong);
                        Toast.makeText(QuizActivity.this,"پاسخ شما غلط بود",Toast.LENGTH_SHORT).show();

                        String s = mQuestionLibrary.getQuestionSessions(mQuestionNumber);
                        if (s=="1")
                            s1++;
                        if (s=="2")
                            s2++;
                        if (s=="3")
                            s3++;
                        if (s=="4")
                            s4++;
                        if (s=="5")
                            s5++;
                        if (s=="6")
                            s6++;
                        if (s=="7")
                            s7++;
                        if (s=="8")
                            s8++;
                        if (s=="9")
                            s9++;
                        if (s=="10")
                            s10++;
                    }


                    if (mAll < 30){
                        updateQuestion();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //My logic for Button goes in here
                if(mAll<30)
                {
                    mAll = mAll+1;
                    updateAll(mAll);
                }
                if (mButtonChoice4.getText()== mAnswer)
                {

                    if (mAll < 30){
                        updateQuestion();
                        mScore = mScore+1;
                        updateScore(mScore);
                        Toast.makeText(QuizActivity.this,"پاسخ شما صحیح بود",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }


                } else {
                    if(mAll<30)
                    {
                        mWrong = mWrong+1;
                        updateWrong(mWrong);
                        Toast.makeText(QuizActivity.this,"پاسخ شما غلط بود",Toast.LENGTH_SHORT).show();

                        String s = mQuestionLibrary.getQuestionSessions(mQuestionNumber);
                        if (s=="1")
                            s1++;
                        if (s=="2")
                            s2++;
                        if (s=="3")
                            s3++;
                        if (s=="4")
                            s4++;
                        if (s=="5")
                            s5++;
                        if (s=="6")
                            s6++;
                        if (s=="7")
                            s7++;
                        if (s=="8")
                            s8++;
                        if (s=="9")
                            s9++;
                        if (s=="10")
                            s10++;

                    }

                    if (mAll < 30){
                        updateQuestion();
                    }
                    else {
                        float r = mWrong / mAll;
                        if (r <= 0.133) {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما مردود شدید",Toast.LENGTH_SHORT).show();
                        } else

                        {
                            updateSession(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
                            Toast.makeText(QuizActivity.this,"شما قبول شدید",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
       // mQuestionNumber++;
        mQuestionNumber = rnd();
    }

    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }
    private void updateWrong(int point){
        mWrongView.setText(""+mWrong);
    }
    private void updateAll(int point){
        mAllView.setText(""+mAll);
    }
    private void updateSession(int s1,int s2,int s3,int s4,int s5, int s6,int s7,int s8,int s9,int s10){
        mQuestionSession.setText("شما تعداد"+ s1 + "سوال ازفصل اول___    "+s2+"سوال از فصل دوم___ "+ s3 +"سوال از فصل سوم___    "+ s4+
        "سوال از فصل چهارم___    "+s5+"سوال از فصل پنجم___    "+ s6+ "سوال از فصل ششم___   "+ s7+" سوال از فصل هفتم___    "+s8+"سوال از فصل هشتم___   "+
        s9+"سوال از فصل نهم___     و "+ s10+ "سوال از فصل دهم را اشتباه پاسخ داده اید. به شما توصیه می شود فصل هایی که سوالات آن را اشتباه پاسخ داده اید مجددا مرور کنید");
    }


    private int rnd()
    {
        Random rand = new Random();
        int n = rand.nextInt(40);
        return n;
    }

}
