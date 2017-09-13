package neit.menu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;
import static neit.menu.R.id.ToastTopTextBox;

public class MainActivity extends AppCompatActivity {

    private EditText top;
    private EditText bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        if (id == R.id.ToastTopTextBox) {
            //top = (EditText)findViewById((R.id.topBox));
            top = (EditText)findViewById (R.id.topBox);
            Toast.makeText(this, top.getText(), Toast.LENGTH_LONG).show();
        }
        if (id == R.id.longText) {
            bottom = (EditText)findViewById (R.id.bottomBox);
            Toast.makeText(this, bottom.getText(), Toast.LENGTH_LONG).show();
        }
        if (id == R.id.New) {
            top = (EditText)findViewById (R.id.topBox);
            bottom = (EditText)findViewById (R.id.bottomBox);
            top.setText("");
            bottom.setText("");
        }



        return super.onOptionsItemSelected(item);
    }
}
