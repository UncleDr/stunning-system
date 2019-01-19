package c.b.a.helloworld;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String phone,email,usrname,pswd;
    int progress ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        final EditText editText3 = (EditText)findViewById(R.id.editText3);
        final EditText editText4 = (EditText)findViewById(R.id.editText4);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        final RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        final RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        final CheckBox checkBox = (CheckBox)findViewById(R.id.CheckBox);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone = editText1.getText().toString();
                email = editText2.getText().toString();
                usrname = editText3.getText().toString();
                pswd = editText4.getText().toString();
                progress = 0;

                if(!phone.equals("") && !email.equals("") && !usrname.equals("") && !pswd.equals("") &&
                        (radioButton1.isChecked() || radioButton2.isChecked()) && checkBox.isChecked()){
                    textView8.setText("注册成功\n");
                    Log.i("MainActivity","注册成功\n");
                }
                else{
                    textView8.setText("请输入完整信息\n");
                    Log.i("MainActivity","请输入完整信息\n");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                MainActivity.this.finish();
            }
        });


    }


}
