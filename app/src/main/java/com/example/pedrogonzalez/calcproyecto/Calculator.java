package com.example.pedrogonzalez.calcproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String POINT = ".";


    Button zero, one, two, three, four,
            five, six, seven, eight, nine,
            point, sign, product, divide, minus,
            plus, erase, equals, history, clean;

    int op = 0, pos = 0, reset = 0;

    float num1 = 0, num2 = 0;
    TextView exit;
    String InComing;
    public static String past[] = {"1","2","3","4","5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        history = (Button) findViewById(R.id.button_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this, MainActivity2.class);
                startActivity(intent);
//                Exit = (TextView) findViewById(R.id.screen);
//                inComing = past[0] + "\n" + past[1] + "";
//                Exit.setText(inComing);
            }
        });

        point = (Button) findViewById(R.id.button_point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);

                if (!exit.getText().toString().contains(".")) {
                    if (reset > 0) {
                        InComing = POINT;
                        reset = 0;
                    } else {
                        InComing = exit.getText().toString() + POINT;
                    }
                    exit.setText(InComing);
                }
            }
        });

        zero = (Button) findViewById(R.id.button_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = ZERO;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + ZERO;
                }
                exit.setText(InComing);
            }
        });

        one = (Button) findViewById(R.id.button_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = ONE;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + ONE;
                }
                exit.setText(InComing);
            }
        });

        two = (Button) findViewById(R.id.button_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = TWO;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + TWO;
                }
                exit.setText(InComing);
            }
        });

        three = (Button) findViewById(R.id.button_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (reset > 0) {
                    InComing = THREE;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + THREE;
                }
                exit.setText(InComing);
            }

        });

        four = (Button) findViewById(R.id.button_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = FOUR;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + FOUR;
                }
                exit.setText(InComing);
            }

        });

        five = (Button) findViewById(R.id.button_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = FIVE;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + FIVE;
                }
                exit.setText(InComing);
            }

        });

        six = (Button) findViewById(R.id.button_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = SIX;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + SIX;
                }
                exit.setText(InComing);
            }

        });

        seven = (Button) findViewById(R.id.button_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = SEVEN;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + SEVEN;
                }
                exit.setText(InComing);
            }
        });

        eight = (Button) findViewById(R.id.button_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = EIGHT;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + EIGHT;
                }
                exit.setText(InComing);
            }
        });

        nine = (Button) findViewById(R.id.button_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reset > 0) {
                    InComing = NINE;
                    reset = 0;
                } else {
                    exit = (TextView) findViewById(R.id.screen);
                    InComing = exit.getText().toString() + NINE;
                }
                exit.setText(InComing);
            }
        });

        clean = (Button) findViewById(R.id.clean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit.setText("");
                num1 = 0;
                num2 = 0;
            }
        });

        erase = (Button) findViewById(R.id.button_back);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0) {
                    InComing = InComing.substring(0, exit.getText().length() - 1);
                    exit.setText(InComing);
                    if (reset > 0) {
                        exit.setText("");
                        num1 = 0;
                        num2 = 0;
                    }
                }
            }
        });

        plus = (Button) findViewById(R.id.button_plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 1;
                    num1 = Float.valueOf(exit.getText().toString());
                    exit.setText("");
                }
            }
        });


        minus = (Button) findViewById(R.id.button_minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 2;
                    num1 = Float.valueOf(exit.getText().toString());
                    exit.setText("");
                }
            }
        });


        product = (Button) findViewById(R.id.button_product);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 3;
                    num1 = Float.valueOf(exit.getText().toString());
                    exit.setText("");
                }
            }
        });

        divide = (Button) findViewById(R.id.button_divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 4;
                    num1 = Float.valueOf(exit.getText().toString());
                    exit.setText("");
                }
            }
        });

        sign = (Button) findViewById(R.id.button_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);

                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    num2 = Float.valueOf(exit.getText().toString()) * (-1);
                    InComing = String.valueOf(num2);
                    InComing = absoluteValue(InComing);
                    exit.setText(InComing);
                }
            }
        });

        equals = (Button) findViewById(R.id.button_equal);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    num2 = Float.valueOf(exit.getText().toString());

                    switch (op) {
                        case 1: {
                            InComing = String.valueOf(plus(num1, num2, pos));
                        }
                        break;
                        case 2: {
                            InComing = String.valueOf(minus(num1, num2, pos));
                        }
                        break;

                        case 3: {
                            InComing = String.valueOf(product(num1, num2, pos));
                        }
                        break;

                        case 4: {
                            InComing = (divide(num1, num2, pos));
                        }
                        break;
                    }
                    if (!InComing.toLowerCase().equals("error") && op != 0) {
                        InComing = absoluteValue(InComing);
                        op = 0;
                    }
                    exit.setText(InComing);
                    reset = 1;
                    pos = pos + 1;
                }
            }
        });
    }

    private float plus(float a, float b, int pos) {
        float result;
        result = a + b;

        String partA, partB, partC;

        partA = String.valueOf(a);
        partB = String.valueOf(b);
        partC = String.valueOf(result);

        partA = absoluteValue(partA);
        partB = absoluteValue(partB);
        partC = absoluteValue(partC);

        String his = String.format("%s)%s+%s = %s", pos + 1, partA, partB, partC);
        past[pos] = his;

        return result;
    }

    private float minus(float a, float b, int pos) {
        float result;
        result = a - b;

        String partA, partB, partC;

        partA = String.valueOf(a);
        partB = String.valueOf(b);
        partC = String.valueOf(result);

        partA = absoluteValue(partA);
        partB = absoluteValue(partB);
        partC = absoluteValue(partC);

        String his = String.format("%s)%s-%s = %s", pos + 1, partA, partB, partC);
        past[pos] = his;

        return result;
    }

    private float product(float a, float b, int pos) {
        float result;

        result = a * b;
        String partA, partB, partC;

        partA = String.valueOf(a);
        partB = String.valueOf(b);
        partC = String.valueOf(result);

        partA = absoluteValue(partA);
        partB = absoluteValue(partB);
        partC = absoluteValue(partC);

        String his = String.format("%s)%s*%s = %s", pos + 1, partA, partB, partC);
        past[pos] = his;

        return result;
    }

    private String divide(float a, float b, int pos) {
        float result;
        String partA, partB, partC;

        partA = String.valueOf(a);
        partB = String.valueOf(b);

        partA = absoluteValue(partA);
        partB = absoluteValue(partB);

        if (b != 0) {
            result = a / b;

            partC = String.valueOf(result);
            partC = absoluteValue(partC);

        } else {
            partC = ("Error");
        }

        String his = String.format("%s)%s/%s = %s", pos + 1, partA, partB, partC);
        past[pos] = his;

        return partC;
    }

    private String absoluteValue(String InComing) {
        String a = InComing;

        if (Float.valueOf(InComing.substring(InComing.indexOf(".") + 1, InComing.length())) <= 0) {
            a = (InComing.substring(0, InComing.length() - 2));
        }
        return a;
    }

}