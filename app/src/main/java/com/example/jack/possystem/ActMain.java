package com.example.jack.possystem;

import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {

    boolean bool紅茶 = false;
    boolean bool綠茶 = false;
    boolean bool麥茶 = false;
    boolean bool烏龍茶 = false;
    boolean bool冬瓜茶 = false;
    boolean bool奶茶 = false;

    private void cancelClick(){
        boolean bool紅茶 = false;
        boolean bool綠茶 = false;
        boolean bool麥茶 = false;
        boolean bool烏龍茶 = false;
        boolean bool冬瓜茶 = false;
        boolean bool奶茶 = false;

        btn紅茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn紅茶.setTextColor(Color.parseColor("#eeeeee"));

        btn綠茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn綠茶.setTextColor(Color.parseColor("#eeeeee"));

        btn麥茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn麥茶.setTextColor(Color.parseColor("#eeeeee"));

        btn烏龍茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn烏龍茶.setTextColor(Color.parseColor("#eeeeee"));

        btn冬瓜茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn冬瓜茶.setTextColor(Color.parseColor("#eeeeee"));

        btn奶茶.setBackgroundColor(Color.parseColor("#3399ff"));
        btn奶茶.setTextColor(Color.parseColor("#eeeeee"));
    }

    private View.OnClickListener btn紅茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn紅茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn紅茶.setTextColor(Color.parseColor("#3399ff"));

            bool紅茶 = true;
            lbl金額.setText("20");
        }
    };

    private View.OnClickListener btn綠茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn綠茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn綠茶.setTextColor(Color.parseColor("#3399ff"));

            bool綠茶 = true;
            lbl金額.setText("20");
        }
    };

    private View.OnClickListener btn麥茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn麥茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn麥茶.setTextColor(Color.parseColor("#3399ff"));

            bool麥茶 = true;
            lbl金額.setText("20");
        }
    };

    private View.OnClickListener btn烏龍茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn烏龍茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn烏龍茶.setTextColor(Color.parseColor("#3399ff"));

            bool烏龍茶 = true;
            lbl金額.setText("20");
        }
    };

    private View.OnClickListener btn冬瓜茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn冬瓜茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn冬瓜茶.setTextColor(Color.parseColor("#3399ff"));

            bool冬瓜茶 = true;
            lbl金額.setText("25");
        }
    };

    private View.OnClickListener btn奶茶_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelClick();
            btn奶茶.setBackgroundColor(Color.parseColor("#eeeeee"));
            btn奶茶.setTextColor(Color.parseColor("#3399ff"));

            bool奶茶 = true;
            lbl金額.setText("30");
        }
    };

    private View.OnClickListener btn確認_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!(bool紅茶 || bool綠茶 || bool麥茶 || bool烏龍茶 || bool冬瓜茶 || bool奶茶) || !(rdb全糖.isChecked()
                    || rdb少糖.isChecked() || rdb半糖.isChecked() || rdb微糖.isChecked() || rdb無糖.isChecked())
                    || !(rdb正常冰.isChecked() || rdb少冰.isChecked() || rdb微冰.isChecked() || rdb去冰.isChecked())){
                AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("未確實選取").setMessage("請確實選取。").show();
                return;
            }
            String strMsg = "產品:\n";
            int intCost = 0;
            if(bool紅茶 == true){
                strMsg += "紅茶";
                intCost = 20;
            }
            if(bool綠茶 == true){
                strMsg += "綠茶";
                intCost = 20;
            }
            if(bool麥茶 == true){
                strMsg += "麥茶";
                intCost = 20;
            }
            if(bool烏龍茶 == true){
                strMsg += "烏龍茶";
                intCost = 20;
            }
            if(bool冬瓜茶 == true){
                strMsg += "冬瓜茶";
                intCost = 25;
            }
            if(bool奶茶 == true){
                strMsg += "奶茶 ";
                intCost = 30;
            }
            strMsg += "冰塊: ";
            if(rdb去冰.isChecked()){
                strMsg += "去冰";
            }
            if(rdb微冰.isChecked()){
                strMsg += "微冰";
            }
            if(rdb少冰.isChecked()){
                strMsg += "少冰";
            }
            if(rdb正常冰.isChecked()){
                strMsg += "正常冰";
            }
            strMsg += "糖度: ";
            if(rdb無糖.isChecked()){
                strMsg += "無糖";
            }
            if(rdb微糖.isChecked()){
                strMsg += "微糖";
            }
            if(rdb半糖.isChecked()){
                strMsg += "半糖";
            }
            if(rdb少糖.isChecked()){
                strMsg += "少糖";
            }
            if(rdb全糖.isChecked()){
                strMsg += "全糖";
            }
            strMsg += "\n------------\n";
            strMsg += String.valueOf(intCost) + "元";
            AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("購買明細").setMessage(strMsg).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }

    private void InitialComponent(){
        btn紅茶 = findViewById(R.id.btn紅茶);
        btn紅茶.setOnClickListener(btn紅茶_Click);
        btn綠茶 = findViewById(R.id.btn綠茶);
        btn綠茶.setOnClickListener(btn綠茶_Click);
        btn麥茶 = findViewById(R.id.btn麥茶);
        btn麥茶.setOnClickListener(btn麥茶_Click);
        btn烏龍茶 = findViewById(R.id.btn烏龍茶);
        btn烏龍茶.setOnClickListener(btn烏龍茶_Click);
        btn冬瓜茶 = findViewById(R.id.btn冬瓜茶);
        btn冬瓜茶.setOnClickListener(btn冬瓜茶_Click);
        btn奶茶 = findViewById(R.id.btn奶茶);
        btn奶茶.setOnClickListener(btn奶茶_Click);
        btn確認 = findViewById(R.id.btn確認);
        btn確認.setOnClickListener(btn確認_Click);
        rdb去冰 = findViewById(R.id.rdb去冰);
        rdb微冰 = findViewById(R.id.rdb微冰);
        rdb少冰 = findViewById(R.id.rdb少冰);
        rdb正常冰 = findViewById(R.id.rdb正常冰);
        rdb無糖 = findViewById(R.id.rdb無糖);
        rdb微糖 = findViewById(R.id.rdb微糖);
        rdb半糖 = findViewById(R.id.rdb半糖);
        rdb少糖 = findViewById(R.id.rdb少糖);
        rdb全糖 = findViewById(R.id.rdb全糖);
        lbl金額 = findViewById(R.id.lbl金額);

    }

    Button btn紅茶;
    Button btn綠茶;
    Button btn麥茶;
    Button btn烏龍茶;
    Button btn冬瓜茶;
    Button btn奶茶;
    Button btn確認;
    RadioButton rdb去冰;
    RadioButton rdb微冰;
    RadioButton rdb少冰;
    RadioButton rdb正常冰;
    RadioButton rdb無糖;
    RadioButton rdb微糖;
    RadioButton rdb半糖;
    RadioButton rdb少糖;
    RadioButton rdb全糖;
    TextView lbl金額;

}
