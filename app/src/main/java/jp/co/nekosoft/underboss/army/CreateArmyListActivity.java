package jp.co.nekosoft.underboss.army;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import jp.co.nekosoft.underboss.R;


public class CreateArmyListActivity extends Activity {

    private Spinner factionSpinner;
    private EditText armyNameET;
    private EditText warcasterNumberET;
    private EditText pointsET;

    private TextView armyNameTV, warcasterNumberTV, pointsTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_army_list);

        addItemsToFactionSpinner();
        addListenerToFactionSpinner();

        armyNameET = (EditText) findViewById(R.id.army_name_edit_text);
        warcasterNumberET = (EditText) findViewById(R.id.warcaster_number_edit_text);
        pointsET = (EditText) findViewById(R.id.points_edit_text);

        initializeTextViews();
    }

    private void addListenerToFactionSpinner() {
        factionSpinner = (Spinner) findViewById(R.id.army_faction_spinner);
        factionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelectedSpinner = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // TODO maybe add something here later
            }
        });
    }

    private void addItemsToFactionSpinner() {
        factionSpinner = (Spinner) findViewById(R.id.army_faction_spinner);
        ArrayAdapter<CharSequence> factionSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.factions, android.R.layout.simple_spinner_item);
        factionSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        factionSpinner.setAdapter(factionSpinnerAdapter);
    }

    private void initializeTextViews() {
        armyNameTV = (TextView) findViewById(R.id.army_name_text_view);
        warcasterNumberTV = (TextView) findViewById(R.id.warcaster_number_text_view);
        pointsTV = (TextView) findViewById(R.id.points_text_view);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_army_list, menu);
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
}
