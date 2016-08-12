package vensy.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView photo;
    Button btn_skill;
    TextView name, surname, patronymic, email;
    EditText edit_name, edit_surname, edit_patronymic, edit_email;
    Animation fade_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photo = (ImageView) findViewById(R.id.photo);
        name = (TextView) findViewById(R.id.name);
        surname = (TextView) findViewById(R.id.surname);
        patronymic = (TextView) findViewById(R.id.patronymic);
        email = (TextView) findViewById(R.id.email);
        edit_name = (EditText) findViewById(R.id.edit_name);
        edit_surname = (EditText) findViewById(R.id.edit_surname);
        edit_patronymic = (EditText) findViewById(R.id.edit_patronymic);
        edit_email = (EditText) findViewById(R.id.edit_email);
        btn_skill = (Button) findViewById(R.id.btn_skill);
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fadein);
        fade_in.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                photo.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
                surname.setVisibility(View.VISIBLE);
                patronymic.setVisibility(View.VISIBLE);
                email.setVisibility(View.VISIBLE);
                btn_skill.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

    }

    public void onBtnClickShow(View view) {
        name.setText(edit_name.getText().toString());
        name.startAnimation(fade_in);
        surname.setText(edit_surname.getText().toString());
        surname.startAnimation(fade_in);
        patronymic.setText(edit_patronymic.getText().toString());
        patronymic.startAnimation(fade_in);
        email.setText(edit_email.getText().toString());
        email.startAnimation(fade_in);
        photo.startAnimation(fade_in);
        btn_skill.startAnimation(fade_in);
    }

    public void onBtnClickSkill(View view) {
        Intent intent = new Intent(this, SkillsActivity.class);
        startActivity(intent);
    }
}
