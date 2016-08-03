package vensy.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_skills;
    String [] skills;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_skills = (TextView) findViewById(R.id.skills);
        skills = getResources().getStringArray(R.array.skills);
    }

    public void onBtnClick(View view) {
        if (i<skills.length) {
            text_skills.append(skills[i] + "\n\n");
            i+=1;
        }
    }
}
