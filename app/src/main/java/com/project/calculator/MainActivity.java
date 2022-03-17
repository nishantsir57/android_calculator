package com.project.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button bModulo = findViewById(R.id.bModulo);
        Button bDivide = findViewById(R.id.bDivide);
        Button bClear = findViewById(R.id.bClear);
        Button bEquals = findViewById(R.id.bEquals);
        Button bMultiplication = findViewById(R.id.bMultiplication);
        Button bDot = findViewById(R.id.bDot);
        Button bSubstraction = findViewById(R.id.bSubstraction);
        Button bAddition=findViewById(R.id.bAddition);
        Button bBack=findViewById(R.id.bBack);
        TextView display = findViewById(R.id.display);
        String[] result = {""};
        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals(result[0]))
                        s+=0;
                        display.setText(s);
                    }
                });
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="1";
                        else
                            s+=1;
                        display.setText(s);
                    }
                });
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="2";
                        else
                            s+=2;
                        display.setText(s);
                    }
                });
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="3";
                        else
                        s+=3;
                        display.setText(s);
                    }
                });
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="4";
                        else
                        s+=4;
                        display.setText(s);
                    }
                });
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="5";
                        else
                        s+=5;
                        display.setText(s);
                    }
                });
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="6";
                        else
                        s+=6;
                        display.setText(s);
                    }
                });
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="7";
                        else
                        s+=7;
                        display.setText(s);
                    }
                });
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="8";
                        else
                        s+=8;
                        display.setText(s);
                    }
                });
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        if(s.equals("0")||s.equals("0.0") || s.equals(result[0]))
                            s="9";
                        else
                        s+=9;
                        display.setText(s);
                    }
                });
        bAddition.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        s+='+';
                        display.setText(s);
                    }
                }
        );
        bSubstraction.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        s+='-';
                        display.setText(s);
                    }
                }
        );
        bMultiplication.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        s+='*';
                        display.setText(s);
                    }
                }
        );
        bDivide.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        s+='/';
                        display.setText(s);
                    }
                }
        );
        bModulo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s=display.getText().toString();
                        s+='%';
                        display.setText(s);
                    }
                }
        );
        bDot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s=display.getText().toString();
                        s+='.';
                        display.setText(s);
                    }
                }
        );
        bClear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setText("0");
                    }
                }
        );
        bEquals.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       String s= display.getText().toString();
                       List<Double> values=new ArrayList<Double>();
                       List<Character> symbols=new ArrayList<Character>();
                       String num="";
                       for(int i=0;i<s.length();i++)
                       {
                           char c=s.charAt(i);
                           if(c >= '0' && c<= '9' || c == '.')
                           {
                               num+=c;
                           }
                           else
                           {
                               symbols.add(c);
                               values.add(Double.parseDouble(num));
                               num="";
                           }
                       }
                        values.add(Double.parseDouble(num));
                       int l1=symbols.size();
                       System.out.println("length of list is"+values.size());
                       for(int i=0;i<l1;i++)
                       {
                           if(symbols.get(i) == '*')
                           {
                               double v1=values.get(i);
                               double v2=values.get(i+1);
                               values.remove(i+1);
                               values.set(i, (v1*v2));
                               symbols.remove(i);
                               l1--;
                           }
                       }
                        System.out.println("length of list is"+l1);
                        for(int i=0;i<l1;i++)
                        {
                            if(symbols.get(i) == '/')
                            {
                                double v1=values.get(i);
                                double v2=values.get(i+1);
                                values.remove(i+1);
                                values.set(i, (v1/v2));
                                symbols.remove(i);
                                l1--;
                            }
                        }
                        System.out.println("length of list is"+l1);
                        for(int i=0;i<l1;i++)
                        {
                            if(symbols.get(i) == '%')
                            {
                                double v1=values.get(i);
                                double v2=values.get(i+1);
                                values.remove(i+1);
                                values.set(i, (v1%v2));
                                symbols.remove(i);
                                l1--;
                            }
                        }
                        System.out.println("length of list is"+l1);
                        for(int i=0;i<l1;i++)
                        {
                            if(symbols.get(i) == '+')
                            {
                                double v1=values.get(i);
                                double v2=values.get(i+1);
                                values.remove(i+1);
                                values.set(i, (v1+v2));
                                symbols.remove(i);
                                l1--;
                            }
                        }
                        System.out.println("length of list is"+l1);
                        for(int i=0;i<l1;i++)
                        {
                            if(symbols.get(i) == '-')
                            {
                                double v1=values.get(i);
                                double v2=values.get(i+1);
                                values.remove(i+1);
                                values.set(i, (v1-v2));
                                symbols.remove(i);
                                l1--;
                            }
                        }
                        display.setText(values.get(0).toString());
                        result[0] =values.get(0).toString();
                    }
                }
        );
        bBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s=display.getText().toString();
                        s=s.substring(0, s.length()-1);
                        display.setText(s);
                    }
                }
        );

    }
}