package jp.co.nekosoft.underboss;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import jp.co.nekosoft.underboss.army.CreateArmyListActivity;
import jp.co.nekosoft.underboss.battle.BattleDiaryActivity;
import jp.co.nekosoft.underboss.collection.CollectionActivity;


public class MainActivity extends Activity {

    private Button createArmyListButton;
    private Button collectionButton;
    private Button referenceButton;
    private Button statisticsButton;
    private Button battleDiaryButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restore any content saved
        super.onCreate(savedInstanceState);

        // Set content view
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        createArmyListButton = (Button) findViewById(R.id.create_army_list_button);
        collectionButton = (Button) findViewById(R.id.collection_button);
        referenceButton = (Button) findViewById(R.id.reference_button);
        statisticsButton = (Button) findViewById(R.id.statistics_button);
        battleDiaryButton = (Button) findViewById(R.id.battle_diary_button);

        // Link UI elements to actions in code
    }


    // This method creates the menu on the app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    // Called when a options menu item is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // A DialogFragment is a Fragment you can place over top of the current Activity.
        // A Fragment is like an interface block that you can place into an Activity.
        // The FrgamentManager allows you to interact with the Fragment
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getFragmentManager(), "theDialog");
            return true;

            // If exit was clicked close the app
        } else if (id == R.id.exit_the_app) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onCreateArmyListButtonClick(View view) {
//        TODO: Implement the button onClick logic
        startActivity(new Intent(this, CreateArmyListActivity.class));
    }
    
    public void onCollectionButtonClick(View view) {
//        TODO: Implement the button onClick logic
        startActivity(new Intent(this, CollectionActivity.class));
    }

    public void onReferenceButtonClick(View view) {
//        TODO: Implement the button onClick logic
        Toast.makeText(this, R.string.wip, Toast.LENGTH_SHORT).show();
    }

    public void onStatisticsButtonClick(View view) {
//        TODO: Implement the button onClick logic
        Toast.makeText(this, R.string.wip, Toast.LENGTH_SHORT).show();
    }

    public void onBattleDiaryButtonClick(View view) {
//        TODO: Implement the button onClick logic
        startActivity(new Intent(this, BattleDiaryActivity.class));
    }

}
