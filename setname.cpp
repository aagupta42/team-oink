#include <iostream>
#include <string>

//public class landingpage extends (something) implements OnClickListener
{
  //code for textbox saying "What is your pet's name?"
  
  private Button continuebutton;
  private EditText et;
  
  @Override
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    //connect to xml screen
    et = (EditText) findViewById(R.id.editText1);
    continuebutton = (Button) findViewbyId(R.id.//continue name in xml here)
    
    continuebutton.setOnClickListener(this);
 
    //setting name from edit text box
    name = et.getText().toString();
  
    //error handling if nothing enterd
    if (name == "")
    {
    // display message saying "Please enter a name!"
    }
    
    }
  
  @Override
  
    public void onClick(View v)
  {
    //if continue button clicked, move to main screen
  }
};
  
  
  