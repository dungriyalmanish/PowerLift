package android.data.app.powerlift;

import android.data.app.powerlift.model.db.Exercise;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

public class Today extends AppCompatActivity implements View.OnClickListener {

    TextView ex[];
    CheckBox[][] checks;
    TextInputEditText[] editText;
    Button[] btn;
    ImageButton[][] imgBtn;
    CardView[] cardView;
    int ex1 = 0, ex2 = 0, ex3 = 0;
    Exercise exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
    }

    private void init() {
        ex = new TextView[3];
        checks = new CheckBox[3][3];
        editText = new TextInputEditText[3];
        btn = new Button[3];
        imgBtn = new ImageButton[3][5];
        cardView = new CardView[3];
        ex[0] = findViewById(R.id.t_ex1_text);
        ex[1] = findViewById(R.id.t_ex2_text);
        ex[2] = findViewById(R.id.t_ex3_text);
        checks[0][0] = findViewById(R.id.t_ex1_supp);
        checks[0][1] = findViewById(R.id.t_ex1_satisfy);
        checks[0][2] = findViewById(R.id.t_ex1_repeat);
        checks[1][0] = findViewById(R.id.t_ex2_supp);
        checks[1][1] = findViewById(R.id.t_ex2_satisfy);
        checks[1][2] = findViewById(R.id.t_ex2_repeat);
        checks[2][0] = findViewById(R.id.t_ex3_supp);
        checks[2][1] = findViewById(R.id.t_ex3_satisfy);
        checks[2][2] = findViewById(R.id.t_ex3_repeat);
        editText[0] = findViewById(R.id.t_ex1_weight);
        editText[1] = findViewById(R.id.t_ex2_weight);
        editText[2] = findViewById(R.id.t_ex2_weight);
        btn[0] = findViewById(R.id.t_ex1_btn_done);
        btn[1] = findViewById(R.id.t_ex2_btn_done);
        btn[2] = findViewById(R.id.t_ex3_btn_done);
        cardView[0] = findViewById(R.id.t_ex1_cardview);
        cardView[1] = findViewById(R.id.t_ex2_cardview);
        cardView[2] = findViewById(R.id.t_ex3_cardview);
        imgBtn[0][0] = findViewById(R.id.t_ex1_set1);
        imgBtn[0][1] = findViewById(R.id.t_ex1_set2);
        imgBtn[0][2] = findViewById(R.id.t_ex1_s3);
        imgBtn[0][3] = findViewById(R.id.t_ex1_s4);
        imgBtn[0][4] = findViewById(R.id.t_ex1_s5);
        imgBtn[2][0] = findViewById(R.id.t_ex2_set1);
        imgBtn[1][1] = findViewById(R.id.t_ex2_set2);
        imgBtn[1][2] = findViewById(R.id.t_ex2_s3);
        imgBtn[1][3] = findViewById(R.id.t_ex2_s4);
        imgBtn[1][4] = findViewById(R.id.t_ex2_s5);
        imgBtn[2][0] = findViewById(R.id.t_ex3_set1);
        imgBtn[2][1] = findViewById(R.id.t_ex3_set2);
        imgBtn[2][2] = findViewById(R.id.t_ex3_s3);
        imgBtn[2][3] = findViewById(R.id.t_ex3_s4);
        imgBtn[2][4] = findViewById(R.id.t_ex3_s5);
        ex[0].setOnClickListener(this);
        ex[1].setOnClickListener(this);
        ex[2].setOnClickListener(this);
        checks[0][0].setOnClickListener(this);
        checks[0][1].setOnClickListener(this);
        checks[0][2].setOnClickListener(this);
        checks[1][0].setOnClickListener(this);
        checks[1][1].setOnClickListener(this);
        checks[1][2].setOnClickListener(this);
        checks[2][0].setOnClickListener(this);
        checks[2][1].setOnClickListener(this);
        checks[2][2].setOnClickListener(this);
        editText[0].setOnClickListener(this);
        editText[1].setOnClickListener(this);
        editText[2].setOnClickListener(this);
        btn[0].setOnClickListener(this);
        btn[1].setOnClickListener(this);
        btn[2].setOnClickListener(this);
        cardView[0].setOnClickListener(this);
        cardView[1].setOnClickListener(this);
        cardView[2].setOnClickListener(this);
        imgBtn[0][0].setOnClickListener(this);
        imgBtn[0][1].setOnClickListener(this);
        imgBtn[0][2].setOnClickListener(this);
        imgBtn[0][3].setOnClickListener(this);
        imgBtn[0][4].setOnClickListener(this);
        imgBtn[2][0].setOnClickListener(this);
        imgBtn[1][1].setOnClickListener(this);
        imgBtn[1][2].setOnClickListener(this);
        imgBtn[1][3].setOnClickListener(this);
        imgBtn[1][4].setOnClickListener(this);
        imgBtn[2][0].setOnClickListener(this);
        imgBtn[2][1].setOnClickListener(this);
        imgBtn[2][2].setOnClickListener(this);
        imgBtn[2][3].setOnClickListener(this);
        imgBtn[2][4].setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.t_ex1_cardview:
                break;
            case R.id.t_ex1_text:
                break;
            case R.id.t_ex1_ll:
                break;
            case R.id.t_ex1_set1:
                //break;
            case R.id.t_ex1_set2:
                //break;
            case R.id.t_ex1_s3:
                // break;
            case R.id.t_ex1_s4:
                // break;
            case R.id.t_ex1_s5:
                v.setBackgroundResource(R.drawable.done);
                //v.setActivated(false);
                if (++ex1 == 5) {
                    cardView[0].setEnabled(false);
                }

                break;
            case R.id.t_ex1_supp:
                break;
            case R.id.t_ex1_satisfy:
                break;
            case R.id.t_ex1_repeat:
                break;
            case R.id.t_ex1_textview1:
                break;
            case R.id.t_ex1_weight:
                break;
            case R.id.t_ex1_btn_done:
                break;
            case R.id.t_ex2_cardview:
                break;
            case R.id.t_ex2_text:
                break;
            case R.id.t_ex2_ll:
                break;
            case R.id.t_ex2_set1:
                break;
            case R.id.t_ex2_set2:
                break;
            case R.id.t_ex2_s3:
                break;
            case R.id.t_ex2_s4:
                break;
            case R.id.t_ex2_s5:
                break;
            case R.id.t_ex2_supp:
                break;
            case R.id.t_ex2_satisfy:
                break;
            case R.id.t_ex2_repeat:
                break;
            case R.id.t_ex2_textview1:
                break;
            case R.id.t_ex2_weight:
                break;
            case R.id.t_ex2_btn_done:
                break;
            case R.id.t_ex3_cardview:
                break;
            case R.id.t_ex3_text:
                break;
            case R.id.t_ex3_ll:
                break;
            case R.id.t_ex3_set1:
                break;
            case R.id.t_ex3_set2:
                break;
            case R.id.t_ex3_s3:
                break;
            case R.id.t_ex3_s4:
                break;
            case R.id.t_ex3_s5:
                break;
            case R.id.t_ex3_supp:
                break;
            case R.id.t_ex3_satisfy:
                break;
            case R.id.t_ex3_repeat:
                break;
            case R.id.t_ex3_textview1:
                break;
            case R.id.t_ex3_weight:
                break;
            case R.id.t_ex3_btn_done:
                break;
        }
    }
}
