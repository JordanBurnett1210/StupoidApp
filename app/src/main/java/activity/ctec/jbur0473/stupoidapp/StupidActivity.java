package activity.ctec.jbur0473.stupoidapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StupidActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid, menu);
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

    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
    }

    private void changeVisibility()
    {
       if(basicText.getVisibility() == View.VISIBLE)
       {
           bsicText.setVisibility(View.GONE);
       }
       else
       {
           basicText.setVisibili(View.VISIBLE);
       }

        basicText.setVisibility(View.GONE);
    }

    private void setupListeners()
    {
        colorChangeButton.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                //This is where the action happens!
                changeBackgroundColor();

            }
        }
    }
}
