package jp.co.nekosoft.underboss.battle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import jp.co.nekosoft.underboss.R;

/**
 * Created by micho on 09/01/15.
 */
public class BattleReportView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle_report_layout);

        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view);
        callingActivityMessage.append(" " + previousActivity);
    }

    public void onSendBattleReport(View view) {
        EditText enemyFactionET = (EditText) findViewById(R.id.enemy_faction_edit_text);
        String enemyFaction = String.valueOf(enemyFactionET.getText());

        Intent goingBack = new Intent();
        goingBack.putExtra("enemyFaction", enemyFaction);
        setResult(RESULT_OK, goingBack);
        finish();
    }

}
