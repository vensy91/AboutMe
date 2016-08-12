package vensy.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by vensy on 11.08.2016.
 */
public class SkillsActivity extends AppCompatActivity {

    ListView list;
    String [] skills;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        list = (ListView) findViewById(R.id.list_skill);
        skills = getResources().getStringArray(R.array.skills);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, skills);
        list.setAdapter(adapter);
    }

    public void onBtnClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
