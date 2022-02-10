package com.example.fragmentsq4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
   }

   public void fragement1Start(View view){
       replaceFragement(new Fragment_1());
   }

   public void fragement2Start(View view){
       replaceFragement(new Fragment_2());
   }

   public void replaceFragement(Fragment pragment){
       FragmentManager fm = getSupportFragmentManager();
       FragmentTransaction ft = fm.beginTransaction();
       ft.replace(R.id.fra,pragment);
       ft.commit();
   }

}

Activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
   xmlns:app="http://schemas.android.com/apk/res-auto"
   xmlns:tools="http://schemas.android.com/tools"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   tools:context=".MainActivity">

   <Button
       android:id="@+id/f2"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_marginStart="32dp"
       android:layout_marginTop="100dp"
       android:onClick="fragement2Start"
       android:text="Fragment 2"
       app:layout_constraintEnd_toEndOf="parent"
       app:layout_constraintHorizontal_bias="0.5"
       app:layout_constraintStart_toEndOf="@+id/f1"
       app:layout_constraintTop_toTopOf="parent" />

   <Button
       android:id="@+id/f1"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_marginTop="100dp"
       android:onClick="fragement1Start"
       android:text="Fragment 1"
       app:layout_constraintEnd_toStartOf="@+id/f2"
       app:layout_constraintHorizontal_bias="0.5"
       app:layout_constraintStart_toStartOf="parent"
       app:layout_constraintTop_toTopOf="parent" />

   <FrameLayout
       android:id="@+id/fra"
       android:layout_width="409dp"
       android:layout_height="581dp"
       tools:layout_editor_absoluteX="2dp"
       tools:layout_editor_absoluteY="148dp">

   </FrameLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
