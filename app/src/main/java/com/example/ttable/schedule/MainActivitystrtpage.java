package com.example.ttable.schedule;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitystrtpage extends Activity {
    public final static String Optext3 ="";
    public String[] mon,tue,wed,thu,fri;

    private Spinner spinner1, spinner2,spinner3;
    private Button btnSubmit;
    int timcmp;
    String date_com,time;
    int i,j=0;
    String per_com;
    String[] per = {"Period 1","Period 2","Period 3","Period 4","Period 5","Period 6","Period 7"};


    String weekday_name = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis());

    String formattedDate = new SimpleDateFormat("HHmm").format(Calendar.getInstance().getTime());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnSpinner2();
        addListenerOnButton();
        //   addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Current Period");
        list.add("Period 1");
        list.add("Period 2");
        list.add("Period 3");
        list.add("Period 4");
        list.add("Period 5");
        list.add("Period 6");
        list.add("Period 7");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }


    public void periodfnd(){

        if (per_com.equals("No cls")){
            j=7;

        }
        else{
            for (j = 0; j < 7; j++) {
                if (per_com.equals(per[j])) {
                    break;
                }
            }}
    }

    public  void clschooser(){
        Intent intentmain = getIntent();
        String clsfin = intentmain.getStringExtra(MainActivity.spinnerdat);
        if (clsfin.equals("S3 CS1"))
        {
            String[] mon1 = {"SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:9.15-10.10","SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:10.10-11"," SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:11.10-12.00"," SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:12.00-12.50","SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:1.35-2.30","SUBJECT:STLD\nFACULTY:Remya Soman\nDURATION:2.40-3.35"," SUBJECT:DS\nFACULTY:Rosebell Paul\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:EDC\nFACULTY:Arathy\nDURATION:9.15-10.10","SUBJECT:DS\nFACULTY:Rosebell Paul\nDURATION:10.10-11"," SUBJECT:STLD\nFACULTY:Remya Soman\nDURATION:11.10-12.00"," SUBJECT:MATHS\nFACULTY:Joy Mathew\nDURATION:12.00-12.50","SUBJECT:DCS\nFACULTY:Susmi Jacob\nDURATION:1.35-2.30","SUBJECT:DS\nFACULTY:Rosebell Paul\nDURATION:2.40-3.35"," SUBJECT:EDC\nFACULTY:Arathy\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:STLD\nFACULTY:Remya Soman\nDURATION:9.15-10.10","SUBJECT:EDC\nFACULTY:Arathy\nDURATION:10.10-11"," SUBJECT:STLD\nFACULTY:Remya Soman\nDURATION:11.10-12.00"," SUBJECT:MATHS\nFACULTY:Joy Mathew\nDURATION:12.00-12.50","SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:1.35-2.30","SUBJECT:DCS\nFACULTY:Susmi Jacob\nDURATION:2.40-3.35"," SUBJECT:MATHS\nFACULTY:Joy Mathew\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:9.15-10.10","SUBJECT:DCS\nFACULTY:Susmi Jacob\nDURATION:10.10-11"," SUBJECT:DS\nFACULTY:Rosebell Paul\nDURATION:11.10-12.00"," SUBJECT:MATHS\nFACULTY:Joy Mathew\nDURATION:12.00-12.50","SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:1.35-2.30","SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:2.40-3.35"," SUBJECT:(DS or EC)Lab\nFACULTY:Rosebell Paul or Arathy\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT:DCSnFACULTY:Susmi Jacob\nDURATION:9.15-10.10","SUBJECT:STLD\nFACULTY:Remya Soman\nDURATION:10.10-11"," SUBJECT:DCS\nFACULTY:Susmi Jacob\nDURATION:11.10-12.00"," SUBJECT:DS\nFACULTY:Rosebell Paul\nDURATION:12.00-12.50","SUBJECT:Microproject\nFACULTY:Rosebell Paul or Susmi Jacaob\nDURATION:1.35-2.30","SUBJECT:Microproject\nFACULTY:Rosebell Paul or Susmi Jacaob\nDURATION:2.40-3.35"," SUBJECT:Microproject\nFACULTY:Rosebell Paul or Susmi Jacaob\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinder();
        }
        else if (clsfin.equals("S3 CS2")){
            String[] mon1 = {"SUBJECT:DCS\nFACULTY:Sindhya Nambiar\nDURATION:9.15-10.10","SUBJECT:Microproject\nFACULTY:Susmi Jacob\nDURATION:10.10-11"," SUBJECT:Microproject\nFACULTY:Susmi Jacob\nDURATION:11.10-12.00"," SUBJECT:Microproject\nFACULTY:Susmi Jacob\nDURATION:12.00-12.50","SUBJECT:EDC\nFACULTY:Arathy\nDURATION:1.35-2.30","SUBJECT:STLD\nFACULTY:Deepasree Varma\nDURATION:2.40-3.35"," SUBJECT:DCS\nFACULTY:Sindhya Nambiar\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sebastian or Sreeja\nDURATION:9.15-10.10","SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sebastian or Sreeja \nDURATION:10.10-11"," SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sbastian or Sreeja\nDURATION:11.10-12.00"," SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sbastian or Sreeja\nDURATION:12.00-12.50","SUBJECT:STLD\nFACULTY:Deepasree Varma\nDURATION:1.35-2.30","SUBJECT:DCS\nFACULTY:Sindhya Nambiar\nDURATION:2.40-3.35"," SUBJECT:STLD\nFACULTY:Deepasree Varma\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:DS\nFACULTY:Neenu Sebastian\nDURATION:9.15-10.10","SUBJECT:STLD\nFACULTY:Deepasree Varma\nDURATION:10.10-11"," SUBJECT:DCS\nFACULTY:Sindhya Nambiar\nDURATION:11.10-12.00"," SUBJECT:EDC\nFACULTY:Arathy\nDURATION:12.00-12.50","SUBJECT:MATHS\nFACULTY:Sophia Cleetus\nDURATION:1.35-2.30","SUBJECT:DS\nFACULTY:Neenu Sebastian\nDURATION:2.40-3.35"," SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:EDC\nFACULTY:Arathy\nDURATION:9.15-10.10","SUBJECT:DCS\nFACULTY:Sindhya Nambiar\nDURATION:10.10-11"," SUBJECT:STLD\nFACULTY:Deepasree Varma\nDURATION:11.10-12.00"," SUBJECT:DS\nFACULTY:Neenu Sebastian\nDURATION:12.00-12.50","SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:1.35-2.30","SUBJECT:MATHS\nFACULTY:Sophia Cleetus\nDURATION:2.40-3.35"," SUBJECT:DS\nFACULTY:Neenu Sebastian\nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT:MATHS\nFACULTY:Sophia Cleetus\nDURATION:9.15-10.10","SUBJECT:DS\nFACULTY:Neenu SEbastian\nDURATION:10.10-11"," SUBJECT:BE\nFACULTY:Hingston Xavier\nDURATION:11.10-12.00"," SUBJECT:MATHS\nFACULTY:Sophia Cleetus\nDURATION:12.00-12.50","SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sebastian or Sreeja nDURATION:1.35-2.30","SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sebastian or Sreeja \nDURATION:2.40-3.35"," SUBJECT:(DS or EC)Lab\nFACULTY:Neenu Sebastian or Sreeja \nDURATION:3.35-4.30","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinder();
        }

        else if (clsfin.equals("S5 CS1"))
        {
            String[] mon1 = {"SUBJECT:DBMS\nFACULTY:Prof.P Reghudas\nDURATION:9.30-10.30","SUBJECT:OS\nFACULTY:Binu John\nDURATION:10.35-11.35\n","SUBJECT:AMP\nFACULTY:Litty Koshy\nDURATION:11.40-12.45","SUBJECT:MATHS1\nFACULTY:Mini Tom\nDURATION:1.30-2.30","SUBJECT:MATHS2\nFACULTY:Reshma.R\nDURATION:2.35-3.30","SUBJECT:DSP\nFACULTY:Akhila P R\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:OS\nFACULTY:Binu John\nDURATION:9.30-10.30","SUBJECT:DBMS\nFACULTY:Prof.P Reghudas\nDURATION:10.35-11.35\n","SUBJECT:POM\nFACULTY:Dr.Balagopal G Menon\nDURATION:11.40-12.45","SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:1.30-2.30","SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:2.35-3.30","SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:DBMS\nFACULTY:Prof.P Reghudas\nDURATION:9.30-10.30","SUBJECT:MATHS2\nFACULTY:Reshma.R\nDURATION:10.35-11.35\n","SUBJECT:DSP\nFACULTY:Akhila P R\nDURATION:11.40-12.45","SUBJECT:OS\nFACULTY:Binu John\nDURATION:1.30-2.30","SUBJECT:POM\nFACULTY:Dr.Balagopal G Menon\nDURATION:2.35-3.30","SUBJECT:AMP\nFACULTY:Litty Koshy\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:9.30-10.30","SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:10.35-11.35\n","SUBJECT:(DB or HW)Lab\nFACULTY:Prof.P Reghudas or Litty Koshy\nDURATION:11.40-12.45","SUBJECT:DSP\nFACULTY:Akhil P R\nDURATION:1.30-2.30","SUBJECT:AMP\nFACULTY:Litty Koshy\nDURATION:2.35-3.30","SUBJECT:POM\nFACULTY:Dr.Balagopal G Menon\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT:DSP \nFACULTY:Akhila P R\nDURATION:9.30-10.30","SUBJECT:DBMS\nFACULTY:Prof.P Reghudas\nDURATION:10.35-11.35\n","SUBJECT:MATHS1\nFACULTY:Mini Tom\nDURATION:11.40-12.45","SUBJECT:POM\nFACULTY:Dr.Balagopal G Menon\nDURATION:1.30-2.30","SUBJECT:AMP\nFACULTY:Litty Koshy\nDURATION:2.35-3.30","SUBJECT:OS\nFACULTY:Binu John\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinderMG();
        }

        else if (clsfin.equals("S5 CS2"))
        {
            String[] mon1 = {"SUBJECT:DSP \nFACULTY:Vrinda V Gopal\nDURATION:9.30-10.30","SUBJECT:DBMS\nFACULTY:Bini Omman\nDURATION:10.35-11.35\n","SUBJECT:OS\nFACULTY:Viji Gopal\nDURATION:11.40-12.45","SUBJECT:(DB or HW)Lab\nFACULTY:Bini Omman or Shilpa P C\nDURATION:1.30-2.30","SUBJECT:(DB or HW)Lab\nFACULTY:Bini Omman or Shilpa P C\nDURATION:2.35-3.30","SUBJECT:(DB or HW)Lab\nFACULTY:Bini Omman or Shilpa P C\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:AMP\nFACULTY:Shilpa P C\nDURATION:9.30-10.30","SUBJECT:DSP\nFACULTY:Vrinda V Gopal\nDURATION:10.35-11.35\n","SUBJECT:MATHS1\nFACULTY:Mini Tom\nDURATION:11.40-12.45","SUBJECT:MATHS2\nFACULTY:Reshma R\nDURATION:1.30-2.30","SUBJECT:DBMS\nFACULTY:Bini Omman\nDURATION:2.35-3.30","SUBJECT:POM\nFACULTY:Dr.Manoj Kumar\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:(DB or HW)Lab\nFACULTY:Bini Omman or Shilpa P C \nDURATION:9.30-10.30","SUBJECT:(DB or HW)Lab\nFACULTY:Bini Omman or Shilpa P C\nDURATION:10.35-11.35\n","SUBJECT:(DB or HW)Lab \nFACULTY:Bini Omman or Shilpa P C\nDURATION:11.40-12.45","SUBJECT:POM\nFACULTY:Dr.Manoj Kumar\nDURATION:1.30-2.30","SUBJECT:AMP\nFACULTY:Shilpa P C\nDURATION:2.35-3.30","SUBJECT:POS\nFACULTY:Viji Gopal\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:POM\nFACULTY:Dr.Manoj Kumar\nDURATION:9.30-10.30","SUBJECT:MATHS1\nFACULTY:Mini Tom\nDURATION:10.35-11.35\n","SUBJECT:DBMS\nFACULTY:Bini Omman\nDURATION:11.40-12.45","SUBJECT:OS\nFACULTY:Viji Gopal\nDURATION:1.30-2.30","SUBJECT:DSP\nFACULTY:Vrinda VGopal\nDURATION:2.35-3.30","SUBJECT:AMP\nFACULTY:Shilpa P C\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT:OS\nFACULTY:Viji Gopal\nDURATION:9.30-10.30","SUBJECT:POM\nFACULTY:Dr.Manoj Kumar\nDURATION:10.35-11.35\n","SUBJECT:AMP\nFACULTY:Shilpa P C\nDURATION:11.40-12.45","SUBJECT:DBMS\nFACULTY:Bini Omman\nDURATION:1.30-2.30","SUBJECT:DSP\nFACULTY:Vrinda VGopal\nDURATION:2.35-3.30","SUBJECT:MATHS2\nFACULTY:Rshma R\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinderMG();
        }

        else if (clsfin.equals("S7 CS1"))
        {
            String[] mon1 = {"\"SUBJECT:CC\nFACULTY:Dr.Vinod P\nDURATION:9.30-10.30","SUBJECT:PPL\nFACULTY:Blessy Antony\nDURATION:10.35-11.35","SUBJECT:WT\nFACULTY:Shilpa P C\nDURATION:11.40-12.45","SUBJECT:OOMD\nFACULTY:Nimmi K\nDURATION:1.30-2.30","SUBJECT:CG\nFACULTY:Diana P G Percy\nDURATION:2.35-3.30","SUBJECT:OOMD\nFACULTY:Nimmi K\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:PPL\nFACULTY:Blessy Antony\nDURATION:9.30-10.30","SUBJECT:DM\nFACULTY:Deepa K\nDURATION:10.35-11.35","SUBJECT:WT\nFACULTY:Shilpa P C\nDURATION:11.40-12.45","SUBJECT:CC\nFACULTY:Dr Vinod P\nDURATION:1.30-2.30","SUBJECT:DM\nFACULTY:Deepa K\nDURATION:2.35-3.30","SUBJECT:WT\nFACULTY:Shilpa P C\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:CG\nFACULTY:Diana P G Percy\nDURATION:9.30-10.30","SUBJECT:OOMD\nFACULTY:Nimmi K\nDURATION:10.35-11.35","SUBJECT:CG\nFACULTY:Diana P G Percy\nDURATION:11.40-12.45","SUBJECT:NW or SP\nFACULTY:\nDURATION:1.30-2.30","SUBJECT:NW or SP\nFACULTY:\nDURATION:2.35-3.30","SUBJECT:NW or SP\nFACULTY:\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:SEMINAR\nFACULTY: -\nDURATION:9.30-10.30","SUBJECT:SEMINAR\nFACULTY: -\nDURATION:10.35-11.35","SUBJECT:SEMINAR\nFACULTY: -\nDURATION:11.40-12.45","SUBJECT:WT\nFACULTY:Shilpa P C\nDURATION:1.30-2.30","SUBJECT:CC\nFACULTY:Dr Vinod P\nDURATION:2.35-3.30","SUBJECT: DM\nFACULTY:Deepa K\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT: NW or SP\nFACULTY: -\nDURATION:9.30-10.30","SUBJECT:NW or SP\nFACULTY: -\nDURATION:10.35-11.35","SUBJECT:NW or SP\nFACULTY: -\nDURATION:11.40-12.45","SUBJECT:PPL\nFACULTY:Blessy Antony\nDURATION:1.30-2.30","SUBJECT:DM\nFACULTY:Deepa K\nDURATION:2.35-3.30","SUBJECT: CC\nFACULTY:Dr Vinod P\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinderMG();
        }

        else
        {
            String[] mon1 = {"SUBJECT:\nFACULTY:- P\nDURATION:9:30-10:30","SUBJECT:SEMINAR\nFACULTY:-\nDURATION:10:35-11:35","SUBJECT:SEMINAR:\nFACULTY:-\nDURATION:11.40-12.45","SUBJECT:DM\nFACULTY:DHANYA K.A\nDURATION:1.30-2.30","SUBJECT:WT\nFACULTY:JOSNA PHILOMINA\nDURATION:2.35-3.30","SUBJECT:CC\nFACULTY:SONAL AYYAPPAN\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] tue1 ={"SUBJECT:NW or SP\nFACULTY:-\nDURATION:9:30-10:30","SUBJECT:\nFACULTY:-\nDURATION:10:35-11:35","SUBJECT:NW or SP\nFACULTY:-\nDURATION:11.40-12.45","SUBJECT:CC\nFACULTY:SONAL AYYAPPAN\nDURATION:1.30-2.30","SUBJECT:CG\nFACULTY:BINU JOHN\nDURATION:2.35-3.30","SUBJECT:DM\nFACULTY:DHANYA K.A\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] wed1 = {"SUBJECT:DM\nFACULTY:DHANYA K.A\nDURATION:9:30-10:30","SUBJECT:WT\nFACULTY:JOSNA PHILOMINA\nDURATION:10:35-11:35","SUBJECT:OOMD\nFACULTY:SREEJA RAJESH\nDURATION:11.40-12.45","SUBJECT:PPL\nFACULTY:GAYATHRY S WARRIER\nDURATION:1.30-2.30","SUBJECT:CC\nFACULTY:SONAL AYYAPPAN\nDURATION:2.35-3.30","SUBJECT:CG\nFACULTY:BINU JOHN\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] thu1 = {"SUBJECT:OOMD\nFACULTY:SREEJA RAJESH\nDURATION:9:30-10:30","SUBJECT:PPL\nFACULTY:GAYATHRI S WARRIER\nDURATION:10:35-11:35","SUBJECT:WT\nFACULTY:JOSNA PHILOMINA\nDURATION:11.40-12.45","SUBJECT:NW or SP\nFACULTY:-\nDURATION:1.30-2.30","SUBJECT:NW or SP\nFACULTY:-\nDURATION:2.35-3.30","SUBJECT:NW or SP\nFACULTY:-\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            String[] fri1 = {"SUBJECT:PPL\nFACULTY:GAYATHRI S WARRIER\nDURATION:9:30-10:30","SUBJECT:CG\nFACULTY:BINU JOHN\nDURATION:10:35-11:35","SUBJECT:CC\nFACULTY:SONAL AYYAPPAN\nDURATION:11.40-12.45","SUBJECT:DM\nFACULTY:DHANYA K.A\nDURATION:1.30-2.30","SUBJECT:WT\nFACULTY:JOSNA PHILOMINA\nDURATION:2.35-3.30","SUBJECT:OOMD\nFACULTY:SREEJA RAJESH\nDURATION:3.35-4.30","BREAK OR NO CLASS","BREAK OR NO CLASS"};
            mon=mon1;
            tue=tue1;
            wed=wed1;
            thu=thu1;
            fri=fri1;
            PeriodFinderMG();
        }
    }


    public void PeriodFinderMG() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        date_com = String.valueOf(spinner1.getSelectedItem());
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        per_com = String.valueOf(spinner2.getSelectedItem());
        if (per_com == "Current Period") {
            timcmp = Integer.parseInt(formattedDate);
            j=0;

            if (timcmp<=1030 && timcmp>=930) {
                per_com = "Period 1";
                periodfnd();
            }
            else if (timcmp<=1135 && timcmp>=1035) {
                per_com = "Period 2";
                periodfnd();
            }

            else if (timcmp<=1245 && timcmp>=1140) {
                per_com = "Period 3";
                periodfnd();
            }

            else if (timcmp<=1430 && timcmp>=1330) {
                per_com = "Period 4";
                periodfnd();
            }

            else if (timcmp<=1530&& timcmp>=1435) {
                per_com = "Period 5";
                periodfnd();
            }

            else if (timcmp<=1630&& timcmp>=1535) {
                per_com = "Period 6";
                periodfnd();
            }
            else {
                per_com="No cls";
                periodfnd();
            }}
        else periodfnd();


    }


    public void PeriodFinder() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        date_com = String.valueOf(spinner1.getSelectedItem());
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        per_com = String.valueOf(spinner2.getSelectedItem());
        if (per_com == "Current Period") {
            timcmp = Integer.parseInt(formattedDate);
            j=0;

            if (timcmp<=1010 && timcmp>=915) {
                per_com = "Period 1";
                periodfnd();
            }
            else if (timcmp<=1100 && timcmp>=1011) {
                per_com = "Period 2";
                periodfnd();
            }

            else if (timcmp<=1200 && timcmp>=1110) {
                per_com = "Period 3";
                periodfnd();
            }

            else if (timcmp<=1250 && timcmp>=1201) {
                per_com = "Period 4";
                periodfnd();
            }

            else if (timcmp<=1430&& timcmp>=1335) {
                per_com = "Period 5";
                periodfnd();
            }

            else if (timcmp<=1535&& timcmp>=1440) {
                per_com = "Period 6";
                periodfnd();
            }

            else if (timcmp<=1630 && timcmp>=1536) {
                per_com = "Period 7";
                periodfnd();
            }
            else {
                per_com="No cls";
                periodfnd();
            }}
        else periodfnd();


    }


    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                clschooser();
                String Optext="";
                spinner1 = (Spinner) findViewById(R.id.spinner1);
                date_com = String.valueOf(spinner1.getSelectedItem());
                switch(date_com) {
                    case "Monday":
                        Optext = Optext + mon[j];
                        break;
                    case "Tuesday":
                        Optext = Optext + tue[j];
                        break;
                    case "Wednesday":
                        Optext = Optext + wed[j];
                        break;
                    case "Thursday":
                        Optext = Optext + thu[j];
                        break;
                    case "Friday":
                        Optext = Optext + fri[j];
                        break;
                    case "Today":
                        switch(weekday_name) {
                            case "Monday":
                                Optext = Optext + mon[j];
                                break;
                            case "Tuesday":
                                Optext = Optext + tue[j];
                                break;
                            case "Wednesday":
                                Optext = Optext + wed[j];
                                break;
                            case "Thursday":
                                Optext = Optext + thu[j];
                                break;
                            case "Friday":
                                Optext = Optext + fri[j];
                                break;
                            case "Saturday":
                                Optext = Optext + "HOLIDAY";
                                break;
                            case "Sunday":
                                Optext = Optext + "HOLIDAY";
                                break;
                        }
                        break;
                }

                Intent intent = new Intent(MainActivitystrtpage.this,MainActivity2.class);
                intent.putExtra(Optext3,Optext);
                startActivity(intent);
            }

        });
    }
}
