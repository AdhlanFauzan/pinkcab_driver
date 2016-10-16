package com.pinkcabs.pinkcab_driver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.pinkcabs.pinkcab_driver.R;

import mehdi.sakout.fancybuttons.FancyButton;

public class EditProfileActivity extends AppCompatActivity {

    FancyButton btnEditProfile, btnEditImage;
    EditText etName, etContact, etCabNo;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etName = (EditText) findViewById(R.id.et_name);
        etContact = (EditText) findViewById(R.id.et_contact);
        etCabNo = (EditText) findViewById(R.id.et_cab_no);

        btnEditImage = (FancyButton) findViewById(R.id.btn_edit_image);
        btnEditProfile = (FancyButton) findViewById(R.id.btn_edit_profile);

        imageView = (ImageView) findViewById(R.id.iv_image);

    }
}
