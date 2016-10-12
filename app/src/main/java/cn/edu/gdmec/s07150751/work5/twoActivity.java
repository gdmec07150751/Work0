package cn.edu.gdmec.s07150751.work5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class twoActivity extends Activity {
    Context AContext;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setText("单击");
        button.setOnClickListener(new OuterClass(AContext));
    }
}

    class OuterClass implements View.OnClickListener {
        Context mContext;
        OuterClass(Context context){
            mContext = context;
        }
        public void onClick(View v) {
           Toast.makeText(mContext,"已点击我",Toast.LENGTH_SHORT).show();
            System.out.println("已单击我");
        }


    }
