package com.example.futureahead.User;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futureahead.Admin.LoginActivity;
import com.example.futureahead.Admin.MainActivity;
import com.example.futureahead.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.example.futureahead.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.example.futureahead.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.futureahead.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.futureahead.HelperClasses.HomeAdapter.MostViewedAdapter;
import com.example.futureahead.HelperClasses.HomeAdapter.MostViewedViewHolder;
import com.example.futureahead.R;
import com.example.futureahead.User.MostViewedHelperClass.MostViewed;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView featuredRecycler,mostViewedRecycler,categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient1,gradient2,gradient3,gradient4;
    static final float END_SCALE = 0.7f;

    //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    LinearLayout contentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.most_viewed_recycler);
        categoriesRecycler = findViewById(R.id.categories_recycler);

        //Menu Hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        menuIcon = findViewById(R.id.menu_icon);
        contentView = findViewById(R.id.content);


        //Recycler views Function Calls
        featuredRecycler();
        mostViewedRecycler();
        categoriesRecycler();
        navigationDrawer();
    }

    //Navigation Drawer Functions
    private void navigationDrawer(){
    navigationView.bringToFront();
    navigationView.setNavigationItemSelectedListener(this);
    navigationView.setCheckedItem(R.id.nav_home);

    menuIcon.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            if(drawerLayout.isDrawerVisible(GravityCompat.START))
                drawerLayout.closeDrawer(GravityCompat.START);
            else drawerLayout.openDrawer(GravityCompat.START);
        }
    });
        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            Intent intent = new Intent(getApplicationContext(), UserDashboard.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.nav_logout) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.nav_login) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.nav_add_missing_place) {
            Intent intent = new Intent(getApplicationContext(), com.example.futureahead.LocationOwner.MainActivity.class);
            startActivity(intent);

        }

        return true;
    }

    //Recycler View Functions
    private void categoriesRecycler(){

        //All Gradients
        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.bus_img,"Engineering",gradient1));
        categoriesHelperClasses.add(new CategoriesHelperClass( R.drawable.med_img, "Medical",gradient2));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.def_img,"Defence" ,gradient3));
        categoriesHelperClasses.add(new CategoriesHelperClass( R.drawable.eng_img,"Business" ,gradient4));
        categoriesHelperClasses.add(new CategoriesHelperClass( R.drawable.nav_bank,"Banking" ,gradient1));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.gov_img,"Government" ,gradient2));

        categoriesRecycler.setHasFixedSize(true);
        adapter = new CategoriesAdapter(categoriesHelperClasses);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        categoriesRecycler.setAdapter(adapter);
    }

    private void mostViewedRecycler(){

        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<MostViewedViewHolder> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedViewHolder("Joint Entrance Exam (JEE)","Entrance exam for admission to undergraduate engineering and architecture programs."));
        mostViewedLocations.add(new MostViewedViewHolder("National Eligibility cum Entrance Test (NEET)", "Medical entrance exam for admission to undergraduate medical and dental courses."));
        mostViewedLocations.add(new MostViewedViewHolder("Graduate Aptitude Test in Engineering (GATE)", "Exam for admission to postgraduate engineering courses and various public sector undertakings."));
        mostViewedLocations.add(new MostViewedViewHolder("Union Public Service Commission (UPSC)","Highly prestigious exam for selection to various administrative services." ));
        mostViewedLocations.add(new MostViewedViewHolder("Common Admission Test (CAT)","Management entrance exam for admission to various postgraduate management programs." ));
        mostViewedLocations.add(new MostViewedViewHolder("Staff Selection Commission (SSC)","Exam for recruitment to various non-technical Group B and Group C posts in government departments and ministries." ));
        mostViewedLocations.add(new MostViewedViewHolder("Institute of Banking Personnel Selection (IBPS)","Exam for recruitment to various clerical, probationary officer, and specialist officer positions in public sector banks" ));
        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);
    }

    private void featuredRecycler(){

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.search_exam,"Search for your Exams","Get started by finding your desired exams with ease using our app search."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.look_future,"Look for your Future","Explore the possibilities and plan ahead for a successful future with our app."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.make_choice,"Make your Choice","Make your choice among the exams that will help secure your future."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.register,"Register your Exams","Do online registration for your chosen Future exam."));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }


    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }

    public void most_viewed_view_all(View view){
        Intent intent = new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }
    public void letsgetstarted (View view){
        Intent intent = new Intent(getApplicationContext(), com.example.futureahead.LocationOwner.MainActivity.class);
        startActivity(intent);
    }

}