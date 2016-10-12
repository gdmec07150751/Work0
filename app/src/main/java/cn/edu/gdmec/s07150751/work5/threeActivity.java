package cn.edu.gdmec.s07150751.work5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class threeActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setText("单击");
        button.setOnClickListener(new OuterClass());
    }
    class OuterClass implements View.OnClickListener{
        public void onClick(View v){
            Toast.makeText(threeActivity.this,"已单击我",Toast.LENGTH_SHORT).show();
            System.out.println("已单击我");
        }


    }
}
