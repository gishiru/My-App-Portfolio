package com.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
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

  /**
   * This method is called when a button clicked.
   *
   * @attention This method must to be defined as public, void, and just having a abstruct, view.
   * @todo (Hiroyuki Kawagashira) Improve click feeling.
   */
  public void sendMessage(View view) {
    String str = "Unknown view was clicked";
    switch (view.getId()) {
      case R.id.button:
        str = "This button will launch my spotify streamer!";
        break;
      case R.id.button2:
        str = "This button will launch my score app!";
        break;
      case R.id.button3:
        str = "This button will launch my library app!";
        break;
      case R.id.button4:
        str = "This button will launch my build it bigger!";
        break;
      case R.id.button5:
        str = "This button will launch my xyz reader!";
        break;
      case R.id.button6:
        str = "This button will launch my capstone app!";
        break;
      default:
        break;
    }
    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
  }
}
