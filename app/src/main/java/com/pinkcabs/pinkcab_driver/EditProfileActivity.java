package com.pinkcabs.pinkcab_driver;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.storage.StorageReference;
import com.pinkcabs.pinkcab_driver.R;

import mehdi.sakout.fancybuttons.FancyButton;

public class EditProfileActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 12341;
    Uri uri;

    FancyButton btnEditProfile, btnEditImage;
    EditText etName, etContact, etCabNo;
    ImageView imageView;
    StorageReference storageRef;
    boolean picChanged = false;
    private static final String TAG = "EditProfileActivity";


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
