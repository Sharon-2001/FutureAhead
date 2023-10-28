package com.example.futureahead.LocationOwner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.futureahead.R;

public class MainActivity extends AppCompatActivity {


    private Spinner spnInterestedField,spinner_status;
    private Button btnGenerateRecommendations;
    private TextView txtRecommendations;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        // Retrieve references to UI elements
        spinner_status = findViewById(R.id.spinner_status);
        spnInterestedField = findViewById(R.id.spnInterestedField);
        btnGenerateRecommendations = findViewById(R.id.btnGenerateRecommendations);
        txtRecommendations = findViewById(R.id.txtRecommendations);

        // Set up click listener for the "Generate Recommendations" button
        btnGenerateRecommendations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRecommendations();
            }
        });
    }
    private void generateRecommendations() {
        // Retrieve user input
        String educationalStatus = spinner_status.getSelectedItem().toString();
        String interestedField = spnInterestedField.getSelectedItem().toString();

        // Perform backend logic to generate recommendations based on user input
        String[] recommendations;

        if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Engineering")) {
            recommendations = new String[]{"Joint Entrance Examination (JEE) Main", "Joint Entrance Examination (JEE) Advanced","All India Engineering Entrance Examination (AIEEE)", "Kerala Engineering Architecture Medical (KEAM)","Birla Institute of Technology and Science Aptitude Test (BITSAT)","Indian Institutes of Technology Joint Entrance Examination (IIT-JEE)"};
        } else if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Medical")) {
            recommendations = new String[]{"NATIONAL ELIGIBILITY CUM ENTRANCE TEST (UG)","AIIMS MBBS Medical Entrance Exam","INDIAN ARMY BSc NURSING","Kerala Higher Secondary Examination (DHSE)","All India Senior School Certificate Examination (AISSCE)","Kerala Engineering Architecture Medical (KEAM)"};
        } else if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Defence")) {
            recommendations = new String[]{"NDA Exam","Territorial Army Officer Examination","Indian Air Force (IAF) Airman Selection Test","Combined Defence Services (CDS) Examination", "Indian Navy B.tech ", "Indian Army TEST Entry","INDIAN ARMY BSc NURSING"};
        } else if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Business")) {
            recommendations = new String[]{"Common Admission Test (CAT)","Xavier Aptitude Test (XAT)","Kerala Management Aptitude Test (KMAT)","Common Management Admission Test (CMAT)","Kerala Engineering, Architecture, Medical (KEAM)","Graduate Aptitude Test in Engineering (GATE)","Kerala Higher Secondary Examination (DHSE)"};
        } else if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Banking")) {
            recommendations = new String[]{"SBI Bank Exam","Kerala Public Service Commission (KPSC) Bank Exams","National Bank for Agriculture and Rural Development (NABARD) Grade A and B Exam","RBI Assistant Exam","SBI Probationary Officer (PO)","SBI Probationary Officer (PO)","IBPS Exams","IBPS Probationary Officer (PO)"};
        } else if (educationalStatus.equalsIgnoreCase("12th") && interestedField.equalsIgnoreCase("Government")) {
            recommendations = new String[]{"Women Police Constable","Excise Inspector","Computer Assistant Grade-II","Confidential Assistant Grade II","Kerala Public Service Commission","Police Constable","Meter Reader","Typist Clerk","Civil Excise Officer (Trainee)","Civil Police Officer (Police Constable) (Armed Police Battalion)","Fireman (Trainee) Fire and Rescue Services"};
        }


        else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Engineering")) {
            recommendations = new String[]{"Joint Entrance Examination (JEE) Main","Kerala Engineering Architecture Medical (KEAM)","National Aptitude Test in Architecture (NATA)","Consortium of Medical, Engineering and Dental Colleges of Karnataka (COMEDK)","Joint Entrance Examination (JEE) Advanced","Graduate Aptitude Test in Engineering (GATE)"};
        } else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Medical")) {
            recommendations = new String[]{"Kerala Engineering Architecture Medical (KEAM)"," All India Institute of Medical Sciences (AIIMS)","National Eligibility cum Entrance Test (NEET)","Kerala Engineering Architecture Medical Pharmacy (KEAM-PH)"};
        } else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Defence")) {
            recommendations = new String[]{"NDA Exam", "Indian Navy B.tech ","Short Service Commission (SSC)","Technical Entry Scheme (TES)","Indian Army TEST Entry","Indian Air Force Common Admission Test (AFCAT)","Indian Navy Entrance Test (INET)","Combined Defense Services Examination (CDSE)","Engineering Services Examination (ESE)"};
        }  else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Business")) {
            recommendations = new String[]{"Common Admission Test (CAT)","Xavier Aptitude Test (XAT)","Symbiosis National Aptitude Test (SNAP)","Tamil Nadu Common Entrance Test (TANCET) ","Management Aptitude Test (MAT)","Common Management Admission Test (CMAT)","Kerala Management Aptitude Test (KMAT)","Graduate Aptitude Test in Engineering (GATE)"};
        } else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Banking")) {
            recommendations = new  String[]{"State Bank of India Probationary Officer","IBPS Clerk","SBI Clerk","NABARD Grade A and B Officer"};
        } else if (educationalStatus.equalsIgnoreCase("B tech") && interestedField.equalsIgnoreCase("Government")){
            recommendations = new  String[]{"Kerala Public Service Commission","Indian Engineering Services (IES)","Graduate Aptitude Test in Engineering (GATE)","Kerala Engineering Architecture Medical (KEAM)","Excise Inspector","SBCID: Kerala Police Special Branch Assistant","Assistant Jailor Grade I","Company Assistant","Block Development Officer (BDO)","Sub Inspector of Police (Trainee)","Municipal Secretary Grade III"};
        }



        else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Engineering")){
            recommendations = new  String[]{"Joint Entrance Examination (JEE) Main","Non-GATE Admission Test (NGNAT)","Consortium of Self-Financing Colleges Management Association (CSMA)","Post Graduate Engineering Common Entrance Test (PGECET)","Kerala Engineering Architecture Medical (KEAM)","Joint Entrance Examination (JEE) Advanced","Graduate Aptitude Test in Engineering (GATE)"};
        } else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Medical")) {
            recommendations = new String[]{"Graduate Aptitude Test in Engineering (GATE)","All India Institute of Medical Sciences (AIIMS)","Kerala Engineering, Architecture, Medical (KEAM)","Kerala University of Health Sciences (KUHS) Entrance Exam"};
        } else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Defence")) {
            recommendations = new String[]{"Graduate Aptitude Test in Engineering (GATE)","Indian Air Force Common Admission Test (AFCAT)","Indian Navy Entrance Exams","Defense Research and Development Organization Scientist Entry Test (DRDO SET)","Indian Engineering Services (IES)",""};
        } else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Business")) {
            recommendations = new String[]{"Common Admission Test (CAT)", "Common Management Admission Test (CMAT)", "Graduate Aptitude Test in Engineering (GATE)"};
        } else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Banking")) {
            recommendations = new String[]{"SBI PO (State Bank of India Probationary Officer)","Kerala PSC (Public Service Commission)","IBPS SO (Institute of Banking Personnel Selection Specialist Officer)","NABARD Grade A and B Officer:"};
        } else if (educationalStatus.equalsIgnoreCase("M tech") && interestedField.equalsIgnoreCase("Government")) {
            recommendations = new String[]{"Kerala Public Service Commission","Kerala State Electricity Board (KSEB)","Kerala State Construction Corporation (KSCC) ","Cochin Shipyard Limited (CSL)","Kerala State Electronics Development Corporation Limited (KELTRON)","Kerala Public Service Commission (KPSC) Exams","Company Assistant","Excise Inspector","SBCID: Kerala Police Special Branch Assistant","Assistant Jailor Grade I","Block Development Officer (BDO)","Sub Inspector of Police (Trainee)","Municipal Secretary Grade III"};
        }





        else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Engineering")) {
            recommendations = new String[]{"Joint Entrance Examination (JEE) Main", "Joint Entrance Examination (JEE) Advanced", "Graduate Aptitude Test in Engineering (GATE)"};
        } else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Medical")) {
            recommendations = new String[]{"Kerala Engineering Architecture Medical (KEAM)","Kerala University of Health Sciences (KUHS)","Jawaharlal Institute of Postgraduate Medical Education and Research (JIPMER)","All India Institute of Medical Sciences (AIIMS)","National Eligibility cum Entrance Test (NEET)"};
        } else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Defence")) {
            recommendations = new String[]{"NDA Exam","Short Service Commission (SSC) Exams","Indian Navy Entrance Test (INET)","Indian Navy B.tech ","Air Force Common Admission Test (AFCAT)","Indian Army TEST Entry","Combined Defence Services (CDS)"};
        } else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Banking")) {
            recommendations = new String[]{"State Bank of India (SBI) Exams","Kerala Public Service Commission (KPSC) ","Reserve Bank of India (RBI) Exams","National Bank for Agriculture and Rural Development (NABARD) Exam"};
        } else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Business")) {
            recommendations =  new String[]{"Kerala Management Aptitude Test (KMAT)","Company Secretary (CS) Exam","State Level Eligibility Test (SLET)","Common Admission Test (CAT)","Xavier Aptitude Test (XAT)","Management Aptitude Test (MAT)","Common Entrance Test (CET)"};
        } else if (educationalStatus.equalsIgnoreCase("Degree") && interestedField.equalsIgnoreCase("Government")){
            recommendations = new String[]{"Store Keeper","SBCID: Kerala Police Special Branch Assistant","Sub Inspector of Police (Trainee)","Excise Inspector","Municipal Secretary Grade III","Block Development Officer (BDO)","Company Assistant","Kerala Administrative Services (KAS) Junior Scale","Data Entry Operator","Typist Clerk Grade-II","Assistant Jailor Grade I","Secretariat Assistant","University Assistant"};
        }


        else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Engineering")) {
            recommendations = new String[]{"Kerala Engineering Architecture Medical (KEAM)","Kerala University of Health Sciences (KUHS)","Kerala Engineering Agricultural Medical (KEAM) B.Sc Nursing","Joint Entrance Examination (JEE) Main"};
        } else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Medical")) {
            recommendations = new String[]{"Kerala University of Health Sciences (KUHS)","National Eligibility cum Entrance Test for Undergraduates (NEET-UG)","All India Institute of Medical Sciences (AIIMS)","Indian Nursing Council (INC)"};
        } else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Defence")) {
            recommendations = new  String[]{"Indian Army Military Nursing Service (MNS)","Indian Navy B.Sc. Nursing Exam","Combined Defense Services (CDS)"};
        } else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Banking")) {
            recommendations = new String[]{"State Bank of India (SBI) Exams","Reserve Bank of India (RBI) Exams","National Bank for Agriculture and Rural Development (NABARD)","Insurance  Exams"};
        } else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Business")) {
            recommendations = new String[]{"Common Admission Test (CAT)","Graduate Management Admission Test (GMAT)","Management Aptitude Test (MAT)","Kerala Management Aptitude Test (KMAT)","Xavier Aptitude Test (XAT)"};
        } else if (educationalStatus.equalsIgnoreCase("Nursing") && interestedField.equalsIgnoreCase("Government")) {
            recommendations = new String[]{"Kerala Public Service Commission (KPSC) Exams","All India Institute of Medical Sciences (AIIMS) Nursing Entrance Exam","National Eligibility cum Entrance Test for Nursing (NEET Nursing)","Kerala State Nursing Council (KSNC) Exams","Indian Nursing Council (INC) Exams"};
        } else {
            recommendations = new String[]{"No recommendations available for the provided educational status and interested field."};
        }

        // Display the recommendations in the TextView and make them clickable
        SpannableStringBuilder builder = new SpannableStringBuilder();
        for (int i = 0; i < recommendations.length; i++) {
            String exam = recommendations[i];
            if (i > 0) {
                builder.append("\n");
            }
            builder.append(i + 1 + ". ")
                    .append(exam, new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            openWebsiteForExam(exam);
                        }

                        @Override
                        public void updateDrawState(@NonNull TextPaint ds) {
                            super.updateDrawState(ds);
                            ds.setUnderlineText(true);
                        }
                    }, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        txtRecommendations.setText(builder);
        txtRecommendations.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void openWebsiteForExam(String exam) {
        String url;
        switch (exam) {
            case "Joint Entrance Examination (JEE) Main":
            case "Indian Institutes of Technology Joint Entrance Examination (IIT-JEE)":
                url = "https://jeemain.nta.nic.in/";
                break;
            case " Joint Entrance Examination (JEE) Advanced":
                url = "https://www.jeeadv.ac.in/";
                break;
            case "Kerala Engineering Architecture Medical (KEAM)":
            case "Kerala Engineering Architecture Medical Pharmacy (KEAM-PH)":
                url = "https://www.cee.kerala.gov.in/main.php";
                break;
            case "NATIONAL ELIGIBILITY CUM ENTRANCE TEST (UG)":
                url = "https://neet.nta.nic.in/";
                break;
            case "NDA Exam":
                url = "https://www.upsc.gov.in/examinations/%20National%20Defence%20Academy%20and%20Naval%20Academy%20Examination%20%28I%29%2C%202021";
                break;
            case "Indian Navy B.tech ":
                url = "https://www.joinindiannavy.gov.in/";
                break;
            case "Indian Army TEST Entry":
                url = "https://joinindianarmy.nic.in/";
                break;
            case "Common Admission Test (CAT)":
                url = "https://catexam.in/";
                break;
            case "Common Management Admission Test (CMAT) ":
                url = "https://cmat.nta.nic.in/";
                break;
            case "Women Police Constable":
            case "Computer Assistant Grade-II":
            case "Confidential Assistant Grade II ":
            case "Police Constable":
            case "Meter Reader":
            case "Typist Clerk":
            case "Civil Excise Officer (Trainee)":
            case "Civil Police Officer (Police Constable) (Armed Police Battalion)":
            case "Fireman (Trainee) Fire and Rescue Services":
            case "Store Keeper":
            case "Data Entry Operator":
            case "Typist Clerk Grade-II":
            case "Secretariat Assistant":
            case "University Assistant":
            case "Kerala Administrative Services (KAS) Junior Scale":
            case "Company Assistant":
            case "Block Development Officer (BDO)":
            case "Sub Inspector of Police (Trainee)":
            case "Municipal Secretary Grade III":
            case "Assistant Jailor Grade I":
            case "Excise Inspector":
            case "SBCID: Kerala Police Special Branch Assistant":
                url = "https://www.keralapsc.gov.in/common-preliminary-examination-plus-two-level-stage-i";
                break;
            case "Graduate Aptitude Test in Engineering (GATE)":
                url = "https://gate.iitk.ac.in/index.html";
                break;
            case "Kerala Public Service Commission":
                url = "https://www.keralapsc.gov.in/examinations";
                break;
            case "Birla Institute of Technology and Science Aptitude Test (BITSAT)":
                url ="https://www.bitsadmission.com/bitsatmain.aspx?id=11012016";
                break;
            case "AIIMS MBBS Medical Entrance Exam":
                url = "https://www.aiimsexams.ac.in/";
                break;
            case "INDIAN ARMY BSc NURSING":
                url = "https://joinindianarmy.nic.in/Default.aspx?id=622&lg=eng&";
                break;
            case "SBI Bank Exam":
                url = "https://sbi.co.in/web/careers/current-openings";
                break;
            case "IBPS Exams":
                url = "https://www.ibps.in/common-written-exam-cwe/";
                break;
            case "All India Engineering Entrance Examination (AIEEE)":
                url = "https://www.aieesesecondary.co.in/";
                break;
            case "Kerala Higher Secondary Examination (DHSE)":
                url = "http://dhsekerala.gov.in/";
                break;
            case "All India Senior School Certificate Examination (AISSCE)":
                url = "https://aissee.nta.nic.in/";
                break;
            case "Combined Defence Services (CDS) Examination":
                url = "https://upsc.gov.in/examinations/Combined%20Defence%20Services%20Examination%20(I),%202022";
                break;
            case "Indian Air Force (IAF) Airman Selection Test":
                url = "https://www.airmenselection.cdac.in/CASB/?ref=inbound_article";
                break;
            case "Territorial Army Officer Examination":
                url = "https://territorialarmy.in/";
                break;
            case "Kerala Management Aptitude Test (KMAT)":
                url = "https://mat.aima.in/?utm_source=collegedunia&utm_medium=banner3&utm_campaign=online";
                break;
            case "Xavier Aptitude Test (XAT)":
                url = "https://xat.org.in/";
                break;
            case "Management Aptitude Test (MAT)":
                url = "https://mat.aima.in/?utm_source=collegedunia&utm_medium=banner3&utm_campaign=online";
                break;
            case "SBI Probationary Officer (PO)":
                url = "https://sbi.co.in/web/careers/probationary-officers";
                break;
            case "IBPS Probationary Officer (PO)":
                url = "https://www.ibps.in/cwe-probationary-officers-management-trainees/";
                break;
            case "RBI Assistant Exam":
                url = "https://rbi.org.in/";
                break;
            case "National Bank for Agriculture and Rural Development (NABARD) Grade A and B Exam":
                url ="https://www.nabard.org/";
                break;
            case "Kerala Public Service Commission (KPSC) Bank Exams":
                url = "https://www.keralapsc.gov.in/examinations";
                break;
            case "Consortium of Medical, Engineering and Dental Colleges of Karnataka (COMEDK)":
                url ="https://www.comedk.org/index.html";
                break;
            case "National Aptitude Test in Architecture (NATA)":
                url = "https://www.nata.in/";
                break;
            case " All India Institute of Medical Sciences (AIIMS)":
                url = "https://www.aiims.edu/en.html";
                break;
            case "Combined Defense Services Examination (CDSE)":
                url = "https://upsc.gov.in/examinations/Combined%20Defence%20Services%20Examination%20(I),%202022";
                break;
            case "Engineering Services Examination (ESE)":
                url = "https://upsc.gov.in/examinations/Engineering%20Services%20%28Preliminary%29%20Examination%2C%202023";
                break;
            case "Indian Navy Entrance Test (INET)":
                url ="https://www.joinindiannavy.gov.in/";
                break;
            case "Indian Air Force Common Admission Test (AFCAT)":
                url = "https://afcat.cdac.in/AFCAT/";
                break;
            case "Technical Entry Scheme (TES)":
                url = "https://www.joinindianarmy.nic.in/Default.aspx?id=72&lg=eng&";
                break;
            case "Short Service Commission (SSC)":
                url = "https://www.joinindianarmy.nic.in/short-service-commission.htm";
                break;
            case " Xavier Aptitude Test (XAT)":
                url ="https://xat.org.in/";
                break;
            case "Symbiosis National Aptitude Test (SNAP)":
                url = "https://www.snaptest.org/";
                break;
            case "Tamil Nadu Common Entrance Test (TANCET) ":
                url ="https://collegedunia.com/exams/tancet?popup=true&utm_source=collegedunia&utm_medium=native3&utm_campaign=tancent2023";
                break;
            case "State Bank of India Probationary Officer":
                url = "https://sbi.co.in/web/careers/probationary-officers";
                break;
            case "IBPS Clerk":
                url = "https://www.ibps.in/common-written-exam-cwe/";
                break;
            case "SBI Clerk":
                url = "https://sbi.co.in/web/careers";
                break;
            case "NABARD Grade A and B Officer":
                url ="https://www.nabard.org/careers-notices1.aspx?cid=693&id=26";
                break;
            case "Indian Engineering Services (IES)":
                url = "https://upsc.gov.in/examinations/Engineering%20Services%20%28Preliminary%29%20Examination%2C%202023";
                break;
            case "Kerala Public Service Commission (KPSC) Exams":
                url = "https://www.keralapsc.gov.in/examinations";
                break;
            case "Kerala State Electronics Development Corporation Limited (KELTRON)":
                url = "https://www.keltron.org/";
                break;
            case "Cochin Shipyard Limited (CSL)":
                url = "https://cochinshipyard.in/";
                break;
            case "Kerala State Construction Corporation (KSCC) ":
                url = "https://kscc.in/home/";
                break;
            case "Kerala State Road Transport Corporation (KSRTC) Exams":
                url = "https://www.keralartc.com/main.html";
                break;
            case "Kerala State Electricity Board (KSEB)":
                url = "https://kseb.in/index.php?lang=en";
                break;
            case "Post Graduate Engineering Common Entrance Test (PGECET)":
                url ="https://pgecet.tsche.ac.in/";
                break;
            case "Consortium of Self-Financing Colleges Management Association (CSMA)":
                url = "https://www.tnsfconsortium.org/";
                break;
            case "Non-GATE Admission Test (NGNAT)":
                url = "https://nta.ac.in/";
                break;
            case "Defense Research and Development Organization Scientist Entry Test (DRDO SET)":
                url = "https://rac.gov.in/index.php?lang=en&id=0";
                break;
            case "SBI PO (State Bank of India Probationary Officer)":
                url = "https://sbi.co.in/web/careers/probationary-officers";
                break;
            case "Indian Navy Entrance Exams":
                url = "https://www.joinindiannavy.gov.in/";
                break;
            case "IBPS SO (Institute of Banking Personnel Selection Specialist Officer)":
                url = "https://www.ibps.in/common-written-exam-cwe/";
                break;
            case "Kerala University of Health Sciences (KUHS) Entrance Exam":
                url = "http://kuhs.ac.in/";
                break;
            case "NABARD Grade A and B Officer:":
                url = "https://www.nabard.org/careers-notices1.aspx?cid=693&id=26";
                break;
            case "Kerala PSC (Public Service Commission)":
                url = "https://www.keralapsc.gov.in/";
                break;
            case "National Eligibility cum Entrance Test (NEET)":
                url = "https://neet.nta.nic.in/";
                break;
            case "Jawaharlal Institute of Postgraduate Medical Education and Research (JIPMER)":
                url = "https://jipmer.edu.in/announcement/entrance-examinations-admissions";
                break;
            case "Kerala University of Health Sciences (KUHS)":
                url = "http://kuhs.ac.in/";
                break;
            case "Combined Defence Services (CDS)":
                url = "https://upsc.gov.in/examinations/Combined%20Defence%20Services%20Examination%20(I),%202022";
                break;
            case "Air Force Common Admission Test (AFCAT)":
                url ="https://careerairforce.nic.in/afcat-entry";
                break;
            case "Short Service Commission (SSC) Exams":
                url ="https://ssc.nic.in/";
                break;
            case "State Bank of India (SBI) Exams":
                url = "https://sbi.co.in/web/careers";
                break;
            case "Reserve Bank of India (RBI) Exams":
                url = "https://rbi.org.in/";
                break;
            case "National Bank for Agriculture and Rural Development (NABARD) ":
                url = "https://www.nabard.org/";
                break;
            case "Kerala Public Service Commission (KPSC) ":
                url ="https://www.keralapsc.gov.in/examinations";
                break;
            case "Common Entrance Test (CET)":
                url = "https://nta.ac.in/";
                break;
            case "State Level Eligibility Test (SLET)":
                url = "https://sletne.org/";
                break;
            case "Company Secretary (CS) Exam":
                url ="https://www.icsi.edu/student-n/examination/examination/";
                break;
            case "Kerala Engineering Agricultural Medical (KEAM) B.Sc Nursing":
                url = "https://www.cee.kerala.gov.in/main.php";
                break;
            case "All India Institute of Medical Sciences (AIIMS) ":
                url ="https://www.aiimsexams.ac.in/";
                break;
            case "Indian Nursing Council (INC)":
                url = "https://indiannursingcouncil.org/";
                break;
            case "National Eligibility cum Entrance Test for Undergraduates (NEET-UG)":
                url ="https://neet.nta.nic.in/";
                break;
            case "Indian Army Military Nursing Service (MNS)":
                url ="https://joinindianarmy.nic.in/Default.aspx?id=622&lg=eng&";
                break;
            case "Indian Navy B.Sc. Nursing Exam":
                url ="https://www.joinindiannavy.gov.in/en/page/medical.html";
                break;
            case "Combined Defense Services (CDS)":
                url ="https://upsc.gov.in/examinations/Combined%20Defence%20Services%20Examination%20(I),%202022";
                break;
            case "Insurance  Exams":
                url ="https://www.insuranceinstituteofindia.com/";
                break;
            case "Kerala State Nursing Council (KSNC) Exams":
                url = "http://www.nursingcouncil.kerala.gov.in/";
                break;
            case "Indian Nursing Council (INC) Exams":
                url = "https://indiannursingcouncil.org/";
                break;
            case "Graduate Management Admission Test (GMAT)":
                url = "https://www.mba.com/#!";
                break;
            case "National Eligibility cum Entrance Test for Nursing (NEET Nursing)":
                url ="https://neet.nta.nic.in/";
                break;
            case "All India Institute of Medical Sciences (AIIMS) Nursing Entrance Exam":
                url ="https://www.aiimsexams.ac.in/";
                break;


            // Add cases for other exams as needed
            default:
                return; // Return early if no specific action is defined
        }

        // Open the website in a browser
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}