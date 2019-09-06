package android.data.app.powerlift;

import android.content.Intent;
import android.data.app.powerlift.model.db.Exercise;
import android.data.app.powerlift.utils.DataConstants;
import android.data.app.powerlift.utils.ExUtils;
import android.data.app.powerlift.views.IViews;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IViews.IMainView {

    CalendarView calendarView;
    TextView ex[];
    TextView ex_points[][];
    ArrayList<Exercise> mExercises = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                startActivity(new Intent(MainActivity.this, Today.class));
            }
        });
    }

    private void init() {
        ex = new TextView[3];
        ex[0] = findViewById(R.id.ex1_text);
        ex[1] = findViewById(R.id.ex2_text);
        ex[2] = findViewById(R.id.ex3_text);
        ex_points = new TextView[3][4];
        ex_points[0][0] = findViewById(R.id.ex1_p1);
        ex_points[0][1] = findViewById(R.id.ex1_p2);
        ex_points[0][2] = findViewById(R.id.ex1_p3);
        ex_points[0][3] = findViewById(R.id.ex1_p4);
        ex_points[1][0] = findViewById(R.id.ex2_p1);
        ex_points[1][1] = findViewById(R.id.ex2_p2);
        ex_points[1][2] = findViewById(R.id.ex2_p3);
        ex_points[1][3] = findViewById(R.id.ex2_p4);
        ex_points[2][0] = findViewById(R.id.ex3_p1);
        ex_points[2][1] = findViewById(R.id.ex3_p2);
        ex_points[2][2] = findViewById(R.id.ex3_p3);
        ex_points[2][3] = findViewById(R.id.ex3_p4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void updateData(ArrayList<Exercise> exercises) {
        Exercise e;
        for (int i = 0; i < exercises.size(); i++) {
            e = exercises.get(i);
            ex[i].setText(ExUtils.getExercise(e.getType()));
            if (e.getPart_a() != e.getPart_b())
                ex_points[i][0].setText(e.getPart_a() + "+" + e.getPart_b() + "kg");
            else
                ex_points[i][0].setText(e.getPart_a() + "kg");
            if (e.isSatisfied())
                ex_points[i][1].setText(DataConstants.SATISFIED);
            else
                ex_points[i][1].setText(DataConstants.NOT_SATISFIED);
            if (e.isRepeat())
                ex_points[i][2].setText(DataConstants.REPEAT);
            else
                ex_points[i][2].setText(DataConstants.NOT_REPEAT);
            if (e.isSupport())
                ex_points[i][3].setText(DataConstants.SUPPORTED);
            else
                ex_points[i][3].setText(DataConstants.NOT_SUPPORTED);
        }
    }

    @Override
    public void moveToToday() {
        Intent i = new Intent(this, Today.class);
        startActivity(i);
    }
}
