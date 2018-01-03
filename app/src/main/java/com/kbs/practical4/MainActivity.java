package com.kbs.practical4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    RadioButton rbtnusdollor,rbtnukdollor,rbtnyen,rbtndinhar;
    EditText Edamount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initalize the controls
        rbtnusdollor = (RadioButton)findViewById(R.id.rbtn_usdollor);
        rbtndinhar = (RadioButton)findViewById(R.id.rbtn_dinhar);
        rbtnyen =(RadioButton)findViewById(R.id.rbtn_yen);
        rbtnukdollor=(RadioButton)findViewById(R.id.rbtn_ukdollor);
        Edamount=(EditText)findViewById(R.id.et_amount);
    }
    public void btn_clear_onClick(View v)
    {
        Edamount.setText("");
    }

    public void btn_convert_onClick(View v)
    {
        double cval,ans;
        if(rbtndinhar.isChecked()==true)
        {
            cval = 15;
            ans =Double.parseDouble(Edamount.getText().toString())/15;
            Toast.makeText(MainActivity.this,ans+" ",Toast.LENGTH_LONG).show();
        }

        if (rbtnukdollor.isChecked()==true)
        {
            cval=84;
            ans =Double.parseDouble(Edamount.getText().toString())/84;
            Toast.makeText(MainActivity.this,ans+" ",Toast.LENGTH_LONG).show();
        }

        if (rbtnusdollor.isChecked()==true)
        {
            cval=48;
            ans =Double.parseDouble(Edamount.getText().toString())/48;
            Toast.makeText(MainActivity.this,ans+" ",Toast.LENGTH_LONG).show();
        }

        if (rbtnyen.isChecked()==true)
        {
            cval=34;
            ans =Double.parseDouble(Edamount.getText().toString())/34;
            Toast.makeText(MainActivity.this,ans+" ",Toast.LENGTH_LONG).show();
        }
    }
}
