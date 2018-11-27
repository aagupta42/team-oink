#include <iostream>
#include <string>

//public class landingpage extends (something) implements OnClickListener
{
  //creating start button object
  private Button startbutton;
  
  @Override
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    //connect buttons to xml screen
    startbutton = (Button) findViewbyId(R.id.//start name in xml here)
    
    startbutton.setOnClickListener(this);
  }
  
  @Override
  
  public void onClick(View v)
  {
    //if exists pet
    //move on to main page
    //else
    //move on to creation page
  }
};
  