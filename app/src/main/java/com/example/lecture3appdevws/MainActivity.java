package com.example.lecture3appdevws;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    public EditText display;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView);

    }

    public void updateTxt(String StringToAdd) {
        String oldString = display.getText().toString();
        display.setText(String.format("%s%s", oldString, StringToAdd));
    }

    public void zeroBtn(View view) {
        Log.i("Main", Integer.toString(display.getCurrentTextColor()));
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.BLACK);
        }

        updateTxt("0");
    }

    public void OneBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("1");
    }

    public void TwoBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("2");
    }

    public void ThreeBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("3");
    }

    public void FourBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("4");
    }

    public void FiveBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("5");
    }

    public void SixBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("6");
    }

    public void SevenBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("7");
    }

    public void EightBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("8");
    }

    public void NineBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt("9");
    }

    public void DotBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setText("");
            textView.setText("");
            display.setTextColor(Color.WHITE);
        }
        updateTxt(".");
    }

    public void ClearBtn(View view) {
        textView.setText("");
        display.setText("");
    }

    public void RightBracketBtn(View view) {
        updateTxt("(");
    }

    public void LeftBracketBtn(View view) {
        updateTxt(")");
    }

    public void EqualsBtn(View view) {
        String oldString = display.getText().toString();

        textView.setText(oldString + "=");
        if (oldString.contains("X")) {
            oldString = oldString.replace("X", "*");
        }
        if (oldString.contains("÷")) {
            oldString = oldString.replace("÷", "/");
        }
        Expression expression = new ExpressionBuilder(oldString).build();

        double result = expression.evaluate();
        display.setText("");
        String result_str = Double.toString(result);
        if (result_str.substring(result_str.length() - 2, result_str.length()).equals(".0")) {
            result_str = result_str.substring(0, result_str.length() - 2);

        }
        display.setTextColor(Color.YELLOW);
        updateTxt(result_str);

// * & /
    }

    public void AdditionBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setTextColor(Color.WHITE);
        }
        updateTxt("+");
    }

    public void SubstractionBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setTextColor(Color.WHITE);
        }
        updateTxt("-");
    }

    public void MultiplicationBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setTextColor(Color.WHITE);
        }
        updateTxt("X");
    }

    public void DivisionBtn(View view) {
        if (display.getCurrentTextColor() == -256) {
            display.setTextColor(Color.WHITE);
        }
        updateTxt("÷");
    }

    public void BackSpaceBtn(View view) {
        String oldString = display.getText().toString();
        display.setSelection(oldString.length());

        ClearBtn(view);
        if (display.getCurrentTextColor() == -256) {
            display.setTextColor(Color.WHITE);
        }
        updateTxt(oldString.substring(0, oldString.length() - 1));


    }

}