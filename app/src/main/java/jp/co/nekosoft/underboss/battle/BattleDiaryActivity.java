package jp.co.nekosoft.underboss.battle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import jp.co.nekosoft.underboss.R;

public class BattleDiaryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_diary);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_battle_diary, menu);
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


    public void onGetBattleReportClick(View view) {
        Intent getBattleReportIntent = new Intent(this, BattleReportView.class);
        final int result = 1;
        getBattleReportIntent.putExtra("callingActivity", "BattleDiaryActivity");
        startActivityForResult(getBattleReportIntent, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView enemyFactionMessage = (TextView) findViewById(R.id.enemy_faction_message);
        String enemyFactionSentBack = data.getStringExtra("enemyFaction");
        enemyFactionMessage.append(" " + enemyFactionSentBack);
    }

}
